package vn.com.sapo.memory;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import vn.com.sapo.domain.LoyaltyConfig;

/**
 *
 * @author Mai-PC
 */
@Component
public class LoyaltyConfigCache {

    // Map key = time; value = Config
    // mục đích 
    private TreeMap<Long, LoyaltyConfig> data = new TreeMap<>();

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock read = lock.readLock();
    private ReentrantReadWriteLock.WriteLock write = lock.writeLock();

    public void init(Map<Long, LoyaltyConfig> map) {
        data.clear();
        data.putAll(map);
    }

    public void init(List<LoyaltyConfig> lstConfig) {
        data.clear();
        if (lstConfig != null && !lstConfig.isEmpty()) {
            Map<Long, LoyaltyConfig> map = lstConfig.stream().collect(Collectors.toMap(
                    (key) -> {
                        return key.getTime();
                    },
                    (value) -> {
                        return value;
                    })
            );
            data.clear();
            data.putAll(map);
        }
    }

    public LoyaltyConfig getConfigApply(Long time) throws InterruptedException {
        LoyaltyConfig result = null;
        try {
            read.lock();
            Map.Entry<Long, LoyaltyConfig> entry = data.floorEntry(time);
            System.out.println(" " + entry);
            if (entry != null) {
                result = entry.getValue();
            }
        } finally {
            read.unlock();
        }
        return result;
    }

    public void updateConfig(LoyaltyConfig config) throws InterruptedException {
        if (config != null) {
            try {
                write.lock();
                data.put(config.getTime(), config);
            } finally {
                write.unlock();
            }

        }
    }

}

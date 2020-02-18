package vn.com.sapo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.sapo.domain.LoyaltyCard;
import vn.com.sapo.domain.LoyaltyConfig;
import vn.com.sapo.domain.RankCredit;
import vn.com.sapo.memory.LoyaltyConfigCache;
import vn.com.sapo.repository.LoyaltyCardRepository;
import vn.com.sapo.repository.LoyaltyConfigRepository;
import vn.com.sapo.util.DateTimeUtil;

/**
 *
 * @author Mai-PC
 */
@Service
public class ConfigService {

    @Autowired
    private LoyaltyConfigRepository loyaltyConfigRepository;
    
    @Autowired
    private LoyaltyCardRepository loyaltyCardRepository;

    @Autowired
    private LoyaltyConfigCache loyaltyConfigCache;

    public void initConfig() {
        List<LoyaltyConfig> config = loyaltyConfigRepository.findAll();
        System.out.println("--------INIT CONFIG START-----------------------------------");
        System.out.println(config);
        loyaltyConfigCache.init(config);
        System.out.println("--------INIT CONFIG END-----------------------------------");
    }

    public void updateConfig(Double money) throws InterruptedException {
        String time = DateTimeUtil.formatyyyyMMddHHmm(new Date());
        LoyaltyConfig config = new LoyaltyConfig(money, Long.valueOf(time));
        loyaltyConfigRepository.save(config);
        loyaltyConfigCache.updateConfig(config);
    }

    public LoyaltyConfig getConfig(Long time) throws InterruptedException {
        return loyaltyConfigCache.getConfigApply(time);
    }
    
    public void updatePoint(Long loyaltyId,Long point,Long time) throws InterruptedException {
        Optional<LoyaltyCard> data = loyaltyCardRepository.findById(loyaltyId);
        if(data.isPresent()){
            LoyaltyCard card = data.get();
            LoyaltyConfig pointConfig = loyaltyConfigCache.getConfigApply(time);
            RankCredit rank = card.getRank();
//            card.
            
        }
    }
}

package vn.com.sapo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.sapo.domain.LoyaltyCard;
/**
 *
 * @author Mai-PC
 */
public interface LoyaltyCardRepository extends JpaRepository<LoyaltyCard,Long>{
    
}

package vn.com.sapo.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mai-PC
 */
@Entity
@Table(name = "loyalty_transaction")
public class LoyaltyTransaction  extends BaseDomain implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "loyalty_id",nullable = false)
    private Long loyaltyId;
    
    @Column(name = "point_changed",nullable = false)
    private Long pointChange;
    
    @Column(name = "value_changed",nullable = false)
    private Double valueChange;
    
    @Column(name = "time",nullable = false)
    private Long time; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoyaltyId() {
        return loyaltyId;
    }

    public void setLoyaltyId(Long loyaltyId) {
        this.loyaltyId = loyaltyId;
    }
    
    public Long getPointChange() {
        return pointChange;
    }

    public void setPointChange(Long pointChange) {
        this.pointChange = pointChange;
    }

    public Double getValueChange() {
        return valueChange;
    }

    public void setValueChange(Double valueChange) {
        this.valueChange = valueChange;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
   
}

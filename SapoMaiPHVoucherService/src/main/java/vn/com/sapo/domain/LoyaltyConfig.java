package vn.com.sapo.domain;

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
@Table(name = "loyalty_config")
public class LoyaltyConfig extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
//    @Column(name = "shop_id",nullable = false)
//    private Long shopId;
//    
    @Column(name = "to_currency",nullable = false)
    private Double toCurrency;
    
    // format yyyyMMddHHmm to long
    @Column(name = "time",nullable = false)
    private Long time;

    public LoyaltyConfig(Double toCurrency, Long time) {
        this.toCurrency = toCurrency;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Long getShopId() {
//        return shopId;
//    }
//
//    public void setShopId(Long shopId) {
//        this.shopId = shopId;
//    }

    public Double getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(Double toCurrency) {
        this.toCurrency = toCurrency;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LoyaltyConfig{" + "id=" + id + ", toCurrency=" + toCurrency + ", time=" + time + '}';
    }
    
}

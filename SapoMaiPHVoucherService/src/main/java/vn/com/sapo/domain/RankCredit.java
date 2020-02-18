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
@Table(name = "loyalty_rank")
public class RankCredit extends BaseDomain{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "name",nullable = false)
    private String name;
    
    @Column(name = "earned_level",nullable = false)
    private Double earnedLevel;
    
    @Column(name = "expire",nullable = false)
    private Long expire;
    
    @Column(name = "discount",length = 100,nullable = false)
    private Long discount;
    
    @Column(name = "create_time",nullable = false)
    private Long createTIme;
    
    @Column(name = "update_time",nullable = false)
    private Long updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getEarnedLevel() {
        return earnedLevel;
    }

    public void setEarnedLevel(Double earnedLevel) {
        this.earnedLevel = earnedLevel;
    }

    public Long getExpire() {
        return expire;
    }

    public void setExpire(Long expire) {
        this.expire = expire;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getCreateTIme() {
        return createTIme;
    }

    public void setCreateTIme(Long createTIme) {
        this.createTIme = createTIme;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
    
    
}

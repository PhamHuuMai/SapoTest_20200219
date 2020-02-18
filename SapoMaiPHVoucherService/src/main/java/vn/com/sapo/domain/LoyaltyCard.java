package vn.com.sapo.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Mai-PC
 */
@Entity
@Table(name = "loyalty_card")
public class LoyaltyCard extends BaseDomain implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "card_code",nullable = false)
    private String code;
    
    @Column(name = "customer_phone_number",nullable = false)
    private String customerPhoneNumber;
    
    @Column(name = "rank_id",nullable = false)
    private Long rankId;
    
    @Column(name = "point",nullable = false)
    private Long point;
    
    @Column(name = "start_time",nullable = false)
    private Long startTime;

    @Column(name = "end_time",nullable = false)
    private Long endTime;
    
    @Column(name = "create_time",nullable = false)
    private Long createTime;

    @Column(name = "update_time",nullable = false)
    private Long updateTime;

    @ManyToOne
    @JoinColumn(name = "rank_id")
    private RankCredit rank;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Long getRankId() {
        return rankId;
    }

    public void setRankId(Long rankId) {
        this.rankId = rankId;
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public RankCredit getRank() {
        return rank;
    }

    public void setRank(RankCredit rank) {
        this.rank = rank;
    }

}

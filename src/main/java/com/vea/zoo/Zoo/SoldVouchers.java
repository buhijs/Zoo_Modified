package com.vea.zoo.Zoo;

import javax.persistence.*;

@Entity
@Table(name = "SOLDVOUCHERS")
public class SoldVouchers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "VISITOR")
    private Long visitor;
    @Column(name = "VOUCHER")
    private Long voucher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVisitor() {
        return visitor;
    }

    public void setVisitor(Long visitor) {
        this.visitor = visitor;
    }

    public Long getVoucher() {
        return voucher;
    }

    public void setVoucher(Long voucher) {
        this.voucher = voucher;
    }


}

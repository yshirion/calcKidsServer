package com.example.server2.familyEntity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "families")
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long fId;
    String name;
    double loanInterest, investLongInterest, investShortInterest;
    final double MIN_INTEREST = 0.1;

    protected Family(){}
    public Family(String name, int fId,
                  double loanInterest, double investLongInterest,
                  double investShortInterest) {
        this.name = name;
        this.fId = fId;
        this.loanInterest = loanInterest;
        this.investLongInterest = investLongInterest;
        this.investShortInterest = investShortInterest;
    }

    public Family(String name){
        this.name =name;
        loanInterest = MIN_INTEREST;
        investLongInterest = MIN_INTEREST;
        investShortInterest = MIN_INTEREST;
    }


    public long getfId() {
        return fId;
    }

    public void setfId(long fId) {
        this.fId = fId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(double loanInterest) {
        this.loanInterest = loanInterest;
    }

    public double getInvestLongInterest() {
        return investLongInterest;
    }

    public void setInvestLongInterest(double investLongInterest) {
        this.investLongInterest = investLongInterest;
    }

    public double getInvestShortInterest() {
        return investShortInterest;
    }

    public void setInvestShortInterest(double investShortInterest) {
        this.investShortInterest = investShortInterest;
    }
}

package com.ashfaq.LowLevelDesign.DesignATM.ATMStates;

import com.ashfaq.LowLevelDesign.DesignATM.ATM;
import com.ashfaq.LowLevelDesign.DesignATM.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}

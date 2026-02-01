package com.example.observermodelpattern.design;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/1 21:13
 * @phone 15524322169
 */
public class LotteryServiceImpl extends LotteryService{

    private MinibusTargetService minibusTargetService=new MinibusTargetService();
    @Override
    protected LotteryResult doDraw(String uId) {

        String lottery = minibusTargetService.lottery(uId);

        return new LotteryResult(uId,lottery,new java.util.Date());


    }
}

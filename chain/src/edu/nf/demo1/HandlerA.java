package edu.nf.demo1;

/**
 * 直接主管，审批限额为2000元
 */
public class HandlerA extends AbstractHandler{
    @Override
    public void execute(int money) {
        //如果是2000元直接审批处理，否则交给下一个审批人
        if(money<=2000){
            System.out.println("主管审批通过");
        }else{
            //获取下一个审批人
            if(getHandler()!=null){
                getHandler().execute(money);
            }
        }
    }
}

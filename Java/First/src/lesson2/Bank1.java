package lesson2;

public class Bank1 {
    private int money=0;
    
    //變數成員設private，getter讓外部程式可以用:
    //getter method
    public int getMoney(){
        return this.money;
    }
    //setter method
    public void setMoney(int setMoney){
        this.money = setMoney;
    }
    
    
    public int showMyMoney(String account, String password) {
        int myMoney = 0;
        if(account == "edward071123" && password == "123123") {
            myMoney = this.money;
        }else{
            myMoney = -1;
        }
        return myMoney;
    }
}

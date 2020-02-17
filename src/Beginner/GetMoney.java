/**
 * Example from https://blog.csdn.net/kong_gu_you_lan/article/details/57083185
 */

package Beginner;
class GetMoney implements Runnable {

    private Account account;

    public GetMoney(Account account) {
        super();
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "Current account shows"
                    + account.getMoney() + "Yuan");
            // 使效果更明显，休眠10ms
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int money = account.getMoney() - 2000;
            account.setMoney(money);
            System.out.println(Thread.currentThread().getName() + "After the deduction of 2000, account shows"
                    + account.getMoney() + "Yuan");
        }
    }

    public static void main(String[] args) {
        // 创建一个账户，里面有存款5000元
        Account account = new Account(50000);
        // 模拟取钱过程
        GetMoney getMoney = new GetMoney(account);
        new Thread(getMoney, "You: \n").start();
        new Thread(getMoney, "Your wife: \n").start();
        new Thread(getMoney, "Your Kid: \n").start();
        new Thread(getMoney, "Your Husband: \n").start();
        new Thread(getMoney, "Your Mother: \n").start();
        new Thread(getMoney, "Your Father: \n").start();
    }

}

class Account {
    private int money;

    public Account(int money) {
        super();
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

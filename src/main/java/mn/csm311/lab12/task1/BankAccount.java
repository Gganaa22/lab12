package mn.csm311.lab12.task1;

/**
 * Энгийн банкны дансны анги.
 *
 * ДААЛГАВАР 1: Энэ анги бат бөх БИШ.
 *  - Ямар ч оролтын шалгалтгүй
 *  - Null объектуудад хандана
 *  - Дансны invariant (balance >= 0) зөрчигдөж болно
 *
 * Таны даалгавар: Fail-fast зарчим, Design by Contract (precondition)
 * ашиглан энэ ангийг сайжрах. Preconditions зөрчигдвөл тодорхой
 * exception шидэх.
 */
public class BankAccount {

    private final String owner;
    private long balance; // MNT

    public BankAccount(String owner, long initialBalance) {
        // TODO 1.1: owner null эсвэл хоосон (blank) бол
        //          IllegalArgumentException шид.
        //          Жишээ: "owner must not be blank"
        // TODO 1.2: initialBalance < 0 бол IllegalArgumentException шид.
        //          Жишээ: "initialBalance must be non-negative"
        this.owner = owner;
        this.balance = initialBalance;
    }

    public String owner() {
        return owner;
    }

    public long balance() {
        return balance;
    }

    /**
     * Дансны үлдэгдлээс мөнгө гаргах.
     */
    public void withdraw(long amount) {
        // TODO 1.3: amount <= 0 бол IllegalArgumentException шид.
        //           ("amount must be positive")
        // TODO 1.4: balance < amount бол InsufficientFundsException шид.
        //           (жишээ: "insufficient funds: balance=1000, requested=5000")
        balance -= amount;

        // TODO 1.5: invariant шалгах assert ашиглах:
        //           assert balance >= 0 : "invariant violated: balance < 0";
    }

    /**
     * Нэг данснаас өөр данс руу мөнгө шилжүүлэх.
     */
    public static void transfer(BankAccount from, BankAccount to, long amount) {
        // TODO 1.6: from эсвэл to нь null бол IllegalArgumentException шид.
        // TODO 1.7: from == to бол IllegalArgumentException шид
        //           ("cannot transfer to the same account").
        // TODO 1.8: withdraw → дараа нь to.deposit хийх.
        //           Анхаар: from.withdraw амжилттай бол л deposit хийнэ.
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Дансанд мөнгө нэмэх.
     */
    public void deposit(long amount) {
        // TODO 1.9: amount <= 0 бол IllegalArgumentException шид.
        balance += amount;
    }
}

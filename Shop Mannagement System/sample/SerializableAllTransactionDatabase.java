package sample;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializableAllTransactionDatabase implements Serializable{
    protected ArrayList<ArrayList<Product>> allTransactions;
    protected int currentIndex;
}

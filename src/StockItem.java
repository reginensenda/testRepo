/**
 * Created by a224404 on 2017/12/06.
 */
public interface StockItem {

    public int itemID = 0;
    public String itemDescription = "";

    public  int getItemID();

    static String getItemDescription() {
        return itemDescription;
    }

    static void setItemDescription(String itemDescription) {

    }

    static void setItemID(int itemID) {

    }


    }



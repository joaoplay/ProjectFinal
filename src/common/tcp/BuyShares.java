package common.tcp;

/**
 * Created with IntelliJ IDEA.
 * User: joaosimoes
 * Date: 10/20/13
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class BuyShares {

    public int user_id;
    public int idea_id;
    public int share_num;
    public int price_per_share;
    public int new_price_share;

    public BuyShares(int user_id, int idea_id, int share_num, int price_per_share, int new_price_share) {
        this.user_id = user_id;
        this.idea_id = idea_id;
        this.share_num = share_num;
        this.share_num = share_num;
        this.price_per_share = price_per_share;
        this.new_price_share = new_price_share;
    }

}
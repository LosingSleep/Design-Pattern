package src.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/

public class Fence extends Decorator {
    public Fence(CurrentFacility currentfacility) {
        super(currentfacility);
    }

    @Override
    public String getDescription() {
        return getName();
    }

}

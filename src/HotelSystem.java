import java.util.ArrayList;
import java.util.List;

/**
 * Created by 蛟川小盆友 on 2018/10/9.
 */
public class HotelSystem {
    private List<CityClock> cityClocks;

    public HotelSystem(){
        cityClocks = new ArrayList<>();
    }

    public void add(CityClock cityClock){
        cityClocks.add(cityClock);
    }

    public List<CityClock> getCityClocks(){
        return cityClocks;
    }

}

/**
 * Created by 蛟川小盆友 on 2018/10/9.
 */
public class PhoneClock extends Clock{
    private HotelSystem hotelWorldClockSystem;
    private int time;

    public PhoneClock(int utcOffset){
        this.utcSet = utcOffset;
    }

    public void setHotelWorldClockSystem(HotelSystem hotelWorldClockSystem){
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    public void setTime(int time){
        this.time = time;
        if(hotelWorldClockSystem!=null){
            for (CityClock cityClock:hotelWorldClockSystem.getCityClocks()){
                cityClock.setUtcTIme(time-utcSet);
            }
        }
    }

    @Override
    public int getTime() {
        return time;
    }
}

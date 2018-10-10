/**
 * Created by 蛟川小盆友 on 2018/10/9.
 */
public class CityClock extends Clock{

    private int utcTIme;
    public CityClock(int utcOffset){
        this.utcSet = utcOffset;
    }
    @Override
    public int getTime() {
        return (utcTIme+utcSet+24)%24;
    }
    public void setUtcTIme(int utcZeroTIme){
        this.utcTIme = utcZeroTIme;
    }
}

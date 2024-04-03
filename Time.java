public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return "час/минута/секунда" + hour + "/" + minute + "/" + second;
    }
    public void setHour(int Hour){
        if(Hour < 0 || Hour > 23){
            throw new RuntimeException("неправильное время");
        }
        else{
            hour = Hour;
        }
    }
    public void setMinute(int Minute){
        if(Minute < 0 || Minute > 60){
            throw new RuntimeException("неправильное время");
        }
        else{
            minute = Minute;
        }
    }
    public void setSecond(int Second){
        if(Second < 0 || Second > 60){
            throw new RuntimeException("неправильное время");
        }
        else{
            second = Second;
        }
    }
    public void changeHour(int delHour){
        hour += delHour;
        int kol24 = hour / 24;
        for(int i = 0; i < kol24;i++){
            hour -= 24;
        }
    }
    public void changeMinute(int delMinute){
        int delHour = delMinute / 60;
        changeHour(delHour);
        delMinute -= delHour * 60;
        if(delMinute + minute > 60){
            if(hour + 1 > 23){
                hour = 0;
            }
            else{
                hour++;
            }
            minute += delMinute - 60;
        }
        else{
            minute += delMinute;
        }
    }
    public void changeSecond(int delSecond){
        int delMinute = delSecond / 60;
        changeMinute(delMinute);
        delSecond -= delMinute * 60;
        if(delSecond + second > 60){
            if(delMinute + 1 > 60){
                minute = 0;
                if(hour + 1 > 23){
                    hour = 0;
                }
                else{
                    hour++;
                }
            }
            else{
                minute++;
            }
            second += delSecond - 60;
        }
        else{
            second += delSecond;
        }
    }
}

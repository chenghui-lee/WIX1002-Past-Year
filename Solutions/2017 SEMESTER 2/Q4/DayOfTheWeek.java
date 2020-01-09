
public class DayOfTheWeek {

    private int h, q, m, y, J, K;

    public DayOfTheWeek(int q, int m, int y) {
        this.q = q;
        this.m = m;
        this.y = y;
    }

    public boolean isValid() {
        int min = 1, max;
        switch (m) {
            case 4:
            case 6:
            case 9:
            case 11:
                max = 30;
                break;
            case 2:
                if (isLeap()) {
                    m = 14;
                    max = 29;
                    y -= 1;
					break;
                } else {
                    m = 14;
                    max = 28;
                    y -= 1;
                }   break;
            case 1:
                m = 13;
                max = 31;
                y -= 1;
                break;
            default:
                max = 31;
                break;
        }
        return (min <= q && q <= max);
    }

    public boolean isLeap() {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    public int dayOfWeek() {
        J = y/100;
        K = y%100;
        return (int)(q + Math.floor((13 * (m + 1)) / 5) + K + Math.floor(K / 4) + Math.floor(J / 4) + 5 * J) % 7;
    }
    @Override
    public String toString(){
        String[] dayArray = {"is on Saturday", "is on Sunday","is on Monday","is on Tuesday",
        "is on Wednesday","is on Thursday","is on Friday"} ;
        String result = "";
        result += q + "/" + m + "/" + y + " ";
        if (isValid())
            result += dayArray[dayOfWeek()];
        else
            result += "is invalid Input";
        return result;
    }

}

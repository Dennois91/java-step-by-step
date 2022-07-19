import java.util.Calendar;

class uppgift {
    public static void main(String[] args) {

        var dat = Calendar.getInstance() .getTime() .toString();
        String tid = dat.substring(10, 19);
        System.out.println("klockan är" + tid);
    }
}

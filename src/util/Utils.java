package util;

public class Utils {

    public static int randomInt(int low, int high) {
        return (int) Math.floor(Math.random() * (high - low + 1) + low);
    }

    public static String prettyPhoneNum(String phoneNumber){
        String areaCode = phoneNumber.substring(0, 3);
        String secondThree = phoneNumber.substring(3, 6);
        String lastFour = phoneNumber.substring(6);
        return String.format("(%s) %s-%s", areaCode, secondThree, lastFour);
    }

}

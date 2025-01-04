//1. Maximum Element In Array

public class Jaseel_1 {
    public static void main(String[] args) {
        int[] a={1,2,3,9,5,6,8,10};
        int res= MaximumElementInArray(a);
        System.out.println(res);
    }

    static int MaximumElementInArray(int[] a) {
        if (a.length == 0) return 0;
        int MaxVal = a[0];
        for (int i = 1; i < a.length; i++) {
            if (MaxVal < a[i]) {
                MaxVal = a[i];
            }
        }
        return MaxVal;
    }
}


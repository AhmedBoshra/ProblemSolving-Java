package codeWars.Easy;

public class IsNDivisibleByXandY {
    public class DivisibleNb {
        public static Boolean isDivisible(long n, long x, long y) {
            return (n%x ==0) && (n%y ==0);
        }
    }
}

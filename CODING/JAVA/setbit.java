public class setbit {
    public static void main(String args[]) {
        int a = 5;  // Binary: 0101 
        int pos=1;
        int bitmask=1<<pos;
        int newnumber=bitmask|a;
        System.out.println(newnumber);
    }
} 
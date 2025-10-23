public class getbit {
    public static void main(String args[]) {
        int a = 5;  // Binary: 0101 if it is kept 8 i.e. 1000 ans will be "Bit was zero"
        int pos=2;
        int bitmask=1<<pos;
        if((bitmask&a)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
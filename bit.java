class bit {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 5;
        int pos = 1;
        int op = 1;
        int bitmask = 1 << pos;
        int notbitmask = ~(bitmask);
        int clearnum = n & notbitmask;
        // if((bitmask & n)==0){
        // System.out.println("Bit was Zero");
        // }else{
        // System.out.println("Bit was One");
        // }
        int newnum = bitmask | n;

        // System.out.println("The new no is : "+clearnum);
        if (op == 1) {
            System.out.print(newnum);
        } else {
            System.out.print(clearnum);
        }

    }
}
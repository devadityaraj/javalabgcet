class sum {
    public static void main( String args[] ) {
    int num=0;
        for (String arg : args) {
            num += Integer.parseInt(arg);
        }
      System.out.println("The sum is " + num);
       }
    }
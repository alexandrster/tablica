
public class tablica {
    public static void main(String[] args){
        for(int i=1; i< 10; i++){
            for(int j=1;j<10;j++){
                int x = i*j;
                //System.out.print(i);
                //System.out.print(" * ");
                //System.out.print(j);
                //System.out.print(" = ");
                System.out.printf(" %2d", x);
                //System.out.println();
                //System.out.format("'%2'%n", 'x');
                //String str = String.format("%2,2f", j);
                //System.out.printf(str);
            }
            System.out.println();
        }
    }

}

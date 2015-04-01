public class Main {

    public static void main(String[] args) {

        int kroki = 0;
        int n = 9;

        while(n>1){
            if(n%2==0){
                n=n/2;
            }else{
                n=n*3;
                n=n+1;
            }
            kroki++;
        }
        System.out.print(kroki);
    }
}

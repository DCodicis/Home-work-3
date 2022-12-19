public class Progression {
    private int y, x;

    public Progression(){
        y = 2;
        x = -3;
    }

    public Progression(int a, int b){
        y = a;
        x = b;
    }

    public int getElement(int k){
        for(int i=1; i<k; i++){
            x = x + y;
        }
        return x;
    }

    public void showProg(int n){
        for(int i=0; i<n-1; i++){
            System.out.print(x+",");
            x = x + y;
        }
        System.out.println(x);
    }

    public void showProg(){
        for(int i=1; i<=10-1; i++){
            System.out.print(x+",");
            x+=y;
        }
        System.out.println(x);
    }
    
    public void showProgUpTo(int n){
        int sum = 0, num = x, tag = n;
        while(tag>=num){
            sum++;
            tag = tag - y;
        }

        for(int i=1;i<sum-1; i++){
            if(x==n){
                x = x - y;
                System.out.print(x);
            }
            System.out.print(x+",");
            x = x + y;
        }
        System.out.println(x);
    }

    public int sum(int n){
        int sum = x;
        for(int i = 1; i<n; i++){
            x = x + y;
            sum = sum + x;
        }
        return sum;
    }
}

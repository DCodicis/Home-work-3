public class Calculator {
    
    public int countDigits(int a){
        int i = 0, num = a;

        while(num!=0) {
            num = num / 10;
            i++;
        }
        return i;
    }

    public boolean evenOdd(int num) {
        int eSum = 0, oSum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                eSum = eSum + digit;
            } 
            else {
                oSum = oSum + digit;
            }
            num /= 10;
        }
        return eSum > oSum;
    }

    public int getLastDigit(int c){
        int num = c, lastNum = 0;
        while(num!=0){
            lastNum = num % 10;
            num = num / 10;
        }
        return lastNum;
    }

    public int getDigit(int num, int k){
        for(int i = 0; i < k; i++){
            num = num / 10;
        }
        num = num % 10;
        return num;
    }

    public int setDigit(int num, int k, int d){
        int r = 0, mult = 1, i = 0;
        for(i = 0; i <= k; i++){
            int x = num % 10;
            if(i==k){
                r = r + d * mult;
            }
            else{
                r = r + x * mult;
            }
            mult = mult * 10;
            num = num / 10;
        }
        if (num == d){
            r = r + d * mult;
        }
        else{
            r = r + num * mult;
        }
        return r;
    }

    public int getLastDigit2(int a){
        int num = countDigits(a);
        return getDigit(a, num-1);

    }
    
    public int countMinDigit(int b){
        int min = 9, count = 0, big = b;
        while(b != 0){
            int r = b % 10;
            min = Math.min(r, min);
            b = b / 10;
        }
        while(big!=0){
            int num = big % 10;
            if(num == min){
                count++;
            }
            big = big / 10;
        }
        return count;
    }

    public boolean isSymmetric(int num){
        int x = num, num2 = 0;
        while(num!=0){
            num2 = num2 * 10 + num % 10;
            num = num / 10;
        }
        if (x == num2) {
          return true;
        }
        else {
            return false;
        }
    }
    public int serch(int num, int d){
        int x = 0, i = 0;
        while(num!=0){
            x = num % 10;
            if(x==d){
                i++;
            }
            num = num / 10;
        }
        return i;
    }
}




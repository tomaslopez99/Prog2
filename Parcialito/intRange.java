package prog2.Parcialito;

public class intRange {
    int[] range;
    public intRange(int start, int end, int increment){
        range = new int[(end-start)/increment+1];
        range[0] = start;
        range[range.length-1] = end;
        for(int i = 1; i<range.length-1; i++){
            range[i] = range[i-1] + increment;
        }
    }

    public int position(int numberInRange){
        for(int i = 0; i<range.length; i++){
            if(range[i] == numberInRange){
                return i;
            }
        }
        return 0;
    }

    public int numberInIndex(int index){
        return range[index];
    }

    public boolean isNumberInRange(int number){
        for(int i = 0; i<range.length; i++){
            if(range[i] == number){
                return true;
            }
        }
        return false;
    }

    public int sumTwoNumbers(int indexOfNumber1, int indexOfNumber2){
        return range[indexOfNumber1] + range[indexOfNumber2];
    }

    public int sumAll(){
        int sum = 0;
        for(int i = 0; i<range.length; i++){
            sum += range[i];
        }
        return sum;
    }

    public void printRange(){
        for(int i = 0; i<range.length; i++){
            System.out.println(range[i]);
        }
    }

    public int[] intersection(intRange range2){
        int[] intersects;
        int length = 0;
        int x = 0;
        for(int i = 0; i<range.length; i++){
            if(isNumberInRange(range2.numberInIndex(i))==true){
                length += 1;
            }
        }
        intersects = new int[length];
        for(int i = 0; i<range.length; i++){
            if(isNumberInRange(range2.numberInIndex(i))==true){
                intersects[x] += range2.numberInIndex(i);
                x += 1;
            }
        }
        return intersects;
    }
}

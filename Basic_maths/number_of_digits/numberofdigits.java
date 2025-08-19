import java.util.*;

public class numberofdigits{
    public static void main(String args[]){
        int n=444;
        int count=0;
        
        while(n>0){
            
            count=count+1;
            n=n/10;
        }
        System.out.println("Number of digits: "+count);
    }
}


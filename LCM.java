package Arrays;

public class LCM {
    public static int findGCD(int ele1,int ele2){
        if(ele2==0)
            return ele1;

        return findGCD(ele2,ele1%ele2);
    }
    public static void main(String[] args) {
        int[] array={12,15,9,10,6,3};
        int lcm=array[0];
        int gcd=array[0];
        for(int i =1;i< array.length;i++){
            gcd=findGCD(array[i],lcm);
            lcm=(lcm*array[i])/gcd;
        }
        System.out.println("LCM is- "+ lcm);
    }
}

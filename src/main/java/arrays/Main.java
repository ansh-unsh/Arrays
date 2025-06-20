package arrays;

public class Main {
    public static void main(String args[])
    {
        int[] myIntArray = new int[10];
        myIntArray[5]=50;

        double[] myDouble = new double[10];
        myDouble[2]=5.6;


        System.out.printf("IntArray: %d, DoubleArray: %.1f", myIntArray[5], myDouble[2]);


        int[] arrayList={1,2,3,4,5,6,7,8,9,0,01,02,03,50};
        System.out.printf("\nArray List at 5: %d\n", arrayList[5]);

        int length=arrayList.length;
        System.out.println("Length Of Array: "+length);
        System.out.println("Last element in Array: "+arrayList[length-1]);



        int[] newArray=new int[] {1,2,2,3,4,5,65};
        int nlength=newArray.length;
        for(int i=0; i<nlength; i++)
        {
            System.out.println(newArray[i]);

        }

        System.out.println("");


    }
}

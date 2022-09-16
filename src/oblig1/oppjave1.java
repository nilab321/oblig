package oblig1;
import java.util.NoSuchElementException;
import  java.util.Arrays;

public class oppjave1 {
    public static void main(String[] args) {


    }

 // oppgave 1:
    public static int maks(int[]arr){
        if (arr.length<1){
      throw new NoSuchElementException("Arryet er tom");// hvis arrayet er tom
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }


        }


        return arr[arr.length-1];  // bytter plass til elementene  største verdi ligger bakerst
        // der det bytter plass til elementene om første er større enn den andre.

    }

    public static int bytte(int[] arr){
        if (arr.length < 1){
            throw new NoSuchElementException("Arrayet arr er tom");
        }
        int teller = 0;// først teller er 0

        for (int i=0; i<arr.length-1; i++){
            if (arr[i] < arr[i+1]){

                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
                teller++;

            }
        }

        return teller;// telleren teller hvor mange ganger bytte plassen på elementer
    }



//oppgave 2:
    static int sorting(int arr[])
    {
        if(arr.length == 0)
            return 0;
        int count = 0;
        for(int i =0; i<arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])// hvis det er ikke sortert stigende
            {
                throw new IllegalStateException("The array is not in ascending order..!!");
            }
            if(arr[i] < arr[i+1])
                count++;
        }
        return count+1;


    }

    //Oppgave 3:
    public static int sorting_2(int[]a){
        if (a.length<1){
            return 0;
        }
        int teller =a.length;
        for (int i= 0;i<a.length;i++){
            for (int j= i+1;j<a.length;j++){
                if (a[j]==a[i]){
                    teller--;
                    break;
                }
            }
        }
        return teller;// først forlokke  begynner fra o-indeksen og den andre begynner fra 1. break hvis
    }





    // 4

    static void oddEvenSeparate(int a[])
    {
        Arrays.sort(a);
        int i,j;
        i = j =0;

        int sol[] = new int[a.length];// new array


        for(i = 0; i<a.length; i++)
        {
            if(a[i] % 2 != 0)
            {
                sol[j] = a[i];
                j++;
            }
        }
        for(i = 0; i<a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                sol[j] = a[i];
                j++;
            }
        }

        System.out.println("Updated array is : ");
        for(i = 0; i<a.length; i++)
        {
            System.out.print(sol[i]+",");
        }

    }


    // Oppgave 5:
    public static void rotasjon(char[] a) {
        if (a.length <1){
            return;
        }
        char siste = a[a.length - 1];

        for (int i = a.length - 1; i > 0; i--){
            a[i] = a[i - 1];
        }

        a[0] = siste;

    }

    //oppgave 6:

    static void shift(char []a, int k)
    {
        int n = k;
        if(n > 0)
        {
            while(k > 0)
            {
                char next = a[0];
                for(int i = 0; i<a.length-1; i++)
                {
                    char temp = a[i+1];
                    a[i+1] = next;
                    next = temp;
                }
                a[0] = next;
                k--;

            }

        }
        if(n < 0)
        {
            int l = Math.abs(n);
            while(l > 0)
            {
                char start = a[0];
                for(int i = 0; i<a.length-1; i++)
                {
                    a[i] = a[i+1];
                }
                a[a.length-1] = start;
                l--;
            }

        }

        for(int  i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }


    }





    // oppgave 7:
    public static String flett(String s, String t) {

        int st = Math.min(s.length(), t.length());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<st; i++){
            stringBuilder.append(s.charAt(i)).append(t.charAt(i));
        }
        stringBuilder.append(s.substring(st)).append(t.substring(st));

        return stringBuilder.toString();
    }




    // oppgave 9:

    static void threeSmallest(int arr[])
    {
        int first,second,third;
        first = second = third = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] < first)
            {
                int temp = first;
                first = arr[i];
                third = second;
                second = temp;

            }
            else if( arr[i] < second)
            {
                third = second;
                second = arr[i];
            }
            else if( arr[i] < third)
            {
                third = arr[i];
            }
        }
        System.out.println(first +"   "+ second+"    "+ third);
    }











}

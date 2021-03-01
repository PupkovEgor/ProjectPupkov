package Laba2;

public class Arraysix {

    public static int[] arr()   {
            int[] ar = new int[6];
            for (int i = 0; i < ar.length; i++) {
                Randomize l=new Randomize();
                ar[i]=l.rand();
            }
            return ar;
        }
    }
package com.tugcegulsanusta.datastructure.bbs516;

public class Bbs {
    static int Recursive ( int array [], int index ,int n, int depth){

        int val1;
        int val2;
        if(n==1){
            for (int i = 0; i < depth; i++) {
                System.out.print(" -- ");
            }
            System.out.println(index +" "+ n +" :"+array[index]);
            return array[index];
        }
        val1 = Recursive(array,index,n/2,depth++);
        val2 = Recursive(array,index+ n/2, n-(n/2),depth++);
        if(val1> val2){
            for (int i = 0; i < depth; i++) {
                System.out.print(" -- ");
            }
            System.out.println(index +" "+ n +" :"+val1);
            return val1;
        }else{
            for (int i = 0; i < depth; i++) {
                System.out.print(" -- ");
            }
            System.out.println(index +" "+ n +" :"+val2);
            return val2;
        }
    }
    public static void main(String[] args){
        int[] a = new int[]{ 14,12,18,15,2,16,4,13 };
        System.out.println(Recursive(a,0,8,0));
    }
}

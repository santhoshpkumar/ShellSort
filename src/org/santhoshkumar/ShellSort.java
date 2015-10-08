package org.santhoshkumar;

public class ShellSort {
    int[] values;

    public static void main(String[] args) {
        ShellSort ss = new ShellSort();
        int aa[] = {9,8,6,7,3,4,5,2,1,0};
        ss.values = aa;
        ss.sort();
        ss.print();
    }

    public void sort(){

    }

    public void print(){
        for (int i=0; i < values.length; i++){
            System.out.print(values[i]);
        }
        System.out.println();
    }

    public void swap(int src, int dst){
        int tmp = values[src];
        values[src] = values[dst];
        values[dst] = tmp;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Matrix();
        ArrayOfArraysDemo();
    }

    public static void Matrix(){
        int[][] matrix = new int[4][5];
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                matrix[i][j] = i + j;
            }
        }
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void  ArrayOfArraysDemo(){
        String[][] cartons = {
                {"Flintstones", "Fred", "Wilma", "Pebbles", "Dino"},
                {"Rubbles", "Barney", "Betty", "Bam Bam"},
                {"Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie", "Astro"},
                {"Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred", "Daphne"}
        };
        for (int i=0;i<cartons.length;i++) {
            System.out.print("cartoons[" + i + "]" + "," + cartons[i].length + "elements:");
            for (int j=0;j<cartons[i].length;j++) {
                System.out.print(cartons[i][j]+(j<cartons[i].length-1?",":""));
            }
            System.out.println();
        }
    }


}

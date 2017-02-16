/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.t02;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int cate,he,ph,sue,pg;
        System.out.println("Ingrese su suledo base");
        sue=kb.nextInt();
        System.out.println("Ingrese su categoria de trabajo. Las opciones son de 1 a 8");
        cate=kb.nextInt();
        do{
            System.out.println("Introdujo un numero equivocado");
            System.out.println("Ingrese su categoria de trabajo. Las opciones son de 1 a 8");
            cate=kb.nextInt();
        }while(cate<1 || cate >8);
        System.out.println("Ingrese sus horas extra de trabajo");
        he=kb.nextInt();
        switch (cate){
            case 1:
                ph=30;
                pg=sue+(ph*he);
                System.out.println("Ustes cuenta con un salario de $"+pg);
                break;
            case 2:
                ph=38;
                pg=sue+(ph*he);
                System.out.println("Ustes cuenta con un salario de $"+pg);
                break;
            case 3:
                ph=50;
                pg=sue+(ph*he);
                System.out.println("Ustes cuenta con un salario de $"+pg);
                break;
            case 4:
                ph=70;
                pg=sue+(ph*he);
                System.out.println("Ustes cuenta con un salario de $"+pg);
                break;
            case 5:
                ph=100;
                pg=sue+(ph*he);
                System.out.println("Ustes cuenta con un salario de $"+pg);
                break;
            case 6:
                ph=140;
                pg=sue+(ph*he);
                System.out.println("Ustes cuenta con un salario de $"+pg);
                break;
            case 7:
                ph=190;
                pg=sue+(ph*he);
                System.out.println("Ustes cuenta con un salario de $"+pg);
                break;
            case 8:
                ph=250;
                pg=sue+(ph*he);
                System.out.println("Ustes cuenta con un salario de $"+pg);
                break;
        }
        }
            
    }
               
    
    


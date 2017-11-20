/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towersofhanoi;

import java.util.Scanner;

/**
 *
 * @author jonassimonsen
 */
public class TowersOfHanoi {

    public void solve(int disc, String start, String helper, String end) {
        if (disc == 1) {
            System.out.println(disc + "->" + end);
        } else {
            solve(disc -1, start, end, helper);
            System.out.println(disc + "->" + end);
            solve(disc -1, helper, start, end);
        }
    }
    
    
    public static void main(String[] args) {
        TowersOfHanoi towerOfHanoi = new TowersOfHanoi();
        System.out.println("Enter number of disc: ");
        Scanner scanner = new Scanner(System.in);
        int disc = scanner.nextInt();
        towerOfHanoi.solve(disc, "start", "helper", "end");
    }
}

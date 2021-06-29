package montecarlo;

import java.util.ArrayList;
import java.util.Scanner;

public class MonteCarlo 
{
    public static void main(String[] args) 
    {
        /*Scanner scan = new Scanner(System.in);
        Model m = new Model();
        System.out.print("Enter Number of Data : ");
        int dataNum = scan.nextInt();
        Model.setNumOfData(dataNum);
        System.out.print("Enter Number of Simulation : ");
        int simuNum = scan.nextInt();
        Model.setNumOfSimulations(simuNum);
        
        
        ArrayList<Integer> data = new ArrayList<>();
        System.out.println("Enter Data :: ");
        for(int i=0; i<dataNum; i++) {
            System.out.print(i+".  ");
            data.add(i,scan.nextInt());
        }
        m.setData(data);
        
        ArrayList<Double> freq = new ArrayList<>();
        System.out.println("Enter Freq :: ");
        for(int i=0; i<dataNum; i++) {
            System.out.print(i+".  ");
            freq.add(i,scan.nextDouble());
        }
        m.setFrequency(freq);
        
        ArrayList<Integer> rand = new ArrayList<>();
        System.out.println("Enter Random Numbers :: ");
        for(int i=0; i<simuNum; i++) {
            System.out.print(i+".  ");
            rand.add(i,scan.nextInt());
        }
        m.setRandomNumbers(rand);
        
        m.getProbabiltyFromFreq();
        m.getCumulativeProbability();
        m.setIntervalOfRandomNumbers();
        System.out.println(m.Simulations());
        
        System.out.println("Start");
        for(int i=0; i<m.from().size(); i++) {
            System.out.print(m.from().get(i)+",");
        }
        System.out.println("\nEnd");
        for(int i=0; i<m.to().size(); i++) {
            System.out.print(m.to().get(i)+",");
        }*/
        
        /*InputPage i = new InputPage();
        i.setVisible(true);*/
        
        HomePage home = new HomePage();
        home.setVisible(true);
    }
    
}

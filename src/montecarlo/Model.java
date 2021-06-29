package montecarlo;

import java.util.ArrayList;

public class Model 
{
    private final static ArrayList<Double> FrequencesList              = new ArrayList<>();
    private final static ArrayList<Double> ProbabilitiesList          = new ArrayList<>();
    private final static ArrayList<Double> CumulativeProbabilitiesList = new ArrayList<>();
    public final static ArrayList<Integer> StartList                   = new ArrayList<>();
    public final static ArrayList<Integer> EndList                     = new ArrayList<>();
    private final static ArrayList<Integer> RandomNumbersList          = new ArrayList<>();
    private final static ArrayList<Integer> SimulationsList            = new ArrayList<>();
    private final static ArrayList<Integer> DataList                   = new ArrayList<>();
    
    private double maxCum , minCum;
    private static int numOfData , numOfSimulations;
    
    public static void setNumOfData(int numOfData) {
        Model.numOfData = numOfData;
    }

    public static void setNumOfSimulations(int numOfSimulations) {
        Model.numOfSimulations = numOfSimulations;
    }

    public static int getNumOfData() {
        return numOfData;
    }

    public static int getNumOfSimulations() {
        return numOfSimulations;
    }
       
    public void setFrequency(ArrayList<Double> freq)
    {
        for(int i=0; i<getNumOfData(); i++) {
            FrequencesList.add(i,freq.get(i));
        }
    }
    
    public ArrayList<Double> getFrequencyList() {
        return FrequencesList;
    }
    
    private double summitionOfFrequences(ArrayList<Double> freq)
    {
        double sum = 0.0;
        for(int i=0; i<getNumOfData(); i++) {
            sum += FrequencesList.get(i);
        }
        return sum;
    }
    
    public void getProbabiltyFromFreq()
    {
        double TotalFreq = summitionOfFrequences(FrequencesList); 
        for(int i=0; i<getNumOfData(); i++)
        {
            ProbabilitiesList.add(i,(FrequencesList.get(i)/TotalFreq));
        }
    }
    
    public void setProbability(ArrayList<Double> pr)
    {
        for(int i=0; i<getNumOfData(); i++) {
            ProbabilitiesList.add(i,pr.get(i));
        }
    }
    
    public void getCumulativeProbability()
    {
        double val = 0.0;
        for(int i=0; i<getNumOfData(); i++) {
            val = val + ProbabilitiesList.get(i);
            CumulativeProbabilitiesList.add(i,val);
        }
    }

    public static ArrayList<Double> getFrequencesList() {
        return FrequencesList;
    }

    public static ArrayList<Double> getProbabilitiesList() {
        return ProbabilitiesList;
    }

    public static ArrayList<Double> getCumulativeProbabilitiesList() {
        return CumulativeProbabilitiesList;
    }

    public static ArrayList<Integer> getStartList() {
        return StartList;
    }

    public static ArrayList<Integer> getEndList() {
        return EndList;
    }

    public static ArrayList<Integer> getSimulationsList() {
        return SimulationsList;
    }
    
    public void setIntervalOfRandomNumbers()
    {      
        minCum = CumulativeProbabilitiesList.get(0);
        for(int i=1; i<getNumOfData(); i++) {
            if(minCum > CumulativeProbabilitiesList.get(i)) {
                minCum = CumulativeProbabilitiesList.get(i);
            }
        }
        
        maxCum = CumulativeProbabilitiesList.get(0);
        for(int i=1; i<getNumOfData(); i++) {
            if(maxCum < CumulativeProbabilitiesList.get(i)) {
                maxCum = CumulativeProbabilitiesList.get(i);
            }
        }
        
        double n = (maxCum - minCum + 1);
        for(int counter=0; counter<getNumOfData(); counter++) {
            double i = CumulativeProbabilitiesList.get(counter) % n;
            EndList.add((int)(i*100));
        }
        System.out.println();
        if(EndList.get(0) > 0)
        {
            StartList.add(0,1);
        }
        else if(EndList.get(0) == 0)
        {
            StartList.add(0,0);
        }
        
        int j=0;
        for (int i = 1; i < getNumOfData(); i++) {
            if (EndList.get(j) < 100) {
                StartList.add(i, (EndList.get(j) + 1));
            } else {
                StartList.add(i, 100);
            }
            j++;
        }
    }

    
    public void setRandomNumbers(ArrayList<Integer> rd)
    {
        for(int i=0; i<getNumOfSimulations(); i++) {
            RandomNumbersList.add(i,rd.get(i));
        }
    }
    
    public ArrayList<Integer> getRandomNumbersList()
    {
        return RandomNumbersList;
    }
    
    public void setData(ArrayList<Integer> data)
    {
        for(int i=0; i<getNumOfData(); i++) {
            DataList.add(i,data.get(i));
        }
    }
    
    public ArrayList<Integer> getDataList() {
        return DataList;
    }
    
    public void Simulations()
    {
        for(int i=0; i<getNumOfSimulations(); i++)
        {
            for(int j=0; j<getNumOfData(); j++)
            {
                if(getRandomNumbersList().get(i) >= getStartList().get(j) && getRandomNumbersList().get(i) <= getEndList().get(j)) {
                    getSimulationsList().add(i,getDataList().get(j));
                    break;
                }
            }
        }    
    }
    
}

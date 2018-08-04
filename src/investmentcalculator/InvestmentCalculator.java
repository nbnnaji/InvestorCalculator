/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investmentcalculator;

/**
 *
 * @author nkechi_nnaji
 */
public class InvestmentCalculator {

    double investmentAmount;
    double value;
    double devalueAmount;

    public void increaseInvestmentValue(){
        
       investmentAmount = investmentAmount + (investmentAmount * value/100);
          
    }
    
    public void decreaseInvestmentValue(){
       
        investmentAmount = investmentAmount - devalueAmount ;
        
 
    }
    
    public void showInvestment(){
        System.out.println( investmentAmount);
         
    }
    
    public static void main(String[] args) {
        InvestmentCalculator save = new InvestmentCalculator();
        
        //Set values for investment calculations
        save.investmentAmount = 14000;
        save.value = 40;
        save.devalueAmount= 1500;
        
        //First year
        save.increaseInvestmentValue();
         System.out.println("First Year: ");
        save.showInvestment();
        
        //Investment loss
        save.decreaseInvestmentValue();
        System.out.println("Second Year: ");
        save.showInvestment();
       
        //Change value 
        save.value = 12;
        save.increaseInvestmentValue();
        System.out.println("Third Year: ");
         
        save.showInvestment();
    }
}    
    
        
    


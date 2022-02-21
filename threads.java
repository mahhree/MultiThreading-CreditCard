public class threads extends Thread {
    private int id;
    private creditcard myCard;
    //public threads(){}
    public threads(int id, creditcard card) 
    {
            this.id = id;
            this.myCard = card;
    }
    


//*******notes*******
// when you break into multiple threads there is no guarantee which thread goes first 
//running at same time 
//one thread does not impact the other
//cant do subclass if you do extend
//implement allows subclasses
//mythread.join() stops program until thread is complete 
//*******notes*******



    public void run() {
        //
        while(true) 
        {
            if(isStepsTF(myCard))
                    break;
        }
    }

    
        

    public synchronized boolean isStepsTF(creditcard card) 
    {
        if(id == 1 && card.getStep() == 1) {
            card.stringToNumber();
            card.addStep();

            return true;
        }
        else if(id == 2 && card.getStep() == 2) {
            card.calculateAltDigitSum();
            card.addStep();

            return true;
        }
        else if(id == 3 && card.getStep() == 3) {
            card.add();
            card.addStep();

            return true;
        }
        else if(id == 4 && card.getStep() == 4) {
            card.findValidInvalid();
            card.addStep();

            return true;
        }
        return false;
    }
}
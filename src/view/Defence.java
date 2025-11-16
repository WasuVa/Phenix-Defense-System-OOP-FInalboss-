package view;

import java.util.ArrayList;

interface DefenceObserverableInterface{
    
    public void updateButtons();
    public void getMsgMain(String msg);
    public void areaClear(boolean clear);
    public void setPosition(int position);
}

class DefenceObserverable implements DefenceObserverableInterface{
    int position;

    private final ArrayList<DefenceObserver>observerList=new ArrayList<>();
    public void addDefenceObserver(DefenceObserver ob){
        observerList.add(ob);
    }
    
    @Override
    public void updateButtons() {
       
    }
    
    @Override
    public void getMsgMain(String msg) {
          for (DefenceObserver ob:observerList) {
            ob.getMsgMain(msg);
    }
  }

    @Override
    public void areaClear(boolean clear) {
        for (DefenceObserver ob:observerList) {
            ob.areaClearLabel(clear);
    }
}
    @Override
    public void setPosition(int position) {
         if (this.position!=position) {
            this.position=position;
            notifyDefence();
     }
   }
     public void notifyDefence(){
        for (DefenceObserver ob:observerList) {
            ob.update(position);
            updateButtons();
        }
     }
  }
     

public class Defence {

    public static void main(String[] args) {
     DefenceObserverable defenceObserverable=new DefenceObserverable();
     
     defenceObserverable.addDefenceObserver(new Helicopters());
     defenceObserverable.addDefenceObserver(new Tank());
     defenceObserverable.addDefenceObserver(new Submarine());
     
     new MainController(defenceObserverable).setVisible(true);
     
    }
}


package model;

public interface DefenseObserver {
   public void updateMessage(String message);
   public void clearArea(boolean clear);
   public void buttonEnable(int value);
}

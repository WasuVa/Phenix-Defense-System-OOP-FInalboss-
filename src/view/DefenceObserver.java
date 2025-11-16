package view;

public interface DefenceObserver {
    public void getMsgMain(String msg);
    public void update(int position);
    public void areaClearLabel(boolean clear);
    public void updateButtons();
}

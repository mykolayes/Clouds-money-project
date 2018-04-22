package Supports.Utils.ExpandableLayout;

public interface ExpandableLayoutListener {

    void onAnimationStart();

    void onAnimationEnd();

    void onPreOpen();

    void onPreClose();

    void onOpened();

    void onClosed();
}
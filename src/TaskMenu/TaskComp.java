package TaskMenu;

import java.util.Comparator;
public class TaskComp implements Comparator <Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o2.getPriorCode()- o1.getPriorCode();
    }
}

import java.util.ArrayList;
import java.util.Comparator;

public class FCFS {

    public FCFS(ArrayList<Process> p){
        p.sort(Comparator.comparingInt(a -> a.AT));
        int cT=0;
        double totalWT=0;

        double totalTAT=0;

        for(Process i: p){
            i.WT= Math.max(cT-i.AT,0);
            cT= Math.max(cT,i.AT) + i.BT;
            i.TAT= i.WT + i.BT;
            totalTAT+= i.TAT;
            totalWT+= i.WT;
        }
        System.out.println("pid  AT  BT  WT  TAT  Priority");
        for(Process i: p) i.display();
        System.out.println("Total TAT ="+ totalTAT);
        System.out.println("Total WT ="+ totalWT);
    }
}

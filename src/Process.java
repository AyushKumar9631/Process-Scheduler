// a class defined foe process to contain information such as arrival time, burst time etc.

public class Process {
    int pid;
    int BT;
    int AT;
    int WT;
    int TAT;
    int priority=0;

    //constructor to call a priority-less process
    public  Process(int pid, int AT, int BT){
        this.pid=pid;
        this.AT=AT;
        this.BT=BT;
    }

    //constructor to call a priority process
    public Process(int pid, int AT, int BT,int priority){
        this.pid=pid;
        this.AT=AT;
        this.BT=BT;
        this.priority=priority;
    }

    //function to show current status of process
    public void display(){
        System.out.println(pid+"  "+AT+"  "+BT+"  "+WT+"  "+TAT+"  "+priority);
    }

}

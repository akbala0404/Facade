package com.company;

public class WorkFlow  {
    Employee employee=new Employee();
    Work work=new Work();
    EDM edm= new EDM();

     public void workProcess(){
         work.work();
         edm.connecting();
         employee.workWithDoc(edm );
     }
}

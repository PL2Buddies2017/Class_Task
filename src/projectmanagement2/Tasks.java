/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanagement2;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Tasks {
   private  int id;
   private  String Task_Name;
   private int Project_Id;
   private  String Task_Descripion;
   private boolean Status;
   private float Progress;
   public static ArrayList<employee> Task =new ArrayList<employee>();
   //Setter Functions
public void  Set_TaskId(int id)
{
this.id=id;
}
public void Set_TaskName(String Task_Name)
{    
this.Task_Name=Task_Name;
}
public void Set_Project_Id(int Project_Id)
{
this.Project_Id=Project_Id;
}
public void Set_TaskDescriapion(String Task_Descripion )
{
 this.Task_Descripion=Task_Descripion;   
}
public void Set_TaskStatus(boolean Status)
{
this.Status=Status;
}
//Getter Functions
public int Get_TaskId()
{
    return id;
}
public String Get_TaskName()
{
    return Task_Name;
}
public String Get_TaskDescription()
{
    return Task_Descripion;
}
public boolean Get_TaskStatus()
{
    return Status;
}
public float Get_Taskprogress()
{
    return Progress;
}
public Tasks(int id ,String Task_Name , int Project_Id, String Task_Descripion )
{
    this.Project_Id=id;
    this.Task_Name=Task_Name;
    this.Project_Id=this.Project_Id;
    this.Task_Descripion=Task_Descripion;
    
}       
    public boolean Write_To_File()
    {
       return FileManger.write(FileName,Task);
    }
    public void Read_From_File()
    {
        Task =(ArrayList<task> FileManger.read(FileManger));
    }
    public int Get_Finished_Task()
    {
        Read_From_File();
       for (employee Task1 : Task) {
           if(Task==null)
           {
               return 1;
           }
       }
        return -1;
    }
    empolyee x=new empolyee();
    public int AssignTask(empolyee x ,String FilePath)
    {
         String TaskPath= FilePath;
        Write_To_File();
     return 0;
    }
    public int Add_New_Employee( employee x)
    {
        int z = 0;
        for (int i = 0; i < Task.size(); i++) {
            if (id == id) {
              z++;  
            }
       
    }
        return z;       
 }
}



/**
 * Created by a224404 on 2017/12/14.
 */
public class Employee {

   private int empID;
   public String empName;
   public String empSurname;
   public double empSalary;




   public Employee( int empID,  String empName, String empSurname,double empSalary) {
       this.empID = empID;
       this.empName = empName;
       this.empSurname = empSurname;
       this.empSalary = empSalary;

   }

    public double getEmpSalarySalary() {
        return empSalary;
    }

    private int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    private void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public void setEmpSalarySalary(double salary) {
        this.empSalary = salary;
    }


    public void raiseSalary(double rate){

       double  increase = this.empSalary * rate;
        this.empSalary += this.empSalary * rate;

       }

}


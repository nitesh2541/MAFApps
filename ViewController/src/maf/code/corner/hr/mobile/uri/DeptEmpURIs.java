//Copyright © 2014 Oracle and/or its affiliates. All rights reserved.
package maf.code.corner.hr.mobile.uri;

//Copyright © 2014 Oracle and/or its affiliates. All rights reserved.

public class DeptEmpURIs {
    
    private static final String DEPARTMENTS_URI = "/dept";
    private static final String EMPLOYEES_URI = "/employees";
    
    
    //departments URI
    public static String GetAllDepartmentsURI(){ return DEPARTMENTS_URI; }
    public static String GetDepartmentsByIdURI(Integer deptId){ return DEPARTMENTS_URI+"/"+deptId;}
    
    
    public static String PostDepartmentsUpdateURI(){ return DEPARTMENTS_URI;}
 //   public static String GetEmployeesinDept(Integer deptId){ return DEPARTMENTS_URI+"/"+deptId+"/employees";}
    public static String PutDepartmentsCreateURI(){ return DEPARTMENTS_URI;}
//    public static String PutDepartmentsCreateEmployeeURI(Integer deptId){ return DEPARTMENTS_URI+"/"+deptId+"/employee";}
    public static String DeleteDepartmentsRemoveURI(Integer deptId){ return DEPARTMENTS_URI+"remove/"+deptId;}
    
    //employeesURI
    
    public static String GetAllEmployeesURI(){ return EMPLOYEES_URI; }
    public static String GetEmployeeByIdURI(Integer empId){ return EMPLOYEES_URI+"/"+empId;}
    
    public static String POSTRelocateEmployeesByDeptEmpIdURI(Integer toDeptId, Integer empId){ return EMPLOYEES_URI+"/relocate?employeeId="+empId+"+departmentId="+toDeptId;}
    public static String PostEmployeeUpdateURI(){return EMPLOYEES_URI;}
    public static String PutEmployeeCreateURI(){ return EMPLOYEES_URI;}
    
    public static String DeleteEmployeeRemoveURI(Integer empId){ return EMPLOYEES_URI+"remove/"+empId;}
    
}

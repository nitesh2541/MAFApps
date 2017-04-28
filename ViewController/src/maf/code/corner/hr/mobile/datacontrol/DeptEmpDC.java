package maf.code.corner.hr.mobile.datacontrol;

//Copyright © 2014 Oracle and/or its affiliates. All rights reserved.

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import maf.code.corner.hr.mobile.entities.DepartmentsEntity;



import maf.code.corner.hr.mobile.json.helper.JsonArrayToDepartmentsArray;

import maf.code.corner.hr.mobile.uri.DeptEmpURIs;

import maf.code.corner.hr.mobile.util.RestCallerUtil;

import oracle.adfmf.java.beans.ProviderChangeListener;
import oracle.adfmf.java.beans.ProviderChangeSupport;


public class DeptEmpDC {
    
   
   
     
    //all departments. We fecth the departments only once as this is not expected to
    //change in the context of the tutorial
    private DepartmentsEntity[] allDepartments = null;

    //collection with single employee record to edit in a MAF form. Providing a separate collection for 
    //the selected employee allows implementation of a cancel-form strategy, which is that the collection
    //data - and this the REST service - is only updated in case of a submit. If the user presses cancel 
    //then nothing happens and the navigation returns to the calling page. 
         
    public DeptEmpDC() {
        super();
    }
    
    public void setAllDepartments(DepartmentsEntity[] allDepartments) {}

    public DepartmentsEntity[] getAllDepartments() {
        
        if(allDepartments == null){
           
            String restURI = DeptEmpURIs.GetAllDepartmentsURI();
            System.out.println("========== restURI -============="+restURI);
            RestCallerUtil rcu = new RestCallerUtil();
            String jsonArrayAsString = rcu.invokeREAD(restURI);
            System.out.println("======================jsonArrayAsString=================="+jsonArrayAsString);
            DepartmentsEntity[] departments = JsonArrayToDepartmentsArray.getDepartmentsArray(jsonArrayAsString);
            System.out.println("=====================departments============"+departments);
            allDepartments = departments;
        }
        
        return allDepartments;
    }

    
    /**
     * get department by a provided department ID
     * @param departmentId
     * @return DepartmentsEntity object for the queried department. 
     *         returns null if department is not found
     * 
     */
    private DepartmentsEntity getDepartmentById(Integer departmentId){
    
        String restURI = DeptEmpURIs.GetDepartmentsByIdURI(departmentId);
        RestCallerUtil rcu = new RestCallerUtil();
        String jsonArrayAsString = rcu.invokeREAD(restURI);
        DepartmentsEntity[] departments = JsonArrayToDepartmentsArray.getDepartmentsArray(jsonArrayAsString);
        
        if(departments.length > 0){
            return departments[0];
        }
        else return null;
    }
    
     
    
    //***** provider change support *****//
    //Enable provider change support
      protected transient ProviderChangeSupport providerChangeSupport = new ProviderChangeSupport(this);

      public void addProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.addProviderChangeListener(l);
      }

      public void removeProviderChangeListener(ProviderChangeListener l) {
         providerChangeSupport.removeProviderChangeListener(l);
      }

}

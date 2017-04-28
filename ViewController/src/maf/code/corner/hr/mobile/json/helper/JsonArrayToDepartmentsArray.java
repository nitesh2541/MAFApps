package maf.code.corner.hr.mobile.json.helper;

//Copyright © 2014 Oracle and/or its affiliates. All rights reserved.

import java.util.logging.Level;

import maf.code.corner.hr.mobile.entities.DepartmentsEntity;
import maf.code.corner.hr.mobile.json.dao.DepartmentsResultArray;

import oracle.adfmf.framework.api.JSONBeanSerializationHelper;
import oracle.adfmf.util.logging.Trace;

/**
 * Class that converts JSON array representing calls to HR departments to an array of departmentsEntity objects
 * that are defined locally in this project. This class is not generic and would need to be changed according to
 * the JSON payload.
 *
 */
public class JsonArrayToDepartmentsArray {
    public JsonArrayToDepartmentsArray() {
        super();
    }
    
    public static DepartmentsEntity[] getDepartmentsArray(String jsonArrayAsString){
        
        //Java object that represents the Java structure for the JSON notation structure. Its simple in 
        //this sample as the array only contains an array of departments with no additional child objects 
        //or primitive values
        DepartmentsResultArray departmentsResult = null;
        
        //object that serializes the JSON payload into the Java object
        JSONBeanSerializationHelper jbsh = new JSONBeanSerializationHelper();


        try {
            departmentsResult = (DepartmentsResultArray) jbsh.fromJSON(DepartmentsResultArray.class, jsonArrayAsString);           


        } catch (Exception e) {
            Trace.log("JSONArray_to_JavaArray",Level.SEVERE, JsonArrayToDepartmentsArray.class,"getDepartmentsArray", "Parsing of REST response failed: "+e.getLocalizedMessage());
        }

      return departmentsResult.getDepartments();
    }
}
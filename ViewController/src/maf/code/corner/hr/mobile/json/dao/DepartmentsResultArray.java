//Copyright © 2014 Oracle and/or its affiliates. All rights reserved.
package maf.code.corner.hr.mobile.json.dao;

//Copyright © 2014 Oracle and/or its affiliates. All rights reserved.

import maf.code.corner.hr.mobile.entities.DepartmentsEntity;

/**
 * class that mimics the structure of the JSON payload for the departments request
 * @author Frank Nimphius
 */

public class DepartmentsResultArray {
    
    private DepartmentsEntity[] departments = null;
    
    public DepartmentsResultArray() {
        super();
    }


    public void setDepartments(DepartmentsEntity[] departments) {
        this.departments = departments;
    }

    public DepartmentsEntity[] getDepartments() {
        return departments;
    }

}

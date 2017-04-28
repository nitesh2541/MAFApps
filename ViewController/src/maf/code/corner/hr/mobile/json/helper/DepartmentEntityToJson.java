package maf.code.corner.hr.mobile.json.helper;

import maf.code.corner.hr.mobile.entities.DepartmentsEntity;

//Copyright © 2014 Oracle and/or its affiliates. All rights reserved.

public class DepartmentEntityToJson {
    public DepartmentEntityToJson() {
        super();
    }

    /**
     * Converts local department entity to JSON object string
     * Example:
     * {
     *      "DepartmentId" : 10,
     *      "DepartmentName" : "Administration",
     *      "ManagerId" : 200,
     *      "LocationId" : 1700
     *
     *      
     *  }
     * @param department
     * @return
     */
    public static String getJson(DepartmentsEntity department) {

        StringBuffer sb = new StringBuffer();
        sb.append("{");

        if (department.getDepartmentId() != null) {
            sb.append("\"DepartmentId\":\"");
            sb.append(department.getDepartmentId() + "\",");
        }
        if (department.getDepartmentName() != null) {
            sb.append("\"DepartmentName\":\"");
            sb.append(department.getDepartmentName() + "\",");
        }
        if (department.getManagerId() != null) {
            sb.append("\"ManagerId\":\"");
            sb.append(department.getManagerId() + "\",");
        }
        if (department.getLocationId() != null) {
            sb.append("\"LocationId\":\"");
            sb.append(department.getLocationId() + "\",");
        }


        sb.deleteCharAt(sb.lastIndexOf(","));

        sb.append("}");

        String jsonObject = sb.toString();

        return jsonObject;

    }
}

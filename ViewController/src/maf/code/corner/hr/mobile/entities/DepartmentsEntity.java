package maf.code.corner.hr.mobile.entities;

//Copyright © 2014 Oracle and/or its affiliates. All rights reserved.

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class DepartmentsEntity {

    private PropertyChangeSupport _propertyChangeSupport = new PropertyChangeSupport(this);

    public void setDepartmentId(Integer DepartmentId) {
        Integer oldDepartmentId = this.DepartmentId;
        this.DepartmentId = DepartmentId;
        _propertyChangeSupport.firePropertyChange("DepartmentId", oldDepartmentId, DepartmentId);
    }

    public Integer getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentName(String DepartmentName) {
        String oldDepartmentName = this.DepartmentName;
        this.DepartmentName = DepartmentName;
        _propertyChangeSupport.firePropertyChange("DepartmentName", oldDepartmentName, DepartmentName);
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setLocationId(Integer LocationId) {
        Integer oldLocationId = this.LocationId;
        this.LocationId = LocationId;
        _propertyChangeSupport.firePropertyChange("LocationId", oldLocationId, LocationId);
    }

    public Integer getLocationId() {
        return LocationId;
    }

    public void setManagerId(Integer ManagerId) {
        Integer oldManagerId = this.ManagerId;
        this.ManagerId = ManagerId;
        _propertyChangeSupport.firePropertyChange("ManagerId", oldManagerId, ManagerId);
    }

    public Integer getManagerId() {
        return ManagerId;
    }
    private Integer DepartmentId = null;
    private String DepartmentName = null;
    private Integer LocationId = null;
    private Integer ManagerId = null;
    
  
    
    public Object clone() {

        DepartmentsEntity dept = new DepartmentsEntity();

        dept.setDepartmentId(DepartmentId);
        dept.setDepartmentName(DepartmentName);
        dept.setLocationId(LocationId);
        dept.setManagerId(ManagerId);

        return dept;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        _propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        _propertyChangeSupport.removePropertyChangeListener(l);
    }
}

package com.t2010a.hellot2010aagain.entity;

public class Teacher {
    private String Id ;
    private String Name;
    private int cakeCount;

    public Teacher(int teacherId, String name, int cakeCount) {

    }

    public Teacher(String id, String name, int cakeCount) {
        Id = id;
        Name = name;
        this.cakeCount = cakeCount;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", cakeCount=" + cakeCount +
                '}';
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCakeCount() {
        return cakeCount;
    }

    public void setCakeCount(int cakeCount) {
        this.cakeCount = cakeCount;
    }
}

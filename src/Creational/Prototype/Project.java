package Creational.Prototype;

public class Project implements Copyable{
    private int id;
    private String projectname;
    private String sourceCode;

    public Project(int id, String projectname, String sourceCode) {
        this.id = id;
        this.projectname = projectname;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }


    @Override
    public Object copy() {
        Project copy = new Project(id,projectname,sourceCode);
        return copy;


    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectname='" + projectname + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}

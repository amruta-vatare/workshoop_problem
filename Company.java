public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int c_Id;

    public Company(int c_Id,String name) {
        this.c_Id = c_Id;
        this.name = name;

    }

    public int getC_Id() {
        return c_Id;
    }

    public void setC_Id(int c_Id) {
        this.c_Id = c_Id;
    }

}

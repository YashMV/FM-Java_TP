public class Student {
    private String name;  //Initialize the private class attributes
    private int reg_no;
    private String branch;

    public void setName(String name){  //Method to set name
        this.name=name;
        System.out.println(name);
    }
    public void setReg_no(int reg_no){  //Method to set registration number
        this.reg_no=reg_no;
        System.out.println(reg_no);
    }

    public void setBranch(String branch){  //Method to set branch
        this.branch=branch;
        System.out.println(branch+"\n");
    }
}

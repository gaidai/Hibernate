package Entity;


public class Friend {
    private int numb;
    private String fname;
    private String name;
    private String mobile;
    private String date;
 
    public Friend (int numb, String fname, String name, String mobile, String date) {
        this.numb = numb;
        this.fname = fname;
        this.name = name;
        this.mobile = mobile;
        this.date = date;
    }
    public Friend (){
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getNumb() {
        return numb;
    }

    public String getFname() {
        return fname;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }
    
    public String getDate() {
        return date;
    }
}

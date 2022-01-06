public abstract class IError {
    private int errornumber;
    private String Description;
    public IError(int errornumber,String description){
        this.errornumber=errornumber;
        this.Description=description;

    }
    public void SendMail(){

    };

    public int getErrornumber() {
        return errornumber;
    }

    public void setErrornumber(int errornumber) {
        this.errornumber = errornumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

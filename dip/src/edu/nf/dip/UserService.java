package edu.nf.dip;

public class UserService {
    public void add(){
        UserDao dao=new UserDao();
        dao.save();
    }
}

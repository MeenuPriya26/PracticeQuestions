package Proxy;

public class StudentProxy implements StudentOperations {
    StudentOperations operations;
    StudentProxy(){
        operations=new StudentOperationsImpl();
    }
    @Override
    public void save(String user, Student student) throws Exception {
        System.out.println("Inside proxy save  method");
        if(user.equals("ADMIN")){
            operations.save(user,student);
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String user,int id) throws Exception{
        System.out.println("inside proxy save method");
        if(user.equals("SuperAdmin")){
            operations.delete(user,id);
        }
        throw new Exception("Access Denied for superAdmin too");
    }
}

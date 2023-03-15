package Proxy;

public class StudentOperationsImpl implements StudentOperations {
    @Override
    public void save(String user, Student student) throws Exception {
        System.out.println("Student is saved successfully");
    }

    @Override
    public void delete(String user, int id) throws Exception {
        System.out.println("Student with"+id+"is deleted successfully");
    }
}

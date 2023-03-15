package Proxy;

public interface StudentOperations {
    public void save(String user,Student student) throws Exception;
    public void delete(String user,int id)throws Exception;
}

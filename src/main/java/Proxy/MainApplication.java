package Proxy;

public class MainApplication {
    public static void main(String[] args) {
        StudentOperations studentData=new StudentProxy();
        try{
            studentData.save("ADMIN",new Student(1,"Meenu"));
            studentData.save("ADMIN",new Student(2,"Monu"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //testing deletion
        try{
            studentData.delete("SuperAdmin", 1);
            studentData.delete("SuperAdmin", 2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

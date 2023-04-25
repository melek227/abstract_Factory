
public class Main {
    public static void main(String[] args) {
        CustomOperation customOperation = new CustomOperation(new OracleDatabaseFactory());
        customOperation.removeById(1);
        }
    }






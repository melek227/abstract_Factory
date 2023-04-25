public class OracleDatabaseFactory implements IDatabaseFactory{

    // Oracle için ilişkili nesneler üretildi.

    @Override
    public Command createCommand() {
        return new OracleCommand();
    }

    @Override
    public Connection createConnection() {
        return new OracleConnection();

    }
}

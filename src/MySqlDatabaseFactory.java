public class MySqlDatabaseFactory implements IDatabaseFactory{
    // MySQL için ilişkili nesneler üretildi.
    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Command createCommand() {
        return new MySqlCommand();
    }
}

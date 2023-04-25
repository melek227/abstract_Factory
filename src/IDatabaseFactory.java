// Oluşturulacak ürünlere ait metotları içerir.
// Oracle ve MySQL için bunların geriye döndüreceği
// Nesneler farklı olacaktır.
public interface IDatabaseFactory {

    Connection createConnection();

    Command createCommand();

}

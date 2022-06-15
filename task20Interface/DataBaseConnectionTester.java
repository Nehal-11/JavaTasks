package task20Interface;

public class DataBaseConnectionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DatabaseConnector oData;
oData = new MongoDataBase();
oData.connectToDataBase();
oData = new OracleDataBase();
oData.connectToDataBase();
oData = new SqlServerDataBase();
oData.connectToDataBase();

	}
}

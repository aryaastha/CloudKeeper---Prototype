import java.io.*;

public class Owner implements Serializable {
	Shop shops[];
	Item inventory[];
	Record log[];
	public int ownerID;
	public String name;
	public String emailID;
	public String password;

	public Owner(Shop[] shops2, Item[] items, Record[] records, int ownerID2,
	    String name2, String emailID2, String password2) {
		this.shops = shops2;
		this.inventory = items;
		this.log = records;
		this.ownerID = ownerID2;
		this.name = name2;
		this.emailID = emailID2;
		this.password = password2;
	}
	public static void main(String[] args) throws IOException,
	    ClassNotFoundException {
		
		Owner o = Owner.read(2);
	}
	void save() throws IOException {
		ObjectOutputStream log = new ObjectOutputStream(new FileOutputStream(
		    ownerID + ".ad"));
		log.writeObject(this);
		log.close();

	}
	static Owner read(int ownerID) throws IOException, ClassNotFoundException {
		ObjectInputStream log = new ObjectInputStream(new FileInputStream(ownerID
		    + ".ad"));
		Owner abc = (Owner) log.readObject();
		System.out.println(abc);
		log.close();
		return abc;
	}
	public String toString() {
		return ownerID + "\nNo. of Shops : " + shops.length + "\nEmail ID : "
		    + emailID + "\n";
	}
}

import java.util.*;

public class Record {
	int itemID;
	int shopID;
	float atPrice;
	Date timestamp;
	Record(int i, int s, float p) {
		this(i, s, p, new Date());
	}
	Record(int i, int s, float p, Date d) {
		itemID = i;
		shopID = s;
		atPrice = p;
		timestamp = d;
	}
}

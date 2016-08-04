import java.nio.channels.SelectableChannel;

public class BitOperations {

	public int getBit(int num, int i) {
		return (num & 1 << i) >> i;
	}

	public int setBit(int num, int i) {
		return num | (1 << i);
	}

	// clearBit

	public static void main(String[] args) {
		int n=0;
		BitOperations bo = new BitOperations();
		n = bo.setBit(n,4);
		System.out.println(bo.getBit(n, 5));
	}
}

public class Test{
public static void main(String args[]){
StorageToInt sfac = new StorageToInt();
Bit bit1 = new Bit(true);
System.out.println(sfac.bitToInt(bit1));
Bit bit2 = new Bit(false);
TwoBits tb1 = new TwoBits(bit1,bit2);
System.out.println(sfac.twoBitsToInt(tb1));
ThreeBits thb1 = new ThreeBits(bit1,tb1);
System.out.println(sfac.threeBitsToInt(thb1));
Nybble n1 = new Nybble(bit2,thb1);
System.out.println(sfac.nybbleToInt(n1));
SByte s1 = new SByte(n1,n1);
System.out.println(sfac.sbyteToInt(s1));
ASCIITable ascii = new ASCIITable()
ASCIITable.init()
ascii.ascii.get(sfac.sbyteToInt(s1));
}
}

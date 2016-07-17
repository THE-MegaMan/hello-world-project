public class Test{
public static void main(String args[]){
StorageToInt sfac = new StorageToInt();
Bit bit1 = new Bit(true);
System.out.println(sfac.bitToInt(bit1));
Bit bit2 = new Bit(false);
TwoBits tb1 = new TwoBits(bit1,bit2);
System.out.println(sfac.twoBitsToInt(tb1));
ThreeBits thb1 = new ThreeBits(tb1,bit1);
System.out.println(sfac.threeBitsToInt(thb1));
Nybble n1 = new Nybble(thb1,bit2);
System.out.println(sfac.nybbleToInt(n1));
SByte s1 = new SByte(n1,nb1);
System.out.println(sfac.sbyteToInt(s1));
}
}

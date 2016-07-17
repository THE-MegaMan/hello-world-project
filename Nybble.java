import java.io.* ;
public class Nybble {
Bit bit;
ThreeBits threebit;
public Nybble(Bit first_bit, ThreeBits double_bit) {
this.bit = first_bit;
this.threebit = double_bit;
}
public Bit  get_state1(){
return bit;
}
public ThreeBits get_state2(){
return threebit;
}
public void setStates(Bit first, ThreeBits second){
this.bit=first;
this.threebit=second;
}
public void dump(File file){

try{

ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file,true));
out.writeObject(this);
out.flush();
out.close();

}
catch (FileNotFoundException ex) {

System.err.println("Sorry, this file doesn't exist");
ex.printStackTrace();

}
catch (Exception ex) {
System.err.println("An error occured. Please try again later");
}

}

}


public class StorageToInt{

int bitToInt(Bit b){
if(b.get_state()==true){
return 1;
}
else
{
return 0;
}
}
int twoBitsToInt(TwoBits tb) {

int b1=(tb.get_state1().get_state()) ? 1 : 0;
int b2=(tb.get_state2().get_state()) ? 2 : 0;
return b1+b2
}

int threeBitsToInt(ThreeBits tb) {

int twb=twoBitsToInt(tb.get_state2());
int b=bitToInt(tb.get_state1());
return twb+b*4;
}

int nybbleToInt(Nybble n){

int tb=threeBitsToInt(n.get_state2());
int b=bitToInt(n.get_state1());
return tb+b*8;
}

int sbyteToInt(SByte by){
int n1=nybbleToInt(by.get_state1())*16
int n2=nybbleToInt(by.get_state2())
return n1+n2
}
}


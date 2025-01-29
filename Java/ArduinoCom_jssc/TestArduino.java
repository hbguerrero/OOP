import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortList;


public class TestArduino {
    public static void main(String[] args){
        String puertos[] = SerialPortList.getPortNames();        
        for(String n : puertos) {
            System.out.println(n);        
        }
        
        SerialPort sp = new SerialPort("/dev/ttyACM0");
        try{
            sp.openPort();
            sp.setParams(SerialPort.BAUDRATE_115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            sp.addEventListener(new LecturaSerial(sp), SerialPort.MASK_RXCHAR);
            Thread.sleep(1500);
            
            while(true){
                System.out.println("Enviando...");
                sp.writeString("Hola sp");
                Thread.sleep(5000);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }                
    }
}

class LecturaSerial implements SerialPortEventListener {
    
    SerialPort sp;
    public LecturaSerial(SerialPort sp){
        this.sp = sp;    
    }

    @Override
    public void serialEvent(SerialPortEvent spe) {
        try{
            String msg = "";
            msg=sp.readString(7);
            System.out.println("Recibiendo");
            System.out.println(msg);
        }catch(Exception e){
            e.printStackTrace();        
        }        
    }               
}
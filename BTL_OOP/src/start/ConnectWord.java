package start;
import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class ConnectWord {

	public  List<String> connectList = new ArrayList<>();
	public void ConnectWord(){
            
        }
	
        public ConnectWord(String file_name){
        connectList = this.trainData(file_name);
        }
 
	public  String get(int index){
            return connectList.get(index);
        }
	
	
	
        private  List<String> trainData(String fileName)  {
		
            List<String> connect = new ArrayList<>();
            try {
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr); 
                String x ;
                while((x = br.readLine())!= null){
                    connect.add(x + " ");
                }
                }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
            catch(IOException e2){
                e2.printStackTrace();
            }
                        
            return connect;
            }
		
		
		
	
		
	}
	


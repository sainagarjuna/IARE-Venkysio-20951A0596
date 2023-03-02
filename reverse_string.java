import java.io.*;
class Main {

  public static String revString(String str){
    if(str.length()==0){
      return "";
    }
    return revString(str.substring(1))+ str.charAt(0);
  }  

  
  public static void main(String[] args) throws IOException {
    InputStreamReader stringReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(stringReader);

    String[] ip = bufferedReader.readLine().split(" ");

    String newReversedString = "";
    for(int i=0;i<ip.length;i++){
      if(i==ip.length - 1){
        
      newReversedString += revString(ip[i]); 
      }
      else{
        newReversedString += revString(ip[i]) + " ";
    }
  }

      System.out.println(newReversedString);
  }
}

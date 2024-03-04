package DemoMVC.utils;
import DemoMVC.entity.Customer;

import java.io.*;
import java.util.List;

public class MyWriteFile {

    private void writeFileCustomer(String path, String data){
        File file = new File(path);
        try {
            Writer writeFile = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writeFile);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeCustomerFile(String path, List<Customer> customerList){
        StringBuffer stringBuffer = new StringBuffer();
        for(Customer customer : customerList){
            stringBuffer.append((customer.toString()));
        }
        writeFileCustomer(path, String.valueOf(stringBuffer));
    }
}

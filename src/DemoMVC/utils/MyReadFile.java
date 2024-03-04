package DemoMVC.utils;

import DemoMVC.entity.Customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyReadFile {
    private List<String> readFile(String path){
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            return strings;
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return strings;
    }

    public List<Customer> readFileCustomer(String path){
        List<Customer> customerList = new ArrayList<>();
        List<String> strings = readFile(path);
        String[] array;
        for(String string : strings){
            array = string.split(",");

        }
        return customerList;
    }
}

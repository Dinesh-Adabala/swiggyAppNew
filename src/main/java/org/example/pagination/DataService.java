package org.example.pagination;

import java.util.ArrayList;
import java.util.List;

public class DataService {

   public List<String> getResult(){
       List<String> resultList = new ArrayList<>();
       for (int i = 1; i< 102; i++){
           resultList.add(String.valueOf(i));
       }
       return resultList;
   }

}

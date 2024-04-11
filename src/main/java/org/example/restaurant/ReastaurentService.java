package org.example.restaurant;

public class ReastaurentService {
    public Restaurent selectReasturent(ReastaurentResponse response, String reasName){
        for (int i=0;i<=response.restaurentList.size();i++){
            if (response.restaurentList.get(i).restaurentName.equalsIgnoreCase(reasName)){
                return response.restaurentList.get(i);
        }
        }
        return null;

    }
}

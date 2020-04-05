package lesson3.HomeWork;

import java.util.*;

public class AddressBook {
    private HashMap<String, Integer> map = new HashMap<String, Integer>();

    static <K, V> List<K> getAllKeysForValue(Map<K, V> mapOfWords, V value)
    {
        List<K> listOfKeys = null;

        //Check if Map contains the given value
        if(mapOfWords.containsValue(value))
        {
            // Create an Empty List
            listOfKeys = new ArrayList<>();

            // Iterate over each entry of map using entrySet
            for (Map.Entry<K, V> entry : mapOfWords.entrySet())
            {
                // Check if value matches with given value
                if (entry.getValue().equals(value))
                {
                    // Store the key from entry to the list
                    listOfKeys.add(entry.getKey());
                }
            }
        }
        // Return the list of keys whose value matches with given value.
        return listOfKeys;
    }


    public void add(String name, Integer tel) {
        map.put(name, tel);
    }

    public List<String> get(Integer tel) {
//        return map.get(name);
//        return getAllKeysForValue(map, name);
        List<String> listOfKeys = getAllKeysForValue(map, tel);
        return listOfKeys;
    }
}

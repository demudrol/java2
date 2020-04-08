package lesson3.HomeWork;

import java.util.*;

public class AddressBook {
    private HashMap<Integer, String> map = new HashMap<>();

    static <K, V> List<V> getAllKeysForKey(Map<K, V> mapOfWords, V value)
    {
        List<V> listOfKeys = null;

        if(mapOfWords.containsValue(value))
        {
            listOfKeys = new ArrayList<>();

            for (Map.Entry<K, V> entry : mapOfWords.entrySet())
            {
                if (entry.getValue().equals(value))
                {
                    listOfKeys.add((V) entry.getKey());
                }
            }
        }
        // Return the list of keys whose value matches with given value.
        return listOfKeys;
    }


    public void add(Integer tel, String name) {
        map.put(tel, name);
    }

    public List<String> get(String name) {
        List<String> listOfKeys = getAllKeysForKey(map, name);
        return listOfKeys;
    }
}

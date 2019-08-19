# JavaHashMaps
 Hashmaps and methods

 //HashMap are efficient for locating a value based on a key
        // and inserting and deleting values based on a key.
	// Hashmaps (key --> value : 1 --> Paul) - 2 items are connected
        HashMap users = new HashMap();
        //inserts key-value item onto the map
        users.put("Sandra", 23);
		
		//iteration
        //hashmap - a higher level arraylist

        //Iterator class and method which takes all the data to the iterator - gives access to it
        Iterator iterator=users.entrySet().iterator();
        //as long as iterator has next item- go on: / hasNext - boolean
        while (iterator.hasNext()){
            //for that creating another abstract pair-Map type object
            Map.Entry pair = (Map.Entry) iterator.next(); // (Map.ENtry)- needs to be
            //in order to cast iterator to the same type as Map - to show exact location of the items!
            // getKey() - prints out normally (without [])
			
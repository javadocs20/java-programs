package com.collections;

public class HashMapCustom<K, V> {
    
	   private MyEntry<K,V>[] table;   //Array of Entry.
	    private int capacity= 10;  //Initial capacity of HashMap
	    
	    static class MyEntry<K, V> {
	        K key;
	        V value;
	        MyEntry<K,V> next;
	    
	        public MyEntry(K key, V value, MyEntry<K,V> next){
	            this.key = key;
	            this.value = value;
	            this.next = next;
	        }
	    }
	    

	   @SuppressWarnings("unchecked")
	   public HashMapCustom(){
		     table = new MyEntry[capacity];
	   }
	   
	   
	   public void put(K newKey, V data){
	       if(newKey==null)   //1st if
	           return;    //does not allow to store null.
	      
	       //calculate hash of key.
	       int hashIndex=hash(newKey);
	       //create new entry.
	       MyEntry<K,V> newEntry = new MyEntry<K,V>(newKey, data, null);
	      
	       //if table location does not contain any entry, store entry there.
	        if(table[hashIndex] == null){  //2nd if
	         table[hashIndex] = newEntry;
	         
	        }else{
	           MyEntry<K,V> previous = null;
	           MyEntry<K,V> current = table[hashIndex];
	           
	           while(current != null){ //we have reached last entry of bucket.
	           if(current.key.equals(newKey)){   //3rd if stmt            
	               if(previous==null){  //node has to be insert on first of bucket.
	                     newEntry.next=current.next;  // when new entry will come with same key (override the old key)
	                     table[hashIndex]=newEntry;
	                     return;
	               }
	               else{
	                   newEntry.next=current.next;
	                   previous.next=newEntry;
	                   return;
	               }
	           }  //End of 3rd if
	             previous=current;
	             current = current.next;
	         }//end of while
	         previous.next = newEntry;
	        }
	    }  // End of Put()
	   
	   public V get(K key){
	       int hash = hash(key);
	       if(table[hash] == null){
	        return null;
	       }else{
	        MyEntry<K,V> temp = table[hash];
	        while(temp!= null){
	            if(temp.key.equals(key))
	                return temp.value;
	            temp = temp.next; //return value corresponding to key.
	        }         
	        return null;   //returns null if key is not found.
	       }
	   }//End of get()
	   
	 public void display(){
	       
	       for(int i=0;i<capacity;i++){
	           if(table[i]!=null){
	                  MyEntry<K, V> entry=table[i];
	                  StringBuilder sb=new StringBuilder();
	                  sb.append("{");
	                  while(entry!=null){
	                	  sb.append(entry.key+"="+entry.value+", ");
	                     //   System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
	                        entry=entry.next;
	                  }
	                  sb.deleteCharAt(sb.length()-2);
	                  sb.append("}");
	                  System.out.println(sb);
	           }
	       }             
	 } //End of display
	 
	 private int hash(K key){
	     return Math.abs(key.hashCode()) % capacity;
	 }
	   
	}//End of HashMapCustom


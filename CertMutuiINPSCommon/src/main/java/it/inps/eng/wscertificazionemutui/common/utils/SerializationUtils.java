
package it.inps.eng.wscertificazionemutui.common.utils;

/*
 * Licensed to the Apache Software Foundation (ASF) under one 
 * or more contributor license agreements.  See the NOTICE file 
 * distributed with this work for additional information 
 * regarding copyright ownership.  The ASF licenses this file 
 * to you under the Apache License, Version 2.0 (the 
 * "License"); you may not use this file except in compliance 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY 
 * KIND, either express or implied.  See the License for the 
 * specific language governing permissions and limitations 
 * under the License. 
 */
 
import org.apache.commons.io.input.ClassLoaderObjectInputStream; 
 
import java.io.*; 
 
/**
 * Created by rebanks on 2/18/14. 
 */ 
public class SerializationUtils { 
 
	private static SerializationUtils INSTANCE;
	
	public static SerializationUtils getInstance() {
		if (INSTANCE == null) INSTANCE = new SerializationUtils();
		return INSTANCE;
	}
	
    /**
     * BORROwED FROM APACHE STORM PROJECT 
     * @param obj 
     * @return 
     */ 
    public byte[] serialize(Object obj) { 
        try { 
            ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
            ObjectOutputStream oos = new ObjectOutputStream(bos); 
            oos.writeObject(obj); 
            oos.close(); 
            return bos.toByteArray(); 
        } catch(IOException ioe) { 
            throw new RuntimeException(ioe); 
        } 
    } 
 
    /**
     * BORROwED FROM APACHE STORM PROJECT 
     * @param serialized 
     * @return 
     */ 
    public Object deserialize(byte[] serialized) { 
        try { 
            ByteArrayInputStream bis = new ByteArrayInputStream(serialized); 
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader(); 
            ObjectInputStream ois = new ClassLoaderObjectInputStream(classLoader, bis); 
            Object ret = ois.readObject(); 
            ois.close(); 
            return ret; 
        } catch(IOException ioe) { 
            throw new RuntimeException(ioe); 
        } catch(ClassNotFoundException e) { 
            throw new RuntimeException(e); 
        } 
    } 
 
 
    @SuppressWarnings("unchecked")
	public <T> T clone(T obj) { 
        if( obj != null ) 
            return (T) deserialize(serialize(obj)); 
        else return null; 
    } 
}
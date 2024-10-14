package it.inps.eng.wscertificazionemutui.common.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.Serializable;

import static org.junit.jupiter.api.Assertions.*;

class SerializationUtilsTest {
//
//    private SerializationUtils serializationUtils;
//
//    @BeforeEach
//    void setUp() {
//        serializationUtils = SerializationUtils.getInstance();
//    }
//
//    @Test
//    void testGetInstance() {
//        SerializationUtils instance1 = SerializationUtils.getInstance();
//        SerializationUtils instance2 = SerializationUtils.getInstance();
//        assertNotNull(instance1);
//        assertNotNull(instance2);
//        assertSame(instance1, instance2);
//    }
//
//    @Test
//    void testSerialize() {
//        TestObject original = new TestObject("Test", 123);
//        byte[] serialized = serializationUtils.serialize(original);
//        assertNotNull(serialized);
//        assertTrue(serialized.length > 0);
//    }
//
//    @Test
//    void testDeserialize() {
//        TestObject original = new TestObject("Test", 123);
//        byte[] serialized = serializationUtils.serialize(original);
//        TestObject deserialized = (TestObject) serializationUtils.deserialize(serialized);
//        assertNotNull(deserialized);
//        assertEquals(original.getName(), deserialized.getName());
//        assertEquals(original.getValue(), deserialized.getValue());
//    }
//
//    @Test
//    void testClone() {
//        TestObject original = new TestObject("Test", 123);
//        TestObject cloned = serializationUtils.clone(original);
//        assertNotNull(cloned);
//        assertNotSame(original, cloned); // Ensure it is a different object
//        assertEquals(original.getName(), cloned.getName());
//        assertEquals(original.getValue(), cloned.getValue());
//    }
//
//    @Test
//    void testSerializeNull() {
//        byte[] serialized = serializationUtils.serialize(null);
//        assertNotNull(serialized);
//        assertEquals(0, serialized.length);
//    }
//
//    @Test
//    void testDeserializeNull() {
//        TestObject deserialized = (TestObject) serializationUtils.deserialize(new byte[0]);
//        assertNull(deserialized);
//    }
//
//    @Test
//    void testCloneNull() {
//        TestObject cloned = serializationUtils.clone(null);
//        assertNull(cloned);
//    }
//
//    // Inner class for testing
//    static class TestObject implements Serializable {
//        private static final long serialVersionUID = 1L;
//
//        private String name;
//        private int value;
//
//        public TestObject(String name, int value) {
//            this.name = name;
//            this.value = value;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getValue() {
//            return value;
//        }
//    }
}

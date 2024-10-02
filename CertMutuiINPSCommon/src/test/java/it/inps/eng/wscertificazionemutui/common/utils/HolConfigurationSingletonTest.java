package it.inps.eng.wscertificazionemutui.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HolConfigurationSingletonTest {

    private HolConfigurationSingleton configSingleton;

    @BeforeEach
    void setUp() {
        // Assicurati che l'istanza venga creata
        configSingleton = HolConfigurationSingleton.getInstance();
    }

    @Test
    void testGetInstance() {
        HolConfigurationSingleton instance1 = HolConfigurationSingleton.getInstance();
        HolConfigurationSingleton instance2 = HolConfigurationSingleton.getInstance();
        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    void testRefresh() {
        HolConfigurationSingleton initialInstance = HolConfigurationSingleton.getInstance();
        configSingleton.refresh();
        HolConfigurationSingleton newInstance = HolConfigurationSingleton.getInstance();
        assertNotSame(initialInstance, newInstance);
    }

    @Test
    void testPrintAllProperties() {
        assertDoesNotThrow(() -> configSingleton.printAllProperties());
    }

    @Test
    void testGetProperty() {
        String value = configSingleton.getProperty("key1");
        assertEquals("value1", value);

        // Testa la chiave non esistente
        String nonExistent = configSingleton.getProperty("nonExistentKey");
        assertEquals("Descrizione property di configurazione non trovata.", nonExistent);
    }

    @Test
    void testGetPropertyWithDefault() {
        String value = configSingleton.getProperty("key2", "defaultValue");
        assertEquals("value2", value);

        // Testa la chiave non esistente con valore di default
        String nonExistent = configSingleton.getProperty("nonExistentKey", "defaultValue");
        assertEquals("defaultValue", nonExistent);
    }
}



package C16Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.ToDoubleBiFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest {
    private Encryption dataEncryption;

    @BeforeEach
    void setUp(){
        dataEncryption = new Encryption();
    }

    @Test
    public void testEncryptedData(){
        //TODO 1. given: I have data=0149 and a method encryptData that encrypts data
        //TODO 2. when: I call encryptData and pass data from 1 to it as argument,
        //TODO  encryptData should return encrypted data
        //TODO  assert that encrypted data => 1678

        String data = "0149";
        String encryptData = dataEncryption.encryptData(data);
        System.out.println("Encryption:: "+encryptData);
        assertEquals("1678", encryptData);
    }

    @Test
    public void testDecryptedData(){
        //TODO 1. given: I have encryptedData=>1678 and a method decryptData that decrypts encryptedData
        //TOD 2. when: I call decrptData and pass encryptData from 1 to it as argument,
        String decryptData = dataEncryption.decryptData("1678");
        assertEquals("0149", decryptData);
    }
}
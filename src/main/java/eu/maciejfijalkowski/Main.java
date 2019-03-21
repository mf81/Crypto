package eu.maciejfijalkowski;

import org.bouncycastle.crypto.CryptoException;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("dane.txt");
        File fileCrypto = new File("dane-crypto.txt");


        try {
            CryptoFiles.encrypt("12345678901234567890123456789012",file,fileCrypto);
        } catch (CryptoException e) {
            e.printStackTrace();
        }



        File fileDECrypto = new File("DEdane.txt");
        try {
            CryptoFiles.decrypt("12345678901234567890123456789012",fileCrypto,fileDECrypto);
        } catch (CryptoException e) {
            e.printStackTrace();
        }
    }
}

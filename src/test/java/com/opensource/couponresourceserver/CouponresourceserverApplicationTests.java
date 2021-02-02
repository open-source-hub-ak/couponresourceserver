package com.opensource.couponresourceserver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Base64;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CouponresourceserverApplicationTests {

	@Test
	void contextLoads() throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException, UnrecoverableKeyException {
		
			String url ="E:\\\\WS\\\\OAuth2server\\\\src\\\\main\\\\resources\\\\jwtiscool.jks";
	        FileInputStream is = new FileInputStream(url);

	        KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
	        keystore.load(is, "jwtiscool".toCharArray());

	        String alias = "jwtiscool";

	        Key key = keystore.getKey(alias, "jwtiscool".toCharArray());
	        if (key instanceof PrivateKey) {
	          // Get certificate of public key
	          Certificate cert = keystore.getCertificate(alias);

	          // Get public key
	          PublicKey publicKey = cert.getPublicKey();

	          // Return a key pair
	          new KeyPair(publicKey, (PrivateKey) key);
	          
	          byte[] encodedPublicKey = publicKey.getEncoded();
	          String b64PublicKey = Base64.getMimeEncoder().encodeToString(encodedPublicKey);
	          
	          System.out.println(b64PublicKey);
	        }
	      
	}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autokey;

/**
 *
 * @author quang
 */
public class AutokeyCipher {
    public String encrypt(String plaintext, String key) {
        plaintext = plaintext.toUpperCase();
        key = key.toUpperCase();

        StringBuilder ciphertext = new StringBuilder();
        int keyIndex = 0;

        for (int i = 0; i < plaintext.length(); i++) {
            char plainChar = plaintext.charAt(i);

            if (Character.isLetter(plainChar)) {
                // Lấy ký tự khóa tương ứng
                char keyChar;
                if (keyIndex < key.length()) {
                    keyChar = key.charAt(keyIndex);
                } else {
                    keyIndex = 0;
                    keyChar = plaintext.charAt(i - key.length());
                }

                // Tính toán ký tự mã hóa
                int shift = keyChar - 'A';
                char encryptedChar = (char) ((plainChar - 'A' + shift) % 26 + 'A');
                ciphertext.append(encryptedChar);
            } else {
                // Nếu không phải chữ cái, giữ nguyên
                ciphertext.append(plainChar);
            }
        }

        return ciphertext.toString();
    }
    public String decrypt(String ciphertext, String key) {
    ciphertext = ciphertext.toUpperCase();
    key = key.toUpperCase();

    StringBuilder plaintext = new StringBuilder();
    int keyIndex = 0;

    for (int i = 0; i < ciphertext.length(); i++) {
        char cipherChar = ciphertext.charAt(i);

        if (Character.isLetter(cipherChar)) {
            // Lấy ký tự khóa tương ứng
            char keyChar;
            if (keyIndex < key.length()) {
                keyChar = key.charAt(keyIndex);
            } else {
                keyIndex = 0;
                keyChar = plaintext.charAt(i - key.length());
            }

            // Tính toán ký tự gốc
            int shift = keyChar - 'A';
            char decryptedChar = (char) ((cipherChar - 'A' - shift + 26) % 26 + 'A');
            plaintext.append(decryptedChar);
        } else {
            // Nếu không phải chữ cái, giữ nguyên
            plaintext.append(cipherChar);
        }
    }

    return plaintext.toString();
    }
}

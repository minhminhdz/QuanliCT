/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transposition;
import java.util.Arrays;
/**
 *
 * @author quang
 */
public class TranspositionCipher {
    public String encrypt(String text, int[] key) {
    // Tính số hàng của ma trận
    int numRows = (int) Math.ceil((double) text.length() / key.length);

    // Khởi tạo ma trận để lưu trữ văn bản
    char[][] grid = new char[numRows][key.length];
    for (char[] row : grid) {
        Arrays.fill(row, ' '); // Khởi tạo các ô trong ma trận bằng khoảng trắng
    }

    // Điền văn bản vào ma trận theo cột
    for (int i = 0; i < text.length(); i++) {
        grid[i / key.length][i % key.length] = text.charAt(i);
    }

    // Đọc ma trận theo cột theo thứ tự của khóa và tạo chuỗi mã hóa
    StringBuilder ciphertext = new StringBuilder();
    for (int k : key) {
        for (int row = 0; row < numRows; row++) {
            if (grid[row][k - 1] != ' ') {
                ciphertext.append(grid[row][k - 1]);
            }
        }
    }
    int textIndex = 0;
    for (int k : key) {
    for (int row = 0; row < numRows; row++) {
        if (textIndex < text.length()) {
            grid[row][k - 1] = text.charAt(textIndex++);
        }
    }
    }

    StringBuilder plaintext = new StringBuilder();
    for (int row = 0; row < numRows; row++) {
        for (int col = 0; col < key.length; col++) {
        if (grid[row][col] != ' ') {
            plaintext.append(grid[row][col]);
        }
        }
    }   

    return plaintext.toString();
    } 

    String decrypt(String ciphertext, int[] key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

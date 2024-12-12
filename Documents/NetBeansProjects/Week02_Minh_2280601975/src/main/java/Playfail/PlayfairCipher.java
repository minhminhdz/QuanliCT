package Playfail;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author quang
 */
public class PlayfairCipher {
    private char[][] keyMatrix;
    private static final int MATRIX_SIZE = 5;

    public PlayfairCipher(String key) {
    keyMatrix = generateKeyMatrix(key);
    }

    private char[][] generateKeyMatrix(String key) {
    char[][] matrix = new char[MATRIX_SIZE][MATRIX_SIZE];
    Set<Character> used = new HashSet<>();
    StringBuilder keyBuilder = new StringBuilder();

        for (char ch : key.toCharArray()) {
            if (Character.isLetter(ch)) {
            ch = Character.toUpperCase(ch);
                if (ch == 'J') {
                ch = 'I';
                }
                if (!used.contains(ch)) {
                    keyBuilder.append(ch);
                used.add(ch);
                }
            }
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
        if (ch == 'J') {
        continue;
        }
        if (!used.contains(ch)) {
        keyBuilder.append(ch);
        used.add(ch);
        }
        }

    int index = 0;
    for (int row = 0; row < MATRIX_SIZE; row++) {
    for (int col = 0; col < MATRIX_SIZE; col++) {
        matrix[row][col] = keyBuilder.charAt(index++);
    }
    }

    return matrix;
    }
    private String preprocessText(String text, boolean encode) {
        text = text.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length() - 1; i += 2) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.insert(i + 1, 'X');
            }
        }
        if (sb.length() % 2 != 0) {
            sb.append('X');
        }
        return sb.toString();
    }
    public String encrypt(String plaintext) {
        return processText(plaintext, true);
    }
    
    public String decrypt(String ciphertext) {
    StringBuilder plaintext = new StringBuilder();
    ciphertext = ciphertext.toUpperCase().replaceAll("[^A-Z]", "");

    for (int i = 0; i < ciphertext.length(); i += 2) {
        char firstChar = ciphertext.charAt(i);
        char secondChar = ciphertext.charAt(i + 1);

        int[] pos1 = findPosition(firstChar);
        int[] pos2 = findPosition(secondChar);

        if (pos1[0] == pos2[0]) {
            plaintext.append(keyMatrix[pos1[0]][(pos1[1] + 4) % 5]);
            plaintext.append(keyMatrix[pos2[0]][(pos2[1] + 4) % 5]);
        } else if (pos1[1] == pos2[1]) {
            plaintext.append(keyMatrix[(pos1[0] + 4) % 5][pos1[1]]);
            plaintext.append(keyMatrix[(pos2[0] + 4) % 5][pos2[1]]);
        } else {
            plaintext.append(keyMatrix[pos1[0]][pos2[1]]);
            plaintext.append(keyMatrix[pos2[0]][pos1[1]]);
        }
    }

    for (int i = 0; i < plaintext.length() - 1; i++) {
        if (plaintext.charAt(i) == 'X' &&
                plaintext.charAt(i + 1) == plaintext.charAt(i + 1)) {
            plaintext.deleteCharAt(i);
        }
    }

    if (plaintext.charAt(plaintext.length() - 1) == 'X') {
        plaintext.deleteCharAt(plaintext.length() - 1);
    }

    return plaintext.toString();
    }
    private String processText(String text, boolean encrypt) {
    StringBuilder result = new StringBuilder();
    // Chuẩn bị văn bản đầu vào: chuyển thành chữ thường và loại bỏ các ký tự không hợp lệ

    for (int i = 0; i < text.length(); i += 2) {
        // Lặp qua từng cặp ký tự
        char a = text.charAt(i);
        char b = text.charAt(i + 1);

        // Tìm vị trí của hai ký tự trong ma trận khóa
        int[] posA = findPosition(a);
        int[] posB = findPosition(b);

        // Xử lý dựa trên vị trí của hai ký tự trong ma trận khóa
        if (posA[0] == posB[0]) { // Nếu hai ký tự nằm trên cùng một hàng
            result.append(keyMatrix[posA[0]][(posA[1] + (encrypt ? 1 : 4)) % MATRIX_SIZE]);
            result.append(keyMatrix[posB[0]][(posB[1] + (encrypt ? 1 : 4)) % MATRIX_SIZE]);
        } else if (posA[1] == posB[1]) { // Nếu hai ký tự nằm trên cùng một cột
            result.append(keyMatrix[(posA[0] + (encrypt ? 1 : 4)) % MATRIX_SIZE][posA[1]]);
            result.append(keyMatrix[(posB[0] + (encrypt ? 1 : 4)) % MATRIX_SIZE][posB[1]]);
        } else { // Nếu hai ký tự không cùng hàng và cột
            result.append(keyMatrix[posA[0]][posB[1]]);
            result.append(keyMatrix[posB[0]][posA[1]]);
        }
    }

    return result.toString();
    }
    private int[] findPosition(char ch) {
    // Tìm vị trí của ký tự 'ch' trong ma trận khóa 'keyMatrix'
    for (int row = 0; row < MATRIX_SIZE; row++) {
        for (int col = 0; col < MATRIX_SIZE; col++) {
            if (keyMatrix[row][col] == ch) {
                // Nếu tìm thấy ký tự, trả về mảng chứa chỉ số hàng và cột
                return new int[]{row, col};
            }
        }
    }
    // Nếu không tìm thấy, trả về null
    return null;
    }
    public String getKeyMatrixAsString() {
    // Tạo một đối tượng StringBuilder để xây dựng chuỗi kết quả
    StringBuilder matrixString = new StringBuilder();

    // Duyệt qua từng hàng của ma trận khóa
    for (int row = 0; row < MATRIX_SIZE; row++) {
        // Duyệt qua từng cột của ma trận khóa
        for (int col = 0; col < MATRIX_SIZE; col++) {
            // Thêm phần tử tại vị trí (row, col) vào chuỗi kết quả, sau đó thêm một khoảng trắng
            matrixString.append(keyMatrix[row][col]).append(" ");
        }
        // Khi kết thúc một hàng, thêm ký tự xuống dòng
        matrixString.append("\n");
    }

    // Trả về chuỗi kết quả
    return matrixString.toString();
    }         
}

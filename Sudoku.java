import javax.swing.*;
import java.awt.*;

public class Sudoku extends JFrame {
    private final JTextField[][] cells = new JTextField[9][9];

    public Sudoku(String[] args) {
        setTitle("Sudoku");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new GridLayout(9, 9));

        for (int row = 0; row < 9; row++)
            for (int col = 0; col < 9; col++) {
                JTextField cell = new JTextField("", SwingConstants.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                cells[row][col] = cell;
                add(cell);
            }

        for (String arg : args) {
            String[] parts = arg.split(";");
            String[] pos = parts[0].split(",");
            int row = Integer.parseInt(pos[1]);
            int col = Integer.parseInt(pos[0]);
            int value = Integer.parseInt(parts[1]);
            boolean fixed = Boolean.parseBoolean(parts[2]);

            JTextField cell = cells[row][col];
            cell.setText(String.valueOf(value));
            if (fixed) {
                cell.setEditable(false);
                cell.setBackground(new Color(200, 200, 255));
            }
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Sudoku(args));
    }
}

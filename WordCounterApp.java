import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Interactive Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout(10, 10));
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(2, 1));
        JLabel wordCountLabel = new JLabel("Word count: 0");
        JLabel charCountLabel = new JLabel("Character count: 0");

        labelPanel.add(wordCountLabel);
        labelPanel.add(charCountLabel);

        topPanel.add(labelPanel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton clearButton = new JButton("Clear");
        buttonPanel.add(clearButton);

        topPanel.add(buttonPanel, BorderLayout.EAST);

        panel.add(topPanel, BorderLayout.NORTH);

        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateCounts();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateCounts();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateCounts();
            }

            private void updateCounts() {
                String text = textArea.getText();
                int wordCount = countWords(text);
                int charCount = text.length();
                wordCountLabel.setText("Word count: " + wordCount);
                charCountLabel.setText("Character count: " + charCount);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });


        frame.add(panel);
        frame.setVisible(true);
    }

    private static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}

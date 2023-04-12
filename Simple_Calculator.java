import java.awt.*;
import java.awt.event.*;
import java.io.Serial;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.border.*;

public class Simple_Calculator extends JFrame {

    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;

    public Simple_Calculator() {

        this.setTitle("Calculator");
        this.setSize(350, 480);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);

        JFrame frame = this;

        // Create custom color
        Color blueLight = new Color(72, 128, 185);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Empty Panel
        JPanel empty = new JPanel();
        empty.setBackground(Color.WHITE);
        empty.setPreferredSize(new Dimension(335, 20));

        // Create Buttons Panel
        JPanel btnsPanel = new JPanel();
        btnsPanel.setBackground(Color.WHITE);

        // Create Entry space
        JPanel entryFieldPan = new JPanel();
        JFormattedTextField entryField = new JFormattedTextField();

        entryField.setHorizontalAlignment(JTextField.RIGHT);
        entryField.setBorder(new LineBorder(Color.white));
        entryField.setPreferredSize(new Dimension(290, 50));
        entryField.setFont(new Font("Consolas", Font.BOLD, 40));

        // Blocking keyboard keys except 0-9 and BackSpace
        entryField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });

        // Create Buttons
        JButton back = new JButton("BKSP");
        back.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        back.setBackground(Color.lightGray);
        back.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton clearEntry = new JButton("CE");
        clearEntry.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        clearEntry.setBackground(Color.lightGray);
        clearEntry.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton clearAll = new JButton("C");
        clearAll.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        clearAll.setBackground(Color.lightGray);
        clearAll.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton sign = new JButton("+/-");
        sign.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
        sign.setBackground(Color.lightGray);
        sign.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton seven = new JButton("7");
        seven.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        seven.setBackground(Color.gray);
        seven.setForeground(Color.white);
        seven.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton eight = new JButton("8");
        eight.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        eight.setBackground(Color.gray);
        eight.setForeground(Color.white);
        eight.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton nine = new JButton("9");
        nine.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        nine.setBackground(Color.gray);
        nine.setForeground(Color.white);
        nine.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton division = new JButton("/");
        division.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
        division.setBackground(Color.orange);
        division.setForeground(Color.white);
        division.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton four = new JButton("4");
        four.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        four.setBackground(Color.gray);
        four.setForeground(Color.white);
        four.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton five = new JButton("5");
        five.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        five.setBackground(Color.gray);
        five.setForeground(Color.white);
        five.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton six = new JButton("6");
        six.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        six.setBackground(Color.gray);
        six.setForeground(Color.white);
        six.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton multiplication = new JButton("*");
        multiplication.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
        multiplication.setBackground(Color.orange);
        multiplication.setForeground(Color.white);
        multiplication.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton one = new JButton("1");
        one.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        one.setBackground(Color.gray);
        one.setForeground(Color.white);
        one.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton two = new JButton("2");
        two.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        two.setBackground(Color.gray);
        two.setForeground(Color.white);
        two.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton three = new JButton("3");
        three.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        three.setBackground(Color.gray);
        three.setForeground(Color.white);
        three.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton subtraction = new JButton("-");
        subtraction.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
        subtraction.setBackground(Color.orange);
        subtraction.setForeground(Color.white);
        subtraction.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton zero = new JButton("0");
        zero.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        zero.setBackground(Color.gray);
        zero.setForeground(Color.white);
        zero.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton dot = new JButton(".");
        dot.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        dot.setBackground(Color.gray);
        dot.setForeground(Color.white);
        dot.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton equals = new JButton("=");
        equals.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
        equals.setBackground(Color.gray);
        equals.setForeground(Color.white);
        equals.setFont(new Font("Tahoma", Font.BOLD, 18));

        JButton addition = new JButton("+");
        addition.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
        addition.setBackground(Color.orange);
        addition.setForeground(Color.white);
        addition.setFont(new Font("Tahoma", Font.BOLD, 18));

        // Set Dimensions for Buttons
        back.setPreferredSize(new Dimension(70, 60));
        clearEntry.setPreferredSize(new Dimension(70, 60));
        clearAll.setPreferredSize(new Dimension(70, 60));
        sign.setPreferredSize(new Dimension(65, 60));
        seven.setPreferredSize(new Dimension(70, 60));
        eight.setPreferredSize(new Dimension(70, 60));
        nine.setPreferredSize(new Dimension(70, 60));
        division.setPreferredSize(new Dimension(65, 60));
        four.setPreferredSize(new Dimension(70, 60));
        five.setPreferredSize(new Dimension(70, 60));
        six.setPreferredSize(new Dimension(70, 60));
        multiplication.setPreferredSize(new Dimension(65, 60));
        one.setPreferredSize(new Dimension(70, 60));
        two.setPreferredSize(new Dimension(70, 60));
        three.setPreferredSize(new Dimension(70, 60));
        subtraction.setPreferredSize(new Dimension(65, 60));
        zero.setPreferredSize(new Dimension(70, 60));
        dot.setPreferredSize(new Dimension(70, 60));
        equals.setPreferredSize(new Dimension(70, 60));
        addition.setPreferredSize(new Dimension(65, 60));

        ActionListener numbers = (ae -> {

            if (ae.getSource() == zero) {
                entryField.setText(entryField.getText().concat(String.valueOf(0)));

            } else if (ae.getSource() == one) {
                entryField.setText(entryField.getText().concat(String.valueOf(1)));

            } else if (ae.getSource() == two) {
                entryField.setText(entryField.getText().concat(String.valueOf(2)));

            } else if (ae.getSource() == three) {
                entryField.setText(entryField.getText().concat(String.valueOf(3)));

            } else if (ae.getSource() == four) {
                entryField.setText(entryField.getText().concat(String.valueOf(4)));

            } else if (ae.getSource() == five) {
                entryField.setText(entryField.getText().concat(String.valueOf(5)));

            } else if (ae.getSource() == six) {
                entryField.setText(entryField.getText().concat(String.valueOf(6)));

            } else if (ae.getSource() == seven) {
                entryField.setText(entryField.getText().concat(String.valueOf(7)));

            } else if (ae.getSource() == eight) {
                entryField.setText(entryField.getText().concat(String.valueOf(8)));

            } else if (ae.getSource() == nine) {
                entryField.setText(entryField.getText().concat(String.valueOf(9)));

            } else if (ae.getSource() == dot) {
                if (!entryField.getText().contains("."))
                    entryField.setText(entryField.getText().concat("."));
            }
        });

        zero.addActionListener(numbers);
        one.addActionListener(numbers);
        two.addActionListener(numbers);
        three.addActionListener(numbers);
        four.addActionListener(numbers);
        five.addActionListener(numbers);
        six.addActionListener(numbers);
        seven.addActionListener(numbers);
        eight.addActionListener(numbers);
        nine.addActionListener(numbers);
        dot.addActionListener(numbers);

        ActionListener operands = (new ActionListener() {

            double num1 = 0, num2 = 0, result = 0;
            char operator;

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == back) {
                    entryField.setText(entryField.getText().substring(0, entryField.getText().length() - 1));

                } else if (ae.getSource() == clearEntry) {
                    entryField.setText("");

                } else if (ae.getSource() == clearAll) {
                    entryField.setText("");
                    operator = 0;
                    num1 = 0;
                    num2 = 0;
                    result = 0;

                } else if (ae.getSource() == addition) {
                    num1 = Double.parseDouble(entryField.getText());
                    operator = '+';
                    entryField.setText("");

                } else if (ae.getSource() == subtraction) {
                    num1 = Double.parseDouble(entryField.getText());
                    operator = '-';
                    entryField.setText("");

                } else if (ae.getSource() == multiplication) {
                    num1 = Double.parseDouble(entryField.getText());
                    operator = '*';
                    entryField.setText("");

                } else if (ae.getSource() == division) {
                    num1 = Double.parseDouble(entryField.getText());
                    operator = '/';
                    entryField.setText("");

                } else if (ae.getSource() == sign) {
                    double temp = Double.parseDouble(entryField.getText());
                    temp *= -1;

                    if (temp == (int) temp) {
                        entryField.setText(Integer.toString((int) temp));
                    } else {
                        entryField.setText(Double.toString(temp));
                    }

                } else if (ae.getSource() == equals) {
                    num2 = Double.parseDouble(entryField.getText());

                    switch (operator) {
                        case '+' -> result = num1 + num2;
                        case '-' -> result = num1 - num2;
                        case '*' -> {
                            result = num1 * num2;
                            DecimalFormat df = new DecimalFormat("#.#####");
                            df.format(result);
                        }
                        case '/' -> result = num1 / num2;
                    }

                    if (result == (int) result) {
                        num1 = result;
                        entryField.setText(Integer.toString((int) result));

                    } else if (num2 == 0) {
                        entryField.setText("");
                        entryField.setText(entryField.getText() + "ERROR");

                    } else {
                        num1 = result;
                        entryField.setText(Double.toString((double) Math.round(result * 100000d) / 100000d));
                    }
                }
            }
        });

        back.addActionListener(operands);
        clearEntry.addActionListener(operands);
        clearAll.addActionListener(operands);
        addition.addActionListener(operands);
        subtraction.addActionListener(operands);
        multiplication.addActionListener(operands);
        division.addActionListener(operands);
        sign.addActionListener(operands);
        equals.addActionListener(operands);

        // Add Buttons to Buttons Panel
        btnsPanel.add(entryField);
        btnsPanel.add(back);
        btnsPanel.add(clearEntry);
        btnsPanel.add(clearAll);
        btnsPanel.add(sign);
        btnsPanel.add(seven);
        btnsPanel.add(eight);
        btnsPanel.add(nine);
        btnsPanel.add(division);
        btnsPanel.add(four);
        btnsPanel.add(five);
        btnsPanel.add(six);
        btnsPanel.add(multiplication);
        btnsPanel.add(one);
        btnsPanel.add(two);
        btnsPanel.add(three);
        btnsPanel.add(subtraction);
        btnsPanel.add(zero);
        btnsPanel.add(dot);
        btnsPanel.add(equals);
        btnsPanel.add(addition);

        // Creating Menu Bar for the Frame
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.white);

        // Adding Edit Menu to the Bar
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        // Adding Themes Submenu to the Edit Menu
        JMenu themesMenu = new JMenu("Themes");
        themesMenu.setOpaque(true);
        themesMenu.setBackground(Color.white);
        editMenu.add(themesMenu);

        JMenuItem nightThemeMenuItem = new JMenuItem("Night");
        nightThemeMenuItem.setBackground(Color.white);
        themesMenu.add(nightThemeMenuItem);

        JMenuItem dayThemeMenuItem = new JMenuItem("Day");
        dayThemeMenuItem.setBackground(Color.white);
        themesMenu.add(dayThemeMenuItem);

        JMenuItem blueThemeMenuItem = new JMenuItem("Blue");
        blueThemeMenuItem.setBackground(Color.white);
        themesMenu.add(blueThemeMenuItem);

        // Adding Exit to the Edit Menu
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setBackground(Color.white);
        editMenu.add(exitMenuItem);

        exitMenuItem.addActionListener(e -> System.exit(0));

        // Adding Help Menu to the Bar
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        // Adding Version to the Help Menu
        JMenuItem versionMenuItem = new JMenuItem("Version");
        versionMenuItem.setBackground(Color.white);
        helpMenu.add(versionMenuItem);

        versionMenuItem.addActionListener(e -> {
            UIManager.put("OptionPane.background", Color.lightGray);
            UIManager.put("Panel.background", Color.lightGray);
            UIManager.put("Button.background", blueLight);
            UIManager.put("Button.foreground", Color.white);
            String message = "<html><body><div width='190px' align='center'>Version 0.2.6 (beta)</div></body></html>";
            JOptionPane.showMessageDialog(frame, message, "", JOptionPane.PLAIN_MESSAGE);
        });

        // Adding About to the Help Menu
        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.setBackground(Color.white);
        helpMenu.add(aboutMenuItem);

        aboutMenuItem.addActionListener(e -> {
            UIManager.put("OptionPane.background", Color.lightGray);
            UIManager.put("Panel.background", Color.lightGray);
            UIManager.put("Button.background", blueLight);
            UIManager.put("Button.foreground", Color.white);
            String message = "<html><body><div width='190px' align='center'>Author: Oleksandr Shyryayev<br>LaSalle College student</div></body></html>";
            JOptionPane.showMessageDialog(frame, message, "", JOptionPane.PLAIN_MESSAGE);
        });

        // Action to nightThemeMenuItem
        nightThemeMenuItem.addActionListener(e -> {

            // Night theme
            empty.setBackground(Color.black);
            entryField.setBackground(Color.black);
            entryField.setForeground(Color.white);
            entryField.setBorder(new LineBorder(Color.black));
            entryField.setCaretColor(Color.white);
            btnsPanel.setBackground(Color.black);

            back.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            clearEntry.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            clearAll.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            sign.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.black));
            seven.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            eight.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            nine.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            division.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.black));
            four.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            five.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            six.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            multiplication.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.black));
            one.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            two.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            three.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            subtraction.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.black));
            zero.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            dot.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            equals.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.black));
            addition.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.black));
        });

        // Action to dayThemeMenuItem
        dayThemeMenuItem.addActionListener(e -> {

            // Day theme
            empty.setBackground(Color.white);
            entryField.setBackground(Color.white);
            entryField.setForeground(Color.black);
            entryField.setBorder(new LineBorder(Color.white));
            entryField.setCaretColor(Color.black);
            btnsPanel.setBackground(Color.white);

            back.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            clearEntry.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            clearAll.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            sign.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
            seven.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            eight.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            nine.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            division.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
            four.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            five.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            six.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            multiplication.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
            one.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            two.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            three.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            subtraction.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
            zero.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            dot.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            equals.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.white));
            addition.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.white));
        });

        // Action to blueThemeMenuItem
        blueThemeMenuItem.addActionListener(e -> {

            // Blue theme
            empty.setBackground(Color.blue);
            entryField.setBackground(Color.blue);
            entryField.setForeground(Color.white);
            entryField.setBorder(new LineBorder(Color.blue));
            entryField.setCaretColor(Color.white);
            btnsPanel.setBackground(Color.blue);

            back.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            clearEntry.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            clearAll.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            sign.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.blue));
            seven.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            eight.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            nine.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            division.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.blue));
            four.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            five.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            six.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            multiplication.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.blue));
            one.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            two.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            three.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            subtraction.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.blue));
            zero.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            dot.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            equals.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, Color.blue));
            addition.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.blue));
        });

        // Add to mainPanel
        mainPanel.add(empty, BorderLayout.NORTH);
        mainPanel.add(entryFieldPan, BorderLayout.CENTER);
        mainPanel.add(btnsPanel, BorderLayout.CENTER);

        this.setJMenuBar(menuBar);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Simple_Calculator();
    }

}

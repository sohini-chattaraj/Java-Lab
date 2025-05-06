import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm extends JFrame implements ActionListener {
    private JLabel nameLabel, emailLabel, genderLabel, courseLabel, passwordLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JComboBox<String> courseComboBox;
    private JButton submitButton;
    private DefaultTableModel tableModel;
    private JTable studentTable;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        add(nameLabel);
        add(nameField);

        emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        add(emailLabel);
        add(emailField);

        genderLabel = new JLabel("Gender:");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        add(genderLabel);
        add(genderPanel);

        courseLabel = new JLabel("Course:");
        String[] courses = {"Computer Science", "Engineering", "Mathematics", "Physics"};
        courseComboBox = new JComboBox<>(courses);
        add(courseLabel);
        add(courseComboBox);

        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        add(passwordLabel);
        add(passwordField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Email");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Course");

        studentTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(studentTable);
        add(scrollPane);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String gender = maleRadioButton.isSelected() ? "Male" : "Female";
            String course = (String) courseComboBox.getSelectedItem();

            tableModel.addRow(new Object[]{name, email, gender, course});

            // Clear fields after submission
            nameField.setText("");
            emailField.setText("");
            maleRadioButton.setSelected(true);
            courseComboBox.setSelectedIndex(0);
            passwordField.setText("");
        }
    }

    public static void 8a(String[] args) {
        new StudentRegistrationForm();
    }
}

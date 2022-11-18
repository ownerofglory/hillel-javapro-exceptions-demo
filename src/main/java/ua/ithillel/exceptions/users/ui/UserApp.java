package ua.ithillel.exceptions.users.ui;

import ua.ithillel.exceptions.users.exception.UserAlreadyExistsException;
import ua.ithillel.exceptions.users.service.UserService;

import javax.swing.*;
import java.awt.*;

public class UserApp extends JFrame {
    private UserService userService;


    private JTextField usernameInput = new JTextField();
    private JLabel usernameLabel = new JLabel("username");
    private JTextField passwordInput = new JPasswordField();
    private JLabel passwordLabel = new JLabel("password");
    private JLabel resultLabel = new JLabel();
    private JButton saveButton = new JButton("save");

    {
        setSize(600, 400);
        setLayout(new GridLayout(3, 2));
        setVisible(true);
        add(usernameLabel);
        add(usernameInput);
        add(passwordLabel);
        add(passwordInput);
        add(resultLabel);
        add(saveButton);
    }

    public UserApp(UserService userService) throws HeadlessException {
        this.userService = userService;

        saveButton.addActionListener(e -> {
            String username = usernameInput.getText();
            String password = passwordInput.getText();

            try {
                userService.saveUser(username, password);

                resultLabel.setForeground(Color.BLUE);
                resultLabel.setText("Successfully saved");
            } catch (UserAlreadyExistsException ex) {
                System.out.printf("User %s already exists\n", ex.getMessage());
                resultLabel.setForeground(Color.RED);
                resultLabel.setText(String.format("User %s already exists\n", ex.getMessage()));
            }
        });
    }

}

package ua.ithillel.exceptions.users;

import ua.ithillel.exceptions.users.repo.UserFileStoreRepo;
import ua.ithillel.exceptions.users.repo.UserInMemoryRepo;
import ua.ithillel.exceptions.users.repo.UserRepo;
import ua.ithillel.exceptions.users.service.UserService;
import ua.ithillel.exceptions.users.service.UserServiceDefault;
import ua.ithillel.exceptions.users.ui.UserApp;

public class Application {
    public static void main(String[] args) {
        UserRepo repo = new UserInMemoryRepo();
        UserService service = new UserServiceDefault(repo);
        UserApp userApp = new UserApp(service);

        //        try (
//                ServerSocket serverSocket = new ServerSocket(8090)) {
//
//            Socket connection = serverSocket.accept();
//
//            InputStream inputStream = connection.getInputStream();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//            StringBuffer requestBuffer = new StringBuffer();
//            bufferedReader.lines().forEach(line -> requestBuffer.append(line));
//
//            System.out.println(requestBuffer);
//
//            FileInputStream fileInputStream = new FileInputStream("nonexisting.html");
//            BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileInputStream));
//
//            StringBuffer responseBuffer = new StringBuffer();
//            fileReader.lines().forEach(line -> responseBuffer.append(line + "\n"));
//
//            System.out.println(responseBuffer);
//
//            OutputStream outputStream = connection.getOutputStream();
//            BufferedWriter printWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
//            String response = "HTTP/1.1 200 OK\r\n\r\n" +
//                    "Content-Type:text/plain\r\n\r\n" +
//                            responseBuffer.toString() + "\r\n";
//            System.out.println(response);
//            printWriter.write("Hello");
//            printWriter.flush();
//
//            printWriter.close();
//
//        } catch (FileNotFoundException e) {
//
//        } catch (IOException e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("Finally block");
//        }
    }
}

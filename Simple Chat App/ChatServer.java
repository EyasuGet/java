package CHAT;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private ArrayList<ClientHandler> clients = new ArrayList<>();
    private static Set<Socket> clientSockets = new HashSet<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server started. Waiting for clients...");

        while (true) {
            Socket socket = serverSocket.accept();
            clientSockets.add(socket);
            System.out.println("New client connected: " + socket.getInetAddress().getHostAddress());

            new Thread(new ClientHandler(socket)).start();
        }
    }

    static class ClientHandler implements Runnable {
        private Socket client;
        private BufferedReader in;
        private String username;
        private PrintWriter out;


        public ClientHandler(Socket client) throws IOException {
            this.client = client;
            this.in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        }

        @Override
        public void run() {
            try {
                out = new PrintWriter(client.getOutputStream(),true);
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                out.println("Enter a username: ");
                username = in.readLine();
                System.out.println(username + "connected");
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                    broadcast(message, client);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    client.close();
                    clientSockets.remove(client);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void broadcast(String message, Socket senderSocket) {
            for (Socket clientSocket : clientSockets) {
                if (clientSocket != senderSocket) {
                    try {
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                        out.println(message);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }



    }
}


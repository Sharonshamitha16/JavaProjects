/*package org.codewithsharon.telegrambot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Document;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.Map;

public class FileBot extends TelegramLongPollingBot {

    private final String botToken; // Replace 'YOUR_TOKEN' with your actual token
    private final Map<String, String> files;

    public FileBot(String botToken) {
        this.botToken = botToken;
        this.files = new HashMap<>();
    }

    public static void main(String[] args) {
        ApiContextInitializer.init(); // Initialize API context
        FileBot bot = new FileBot("YOUR_TOKEN"); // Replace 'YOUR_TOKEN' with your actual token
        bot.runBot();
    }

    public void runBot() {
        try {
            execute(this);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "YourBotUsername"; // Replace with your bot's username
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message message = update.getMessage();
            String text = message.getText();
            long chatId = message.getChatId();

            if (text.startsWith("/start")) {
                sendTextMessage(chatId, "Welcome to File Bot! Send /help for a list of commands.");
            } else if (text.startsWith("/help")) {
                sendTextMessage(chatId, "Available commands:\n",
                        "/start - Start the bot\n",
                        "/help - Show this help message\n",
                        "/upload - Upload a file\n",
                        "/getfile - Get a file by name");
            } else if (text.startsWith("/upload") && message.hasDocument()) {
                Document document = message.getDocument();
                String fileId = document.getFileId();
                String fileName = document.getFileName();
                files.put(fileName, fileId);
                sendTextMessage(chatId, "File '" + fileName + "' uploaded successfully!");
            } else if (text.startsWith("/getfile")) {
                String[] args = text.split(" ", 2);
                if (args.length == 2) {
                    String fileName = args[1];
                    String fileId = files.get(fileName);
                    if (fileId != null) {
                        sendDocument(chatId, fileId);
                    } else {
                        sendTextMessage(chatId, "File '" + fileName + "' not found.");
                    }
                } else {
                    sendTextMessage(chatId, "Please provide a file name. Usage: /getfile <file_name>");
                }
            }
        }
    }

    private void sendTextMessage(long chatId, String text) {
        SendMessage message = new SendMessage(chatId, text);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendDocument(long chatId, String fileId) {
        SendDocument document = new SendDocument(chatId, fileId);
        try {
            execute(document);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
*/

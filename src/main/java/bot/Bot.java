package bot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import service.impl.WeatherServiceImpl;

import java.util.List;

public class Bot extends TelegramLongPollingBot {

    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        var cityName = update.getMessage().getText();

        var service = new WeatherServiceImpl();

        var sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        sendMessage.setChatId(update.getMessage().getChatId());
        sendMessage.setText(service.getByCityName(cityName).toString());

        KeyboardRow firstkeyboardRow = new KeyboardRow();
        firstkeyboardRow.add("Hi");

        KeyboardRow firstkeyboardRow3 = new KeyboardRow();
        firstkeyboardRow.add("Hi");

        KeyboardRow firstkeyboardRow2 = new KeyboardRow();
        firstkeyboardRow.add("Hi");


        KeyboardRow secondkeyboardRow = new KeyboardRow();
        secondkeyboardRow.add("bye");


        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setKeyboard(List.of(firstkeyboardRow, secondkeyboardRow, firstkeyboardRow3,firstkeyboardRow2));
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);


        execute(sendMessage);


    }

//    @SneakyThrows
//    public synchronized void sendMsg(String chatId, String msg) {
//
//    }

    @Override
    public String getBotUsername() {
        return "cursor_weather_bot";
    }


    @Override
    public String getBotToken() {
        return "1273515866:AAFMUk2fND_2DP64sp_3kt9P707nRDAe1Z4";
    }
}

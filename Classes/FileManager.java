package Classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehavior;
import Interfaces.FileIO;

public class FileManager implements FileIO {
    @Override
    public void writeToFile(String fileName, List<iActorBehavior> queue) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(queue);
            System.out.println("Данные успешно записаны в файл " + fileName);
        }
    }

    @Override
    public List<iActorBehavior> readFromFile(String fileName) throws IOException {
        List<iActorBehavior> queue = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            queue = (List<iActorBehavior>) ois.readObject();
            System.out.println("Данные успешно загружены из файла " + fileName);
        } catch (ClassNotFoundException e) {
            System.err.println("Ошибка при чтении данных из файла: " + e.getMessage());
        }
        return queue;
    }
}
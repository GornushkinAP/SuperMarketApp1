package Interfaces;

import java.io.IOException;
import java.util.List;

public interface FileIO {
    void writeToFile(String fileName, List<iActorBehavior> queue) throws IOException;
    List<iActorBehavior> readFromFile(String fileName) throws IOException;
}


package OOP.oop2.Lesson_08.Ex006.Format;

import OOP.oop2.Lesson_08.Ex006.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;

public class Md extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".md", false)) {
            writer.write("## <Md Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

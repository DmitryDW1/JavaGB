package OOP.oop2.Lesson_08.Ex006.Interface;

import OOP.oop2.Lesson_08.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}

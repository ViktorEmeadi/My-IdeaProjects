package Diary2;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    public void set(){
        diary = new Diary();
    }
    public void testForDiary(){
        assertNotNull(diary);
    }
    public void testDiaryIsLocked(){
        assertTrue(diary.isLocked());
    }
    public void testDiaryCanBeUnlocked(){
        assertTrue(diary.isLocked());
        diary.unlockWith("password");
    }
    public void createGist_findGistByTitle(){
//        diary.unlockWith("password");
//        diary.addGist("title", "body");
//        Gist foundGist = diary.findGistByTitle("title");
//
//        assertEquals("title", foundGist.getTitle());
//        assertEquals("body", foundGist.getBody());

    }

}

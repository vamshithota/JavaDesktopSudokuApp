package com.example.javadesktopsudokuapp.problemdomain;

import java.io.IOException;

public interface IStorage {

    void updateGame(SudokuGame game) throws IOException;
    SudokuGame getGame() throws IOException;

}

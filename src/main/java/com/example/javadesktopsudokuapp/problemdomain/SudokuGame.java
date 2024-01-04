package com.example.javadesktopsudokuapp.problemdomain;

import com.example.javadesktopsudokuapp.computationlogic.SudokuUtilities;
import com.example.javadesktopsudokuapp.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState){
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState(){
        return gameState;
    }

    public int[][] getCopyOfGridState(){
        return SudokuUtilities.copyToNewArray(gridState);
    }

}

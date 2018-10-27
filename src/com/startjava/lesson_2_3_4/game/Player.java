package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number = -1;
	private int[] numbersHistory = new int[11];
	private boolean isWinner;
	private int currentNumberIndex = 0;

	public Player(String name) {
		this.name = name;
	}

	private void updateNumberIndex() {
        currentNumberIndex++;

        if (currentNumberIndex > 10) {
            currentNumberIndex = 0;
            Arrays.fill(numbersHistory, -1);
        }
    }

	public String getName() {
		return name;
	}

    public void setNumber(int number) {
	    numbersHistory[currentNumberIndex] = this.number;
        this.number = number;

        updateNumberIndex();
    }

    public int getNumber() {
        return number;
    }

    public int getNumbersHistoryElemet(int index) {
        return numbersHistory[index];
    }

    public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	
} 
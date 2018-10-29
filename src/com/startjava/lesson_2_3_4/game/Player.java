package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number = -1;
	private static final int MAX_TRIES = 10;
	private int[] numbers = new int[MAX_TRIES];
	private boolean isWinner;
	private int currentNumberIndex = -1;

	public Player(String name) {
		this.name = name;
	}

	private void updateNumberIndex() {
        currentNumberIndex++;

        if (currentNumberIndex == MAX_TRIES) {
            currentNumberIndex = 0;
            Arrays.fill(numbers, -1);
        }
    }

	public String getName() {
		return name;
	}

    public void setNumber(int number) {
        updateNumberIndex();
	    numbers[currentNumberIndex] = number;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	
} 
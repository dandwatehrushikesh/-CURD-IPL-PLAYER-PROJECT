package com.client;

import com.controller.playercontroller;

public class iplclient {
	public static void main(String[] args) {

		playercontroller pl = new playercontroller();

		pl.ShowAllPlayer();
		System.out.println();

		pl.findPlayerWithHighestRuns(0);
		System.out.println();

		pl.findPlayerWithLowestRuns();
		System.out.println();

		pl.findPlayersOfSameTem(" MI");
		System.out.println();

		pl.displayPlayersInAscendingOrder();
		System.out.println();

		pl.displayPlayersInDescendingOrder();
		System.out.println();

		

		pl.UpdatePlayerData();
		System.out.println();

		pl.InsertPlayerData();
		System.out.println();

		pl.DeletePlayerData();
		System.out.println();

	}

}

package com.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.Dao.playerdao;
import com.entity.playerentity;

public class playerservice {

	playerdao dao;

	public List<playerentity> ShowAllPlayer() {

		dao = new playerdao();
		List<playerentity> db = dao.ShowAllPlayer();
		for (playerentity ply : db) {
			System.out.println(ply);

		}

		return db;

	}

	// Method to find player with highest runs
	public List<playerentity> findPlayerWithHighestRuns() {
		List<playerentity> players = dao.ShowAllPlayer();
		int maxRuns = 0;
		playerentity highestRunPlayer = null;

		for (playerentity player : players) {
			if (player.getRuns() > maxRuns) {
				maxRuns = player.getRuns();
				highestRunPlayer = player;
			}
		}

		System.out.println("Player with Highest Runs: " + highestRunPlayer);
		return players;
	}

	// Method to find player with lowest runs
	public List<playerentity> findPlayerWithLowestRuns() {
		List<playerentity> players = dao.ShowAllPlayer();
		int minRuns = Integer.MAX_VALUE;
		playerentity lowestRunPlayer = null;

		for (playerentity player : players) {
			if (player.getRuns() < minRuns) {
				minRuns = player.getRuns();
				lowestRunPlayer = player;
			}
		}

		System.out.println("Player with Lowest Runs: " + lowestRunPlayer);
		return players;
	}

	// Method to find players of the same team
	public List<playerentity> findPlayersOfSameTeam(String teamName) {
		List<playerentity> players = dao.ShowAllPlayer();

		System.out.println("Players of Team '" + teamName + "':");
		for (playerentity player : players) {
			if (player.getPlayername().equals(teamName)) {
				System.out.println(player);
			}
		}
		return players;
	}

	// Method to display players in ascending order of runs
	public List<playerentity> displayPlayersInAscendingOrder() {
		List<playerentity> players = dao.ShowAllPlayer();

		// Sort players by runs in ascending order
		players.sort((p1, p2) -> Integer.compare(p1.getRuns(), p2.getRuns()));

		System.out.println("Players in Ascending Order of Runs:");
		for (playerentity player : players) {
			System.out.println(player);
		}
		return players;
	}

	// Method to display players in descending order of runs
	public List<playerentity> displayPlayersInDescendingOrder() {
		List<playerentity> players = dao.ShowAllPlayer();

		// Sort players by runs in descending order
		players.sort((p1, p2) -> Integer.compare(p2.getRuns(), p1.getRuns()));

		System.out.println("Players in Descending Order of Runs:");
		for (playerentity player : players) {
			System.out.println(player);
		}
		return players;
	}

	public List<playerentity> UpdatePlayerData() {

		dao = new playerdao();
		List<playerentity> db = dao.UpdatePlayerData();
		return db;

	}

	public List<playerentity> InsertPlayerData() {
		dao = new playerdao();
		List<playerentity> db = dao.InsertPlayerData();
		return db;

	}

	public List<playerentity> DeletePlayerData() {
		dao = new playerdao();
		List<playerentity> db = dao.DeletePlayerData();

		return db;

	}
}
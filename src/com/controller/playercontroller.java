package com.controller;

import java.util.List;

import com.Service.playerservice;
import com.entity.playerentity;

public class playercontroller {

	playerservice service;

	public List<playerentity> ShowAllPlayer() {

		service = new playerservice();

		List<playerentity> db = service.ShowAllPlayer();

		return db;

	}

	public List<playerentity> findPlayerWithHighestRuns(int runs) {
		service = new playerservice();

		List<playerentity> db = service.findPlayerWithHighestRuns();

		return db;

	}

	public List<playerentity> findPlayerWithLowestRuns() {
		service = new playerservice();

		List<playerentity> db = service.findPlayerWithLowestRuns();
		return db;

	}

	public List<playerentity> findPlayersOfSameTem(String teamname) {
		service = new playerservice();

		List<playerentity> db = service.findPlayersOfSameTeam(teamname);
		return db;

	}

	public List<playerentity> displayPlayersInAscendingOrder() {
		service = new playerservice();

		List<playerentity> db = service.displayPlayersInAscendingOrder();
		return db;

	}

	public List<playerentity> displayPlayersInDescendingOrder() {
		service = new playerservice();

		List<playerentity> db = service.displayPlayersInDescendingOrder();
		return db;

	}

	public List<playerentity> UpdatePlayerData() {

		service = new playerservice();

		List<playerentity> db = service.UpdatePlayerData();
		return db;

	}

	public List<playerentity> InsertPlayerData() {

		service = new playerservice();

		List<playerentity> db = service.InsertPlayerData();
		return db;

	}

	public List<playerentity> DeletePlayerData() {
		service = new playerservice();

		List<playerentity> db = service.DeletePlayerData();
		return db;

	}
}
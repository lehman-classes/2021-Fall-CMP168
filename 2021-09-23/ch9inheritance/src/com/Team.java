package com;

import java.util.ArrayList;

public class Team {
  private String name;
  private ArrayList players;

  public Team(String newName) {
    name = newName;
  }

  public String getName() {
    return name;
  }

  public void addPlayer(Player player) {
    players.add(player);
  }
}

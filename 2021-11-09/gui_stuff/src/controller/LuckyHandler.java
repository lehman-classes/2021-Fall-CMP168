package controller;

import model.Person;

public class LuckyHandler {

  public boolean checkIfWinner(Person person) {
    // it might need to call a db from here
    // or some remote service
    // then return result if required
    if (person.getLuckyNumber() == 7) {
      return true;
    }
    return false;
  }
}

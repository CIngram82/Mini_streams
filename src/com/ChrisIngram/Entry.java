package com.ChrisIngram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entry {
  private Day day;
  private String note;

  public Entry(Day day, String note) {
    this.day = day;
    this.note = note;
  }

  public Day getDay() {
    return day;
  }

  public String getNote() {
    return note;
  }

  @Override
  public String toString() {
    return "Entry{" +
        "day=" + day +
        ", note='" + note + '\'' +
        '}';
  }

  public static List<Entry> populate() {
    List<Entry> entries = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 12; i++) {
      int rando = random.nextInt(7);

      switch (rando) {
        case 0:
          Entry entry = new Entry(Day.MONDAY, "Today I went to play sports");
          entries.add(entry);
          break;
        case 1:
          entry = new Entry(Day.TUESDAY, "Lunch was a salad today... was still hungry");
          entries.add(entry);
          break;
        case 2:
          entry = new Entry(Day.WEDNESDAY, "Hump day! Looking forward to the weekend.");
          entries.add(entry);
          break;
        case 3:
          entry = new Entry(Day.THURSDAY, "Poker night");
          entries.add(entry);
          break;
        case 4:
          entry = new Entry(Day.FRIDAY, "Finally Friday!");
          entries.add(entry);
          break;
        case 5:
          entry = new Entry(Day.SATURDAY, "Saturdaze");
          entries.add(entry);
          break;
        case 6:
          entry = new Entry(Day.SUNDAY, "Sunday Bumday");
          entries.add(entry);
          break;
          default:
            System.out.println("WHY are you here???");
            break;
      }
    }
    return entries;
  }
}

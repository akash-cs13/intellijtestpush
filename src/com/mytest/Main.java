package com.mytest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void basedOnSport(Participant[] participants, String sport){
        for (Participant participant : participants) {
            if (participant.getSportType().equals(sport)){
                System.out.println(participant.getName() + " " + participant.getSurname());
            }
        }
    }

    public static void basedOnAward(Participant[] participants, String award){
        for (Participant participant : participants) {
            if (participant.getAwards().contains(award)){
                System.out.println(participant.getName() + " " + participant.getSurname());
            }
        }
    }

    public static void main(String[] args) {
        Participant[] participants = new Participant[5];
        List<String> awards = new ArrayList<>();
        awards.add("National");
        participants[0] = new Participant("Akash", "CS", 22, "Bouldering", awards);

        List<String> awards1 = new ArrayList<>();
        awards1.add("National");
        awards1.add("International");
        participants[1] = new Participant("Magnus", "Mitbo", 33, "Bouldering", awards1);
        participants[2] = new Participant("Virat", "Koili", 27, "Cricket", awards1);
        participants[3] = new Participant("Lionel", "Messi", 30, "Football", awards1);
        participants[4] = new Participant("Adam", "Ondra", 28, "Bouldering", awards1);

        System.out.println("Participants with Bouldering as their sport:");
        basedOnSport(participants, "Bouldering");

        System.out.println("\nParticipants with International Awards in their sport:");
        basedOnAward(participants, "International");
    }
}
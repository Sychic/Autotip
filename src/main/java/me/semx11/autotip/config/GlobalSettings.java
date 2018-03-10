package me.semx11.autotip.config;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class GlobalSettings {

    private String hypixelHeader;
    private int xpPerTipReceived;
    private LocalDate xpChangeDate;
    private List<GameGroup> gameGroups;

    public String getHypixelHeader() {
        return hypixelHeader;
    }

    public int getXpPerTipReceived() {
        return xpPerTipReceived;
    }

    public LocalDate getXpChangeDate() {
        return xpChangeDate;
    }

    public List<GameGroup> getGameGroups() {
        return gameGroups;
    }

    public static class GameGroup {

        private String name;
        private Set<String> games;

        public String getName() {
            return name;
        }

        public Set<String> getGames() {
            return games;
        }

    }

}

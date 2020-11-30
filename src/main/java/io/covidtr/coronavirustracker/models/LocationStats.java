package io.covidtr.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int deltaPrevDay;

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getDeltaPrevDay() {
        return deltaPrevDay;
    }

    public void setDeltaPrevDay(int deltaPrevDay) {
        this.deltaPrevDay = deltaPrevDay;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", leatestTotalCases=" + latestTotalCases +
                '}';
    }
}

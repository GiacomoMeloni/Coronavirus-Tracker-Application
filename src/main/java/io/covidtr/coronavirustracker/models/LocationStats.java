package io.covidtr.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int leatestTotalCases;

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getLatestTotalCases() {
        return leatestTotalCases;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLeatestTotalCases(int leatestTotalCases) {
        this.leatestTotalCases = leatestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", leatestTotalCases=" + leatestTotalCases +
                '}';
    }
}

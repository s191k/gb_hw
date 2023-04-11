package Lesson_6;

public class Laptop {

    private String cpu;
    private int numberOfCores;
    private String resolution;
    private double screenDiagonalSize;
    private int ssdVolume;
    private int ram;
    private boolean hasWebCam;

    public Laptop( String cpu, int numberOfCores, String resolution,double screenDiagonalSize,
                   int ssdVolume, int ram, boolean hasWebCam ) {
        this.cpu = cpu;
        this.numberOfCores = numberOfCores;
        this.resolution = resolution;
        this.screenDiagonalSize = screenDiagonalSize;
        this.ssdVolume = ssdVolume;
        this.ram = ram;
        this.hasWebCam = hasWebCam;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getScreenDiagonalSize() {
        return screenDiagonalSize;
    }

    public void setScreenDiagonalSize(double screenDiagonalSize) {
        this.screenDiagonalSize = screenDiagonalSize;
    }

    public int getSsdVolume() {
        return ssdVolume;
    }

    public void setSsdVolume(int ssdVolume) {
        this.ssdVolume = ssdVolume;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isHasWebCam() {
        return hasWebCam;
    }

    public void setHasWebCam(boolean hasWebCam) {
        this.hasWebCam = hasWebCam;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "cpu='" + cpu + '\'' +
                ", numberOfCores=" + numberOfCores +
                ", resolution='" + resolution + '\'' +
                ", screenDiagonalSize=" + screenDiagonalSize +
                ", ssdVolume=" + ssdVolume +
                ", ram=" + ram +
                ", hasWebCam=" + hasWebCam +
                '}';
    }

}

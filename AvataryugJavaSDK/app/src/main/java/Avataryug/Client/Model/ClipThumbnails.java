package Avataryug.Client.Model;

import java.util.Objects;

public class ClipThumbnails {
    // Private fields
    private Integer device;
    private Integer textureSize;
    private String thumbnailUrl;

    // Constructor
    public ClipThumbnails(Integer device, Integer textureSize, String thumbnailUrl) {
        this.device = device;
        this.textureSize = textureSize;
        this.thumbnailUrl = thumbnailUrl;
    }

    // Getters and Setters
    public Integer getDevice() {
        return device;
    }

    public void setDevice(Integer device) {
        this.device = device;
    }

    public Integer getTextureSize() {
        return textureSize;
    }

    public void setTextureSize(Integer textureSize) {
        this.textureSize = textureSize;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    // Override equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClipThumbnails that = (ClipThumbnails) o;
        return Objects.equals(device, that.device) &&
                Objects.equals(textureSize, that.textureSize) &&
                Objects.equals(thumbnailUrl, that.thumbnailUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, textureSize, thumbnailUrl);
    }
}

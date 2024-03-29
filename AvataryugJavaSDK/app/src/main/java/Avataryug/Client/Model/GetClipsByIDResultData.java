/**
 * Client
 * AvatarYug Client side API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package Avataryug.Client.Model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetClipsByIDResultData {
  
  @SerializedName("DisplayName")
  private String displayName = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("Category")
  private String category = null;
  @SerializedName("CustomMetaData")
  private String customMetaData = null;
  @SerializedName("ThumbnailsUrl")
  private String ThumbnailsUrl = null;
//  @SerializedName("Artifacts")
//  private List artifacts = null;
  @SerializedName("Tags")
  private String tags = null;
  @SerializedName("Color")
  private String color = null;
  @SerializedName("Metadata")
  private String metadata = null;
  @SerializedName("Status")
  private Integer status = null;
  @SerializedName("ClipType")
  private Integer clipType = null;
  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClipTemplateID")
  private String ClipTemplateID = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCustomMetaData() {
    return customMetaData;
  }
  public void setCustomMetaData(String customMetaData) {
    this.customMetaData = customMetaData;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThumbnailsUrl() {
    return ThumbnailsUrl;
  }
  public void setThumbnailsUrl(String thumbnailsUrl) {
    this.ThumbnailsUrl = ThumbnailsUrl;
  }

  /**
   **/
//  @ApiModelProperty(value = "")
//  public List getArtifacts() {
//    return artifacts;
//  }
//  public void setArtifacts(List artifacts) {
//    this.artifacts = artifacts;
//  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMetadata() {
    return metadata;
  }
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getClipType() {
    return clipType;
  }
  public void setClipType(Integer clipType) {
    this.clipType = clipType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  @ApiModelProperty(value = "")
  public String getClipTemplateID() {
    return ClipTemplateID;
  }
  public void setClipTemplateID(String ID) {
    this.ClipTemplateID = ClipTemplateID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClipsByIDResultData getClipsByIDResultData = (GetClipsByIDResultData) o;
    return (this.displayName == null ? getClipsByIDResultData.displayName == null : this.displayName.equals(getClipsByIDResultData.displayName)) &&
        (this.description == null ? getClipsByIDResultData.description == null : this.description.equals(getClipsByIDResultData.description)) &&
        (this.category == null ? getClipsByIDResultData.category == null : this.category.equals(getClipsByIDResultData.category)) &&
        (this.customMetaData == null ? getClipsByIDResultData.customMetaData == null : this.customMetaData.equals(getClipsByIDResultData.customMetaData)) &&
        (this.ThumbnailsUrl == null ? getClipsByIDResultData.ThumbnailsUrl == null : this.ThumbnailsUrl.equals(getClipsByIDResultData.ThumbnailsUrl)) &&
//        (this.artifacts == null ? getClipsByIDResultData.artifacts == null : this.artifacts.equals(getClipsByIDResultData.artifacts)) &&
        (this.tags == null ? getClipsByIDResultData.tags == null : this.tags.equals(getClipsByIDResultData.tags)) &&
        (this.color == null ? getClipsByIDResultData.color == null : this.color.equals(getClipsByIDResultData.color)) &&
        (this.metadata == null ? getClipsByIDResultData.metadata == null : this.metadata.equals(getClipsByIDResultData.metadata)) &&
        (this.status == null ? getClipsByIDResultData.status == null : this.status.equals(getClipsByIDResultData.status)) &&
        (this.clipType == null ? getClipsByIDResultData.clipType == null : this.clipType.equals(getClipsByIDResultData.clipType)) &&
        (this.ID == null ? getClipsByIDResultData.ID == null : this.ID.equals(getClipsByIDResultData.ID))&&
            (this.ClipTemplateID == null ? getClipsByIDResultData.ClipTemplateID == null : this.ClipTemplateID.equals(getClipsByIDResultData.ClipTemplateID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.customMetaData == null ? 0: this.customMetaData.hashCode());
    result = 31 * result + (this.ThumbnailsUrl == null ? 0: this.ThumbnailsUrl.hashCode());
//    result = 31 * result + (this.artifacts == null ? 0: this.artifacts.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.color == null ? 0: this.color.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.clipType == null ? 0: this.clipType.hashCode());
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    result = 31 * result + (this.ClipTemplateID == null ? 0: this.ClipTemplateID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClipsByIDResultData {\n");
    
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  customMetaData: ").append(customMetaData).append("\n");
    sb.append("  ThumbnailsUrl: ").append(ThumbnailsUrl).append("\n");
//    sb.append("  artifacts: ").append(artifacts).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  color: ").append(color).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  clipType: ").append(clipType).append("\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("  ClipTemplateID: ").append(ClipTemplateID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

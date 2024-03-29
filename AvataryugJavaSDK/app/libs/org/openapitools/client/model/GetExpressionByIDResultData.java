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

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetExpressionByIDResultData {
  
  @SerializedName("DisplayName")
  private String displayName = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("Category")
  private String category = null;
  @SerializedName("CustomMetaData")
  private List customMetaData = null;
  @SerializedName("ThumbnailsUrl")
  private String thumbnailsUrl = null;
  @SerializedName("BlendshapeKeys")
  private String blendshapeKeys = null;
  @SerializedName("Tags")
  private String tags = null;
  @SerializedName("Color")
  private String color = null;
  @SerializedName("Metadata")
  private String metadata = null;
  @SerializedName("Status")
  private Integer status = null;
  @SerializedName("ID")
  private String ID = null;

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
  public List getCustomMetaData() {
    return customMetaData;
  }
  public void setCustomMetaData(List customMetaData) {
    this.customMetaData = customMetaData;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThumbnailsUrl() {
    return thumbnailsUrl;
  }
  public void setThumbnailsUrl(String thumbnailsUrl) {
    this.thumbnailsUrl = thumbnailsUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBlendshapeKeys() {
    return blendshapeKeys;
  }
  public void setBlendshapeKeys(String blendshapeKeys) {
    this.blendshapeKeys = blendshapeKeys;
  }

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
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExpressionByIDResultData getExpressionByIDResultData = (GetExpressionByIDResultData) o;
    return (this.displayName == null ? getExpressionByIDResultData.displayName == null : this.displayName.equals(getExpressionByIDResultData.displayName)) &&
        (this.description == null ? getExpressionByIDResultData.description == null : this.description.equals(getExpressionByIDResultData.description)) &&
        (this.category == null ? getExpressionByIDResultData.category == null : this.category.equals(getExpressionByIDResultData.category)) &&
        (this.customMetaData == null ? getExpressionByIDResultData.customMetaData == null : this.customMetaData.equals(getExpressionByIDResultData.customMetaData)) &&
        (this.thumbnailsUrl == null ? getExpressionByIDResultData.thumbnailsUrl == null : this.thumbnailsUrl.equals(getExpressionByIDResultData.thumbnailsUrl)) &&
        (this.blendshapeKeys == null ? getExpressionByIDResultData.blendshapeKeys == null : this.blendshapeKeys.equals(getExpressionByIDResultData.blendshapeKeys)) &&
        (this.tags == null ? getExpressionByIDResultData.tags == null : this.tags.equals(getExpressionByIDResultData.tags)) &&
        (this.color == null ? getExpressionByIDResultData.color == null : this.color.equals(getExpressionByIDResultData.color)) &&
        (this.metadata == null ? getExpressionByIDResultData.metadata == null : this.metadata.equals(getExpressionByIDResultData.metadata)) &&
        (this.status == null ? getExpressionByIDResultData.status == null : this.status.equals(getExpressionByIDResultData.status)) &&
        (this.ID == null ? getExpressionByIDResultData.ID == null : this.ID.equals(getExpressionByIDResultData.ID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.customMetaData == null ? 0: this.customMetaData.hashCode());
    result = 31 * result + (this.thumbnailsUrl == null ? 0: this.thumbnailsUrl.hashCode());
    result = 31 * result + (this.blendshapeKeys == null ? 0: this.blendshapeKeys.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.color == null ? 0: this.color.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExpressionByIDResultData {\n");
    
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  customMetaData: ").append(customMetaData).append("\n");
    sb.append("  thumbnailsUrl: ").append(thumbnailsUrl).append("\n");
    sb.append("  blendshapeKeys: ").append(blendshapeKeys).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  color: ").append(color).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

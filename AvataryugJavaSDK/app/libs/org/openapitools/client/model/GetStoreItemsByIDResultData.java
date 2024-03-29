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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetStoreItemsByIDResultData {
  
  @SerializedName("StoreID")
  private String storeID = null;
  @SerializedName("DisplayName")
  private String displayName = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("CustomMetaData")
  private String customMetaData = null;
  @SerializedName("StoreContents")
  private String storeContents = null;
  @SerializedName("Status")
  private Integer status = null;
  @SerializedName("ID")
  private String ID = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStoreID() {
    return storeID;
  }
  public void setStoreID(String storeID) {
    this.storeID = storeID;
  }

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
  public String getCustomMetaData() {
    return customMetaData;
  }
  public void setCustomMetaData(String customMetaData) {
    this.customMetaData = customMetaData;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStoreContents() {
    return storeContents;
  }
  public void setStoreContents(String storeContents) {
    this.storeContents = storeContents;
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
    GetStoreItemsByIDResultData getStoreItemsByIDResultData = (GetStoreItemsByIDResultData) o;
    return (this.storeID == null ? getStoreItemsByIDResultData.storeID == null : this.storeID.equals(getStoreItemsByIDResultData.storeID)) &&
        (this.displayName == null ? getStoreItemsByIDResultData.displayName == null : this.displayName.equals(getStoreItemsByIDResultData.displayName)) &&
        (this.description == null ? getStoreItemsByIDResultData.description == null : this.description.equals(getStoreItemsByIDResultData.description)) &&
        (this.customMetaData == null ? getStoreItemsByIDResultData.customMetaData == null : this.customMetaData.equals(getStoreItemsByIDResultData.customMetaData)) &&
        (this.storeContents == null ? getStoreItemsByIDResultData.storeContents == null : this.storeContents.equals(getStoreItemsByIDResultData.storeContents)) &&
        (this.status == null ? getStoreItemsByIDResultData.status == null : this.status.equals(getStoreItemsByIDResultData.status)) &&
        (this.ID == null ? getStoreItemsByIDResultData.ID == null : this.ID.equals(getStoreItemsByIDResultData.ID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.storeID == null ? 0: this.storeID.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.customMetaData == null ? 0: this.customMetaData.hashCode());
    result = 31 * result + (this.storeContents == null ? 0: this.storeContents.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStoreItemsByIDResultData {\n");
    
    sb.append("  storeID: ").append(storeID).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  customMetaData: ").append(customMetaData).append("\n");
    sb.append("  storeContents: ").append(storeContents).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

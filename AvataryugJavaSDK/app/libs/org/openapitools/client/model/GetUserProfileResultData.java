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
public class GetUserProfileResultData {
  
  @SerializedName("ID")
  private String ID = null;
  @SerializedName("DisplayName")
  private String displayName = null;
  @SerializedName("DefaultAvatar")
  private String defaultAvatarID = null;
  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
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
  public String getDefaultAvatarID() {
    return defaultAvatarID;
  }
  public void setDefaultAvatarID(String defaultAvatarID) {
    this.defaultAvatarID = defaultAvatarID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserProfileResultData getUserProfileResultData = (GetUserProfileResultData) o;
    return (this.ID == null ? getUserProfileResultData.ID == null : this.ID.equals(getUserProfileResultData.ID)) &&
        (this.displayName == null ? getUserProfileResultData.displayName == null : this.displayName.equals(getUserProfileResultData.displayName)) &&
        (this.defaultAvatarID == null ? getUserProfileResultData.defaultAvatarID == null : this.defaultAvatarID.equals(getUserProfileResultData.defaultAvatarID)) &&
        (this.updatedAt == null ? getUserProfileResultData.updatedAt == null : this.updatedAt.equals(getUserProfileResultData.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.defaultAvatarID == null ? 0: this.defaultAvatarID.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserProfileResultData {\n");
    
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  defaultAvatarID: ").append(defaultAvatarID).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

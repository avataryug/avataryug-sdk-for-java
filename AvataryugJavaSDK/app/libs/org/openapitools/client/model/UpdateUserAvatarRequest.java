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
public class UpdateUserAvatarRequest {
  
  @SerializedName("AvatarID")
  private String avatarID = null;
  @SerializedName("AvatarData")
  private String avatarData = null;
  @SerializedName("AvatarUrl")
  private String avatarUrl = null;
  @SerializedName("ThumbUrl")
  private String thumbUrl = null;

  /**
   * Unique identifier for the generated avatar
   **/
  @ApiModelProperty(required = true, value = "Unique identifier for the generated avatar")
  public String getAvatarID() {
    return avatarID;
  }
  public void setAvatarID(String avatarID) {
    this.avatarID = avatarID;
  }

  /**
   * Data related to the AvatarID
   **/
  @ApiModelProperty(required = true, value = "Data related to the AvatarID")
  public String getAvatarData() {
    return avatarData;
  }
  public void setAvatarData(String avatarData) {
    this.avatarData = avatarData;
  }

  /**
   * Mesh URL of the Avatar
   **/
  @ApiModelProperty(required = true, value = "Mesh URL of the Avatar")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * Rendered Image URL of the Avatar
   **/
  @ApiModelProperty(required = true, value = "Rendered Image URL of the Avatar")
  public String getThumbUrl() {
    return thumbUrl;
  }
  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserAvatarRequest updateUserAvatarRequest = (UpdateUserAvatarRequest) o;
    return (this.avatarID == null ? updateUserAvatarRequest.avatarID == null : this.avatarID.equals(updateUserAvatarRequest.avatarID)) &&
        (this.avatarData == null ? updateUserAvatarRequest.avatarData == null : this.avatarData.equals(updateUserAvatarRequest.avatarData)) &&
        (this.avatarUrl == null ? updateUserAvatarRequest.avatarUrl == null : this.avatarUrl.equals(updateUserAvatarRequest.avatarUrl)) &&
        (this.thumbUrl == null ? updateUserAvatarRequest.thumbUrl == null : this.thumbUrl.equals(updateUserAvatarRequest.thumbUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.avatarID == null ? 0: this.avatarID.hashCode());
    result = 31 * result + (this.avatarData == null ? 0: this.avatarData.hashCode());
    result = 31 * result + (this.avatarUrl == null ? 0: this.avatarUrl.hashCode());
    result = 31 * result + (this.thumbUrl == null ? 0: this.thumbUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserAvatarRequest {\n");
    
    sb.append("  avatarID: ").append(avatarID).append("\n");
    sb.append("  avatarData: ").append(avatarData).append("\n");
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  thumbUrl: ").append(thumbUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

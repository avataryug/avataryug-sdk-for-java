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
public class GetUsersAllAvatarsResultDataInner {
  
  @SerializedName("AvatarID")
  private String avatarID = null;
  @SerializedName("AvatarUrl")
  private String avatarUrl = null;
  @SerializedName("ThumbUrl")
  private String thumbUrl = null;
  @SerializedName("AvatarData")
  private String avatarData = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAvatarID() {
    return avatarID;
  }
  public void setAvatarID(String avatarID) {
    this.avatarID = avatarID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getThumbUrl() {
    return thumbUrl;
  }
  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAvatarData() {
    return avatarData;
  }
  public void setAvatarData(String avatarData) {
    this.avatarData = avatarData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUsersAllAvatarsResultDataInner getUsersAllAvatarsResultDataInner = (GetUsersAllAvatarsResultDataInner) o;
    return (this.avatarID == null ? getUsersAllAvatarsResultDataInner.avatarID == null : this.avatarID.equals(getUsersAllAvatarsResultDataInner.avatarID)) &&
        (this.avatarUrl == null ? getUsersAllAvatarsResultDataInner.avatarUrl == null : this.avatarUrl.equals(getUsersAllAvatarsResultDataInner.avatarUrl)) &&
        (this.thumbUrl == null ? getUsersAllAvatarsResultDataInner.thumbUrl == null : this.thumbUrl.equals(getUsersAllAvatarsResultDataInner.thumbUrl)) &&
        (this.avatarData == null ? getUsersAllAvatarsResultDataInner.avatarData == null : this.avatarData.equals(getUsersAllAvatarsResultDataInner.avatarData));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.avatarID == null ? 0: this.avatarID.hashCode());
    result = 31 * result + (this.avatarUrl == null ? 0: this.avatarUrl.hashCode());
    result = 31 * result + (this.thumbUrl == null ? 0: this.thumbUrl.hashCode());
    result = 31 * result + (this.avatarData == null ? 0: this.avatarData.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUsersAllAvatarsResultDataInner {\n");
    
    sb.append("  avatarID: ").append(avatarID).append("\n");
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  thumbUrl: ").append(thumbUrl).append("\n");
    sb.append("  avatarData: ").append(avatarData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

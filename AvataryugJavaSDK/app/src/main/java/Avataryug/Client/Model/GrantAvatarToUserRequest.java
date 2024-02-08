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
public class GrantAvatarToUserRequest {
  
  @SerializedName("UserID")
  private String userID = null;
  @SerializedName("AvatarUrl")
  private String avatarUrl = null;
  @SerializedName("ThumbUrl")
  private String thumbUrl = null;
  @SerializedName("AvatarData")
  private String avatarData = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThumbUrl() {
    return thumbUrl;
  }
  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    GrantAvatarToUserRequest grantAvatarToUserRequest = (GrantAvatarToUserRequest) o;
    return (this.userID == null ? grantAvatarToUserRequest.userID == null : this.userID.equals(grantAvatarToUserRequest.userID)) &&
        (this.avatarUrl == null ? grantAvatarToUserRequest.avatarUrl == null : this.avatarUrl.equals(grantAvatarToUserRequest.avatarUrl)) &&
        (this.thumbUrl == null ? grantAvatarToUserRequest.thumbUrl == null : this.thumbUrl.equals(grantAvatarToUserRequest.thumbUrl)) &&
        (this.avatarData == null ? grantAvatarToUserRequest.avatarData == null : this.avatarData.equals(grantAvatarToUserRequest.avatarData));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userID == null ? 0: this.userID.hashCode());
    result = 31 * result + (this.avatarUrl == null ? 0: this.avatarUrl.hashCode());
    result = 31 * result + (this.thumbUrl == null ? 0: this.thumbUrl.hashCode());
    result = 31 * result + (this.avatarData == null ? 0: this.avatarData.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantAvatarToUserRequest {\n");
    
    sb.append("  userID: ").append(userID).append("\n");
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  thumbUrl: ").append(thumbUrl).append("\n");
    sb.append("  avatarData: ").append(avatarData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
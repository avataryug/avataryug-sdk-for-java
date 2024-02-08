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
public class RegisterUserResultDataUser {
  
  @SerializedName("UserID")
  private String userID = null;
  @SerializedName("DisplayName")
  private String displayName = null;
  @SerializedName("CreatedAt")
  private String createdAt = null;
  @SerializedName("Verified")
  private Integer verified = null;

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
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getVerified() {
    return verified;
  }
  public void setVerified(Integer verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterUserResultDataUser registerUserResultDataUser = (RegisterUserResultDataUser) o;
    return (this.userID == null ? registerUserResultDataUser.userID == null : this.userID.equals(registerUserResultDataUser.userID)) &&
        (this.displayName == null ? registerUserResultDataUser.displayName == null : this.displayName.equals(registerUserResultDataUser.displayName)) &&
        (this.createdAt == null ? registerUserResultDataUser.createdAt == null : this.createdAt.equals(registerUserResultDataUser.createdAt)) &&
        (this.verified == null ? registerUserResultDataUser.verified == null : this.verified.equals(registerUserResultDataUser.verified));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userID == null ? 0: this.userID.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.verified == null ? 0: this.verified.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterUserResultDataUser {\n");
    
    sb.append("  userID: ").append(userID).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  verified: ").append(verified).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

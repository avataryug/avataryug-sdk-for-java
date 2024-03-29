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
public class DeleteUserAvatarRequest {
  
  @SerializedName("AvatarID")
  private String avatarID = null;

  /**
   * Unique identifier for the avatar being deleted
   **/
  @ApiModelProperty(required = true, value = "Unique identifier for the avatar being deleted")
  public String getAvatarID() {
    return avatarID;
  }
  public void setAvatarID(String avatarID) {
    this.avatarID = avatarID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteUserAvatarRequest deleteUserAvatarRequest = (DeleteUserAvatarRequest) o;
    return (this.avatarID == null ? deleteUserAvatarRequest.avatarID == null : this.avatarID.equals(deleteUserAvatarRequest.avatarID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.avatarID == null ? 0: this.avatarID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteUserAvatarRequest {\n");
    
    sb.append("  avatarID: ").append(avatarID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

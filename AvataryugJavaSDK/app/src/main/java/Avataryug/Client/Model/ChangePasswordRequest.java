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
public class ChangePasswordRequest {
  
  @SerializedName("OldPassword")
  private String oldPassword = null;
  @SerializedName("NewPassword")
  private String newPassword = null;

  /**
   * Current Password of the account.
   **/
  @ApiModelProperty(required = true, value = "Current Password of the account.")
  public String getOldPassword() {
    return oldPassword;
  }
  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  /**
   * New password which needs to be updated.
   **/
  @ApiModelProperty(required = true, value = "New password which needs to be updated.")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) o;
    return (this.oldPassword == null ? changePasswordRequest.oldPassword == null : this.oldPassword.equals(changePasswordRequest.oldPassword)) &&
        (this.newPassword == null ? changePasswordRequest.newPassword == null : this.newPassword.equals(changePasswordRequest.newPassword));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.oldPassword == null ? 0: this.oldPassword.hashCode());
    result = 31 * result + (this.newPassword == null ? 0: this.newPassword.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordRequest {\n");
    
    sb.append("  oldPassword: ").append(oldPassword).append("\n");
    sb.append("  newPassword: ").append(newPassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

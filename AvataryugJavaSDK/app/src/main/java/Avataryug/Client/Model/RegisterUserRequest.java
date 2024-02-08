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
public class RegisterUserRequest {
  
  @SerializedName("EmailID")
  private String emailID = null;
  @SerializedName("Password")
  private String password = null;
  @SerializedName("DisplayName")
  private String displayName = null;

  /**
   * User email address attached to their account.
   **/
  @ApiModelProperty(required = true, value = "User email address attached to their account.")
  public String getEmailID() {
    return emailID;
  }
  public void setEmailID(String emailID) {
    this.emailID = emailID;
  }

  /**
   * Password for the AvatarYug account (6-100 characters).
   **/
  @ApiModelProperty(required = true, value = "Password for the AvatarYug account (6-100 characters).")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * An optional parameter for setting the display name for this Project (3-25 characters).
   **/
  @ApiModelProperty(value = "An optional parameter for setting the display name for this Project (3-25 characters).")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterUserRequest registerUserRequest = (RegisterUserRequest) o;
    return (this.emailID == null ? registerUserRequest.emailID == null : this.emailID.equals(registerUserRequest.emailID)) &&
        (this.password == null ? registerUserRequest.password == null : this.password.equals(registerUserRequest.password)) &&
        (this.displayName == null ? registerUserRequest.displayName == null : this.displayName.equals(registerUserRequest.displayName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.emailID == null ? 0: this.emailID.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterUserRequest {\n");
    
    sb.append("  emailID: ").append(emailID).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

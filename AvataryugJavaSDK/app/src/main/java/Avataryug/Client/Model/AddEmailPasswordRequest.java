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
public class AddEmailPasswordRequest {
  
  @SerializedName("EmailID")
  private String emailID = null;
  @SerializedName("Password")
  private String password = null;

  /**
   * User email address attached to their account
   **/
  @ApiModelProperty(required = true, value = "User email address attached to their account")
  public String getEmailID() {
    return emailID;
  }
  public void setEmailID(String emailID) {
    this.emailID = emailID;
  }

  /**
   * Password for the AvatarYug account (6-100 characters)
   **/
  @ApiModelProperty(required = true, value = "Password for the AvatarYug account (6-100 characters)")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddEmailPasswordRequest addEmailPasswordRequest = (AddEmailPasswordRequest) o;
    return (this.emailID == null ? addEmailPasswordRequest.emailID == null : this.emailID.equals(addEmailPasswordRequest.emailID)) &&
        (this.password == null ? addEmailPasswordRequest.password == null : this.password.equals(addEmailPasswordRequest.password));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.emailID == null ? 0: this.emailID.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddEmailPasswordRequest {\n");
    
    sb.append("  emailID: ").append(emailID).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

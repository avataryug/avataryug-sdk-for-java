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
public class UpdateEmailPasswordRequest {
  
  @SerializedName("EmailID")
  private String emailID = null;
  @SerializedName("Password")
  private String password = null;
  @SerializedName("VerificationCode")
  private String verificationCode = null;

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

  /**
   * Verification Code received on email
   **/
  @ApiModelProperty(required = true, value = "Verification Code received on email")
  public String getVerificationCode() {
    return verificationCode;
  }
  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEmailPasswordRequest updateEmailPasswordRequest = (UpdateEmailPasswordRequest) o;
    return (this.emailID == null ? updateEmailPasswordRequest.emailID == null : this.emailID.equals(updateEmailPasswordRequest.emailID)) &&
        (this.password == null ? updateEmailPasswordRequest.password == null : this.password.equals(updateEmailPasswordRequest.password)) &&
        (this.verificationCode == null ? updateEmailPasswordRequest.verificationCode == null : this.verificationCode.equals(updateEmailPasswordRequest.verificationCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.emailID == null ? 0: this.emailID.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.verificationCode == null ? 0: this.verificationCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEmailPasswordRequest {\n");
    
    sb.append("  emailID: ").append(emailID).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  verificationCode: ").append(verificationCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

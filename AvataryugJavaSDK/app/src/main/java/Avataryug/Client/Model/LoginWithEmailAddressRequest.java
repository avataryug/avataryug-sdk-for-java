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
public class LoginWithEmailAddressRequest {
  
  @SerializedName("EmailID")
  private String emailID = null;
  @SerializedName("Password")
  private String password = null;

  @SerializedName("CreateAccount")
  private Boolean createAccount = null;

  /**
   * Email address for the account.
   **/
  @ApiModelProperty(required = true, value = "Email address for the account.")
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

  @ApiModelProperty(value = "Automatically create a AvatarYug account if one is not currently linked to this ID.")
  public Boolean getCreateAccount() {
    return createAccount;
  }
  public void setCreateAccount(Boolean createAccount) {
    this.createAccount = createAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginWithEmailAddressRequest loginWithEmailAddressRequest = (LoginWithEmailAddressRequest) o;
    return (this.emailID == null ? loginWithEmailAddressRequest.emailID == null : this.emailID.equals(loginWithEmailAddressRequest.emailID)) &&
        (this.password == null ? loginWithEmailAddressRequest.password == null : this.password.equals(loginWithEmailAddressRequest.password)) &&
            (this.createAccount == null ? loginWithEmailAddressRequest.createAccount == null : this.createAccount.equals(loginWithEmailAddressRequest.createAccount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.emailID == null ? 0: this.emailID.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.createAccount == null ? 0: this.createAccount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWithEmailAddressRequest {\n");
    
    sb.append("  emailID: ").append(emailID).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  createAccount: ").append(createAccount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

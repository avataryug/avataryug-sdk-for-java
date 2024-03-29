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
public class LoginWithCustomIDRequest {
  
  @SerializedName("CustomID")
  private String customID = null;
  @SerializedName("CreateAccount")
  private Boolean createAccount = null;

  /**
   * Custom unique identifier for the user sent from the client.
   **/
  @ApiModelProperty(required = true, value = "Custom unique identifier for the user sent from the client.")
  public String getCustomID() {
    return customID;
  }
  public void setCustomID(String customID) {
    this.customID = customID;
  }

  /**
   * Automatically create a AvatarYug account if one is not currently linked to this ID.
   **/
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
    LoginWithCustomIDRequest loginWithCustomIDRequest = (LoginWithCustomIDRequest) o;
    return (this.customID == null ? loginWithCustomIDRequest.customID == null : this.customID.equals(loginWithCustomIDRequest.customID)) &&
        (this.createAccount == null ? loginWithCustomIDRequest.createAccount == null : this.createAccount.equals(loginWithCustomIDRequest.createAccount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.customID == null ? 0: this.customID.hashCode());
    result = 31 * result + (this.createAccount == null ? 0: this.createAccount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWithCustomIDRequest {\n");
    
    sb.append("  customID: ").append(customID).append("\n");
    sb.append("  createAccount: ").append(createAccount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

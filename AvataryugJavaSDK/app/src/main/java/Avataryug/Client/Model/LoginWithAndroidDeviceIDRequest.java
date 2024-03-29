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
public class LoginWithAndroidDeviceIDRequest {
  
  @SerializedName("AndroidDeviceID")
  private String androidDeviceID = null;
  @SerializedName("CreateAccount")
  private Boolean createAccount = null;

  /**
   * Android device identifier for the user's device.
   **/
  @ApiModelProperty(required = true, value = "Android device identifier for the user's device.")
  public String getAndroidDeviceID() {
    return androidDeviceID;
  }
  public void setAndroidDeviceID(String androidDeviceID) {
    this.androidDeviceID = androidDeviceID;
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
    LoginWithAndroidDeviceIDRequest loginWithAndroidDeviceIDRequest = (LoginWithAndroidDeviceIDRequest) o;
    return (this.androidDeviceID == null ? loginWithAndroidDeviceIDRequest.androidDeviceID == null : this.androidDeviceID.equals(loginWithAndroidDeviceIDRequest.androidDeviceID)) &&
        (this.createAccount == null ? loginWithAndroidDeviceIDRequest.createAccount == null : this.createAccount.equals(loginWithAndroidDeviceIDRequest.createAccount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.androidDeviceID == null ? 0: this.androidDeviceID.hashCode());
    result = 31 * result + (this.createAccount == null ? 0: this.createAccount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWithAndroidDeviceIDRequest {\n");
    
    sb.append("  androidDeviceID: ").append(androidDeviceID).append("\n");
    sb.append("  createAccount: ").append(createAccount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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
public class RegisterUserResultData {
  
  @SerializedName("AccessToken")
  private String accessToken = null;
  @SerializedName("User")
  private RegisterUserResultDataUser user = null;
  @SerializedName("LinkedAccounts")
  private String linkedAccounts = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public RegisterUserResultDataUser getUser() {
    return user;
  }
  public void setUser(RegisterUserResultDataUser user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLinkedAccounts() {
    return linkedAccounts;
  }
  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterUserResultData registerUserResultData = (RegisterUserResultData) o;
    return (this.accessToken == null ? registerUserResultData.accessToken == null : this.accessToken.equals(registerUserResultData.accessToken)) &&
        (this.user == null ? registerUserResultData.user == null : this.user.equals(registerUserResultData.user)) &&
        (this.linkedAccounts == null ? registerUserResultData.linkedAccounts == null : this.linkedAccounts.equals(registerUserResultData.linkedAccounts));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accessToken == null ? 0: this.accessToken.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    result = 31 * result + (this.linkedAccounts == null ? 0: this.linkedAccounts.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterUserResultData {\n");
    
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  linkedAccounts: ").append(linkedAccounts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
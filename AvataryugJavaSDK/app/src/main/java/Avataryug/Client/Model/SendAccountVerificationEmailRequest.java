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
public class SendAccountVerificationEmailRequest {
  
  @SerializedName("EmailID")
  private String emailID = null;

  /**
   * Email address which is being verified.
   **/
  @ApiModelProperty(required = true, value = "Email address which is being verified.")
  public String getEmailID() {
    return emailID;
  }
  public void setEmailID(String emailID) {
    this.emailID = emailID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendAccountVerificationEmailRequest sendAccountVerificationEmailRequest = (SendAccountVerificationEmailRequest) o;
    return (this.emailID == null ? sendAccountVerificationEmailRequest.emailID == null : this.emailID.equals(sendAccountVerificationEmailRequest.emailID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.emailID == null ? 0: this.emailID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendAccountVerificationEmailRequest {\n");
    
    sb.append("  emailID: ").append(emailID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

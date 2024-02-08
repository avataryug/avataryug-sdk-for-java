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
public class GetUserIDfromSessionTicket {
  
  @SerializedName("Code")
  private Integer code = null;
  @SerializedName("Status")
  private String status = null;
  @SerializedName("UserID")
  private String userID = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserIDfromSessionTicket getUserIDfromSessionTicket = (GetUserIDfromSessionTicket) o;
    return (this.code == null ? getUserIDfromSessionTicket.code == null : this.code.equals(getUserIDfromSessionTicket.code)) &&
        (this.status == null ? getUserIDfromSessionTicket.status == null : this.status.equals(getUserIDfromSessionTicket.status)) &&
        (this.userID == null ? getUserIDfromSessionTicket.userID == null : this.userID.equals(getUserIDfromSessionTicket.userID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.userID == null ? 0: this.userID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserIDfromSessionTicket {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  userID: ").append(userID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

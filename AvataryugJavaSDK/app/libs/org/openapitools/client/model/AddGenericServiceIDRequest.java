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

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AddGenericServiceIDRequest {
  
  @SerializedName("GenericServiceID")
  private String genericServiceID = null;

  /**
   * Generic service identifier to add to the player account.
   **/
  @ApiModelProperty(required = true, value = "Generic service identifier to add to the player account.")
  public String getGenericServiceID() {
    return genericServiceID;
  }
  public void setGenericServiceID(String genericServiceID) {
    this.genericServiceID = genericServiceID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddGenericServiceIDRequest addGenericServiceIDRequest = (AddGenericServiceIDRequest) o;
    return (this.genericServiceID == null ? addGenericServiceIDRequest.genericServiceID == null : this.genericServiceID.equals(addGenericServiceIDRequest.genericServiceID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.genericServiceID == null ? 0: this.genericServiceID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddGenericServiceIDRequest {\n");
    
    sb.append("  genericServiceID: ").append(genericServiceID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
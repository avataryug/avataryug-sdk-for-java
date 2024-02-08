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
public class GrantInstanceToUserRequestInstanceIDsInner {
  
  @SerializedName("InstanceID")
  private String instanceID = null;
  @SerializedName("InstanceType")
  private String instanceType = null;
  @SerializedName("Quantity")
  private Integer quantity = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getInstanceID() {
    return instanceID;
  }
  public void setInstanceID(String instanceID) {
    this.instanceID = instanceID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getInstanceType() {
    return instanceType;
  }
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantInstanceToUserRequestInstanceIDsInner grantInstanceToUserRequestInstanceIDsInner = (GrantInstanceToUserRequestInstanceIDsInner) o;
    return (this.instanceID == null ? grantInstanceToUserRequestInstanceIDsInner.instanceID == null : this.instanceID.equals(grantInstanceToUserRequestInstanceIDsInner.instanceID)) &&
        (this.instanceType == null ? grantInstanceToUserRequestInstanceIDsInner.instanceType == null : this.instanceType.equals(grantInstanceToUserRequestInstanceIDsInner.instanceType)) &&
        (this.quantity == null ? grantInstanceToUserRequestInstanceIDsInner.quantity == null : this.quantity.equals(grantInstanceToUserRequestInstanceIDsInner.quantity));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.instanceID == null ? 0: this.instanceID.hashCode());
    result = 31 * result + (this.instanceType == null ? 0: this.instanceType.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantInstanceToUserRequestInstanceIDsInner {\n");
    
    sb.append("  instanceID: ").append(instanceID).append("\n");
    sb.append("  instanceType: ").append(instanceType).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

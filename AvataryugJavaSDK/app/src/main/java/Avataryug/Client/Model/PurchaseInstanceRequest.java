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
public class PurchaseInstanceRequest {
  
  @SerializedName("UserID")
  private String userID = null;
  @SerializedName("InstanceID")
  private String instanceID = null;
  @SerializedName("InstanceType")
  private String instanceType = null;
  @SerializedName("Price")
  private Integer price = null;
  @SerializedName("VirtualCurrency")
  private String virtualCurrency = null;
  @SerializedName("StoreID")
  private String storeID = null;

  /**
   * Unique AvatarYug identifier of the user whose info is being requested. Optional, defaults to the authenticated user if no other lookup identifier set.
   **/
  @ApiModelProperty(required = true, value = "Unique AvatarYug identifier of the user whose info is being requested. Optional, defaults to the authenticated user if no other lookup identifier set.")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  /**
   * Unique identifier of the item to purchase.
   **/
  @ApiModelProperty(required = true, value = "Unique identifier of the item to purchase.")
  public String getInstanceID() {
    return instanceID;
  }
  public void setInstanceID(String instanceID) {
    this.instanceID = instanceID;
  }

  /**
   * Type of the instance i.e item,bundle,container.
   **/
  @ApiModelProperty(required = true, value = "Type of the instance i.e item,bundle,container.")
  public String getInstanceType() {
    return instanceType;
  }
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Price the client expects to pay for the item.
   **/
  @ApiModelProperty(required = true, value = "Price the client expects to pay for the item.")
  public Integer getPrice() {
    return price;
  }
  public void setPrice(Integer price) {
    this.price = price;
  }

  /**
   * Virtual currency to use to purchase the item.
   **/
  @ApiModelProperty(required = true, value = "Virtual currency to use to purchase the item.")
  public String getVirtualCurrency() {
    return virtualCurrency;
  }
  public void setVirtualCurrency(String virtualCurrency) {
    this.virtualCurrency = virtualCurrency;
  }

  /**
   * Store to buy this item through. If not set, prices default to those in the catalog.
   **/
  @ApiModelProperty(required = true, value = "Store to buy this item through. If not set, prices default to those in the catalog.")
  public String getStoreID() {
    return storeID;
  }
  public void setStoreID(String storeID) {
    this.storeID = storeID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseInstanceRequest purchaseInstanceRequest = (PurchaseInstanceRequest) o;
    return (this.userID == null ? purchaseInstanceRequest.userID == null : this.userID.equals(purchaseInstanceRequest.userID)) &&
        (this.instanceID == null ? purchaseInstanceRequest.instanceID == null : this.instanceID.equals(purchaseInstanceRequest.instanceID)) &&
        (this.instanceType == null ? purchaseInstanceRequest.instanceType == null : this.instanceType.equals(purchaseInstanceRequest.instanceType)) &&
        (this.price == null ? purchaseInstanceRequest.price == null : this.price.equals(purchaseInstanceRequest.price)) &&
        (this.virtualCurrency == null ? purchaseInstanceRequest.virtualCurrency == null : this.virtualCurrency.equals(purchaseInstanceRequest.virtualCurrency)) &&
        (this.storeID == null ? purchaseInstanceRequest.storeID == null : this.storeID.equals(purchaseInstanceRequest.storeID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userID == null ? 0: this.userID.hashCode());
    result = 31 * result + (this.instanceID == null ? 0: this.instanceID.hashCode());
    result = 31 * result + (this.instanceType == null ? 0: this.instanceType.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.virtualCurrency == null ? 0: this.virtualCurrency.hashCode());
    result = 31 * result + (this.storeID == null ? 0: this.storeID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseInstanceRequest {\n");
    
    sb.append("  userID: ").append(userID).append("\n");
    sb.append("  instanceID: ").append(instanceID).append("\n");
    sb.append("  instanceType: ").append(instanceType).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  virtualCurrency: ").append(virtualCurrency).append("\n");
    sb.append("  storeID: ").append(storeID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

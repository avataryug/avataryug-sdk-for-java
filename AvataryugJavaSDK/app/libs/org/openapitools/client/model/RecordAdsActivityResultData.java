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
public class RecordAdsActivityResultData {
  
  @SerializedName("Owner")
  private String owner = null;
  @SerializedName("RevenueCurrency")
  private String revenueCurrency = null;
  @SerializedName("AdRevenue")
  private Integer adRevenue = null;
  @SerializedName("PlacementID")
  private String placementID = null;
  @SerializedName("UpdatedAt")
  private String updatedAt = null;
  @SerializedName("ID")
  private String ID = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRevenueCurrency() {
    return revenueCurrency;
  }
  public void setRevenueCurrency(String revenueCurrency) {
    this.revenueCurrency = revenueCurrency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAdRevenue() {
    return adRevenue;
  }
  public void setAdRevenue(Integer adRevenue) {
    this.adRevenue = adRevenue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPlacementID() {
    return placementID;
  }
  public void setPlacementID(String placementID) {
    this.placementID = placementID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordAdsActivityResultData recordAdsActivityResultData = (RecordAdsActivityResultData) o;
    return (this.owner == null ? recordAdsActivityResultData.owner == null : this.owner.equals(recordAdsActivityResultData.owner)) &&
        (this.revenueCurrency == null ? recordAdsActivityResultData.revenueCurrency == null : this.revenueCurrency.equals(recordAdsActivityResultData.revenueCurrency)) &&
        (this.adRevenue == null ? recordAdsActivityResultData.adRevenue == null : this.adRevenue.equals(recordAdsActivityResultData.adRevenue)) &&
        (this.placementID == null ? recordAdsActivityResultData.placementID == null : this.placementID.equals(recordAdsActivityResultData.placementID)) &&
        (this.updatedAt == null ? recordAdsActivityResultData.updatedAt == null : this.updatedAt.equals(recordAdsActivityResultData.updatedAt)) &&
        (this.ID == null ? recordAdsActivityResultData.ID == null : this.ID.equals(recordAdsActivityResultData.ID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.owner == null ? 0: this.owner.hashCode());
    result = 31 * result + (this.revenueCurrency == null ? 0: this.revenueCurrency.hashCode());
    result = 31 * result + (this.adRevenue == null ? 0: this.adRevenue.hashCode());
    result = 31 * result + (this.placementID == null ? 0: this.placementID.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordAdsActivityResultData {\n");
    
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  revenueCurrency: ").append(revenueCurrency).append("\n");
    sb.append("  adRevenue: ").append(adRevenue).append("\n");
    sb.append("  placementID: ").append(placementID).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

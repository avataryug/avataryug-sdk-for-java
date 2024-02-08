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
public class RecordAdsActivityRequest {
  
  @SerializedName("PlacementID")
  private String placementID = null;
  @SerializedName("RevenueCurrency")
  private String revenueCurrency = null;
  @SerializedName("AdRevenue")
  private Integer adRevenue = null;

  /**
   * Unique identifier of the placement.
   **/
  @ApiModelProperty(required = true, value = "Unique identifier of the placement.")
  public String getPlacementID() {
    return placementID;
  }
  public void setPlacementID(String placementID) {
    this.placementID = placementID;
  }

  /**
   * ISO 4217 code of the currency.
   **/
  @ApiModelProperty(required = true, value = "ISO 4217 code of the currency.")
  public String getRevenueCurrency() {
    return revenueCurrency;
  }
  public void setRevenueCurrency(String revenueCurrency) {
    this.revenueCurrency = revenueCurrency;
  }

  /**
   * Revenue generated from Ad Activity in centesimal units (Eg.100).
   **/
  @ApiModelProperty(required = true, value = "Revenue generated from Ad Activity in centesimal units (Eg.100).")
  public Integer getAdRevenue() {
    return adRevenue;
  }
  public void setAdRevenue(Integer adRevenue) {
    this.adRevenue = adRevenue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordAdsActivityRequest recordAdsActivityRequest = (RecordAdsActivityRequest) o;
    return (this.placementID == null ? recordAdsActivityRequest.placementID == null : this.placementID.equals(recordAdsActivityRequest.placementID)) &&
        (this.revenueCurrency == null ? recordAdsActivityRequest.revenueCurrency == null : this.revenueCurrency.equals(recordAdsActivityRequest.revenueCurrency)) &&
        (this.adRevenue == null ? recordAdsActivityRequest.adRevenue == null : this.adRevenue.equals(recordAdsActivityRequest.adRevenue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.placementID == null ? 0: this.placementID.hashCode());
    result = 31 * result + (this.revenueCurrency == null ? 0: this.revenueCurrency.hashCode());
    result = 31 * result + (this.adRevenue == null ? 0: this.adRevenue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordAdsActivityRequest {\n");
    
    sb.append("  placementID: ").append(placementID).append("\n");
    sb.append("  revenueCurrency: ").append(revenueCurrency).append("\n");
    sb.append("  adRevenue: ").append(adRevenue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
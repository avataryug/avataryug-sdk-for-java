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
public class GrantAdsRewardRequest {
  
  @SerializedName("PlacementID")
  private String placementID = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantAdsRewardRequest grantAdsRewardRequest = (GrantAdsRewardRequest) o;
    return (this.placementID == null ? grantAdsRewardRequest.placementID == null : this.placementID.equals(grantAdsRewardRequest.placementID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.placementID == null ? 0: this.placementID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantAdsRewardRequest {\n");
    
    sb.append("  placementID: ").append(placementID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

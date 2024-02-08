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
public class GetRewardedAdPlacementsResultData {
  
  @SerializedName("PlacementName")
  private String placementName = null;
  @SerializedName("AppId")
  private String appId = null;
  @SerializedName("AdUnit")
  private String adUnit = null;
  @SerializedName("Rewards")
  private String rewards = null;
  @SerializedName("Segments")
  private String segments = null;
  @SerializedName("Status")
  private Integer status = null;
  @SerializedName("ID")
  private String ID = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPlacementName() {
    return placementName;
  }
  public void setPlacementName(String placementName) {
    this.placementName = placementName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAdUnit() {
    return adUnit;
  }
  public void setAdUnit(String adUnit) {
    this.adUnit = adUnit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRewards() {
    return rewards;
  }
  public void setRewards(String rewards) {
    this.rewards = rewards;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSegments() {
    return segments;
  }
  public void setSegments(String segments) {
    this.segments = segments;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
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
    GetRewardedAdPlacementsResultData getRewardedAdPlacementsResultData = (GetRewardedAdPlacementsResultData) o;
    return (this.placementName == null ? getRewardedAdPlacementsResultData.placementName == null : this.placementName.equals(getRewardedAdPlacementsResultData.placementName)) &&
        (this.appId == null ? getRewardedAdPlacementsResultData.appId == null : this.appId.equals(getRewardedAdPlacementsResultData.appId)) &&
        (this.adUnit == null ? getRewardedAdPlacementsResultData.adUnit == null : this.adUnit.equals(getRewardedAdPlacementsResultData.adUnit)) &&
        (this.rewards == null ? getRewardedAdPlacementsResultData.rewards == null : this.rewards.equals(getRewardedAdPlacementsResultData.rewards)) &&
        (this.segments == null ? getRewardedAdPlacementsResultData.segments == null : this.segments.equals(getRewardedAdPlacementsResultData.segments)) &&
        (this.status == null ? getRewardedAdPlacementsResultData.status == null : this.status.equals(getRewardedAdPlacementsResultData.status)) &&
        (this.ID == null ? getRewardedAdPlacementsResultData.ID == null : this.ID.equals(getRewardedAdPlacementsResultData.ID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.placementName == null ? 0: this.placementName.hashCode());
    result = 31 * result + (this.appId == null ? 0: this.appId.hashCode());
    result = 31 * result + (this.adUnit == null ? 0: this.adUnit.hashCode());
    result = 31 * result + (this.rewards == null ? 0: this.rewards.hashCode());
    result = 31 * result + (this.segments == null ? 0: this.segments.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRewardedAdPlacementsResultData {\n");
    
    sb.append("  placementName: ").append(placementName).append("\n");
    sb.append("  appId: ").append(appId).append("\n");
    sb.append("  adUnit: ").append(adUnit).append("\n");
    sb.append("  rewards: ").append(rewards).append("\n");
    sb.append("  segments: ").append(segments).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
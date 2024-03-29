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
public class GetEconomyContainersResultDataInner {
  
  @SerializedName("Status")
  private Integer status = null;
  @SerializedName("DisplayName")
  private String displayName = null;
  @SerializedName("ContainerCategory")
  private String containerCategory = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("Tags")
  private String tags = null;
  @SerializedName("ContainerImageUrl")
  private String containerImageUrl = null;
  @SerializedName("IsStackable")
  private Integer isStackable = null;
  @SerializedName("IsLimitedEdition")
  private Integer isLimitedEdition = null;
  @SerializedName("LimitedEditionIntialCount")
  private Integer limitedEditionIntialCount = null;
  @SerializedName("Entitlement")
  private String entitlement = null;
  @SerializedName("ContainerSettings")
  private String containerSettings = null;
  @SerializedName("ContainerContents")
  private String containerContents = null;
  @SerializedName("VirtualCurrency")
  private String virtualCurrency = null;
  @SerializedName("RealCurrency")
  private Integer realCurrency = null;
  @SerializedName("CustomMetaData")
  private String customMetaData = null;
  @SerializedName("ID")
  private String ID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getContainerCategory() {
    return containerCategory;
  }
  public void setContainerCategory(String containerCategory) {
    this.containerCategory = containerCategory;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getContainerImageUrl() {
    return containerImageUrl;
  }
  public void setContainerImageUrl(String containerImageUrl) {
    this.containerImageUrl = containerImageUrl;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIsStackable() {
    return isStackable;
  }
  public void setIsStackable(Integer isStackable) {
    this.isStackable = isStackable;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIsLimitedEdition() {
    return isLimitedEdition;
  }
  public void setIsLimitedEdition(Integer isLimitedEdition) {
    this.isLimitedEdition = isLimitedEdition;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLimitedEditionIntialCount() {
    return limitedEditionIntialCount;
  }
  public void setLimitedEditionIntialCount(Integer limitedEditionIntialCount) {
    this.limitedEditionIntialCount = limitedEditionIntialCount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEntitlement() {
    return entitlement;
  }
  public void setEntitlement(String entitlement) {
    this.entitlement = entitlement;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getContainerSettings() {
    return containerSettings;
  }
  public void setContainerSettings(String containerSettings) {
    this.containerSettings = containerSettings;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getContainerContents() {
    return containerContents;
  }
  public void setContainerContents(String containerContents) {
    this.containerContents = containerContents;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getVirtualCurrency() {
    return virtualCurrency;
  }
  public void setVirtualCurrency(String virtualCurrency) {
    this.virtualCurrency = virtualCurrency;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRealCurrency() {
    return realCurrency;
  }
  public void setRealCurrency(Integer realCurrency) {
    this.realCurrency = realCurrency;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCustomMetaData() {
    return customMetaData;
  }
  public void setCustomMetaData(String customMetaData) {
    this.customMetaData = customMetaData;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    GetEconomyContainersResultDataInner getEconomyContainersResultDataInner = (GetEconomyContainersResultDataInner) o;
    return (this.status == null ? getEconomyContainersResultDataInner.status == null : this.status.equals(getEconomyContainersResultDataInner.status)) &&
        (this.displayName == null ? getEconomyContainersResultDataInner.displayName == null : this.displayName.equals(getEconomyContainersResultDataInner.displayName)) &&
        (this.containerCategory == null ? getEconomyContainersResultDataInner.containerCategory == null : this.containerCategory.equals(getEconomyContainersResultDataInner.containerCategory)) &&
        (this.description == null ? getEconomyContainersResultDataInner.description == null : this.description.equals(getEconomyContainersResultDataInner.description)) &&
        (this.tags == null ? getEconomyContainersResultDataInner.tags == null : this.tags.equals(getEconomyContainersResultDataInner.tags)) &&
        (this.containerImageUrl == null ? getEconomyContainersResultDataInner.containerImageUrl == null : this.containerImageUrl.equals(getEconomyContainersResultDataInner.containerImageUrl)) &&
        (this.isStackable == null ? getEconomyContainersResultDataInner.isStackable == null : this.isStackable.equals(getEconomyContainersResultDataInner.isStackable)) &&
        (this.isLimitedEdition == null ? getEconomyContainersResultDataInner.isLimitedEdition == null : this.isLimitedEdition.equals(getEconomyContainersResultDataInner.isLimitedEdition)) &&
        (this.limitedEditionIntialCount == null ? getEconomyContainersResultDataInner.limitedEditionIntialCount == null : this.limitedEditionIntialCount.equals(getEconomyContainersResultDataInner.limitedEditionIntialCount)) &&
        (this.entitlement == null ? getEconomyContainersResultDataInner.entitlement == null : this.entitlement.equals(getEconomyContainersResultDataInner.entitlement)) &&
        (this.containerSettings == null ? getEconomyContainersResultDataInner.containerSettings == null : this.containerSettings.equals(getEconomyContainersResultDataInner.containerSettings)) &&
        (this.containerContents == null ? getEconomyContainersResultDataInner.containerContents == null : this.containerContents.equals(getEconomyContainersResultDataInner.containerContents)) &&
        (this.virtualCurrency == null ? getEconomyContainersResultDataInner.virtualCurrency == null : this.virtualCurrency.equals(getEconomyContainersResultDataInner.virtualCurrency)) &&
        (this.realCurrency == null ? getEconomyContainersResultDataInner.realCurrency == null : this.realCurrency.equals(getEconomyContainersResultDataInner.realCurrency)) &&
        (this.customMetaData == null ? getEconomyContainersResultDataInner.customMetaData == null : this.customMetaData.equals(getEconomyContainersResultDataInner.customMetaData)) &&
        (this.ID == null ? getEconomyContainersResultDataInner.ID == null : this.ID.equals(getEconomyContainersResultDataInner.ID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.containerCategory == null ? 0: this.containerCategory.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.containerImageUrl == null ? 0: this.containerImageUrl.hashCode());
    result = 31 * result + (this.isStackable == null ? 0: this.isStackable.hashCode());
    result = 31 * result + (this.isLimitedEdition == null ? 0: this.isLimitedEdition.hashCode());
    result = 31 * result + (this.limitedEditionIntialCount == null ? 0: this.limitedEditionIntialCount.hashCode());
    result = 31 * result + (this.entitlement == null ? 0: this.entitlement.hashCode());
    result = 31 * result + (this.containerSettings == null ? 0: this.containerSettings.hashCode());
    result = 31 * result + (this.containerContents == null ? 0: this.containerContents.hashCode());
    result = 31 * result + (this.virtualCurrency == null ? 0: this.virtualCurrency.hashCode());
    result = 31 * result + (this.realCurrency == null ? 0: this.realCurrency.hashCode());
    result = 31 * result + (this.customMetaData == null ? 0: this.customMetaData.hashCode());
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEconomyContainersResultDataInner {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  containerCategory: ").append(containerCategory).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  containerImageUrl: ").append(containerImageUrl).append("\n");
    sb.append("  isStackable: ").append(isStackable).append("\n");
    sb.append("  isLimitedEdition: ").append(isLimitedEdition).append("\n");
    sb.append("  limitedEditionIntialCount: ").append(limitedEditionIntialCount).append("\n");
    sb.append("  entitlement: ").append(entitlement).append("\n");
    sb.append("  containerSettings: ").append(containerSettings).append("\n");
    sb.append("  containerContents: ").append(containerContents).append("\n");
    sb.append("  virtualCurrency: ").append(virtualCurrency).append("\n");
    sb.append("  realCurrency: ").append(realCurrency).append("\n");
    sb.append("  customMetaData: ").append(customMetaData).append("\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

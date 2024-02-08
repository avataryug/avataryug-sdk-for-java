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
public class GetEconomyBundlesResultDataInner {
  
  @SerializedName("BundleCategory")
  private String bundleCategory = null;
  @SerializedName("DisplayName")
  private String displayName = null;
  @SerializedName("Description")
  private String description = null;
  @SerializedName("VirtualCurrency")
  private String virtualCurrency = null;
  @SerializedName("RealCurrency")
  private Integer realCurrency = null;
  @SerializedName("Tags")
  private String tags = null;
  @SerializedName("Entitlement")
  private String entitlement = null;
  @SerializedName("IsStackable")
  private Integer isStackable = null;
  @SerializedName("BundleImageUrl")
  private String bundleImageUrl = null;
  @SerializedName("IsLimitedEdition")
  private Integer isLimitedEdition = null;
  @SerializedName("LimitedEditionIntialCount")
  private Integer limitedEditionIntialCount = null;
  @SerializedName("CustomMetaData")
  private String customMetaData = null;
  @SerializedName("BundleContents")
  private String bundleContents = null;
  @SerializedName("Status")
  private Integer status = null;
  @SerializedName("ID")
  private String ID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBundleCategory() {
    return bundleCategory;
  }
  public void setBundleCategory(String bundleCategory) {
    this.bundleCategory = bundleCategory;
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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
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
  public Integer getIsStackable() {
    return isStackable;
  }
  public void setIsStackable(Integer isStackable) {
    this.isStackable = isStackable;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBundleImageUrl() {
    return bundleImageUrl;
  }
  public void setBundleImageUrl(String bundleImageUrl) {
    this.bundleImageUrl = bundleImageUrl;
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
  public String getCustomMetaData() {
    return customMetaData;
  }
  public void setCustomMetaData(String customMetaData) {
    this.customMetaData = customMetaData;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBundleContents() {
    return bundleContents;
  }
  public void setBundleContents(String bundleContents) {
    this.bundleContents = bundleContents;
  }

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
    GetEconomyBundlesResultDataInner getEconomyBundlesResultDataInner = (GetEconomyBundlesResultDataInner) o;
    return (this.bundleCategory == null ? getEconomyBundlesResultDataInner.bundleCategory == null : this.bundleCategory.equals(getEconomyBundlesResultDataInner.bundleCategory)) &&
        (this.displayName == null ? getEconomyBundlesResultDataInner.displayName == null : this.displayName.equals(getEconomyBundlesResultDataInner.displayName)) &&
        (this.description == null ? getEconomyBundlesResultDataInner.description == null : this.description.equals(getEconomyBundlesResultDataInner.description)) &&
        (this.virtualCurrency == null ? getEconomyBundlesResultDataInner.virtualCurrency == null : this.virtualCurrency.equals(getEconomyBundlesResultDataInner.virtualCurrency)) &&
        (this.realCurrency == null ? getEconomyBundlesResultDataInner.realCurrency == null : this.realCurrency.equals(getEconomyBundlesResultDataInner.realCurrency)) &&
        (this.tags == null ? getEconomyBundlesResultDataInner.tags == null : this.tags.equals(getEconomyBundlesResultDataInner.tags)) &&
        (this.entitlement == null ? getEconomyBundlesResultDataInner.entitlement == null : this.entitlement.equals(getEconomyBundlesResultDataInner.entitlement)) &&
        (this.isStackable == null ? getEconomyBundlesResultDataInner.isStackable == null : this.isStackable.equals(getEconomyBundlesResultDataInner.isStackable)) &&
        (this.bundleImageUrl == null ? getEconomyBundlesResultDataInner.bundleImageUrl == null : this.bundleImageUrl.equals(getEconomyBundlesResultDataInner.bundleImageUrl)) &&
        (this.isLimitedEdition == null ? getEconomyBundlesResultDataInner.isLimitedEdition == null : this.isLimitedEdition.equals(getEconomyBundlesResultDataInner.isLimitedEdition)) &&
        (this.limitedEditionIntialCount == null ? getEconomyBundlesResultDataInner.limitedEditionIntialCount == null : this.limitedEditionIntialCount.equals(getEconomyBundlesResultDataInner.limitedEditionIntialCount)) &&
        (this.customMetaData == null ? getEconomyBundlesResultDataInner.customMetaData == null : this.customMetaData.equals(getEconomyBundlesResultDataInner.customMetaData)) &&
        (this.bundleContents == null ? getEconomyBundlesResultDataInner.bundleContents == null : this.bundleContents.equals(getEconomyBundlesResultDataInner.bundleContents)) &&
        (this.status == null ? getEconomyBundlesResultDataInner.status == null : this.status.equals(getEconomyBundlesResultDataInner.status)) &&
        (this.ID == null ? getEconomyBundlesResultDataInner.ID == null : this.ID.equals(getEconomyBundlesResultDataInner.ID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bundleCategory == null ? 0: this.bundleCategory.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.virtualCurrency == null ? 0: this.virtualCurrency.hashCode());
    result = 31 * result + (this.realCurrency == null ? 0: this.realCurrency.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.entitlement == null ? 0: this.entitlement.hashCode());
    result = 31 * result + (this.isStackable == null ? 0: this.isStackable.hashCode());
    result = 31 * result + (this.bundleImageUrl == null ? 0: this.bundleImageUrl.hashCode());
    result = 31 * result + (this.isLimitedEdition == null ? 0: this.isLimitedEdition.hashCode());
    result = 31 * result + (this.limitedEditionIntialCount == null ? 0: this.limitedEditionIntialCount.hashCode());
    result = 31 * result + (this.customMetaData == null ? 0: this.customMetaData.hashCode());
    result = 31 * result + (this.bundleContents == null ? 0: this.bundleContents.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEconomyBundlesResultDataInner {\n");
    
    sb.append("  bundleCategory: ").append(bundleCategory).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  virtualCurrency: ").append(virtualCurrency).append("\n");
    sb.append("  realCurrency: ").append(realCurrency).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  entitlement: ").append(entitlement).append("\n");
    sb.append("  isStackable: ").append(isStackable).append("\n");
    sb.append("  bundleImageUrl: ").append(bundleImageUrl).append("\n");
    sb.append("  isLimitedEdition: ").append(isLimitedEdition).append("\n");
    sb.append("  limitedEditionIntialCount: ").append(limitedEditionIntialCount).append("\n");
    sb.append("  customMetaData: ").append(customMetaData).append("\n");
    sb.append("  bundleContents: ").append(bundleContents).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

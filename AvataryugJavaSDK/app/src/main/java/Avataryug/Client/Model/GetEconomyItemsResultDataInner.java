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
public class GetEconomyItemsResultDataInner {
  
  @SerializedName("TemplateID")
  private String templateID = null;
  @SerializedName("ItemGender")
  private Integer itemGender = null;
  @SerializedName("ItemCategory")
  private String itemCategory = null;
  @SerializedName("ItemSubCategory")
  private String itemSubCategory = null;
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
  @SerializedName("IsLimitedEdition")
  private Integer isLimitedEdition = null;
  @SerializedName("LimitedEditionIntialCount")
  private Integer limitedEditionIntialCount = null;
  @SerializedName("CustomMetaData")
  private String customMetaData = null;
  @SerializedName("Style")
  private String style = null;
  @SerializedName("ItemThumbnailsUrl")
  private String itemThumbnailsUrl = null;
  @SerializedName("Artifacts")
  private String artifacts = null;
  @SerializedName("BlendshapeKeys")
  private String blendshapeKeys = null;
  @SerializedName("ItemSkin")
  private String itemSkin = null;
  @SerializedName("Status")
  private Integer status = null;
  @SerializedName("ID")
  private String ID = null;
  @SerializedName("Config")
  private String config = null;
  @SerializedName("CoreBucket")
  private String coreBucket = null;
  @SerializedName("ConflictingBuckets")
  private String conflictingBuckets = null;


  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTemplateID() {
    return templateID;
  }
  public void setTemplateID(String templateID) {
    this.templateID = templateID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getItemGender() {
    return itemGender;
  }
  public void setItemGender(Integer itemGender) {
    this.itemGender = itemGender;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getItemCategory() {
    return itemCategory;
  }
  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getItemSubCategory() {
    return itemSubCategory;
  }
  public void setItemSubCategory(String itemSubCategory) {
    this.itemSubCategory = itemSubCategory;
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
  public String getStyle() {
    return style;
  }
  public void setStyle(String style) {
    this.style = style;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getItemThumbnailsUrl() {
    return itemThumbnailsUrl;
  }
  public void setItemThumbnailsUrl(String itemThumbnailsUrl) {
    this.itemThumbnailsUrl = itemThumbnailsUrl;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getArtifacts() {
    return artifacts;
  }
  public void setArtifacts(String artifacts) {
    this.artifacts = artifacts;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBlendshapeKeys() {
    return blendshapeKeys;
  }
  public void setBlendshapeKeys(String blendshapeKeys) {
    this.blendshapeKeys = blendshapeKeys;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getItemSkin() {
    return itemSkin;
  }
  public void setItemSkin(String itemSkin) {
    this.itemSkin = itemSkin;
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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getConfig() {
    return config;
  }
  public void setConfig(String config) {
    this.config = config;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCoreBucket() {
    return coreBucket;
  }
  public void setCoreBucket(String coreBucket) {
    this.coreBucket = coreBucket;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getConflictingBuckets() {
    return conflictingBuckets;
  }
  public void setConflictingBuckets(String conflictingBuckets) {
    this.conflictingBuckets = conflictingBuckets;
  }

  /**
   **/

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEconomyItemsResultDataInner getEconomyItemsResultDataInner = (GetEconomyItemsResultDataInner) o;
    return (this.templateID == null ? getEconomyItemsResultDataInner.templateID == null : this.templateID.equals(getEconomyItemsResultDataInner.templateID)) &&
        (this.itemGender == null ? getEconomyItemsResultDataInner.itemGender == null : this.itemGender.equals(getEconomyItemsResultDataInner.itemGender)) &&
        (this.itemCategory == null ? getEconomyItemsResultDataInner.itemCategory == null : this.itemCategory.equals(getEconomyItemsResultDataInner.itemCategory)) &&
        (this.itemSubCategory == null ? getEconomyItemsResultDataInner.itemSubCategory == null : this.itemSubCategory.equals(getEconomyItemsResultDataInner.itemSubCategory)) &&
        (this.displayName == null ? getEconomyItemsResultDataInner.displayName == null : this.displayName.equals(getEconomyItemsResultDataInner.displayName)) &&
        (this.description == null ? getEconomyItemsResultDataInner.description == null : this.description.equals(getEconomyItemsResultDataInner.description)) &&
        (this.virtualCurrency == null ? getEconomyItemsResultDataInner.virtualCurrency == null : this.virtualCurrency.equals(getEconomyItemsResultDataInner.virtualCurrency)) &&
        (this.realCurrency == null ? getEconomyItemsResultDataInner.realCurrency == null : this.realCurrency.equals(getEconomyItemsResultDataInner.realCurrency)) &&
        (this.tags == null ? getEconomyItemsResultDataInner.tags == null : this.tags.equals(getEconomyItemsResultDataInner.tags)) &&
        (this.entitlement == null ? getEconomyItemsResultDataInner.entitlement == null : this.entitlement.equals(getEconomyItemsResultDataInner.entitlement)) &&
        (this.isStackable == null ? getEconomyItemsResultDataInner.isStackable == null : this.isStackable.equals(getEconomyItemsResultDataInner.isStackable)) &&
        (this.isLimitedEdition == null ? getEconomyItemsResultDataInner.isLimitedEdition == null : this.isLimitedEdition.equals(getEconomyItemsResultDataInner.isLimitedEdition)) &&
        (this.limitedEditionIntialCount == null ? getEconomyItemsResultDataInner.limitedEditionIntialCount == null : this.limitedEditionIntialCount.equals(getEconomyItemsResultDataInner.limitedEditionIntialCount)) &&
        (this.customMetaData == null ? getEconomyItemsResultDataInner.customMetaData == null : this.customMetaData.equals(getEconomyItemsResultDataInner.customMetaData)) &&
        (this.style == null ? getEconomyItemsResultDataInner.style == null : this.style.equals(getEconomyItemsResultDataInner.style)) &&
        (this.itemThumbnailsUrl == null ? getEconomyItemsResultDataInner.itemThumbnailsUrl == null : this.itemThumbnailsUrl.equals(getEconomyItemsResultDataInner.itemThumbnailsUrl)) &&
        (this.artifacts == null ? getEconomyItemsResultDataInner.artifacts == null : this.artifacts.equals(getEconomyItemsResultDataInner.artifacts)) &&
        (this.blendshapeKeys == null ? getEconomyItemsResultDataInner.blendshapeKeys == null : this.blendshapeKeys.equals(getEconomyItemsResultDataInner.blendshapeKeys)) &&
        (this.itemSkin == null ? getEconomyItemsResultDataInner.itemSkin == null : this.itemSkin.equals(getEconomyItemsResultDataInner.itemSkin)) &&
        (this.status == null ? getEconomyItemsResultDataInner.status == null : this.status.equals(getEconomyItemsResultDataInner.status)) &&
        (this.ID == null ? getEconomyItemsResultDataInner.ID == null : this.ID.equals(getEconomyItemsResultDataInner.ID)) &&
        (this.config == null ? getEconomyItemsResultDataInner.config == null : this.config.equals(getEconomyItemsResultDataInner.config)) &&
        (this.coreBucket == null ? getEconomyItemsResultDataInner.coreBucket == null : this.coreBucket.equals(getEconomyItemsResultDataInner.coreBucket)) &&
        (this.conflictingBuckets == null ? getEconomyItemsResultDataInner.conflictingBuckets == null : this.conflictingBuckets.equals(getEconomyItemsResultDataInner.conflictingBuckets));

  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.templateID == null ? 0: this.templateID.hashCode());
    result = 31 * result + (this.itemGender == null ? 0: this.itemGender.hashCode());
    result = 31 * result + (this.itemCategory == null ? 0: this.itemCategory.hashCode());
    result = 31 * result + (this.itemSubCategory == null ? 0: this.itemSubCategory.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.virtualCurrency == null ? 0: this.virtualCurrency.hashCode());
    result = 31 * result + (this.realCurrency == null ? 0: this.realCurrency.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.entitlement == null ? 0: this.entitlement.hashCode());
    result = 31 * result + (this.isStackable == null ? 0: this.isStackable.hashCode());
    result = 31 * result + (this.isLimitedEdition == null ? 0: this.isLimitedEdition.hashCode());
    result = 31 * result + (this.limitedEditionIntialCount == null ? 0: this.limitedEditionIntialCount.hashCode());
    result = 31 * result + (this.customMetaData == null ? 0: this.customMetaData.hashCode());
    result = 31 * result + (this.style == null ? 0: this.style.hashCode());
    result = 31 * result + (this.itemThumbnailsUrl == null ? 0: this.itemThumbnailsUrl.hashCode());
    result = 31 * result + (this.artifacts == null ? 0: this.artifacts.hashCode());
    result = 31 * result + (this.blendshapeKeys == null ? 0: this.blendshapeKeys.hashCode());
    result = 31 * result + (this.itemSkin == null ? 0: this.itemSkin.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    result = 31 * result + (this.config == null ? 0: this.config.hashCode());
    result = 31 * result + (this.coreBucket == null ? 0: this.coreBucket.hashCode());
    result = 31 * result + (this.conflictingBuckets == null ? 0: this.conflictingBuckets.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEconomyItemsResultDataInner {\n");
    
    sb.append("  templateID: ").append(templateID).append("\n");
    sb.append("  itemGender: ").append(itemGender).append("\n");
    sb.append("  itemCategory: ").append(itemCategory).append("\n");
    sb.append("  itemSubCategory: ").append(itemSubCategory).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  virtualCurrency: ").append(virtualCurrency).append("\n");
    sb.append("  realCurrency: ").append(realCurrency).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  entitlement: ").append(entitlement).append("\n");
    sb.append("  isStackable: ").append(isStackable).append("\n");
    sb.append("  isLimitedEdition: ").append(isLimitedEdition).append("\n");
    sb.append("  limitedEditionIntialCount: ").append(limitedEditionIntialCount).append("\n");
    sb.append("  customMetaData: ").append(customMetaData).append("\n");
    sb.append("  style: ").append(style).append("\n");
    sb.append("  itemThumbnailsUrl: ").append(itemThumbnailsUrl).append("\n");
    sb.append("  artifacts: ").append(artifacts).append("\n");
    sb.append("  blendshapeKeys: ").append(blendshapeKeys).append("\n");
    sb.append("  itemSkin: ").append(itemSkin).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("  config: ").append(config).append("\n");
    sb.append("  coreBucket: ").append(coreBucket).append("\n");
    sb.append("  conflictingBuckets: ").append(conflictingBuckets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
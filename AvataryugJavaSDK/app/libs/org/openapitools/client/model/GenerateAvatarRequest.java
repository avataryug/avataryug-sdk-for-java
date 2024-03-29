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
public class GenerateAvatarRequest {
  
  @SerializedName("Meta")
  private String meta = null;
  @SerializedName("Colors")
  private String colors = null;
  @SerializedName("BlendShapes")
  private String blendShapes = null;
  @SerializedName("BucketData")
  private String bucketData = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMeta() {
    return meta;
  }
  public void setMeta(String meta) {
    this.meta = meta;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getColors() {
    return colors;
  }
  public void setColors(String colors) {
    this.colors = colors;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBlendShapes() {
    return blendShapes;
  }
  public void setBlendShapes(String blendShapes) {
    this.blendShapes = blendShapes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBucketData() {
    return bucketData;
  }
  public void setBucketData(String bucketData) {
    this.bucketData = bucketData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateAvatarRequest generateAvatarRequest = (GenerateAvatarRequest) o;
    return (this.meta == null ? generateAvatarRequest.meta == null : this.meta.equals(generateAvatarRequest.meta)) &&
        (this.colors == null ? generateAvatarRequest.colors == null : this.colors.equals(generateAvatarRequest.colors)) &&
        (this.blendShapes == null ? generateAvatarRequest.blendShapes == null : this.blendShapes.equals(generateAvatarRequest.blendShapes)) &&
        (this.bucketData == null ? generateAvatarRequest.bucketData == null : this.bucketData.equals(generateAvatarRequest.bucketData));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.meta == null ? 0: this.meta.hashCode());
    result = 31 * result + (this.colors == null ? 0: this.colors.hashCode());
    result = 31 * result + (this.blendShapes == null ? 0: this.blendShapes.hashCode());
    result = 31 * result + (this.bucketData == null ? 0: this.bucketData.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateAvatarRequest {\n");
    
    sb.append("  meta: ").append(meta).append("\n");
    sb.append("  colors: ").append(colors).append("\n");
    sb.append("  blendShapes: ").append(blendShapes).append("\n");
    sb.append("  bucketData: ").append(bucketData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

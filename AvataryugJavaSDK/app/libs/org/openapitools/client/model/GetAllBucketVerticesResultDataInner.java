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
public class GetAllBucketVerticesResultDataInner {
  
  @SerializedName("BucketName")
  private String bucketName = null;
  @SerializedName("MainCatID")
  private String mainCatID = null;
  @SerializedName("Platform")
  private String platform = null;
  @SerializedName("VertexArray")
  private String vertexArray = null;
  @SerializedName("Meta")
  private String meta = null;
  @SerializedName("ID")
  private String ID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBucketName() {
    return bucketName;
  }
  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMainCatID() {
    return mainCatID;
  }
  public void setMainCatID(String mainCatID) {
    this.mainCatID = mainCatID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPlatform() {
    return platform;
  }
  public void setPlatform(String platform) {
    this.platform = platform;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getVertexArray() {
    return vertexArray;
  }
  public void setVertexArray(String vertexArray) {
    this.vertexArray = vertexArray;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMeta() {
    return meta;
  }
  public void setMeta(String meta) {
    this.meta = meta;
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
    GetAllBucketVerticesResultDataInner getAllBucketVerticesResultDataInner = (GetAllBucketVerticesResultDataInner) o;
    return (this.bucketName == null ? getAllBucketVerticesResultDataInner.bucketName == null : this.bucketName.equals(getAllBucketVerticesResultDataInner.bucketName)) &&
        (this.mainCatID == null ? getAllBucketVerticesResultDataInner.mainCatID == null : this.mainCatID.equals(getAllBucketVerticesResultDataInner.mainCatID)) &&
        (this.platform == null ? getAllBucketVerticesResultDataInner.platform == null : this.platform.equals(getAllBucketVerticesResultDataInner.platform)) &&
        (this.vertexArray == null ? getAllBucketVerticesResultDataInner.vertexArray == null : this.vertexArray.equals(getAllBucketVerticesResultDataInner.vertexArray)) &&
        (this.meta == null ? getAllBucketVerticesResultDataInner.meta == null : this.meta.equals(getAllBucketVerticesResultDataInner.meta)) &&
        (this.ID == null ? getAllBucketVerticesResultDataInner.ID == null : this.ID.equals(getAllBucketVerticesResultDataInner.ID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bucketName == null ? 0: this.bucketName.hashCode());
    result = 31 * result + (this.mainCatID == null ? 0: this.mainCatID.hashCode());
    result = 31 * result + (this.platform == null ? 0: this.platform.hashCode());
    result = 31 * result + (this.vertexArray == null ? 0: this.vertexArray.hashCode());
    result = 31 * result + (this.meta == null ? 0: this.meta.hashCode());
    result = 31 * result + (this.ID == null ? 0: this.ID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllBucketVerticesResultDataInner {\n");
    
    sb.append("  bucketName: ").append(bucketName).append("\n");
    sb.append("  mainCatID: ").append(mainCatID).append("\n");
    sb.append("  platform: ").append(platform).append("\n");
    sb.append("  vertexArray: ").append(vertexArray).append("\n");
    sb.append("  meta: ").append(meta).append("\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

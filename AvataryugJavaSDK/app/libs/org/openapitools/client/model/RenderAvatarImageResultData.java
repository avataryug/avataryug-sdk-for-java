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
public class RenderAvatarImageResultData {
  
  @SerializedName("Platform")
  private String platform = null;
  @SerializedName("ImageURL")
  private String imageURL = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPlatform() {
    return platform;
  }
  public void setPlatform(String platform) {
    this.platform = platform;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImageURL() {
    return imageURL;
  }
  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderAvatarImageResultData renderAvatarImageResultData = (RenderAvatarImageResultData) o;
    return (this.platform == null ? renderAvatarImageResultData.platform == null : this.platform.equals(renderAvatarImageResultData.platform)) &&
        (this.imageURL == null ? renderAvatarImageResultData.imageURL == null : this.imageURL.equals(renderAvatarImageResultData.imageURL));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.platform == null ? 0: this.platform.hashCode());
    result = 31 * result + (this.imageURL == null ? 0: this.imageURL.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderAvatarImageResultData {\n");
    
    sb.append("  platform: ").append(platform).append("\n");
    sb.append("  imageURL: ").append(imageURL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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
public class UpdateImageAvatarUrlRequest {
  
  @SerializedName("ImageUrl")
  private String imageUrl = null;

  /**
   * Avatar Image Url for the user.
   **/
  @ApiModelProperty(required = true, value = "Avatar Image Url for the user.")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateImageAvatarUrlRequest updateImageAvatarUrlRequest = (UpdateImageAvatarUrlRequest) o;
    return (this.imageUrl == null ? updateImageAvatarUrlRequest.imageUrl == null : this.imageUrl.equals(updateImageAvatarUrlRequest.imageUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.imageUrl == null ? 0: this.imageUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateImageAvatarUrlRequest {\n");
    
    sb.append("  imageUrl: ").append(imageUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

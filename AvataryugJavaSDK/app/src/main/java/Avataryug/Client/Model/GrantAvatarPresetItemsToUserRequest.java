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

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GrantAvatarPresetItemsToUserRequest {
  
  @SerializedName("ItemIDs")
  private List<GrantAvatarPresetItemsToUserRequestItemIDsInner> itemIDs = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<GrantAvatarPresetItemsToUserRequestItemIDsInner> getItemIDs() {
    return itemIDs;
  }
  public void setItemIDs(List<GrantAvatarPresetItemsToUserRequestItemIDsInner> itemIDs) {
    this.itemIDs = itemIDs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantAvatarPresetItemsToUserRequest grantAvatarPresetItemsToUserRequest = (GrantAvatarPresetItemsToUserRequest) o;
    return (this.itemIDs == null ? grantAvatarPresetItemsToUserRequest.itemIDs == null : this.itemIDs.equals(grantAvatarPresetItemsToUserRequest.itemIDs));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.itemIDs == null ? 0: this.itemIDs.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantAvatarPresetItemsToUserRequest {\n");
    
    sb.append("  itemIDs: ").append(itemIDs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

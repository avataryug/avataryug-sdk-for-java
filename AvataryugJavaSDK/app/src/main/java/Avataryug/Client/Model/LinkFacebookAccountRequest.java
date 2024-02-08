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
public class LinkFacebookAccountRequest {
  
  @SerializedName("ForceLink")
  private Boolean forceLink = null;
  @SerializedName("AccessToken")
  private String accessToken = null;
  @SerializedName("FacebookID")
  private String facebookID = null;

  /**
   * If another user is already linked to the account, unlink the other user and re-link.
   **/
  @ApiModelProperty(value = "If another user is already linked to the account, unlink the other user and re-link.")
  public Boolean getForceLink() {
    return forceLink;
  }
  public void setForceLink(Boolean forceLink) {
    this.forceLink = forceLink;
  }

  /**
   * Unique identifier from Facebook for the user.
   **/
  @ApiModelProperty(value = "Unique identifier from Facebook for the user.")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * Facebook ID provided by Facebook.
   **/
  @ApiModelProperty(required = true, value = "Facebook ID provided by Facebook.")
  public String getFacebookID() {
    return facebookID;
  }
  public void setFacebookID(String facebookID) {
    this.facebookID = facebookID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkFacebookAccountRequest linkFacebookAccountRequest = (LinkFacebookAccountRequest) o;
    return (this.forceLink == null ? linkFacebookAccountRequest.forceLink == null : this.forceLink.equals(linkFacebookAccountRequest.forceLink)) &&
        (this.accessToken == null ? linkFacebookAccountRequest.accessToken == null : this.accessToken.equals(linkFacebookAccountRequest.accessToken)) &&
        (this.facebookID == null ? linkFacebookAccountRequest.facebookID == null : this.facebookID.equals(linkFacebookAccountRequest.facebookID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.forceLink == null ? 0: this.forceLink.hashCode());
    result = 31 * result + (this.accessToken == null ? 0: this.accessToken.hashCode());
    result = 31 * result + (this.facebookID == null ? 0: this.facebookID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkFacebookAccountRequest {\n");
    
    sb.append("  forceLink: ").append(forceLink).append("\n");
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  facebookID: ").append(facebookID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

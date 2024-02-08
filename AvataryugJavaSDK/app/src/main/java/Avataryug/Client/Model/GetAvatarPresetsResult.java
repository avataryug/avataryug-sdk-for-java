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
public class GetAvatarPresetsResult {
  
  @SerializedName("Code")
  private Integer code = null;
  @SerializedName("Status")
  private String status = null;
  @SerializedName("Data")
  private List<GetAvatarPresetsResultDataInner> data = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<GetAvatarPresetsResultDataInner> getData() {
    return data;
  }
  public void setData(List<GetAvatarPresetsResultDataInner> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAvatarPresetsResult getAvatarPresetsResult = (GetAvatarPresetsResult) o;
    return (this.code == null ? getAvatarPresetsResult.code == null : this.code.equals(getAvatarPresetsResult.code)) &&
        (this.status == null ? getAvatarPresetsResult.status == null : this.status.equals(getAvatarPresetsResult.status)) &&
        (this.data == null ? getAvatarPresetsResult.data == null : this.data.equals(getAvatarPresetsResult.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAvatarPresetsResult {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
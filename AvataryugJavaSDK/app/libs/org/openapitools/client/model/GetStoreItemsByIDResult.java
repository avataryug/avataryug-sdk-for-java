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

import org.openapitools.client.model.GetStoreItemsByIDResultData;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetStoreItemsByIDResult {
  
  @SerializedName("Code")
  private Integer code = null;
  @SerializedName("Status")
  private String status = null;
  @SerializedName("Data")
  private GetStoreItemsByIDResultData data = null;

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
  public GetStoreItemsByIDResultData getData() {
    return data;
  }
  public void setData(GetStoreItemsByIDResultData data) {
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
    GetStoreItemsByIDResult getStoreItemsByIDResult = (GetStoreItemsByIDResult) o;
    return (this.code == null ? getStoreItemsByIDResult.code == null : this.code.equals(getStoreItemsByIDResult.code)) &&
        (this.status == null ? getStoreItemsByIDResult.status == null : this.status.equals(getStoreItemsByIDResult.status)) &&
        (this.data == null ? getStoreItemsByIDResult.data == null : this.data.equals(getStoreItemsByIDResult.data));
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
    sb.append("class GetStoreItemsByIDResult {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

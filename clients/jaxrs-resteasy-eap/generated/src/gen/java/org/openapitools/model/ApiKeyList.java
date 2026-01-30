package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdminApiKey;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ApiKeyList   {
  
  private String _object;
  private List<@Valid AdminApiKey> data = new ArrayList<>();
  private Boolean hasMore;
  private String firstId;
  private String lastId;

  /**
   **/
  
  @ApiModelProperty(example = "list", value = "")
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public List<@Valid AdminApiKey> getData() {
    return data;
  }
  public void setData(List<@Valid AdminApiKey> data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  /**
   **/
  
  @ApiModelProperty(example = "key_abc", value = "")
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }
  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  /**
   **/
  
  @ApiModelProperty(example = "key_xyz", value = "")
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }
  public void setLastId(String lastId) {
    this.lastId = lastId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyList apiKeyList = (ApiKeyList) o;
    return Objects.equals(this._object, apiKeyList._object) &&
        Objects.equals(this.data, apiKeyList.data) &&
        Objects.equals(this.hasMore, apiKeyList.hasMore) &&
        Objects.equals(this.firstId, apiKeyList.firstId) &&
        Objects.equals(this.lastId, apiKeyList.lastId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, hasMore, firstId, lastId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyList {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
    sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


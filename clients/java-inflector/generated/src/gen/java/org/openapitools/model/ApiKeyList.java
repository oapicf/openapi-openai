package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdminApiKey;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ApiKeyList   {
  @JsonProperty("object")
  private String _object;

  @JsonProperty("data")
  private List<AdminApiKey> data = null;

  @JsonProperty("has_more")
  private Boolean hasMore;

  @JsonProperty("first_id")
  private String firstId;

  @JsonProperty("last_id")
  private String lastId;

  /**
   **/
  public ApiKeyList _object(String _object) {
    this._object = _object;
    return this;
  }

  
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
  public ApiKeyList data(List<AdminApiKey> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public List<AdminApiKey> getData() {
    return data;
  }
  public void setData(List<AdminApiKey> data) {
    this.data = data;
  }

  /**
   **/
  public ApiKeyList hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  
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
  public ApiKeyList firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  
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
  public ApiKeyList lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  
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
    return Objects.equals(_object, apiKeyList._object) &&
        Objects.equals(data, apiKeyList.data) &&
        Objects.equals(hasMore, apiKeyList.hasMore) &&
        Objects.equals(firstId, apiKeyList.firstId) &&
        Objects.equals(lastId, apiKeyList.lastId);
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


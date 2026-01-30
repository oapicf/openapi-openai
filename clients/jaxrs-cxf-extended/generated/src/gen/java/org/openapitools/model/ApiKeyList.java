package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdminApiKey;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApiKeyList  {
  
  @ApiModelProperty(example = "list", value = "")
  private String _object;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid AdminApiKey> data = new ArrayList<>();

  @ApiModelProperty(example = "false", value = "")
  private Boolean hasMore;

  @ApiModelProperty(example = "key_abc", value = "")
  private String firstId;

  @ApiModelProperty(example = "key_xyz", value = "")
  private String lastId;
 /**
  * Get _object
  * @return _object
  */
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public ApiKeyList _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  public List<@Valid AdminApiKey> getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(List<@Valid AdminApiKey> data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public ApiKeyList data(List<@Valid AdminApiKey> data) {
    this.data = data;
    return this;
  }

  /**
   * Adds a new item to the <code>data</code> list.
   */
  public ApiKeyList addDataItem(AdminApiKey dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
  * Get hasMore
  * @return hasMore
  */
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }

  /**
   * Sets the <code>hasMore</code> property.
   */
 public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  /**
   * Sets the <code>hasMore</code> property.
   */
  public ApiKeyList hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

 /**
  * Get firstId
  * @return firstId
  */
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }

  /**
   * Sets the <code>firstId</code> property.
   */
 public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  /**
   * Sets the <code>firstId</code> property.
   */
  public ApiKeyList firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

 /**
  * Get lastId
  * @return lastId
  */
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }

  /**
   * Sets the <code>lastId</code> property.
   */
 public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  /**
   * Sets the <code>lastId</code> property.
   */
  public ApiKeyList lastId(String lastId) {
    this.lastId = lastId;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


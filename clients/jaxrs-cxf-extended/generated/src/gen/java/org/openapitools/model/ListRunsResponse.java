package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListRunsResponse  {
  
  @ApiModelProperty(example = "list", required = true, value = "")
  private String _object;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid RunObject> data = new ArrayList<>();

  @ApiModelProperty(example = "run_abc123", required = true, value = "")
  private String firstId;

  @ApiModelProperty(example = "run_abc456", required = true, value = "")
  private String lastId;

  @ApiModelProperty(example = "false", required = true, value = "")
  private Boolean hasMore;
 /**
  * Get _object
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
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
  public ListRunsResponse _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  @NotNull
  public List<@Valid RunObject> getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(List<@Valid RunObject> data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public ListRunsResponse data(List<@Valid RunObject> data) {
    this.data = data;
    return this;
  }

  /**
   * Adds a new item to the <code>data</code> list.
   */
  public ListRunsResponse addDataItem(RunObject dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
  * Get firstId
  * @return firstId
  */
  @JsonProperty("first_id")
  @NotNull
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
  public ListRunsResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

 /**
  * Get lastId
  * @return lastId
  */
  @JsonProperty("last_id")
  @NotNull
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
  public ListRunsResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

 /**
  * Get hasMore
  * @return hasMore
  */
  @JsonProperty("has_more")
  @NotNull
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
  public ListRunsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
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
    ListRunsResponse listRunsResponse = (ListRunsResponse) o;
    return Objects.equals(this._object, listRunsResponse._object) &&
        Objects.equals(this.data, listRunsResponse.data) &&
        Objects.equals(this.firstId, listRunsResponse.firstId) &&
        Objects.equals(this.lastId, listRunsResponse.lastId) &&
        Objects.equals(this.hasMore, listRunsResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRunsResponse {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
    sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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


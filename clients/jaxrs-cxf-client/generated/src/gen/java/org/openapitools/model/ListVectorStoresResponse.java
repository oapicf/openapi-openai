package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VectorStoreObject;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListVectorStoresResponse  {
  
  @ApiModelProperty(example = "list", required = true, value = "")

  private String _object;

  @ApiModelProperty(required = true, value = "")

  private List<VectorStoreObject> data = new ArrayList<>();

  @ApiModelProperty(example = "vs_abc123", required = true, value = "")

  private String firstId;

  @ApiModelProperty(example = "vs_abc456", required = true, value = "")

  private String lastId;

  @ApiModelProperty(example = "false", required = true, value = "")

  private Boolean hasMore;
 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public ListVectorStoresResponse _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<VectorStoreObject> getData() {
    return data;
  }

  public void setData(List<VectorStoreObject> data) {
    this.data = data;
  }

  public ListVectorStoresResponse data(List<VectorStoreObject> data) {
    this.data = data;
    return this;
  }

  public ListVectorStoresResponse addDataItem(VectorStoreObject dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get firstId
   * @return firstId
  **/
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ListVectorStoresResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

 /**
   * Get lastId
   * @return lastId
  **/
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ListVectorStoresResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

 /**
   * Get hasMore
   * @return hasMore
  **/
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ListVectorStoresResponse hasMore(Boolean hasMore) {
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
    ListVectorStoresResponse listVectorStoresResponse = (ListVectorStoresResponse) o;
    return Objects.equals(this._object, listVectorStoresResponse._object) &&
        Objects.equals(this.data, listVectorStoresResponse.data) &&
        Objects.equals(this.firstId, listVectorStoresResponse.firstId) &&
        Objects.equals(this.lastId, listVectorStoresResponse.lastId) &&
        Objects.equals(this.hasMore, listVectorStoresResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVectorStoresResponse {\n");
    
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


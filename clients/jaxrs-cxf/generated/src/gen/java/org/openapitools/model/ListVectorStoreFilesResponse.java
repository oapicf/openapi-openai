package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VectorStoreFileObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListVectorStoreFilesResponse  {
  
  @ApiModelProperty(example = "list", required = true, value = "")

  private String _object;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid VectorStoreFileObject> data = new ArrayList<>();

  @ApiModelProperty(example = "file-abc123", required = true, value = "")

  private String firstId;

  @ApiModelProperty(example = "file-abc456", required = true, value = "")

  private String lastId;

  @ApiModelProperty(example = "false", required = true, value = "")

  private Boolean hasMore;
 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public ListVectorStoreFilesResponse _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
  public List<@Valid VectorStoreFileObject> getData() {
    return data;
  }

  public void setData(List<@Valid VectorStoreFileObject> data) {
    this.data = data;
  }

  public ListVectorStoreFilesResponse data(List<@Valid VectorStoreFileObject> data) {
    this.data = data;
    return this;
  }

  public ListVectorStoreFilesResponse addDataItem(VectorStoreFileObject dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get firstId
   * @return firstId
  **/
  @JsonProperty("first_id")
  @NotNull
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ListVectorStoreFilesResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

 /**
   * Get lastId
   * @return lastId
  **/
  @JsonProperty("last_id")
  @NotNull
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ListVectorStoreFilesResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

 /**
   * Get hasMore
   * @return hasMore
  **/
  @JsonProperty("has_more")
  @NotNull
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ListVectorStoreFilesResponse hasMore(Boolean hasMore) {
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
    ListVectorStoreFilesResponse listVectorStoreFilesResponse = (ListVectorStoreFilesResponse) o;
    return Objects.equals(this._object, listVectorStoreFilesResponse._object) &&
        Objects.equals(this.data, listVectorStoreFilesResponse.data) &&
        Objects.equals(this.firstId, listVectorStoreFilesResponse.firstId) &&
        Objects.equals(this.lastId, listVectorStoreFilesResponse.lastId) &&
        Objects.equals(this.hasMore, listVectorStoreFilesResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVectorStoreFilesResponse {\n");
    
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


package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.RunObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ListRunsResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ListRunsResponse   {
  @JsonProperty("object")
  private String _object;

  @JsonProperty("data")
  
  private List<RunObject> data = new ArrayList<>();

  @JsonProperty("first_id")
  private String firstId;

  @JsonProperty("last_id")
  private String lastId;

  @JsonProperty("has_more")
  private Boolean hasMore;

  public ListRunsResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @ApiModelProperty(example = "list", required = true, value = "")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public ListRunsResponse data(List<RunObject> data) {
    this.data = data;
    return this;
  }

  public ListRunsResponse addDataItem(RunObject dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @ApiModelProperty(required = true, value = "")
  public List<RunObject> getData() {
    return data;
  }

  public void setData(List<RunObject> data) {
    this.data = data;
  }

  public ListRunsResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  /**
   * Get firstId
   * @return firstId
   */
  @ApiModelProperty(example = "run_abc123", required = true, value = "")
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ListRunsResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  /**
   * Get lastId
   * @return lastId
   */
  @ApiModelProperty(example = "run_abc456", required = true, value = "")
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ListRunsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


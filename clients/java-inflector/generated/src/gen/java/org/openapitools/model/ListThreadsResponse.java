package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ThreadObject;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-03T11:06:32.740431132Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ListThreadsResponse   {
  @JsonProperty("object")
  private String _object;

  @JsonProperty("data")
  private List<ThreadObject> data = new ArrayList<>();

  @JsonProperty("first_id")
  private String firstId;

  @JsonProperty("last_id")
  private String lastId;

  @JsonProperty("has_more")
  private Boolean hasMore;

  /**
   **/
  public ListThreadsResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(example = "list", required = true, value = "")
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  public ListThreadsResponse data(List<ThreadObject> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  public List<ThreadObject> getData() {
    return data;
  }
  public void setData(List<ThreadObject> data) {
    this.data = data;
  }

  /**
   **/
  public ListThreadsResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  
  @ApiModelProperty(example = "asst_abc123", required = true, value = "")
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }
  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  /**
   **/
  public ListThreadsResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  
  @ApiModelProperty(example = "asst_abc456", required = true, value = "")
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }
  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  /**
   **/
  public ListThreadsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  
  @ApiModelProperty(example = "false", required = true, value = "")
  @JsonProperty("has_more")
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
    ListThreadsResponse listThreadsResponse = (ListThreadsResponse) o;
    return Objects.equals(_object, listThreadsResponse._object) &&
        Objects.equals(data, listThreadsResponse.data) &&
        Objects.equals(firstId, listThreadsResponse.firstId) &&
        Objects.equals(lastId, listThreadsResponse.lastId) &&
        Objects.equals(hasMore, listThreadsResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListThreadsResponse {\n");
    
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


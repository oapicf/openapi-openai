/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunObject;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ListRunsResponse   {
  
  private String _object;
  private List<RunObject> data = new ArrayList<>();
  private String firstId;
  private String lastId;
  private Boolean hasMore;

  /**
   */
  public ListRunsResponse _object(String _object) {
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
   */
  public ListRunsResponse data(List<RunObject> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  public List<RunObject> getData() {
    return data;
  }
  public void setData(List<RunObject> data) {
    this.data = data;
  }

  /**
   */
  public ListRunsResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  
  @ApiModelProperty(example = "run_abc123", required = true, value = "")
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }
  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  /**
   */
  public ListRunsResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  
  @ApiModelProperty(example = "run_abc456", required = true, value = "")
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }
  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  /**
   */
  public ListRunsResponse hasMore(Boolean hasMore) {
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
    ListRunsResponse listRunsResponse = (ListRunsResponse) o;
    return Objects.equals(_object, listRunsResponse._object) &&
        Objects.equals(data, listRunsResponse.data) &&
        Objects.equals(firstId, listRunsResponse.firstId) &&
        Objects.equals(lastId, listRunsResponse.lastId) &&
        Objects.equals(hasMore, listRunsResponse.hasMore);
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


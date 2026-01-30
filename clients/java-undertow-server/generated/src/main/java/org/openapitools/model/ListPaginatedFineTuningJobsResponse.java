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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTuningJob;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ListPaginatedFineTuningJobsResponse   {
  
  private List<FineTuningJob> data = new ArrayList<>();
  private Boolean hasMore;


  public enum ObjectEnum {
    LIST("list");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;

  /**
   */
  public ListPaginatedFineTuningJobsResponse data(List<FineTuningJob> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  public List<FineTuningJob> getData() {
    return data;
  }
  public void setData(List<FineTuningJob> data) {
    this.data = data;
  }

  /**
   */
  public ListPaginatedFineTuningJobsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  /**
   */
  public ListPaginatedFineTuningJobsResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobsResponse = (ListPaginatedFineTuningJobsResponse) o;
    return Objects.equals(data, listPaginatedFineTuningJobsResponse.data) &&
        Objects.equals(hasMore, listPaginatedFineTuningJobsResponse.hasMore) &&
        Objects.equals(_object, listPaginatedFineTuningJobsResponse._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, hasMore, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaginatedFineTuningJobsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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


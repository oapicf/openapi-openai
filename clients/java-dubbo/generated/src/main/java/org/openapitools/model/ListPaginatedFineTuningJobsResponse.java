package org.openapitools.model;

import org.openapitools.model.FineTuningJob;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ListPaginatedFineTuningJobsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private List<FineTuningJob> data = new ArrayList<>();

  @JsonProperty("has_more")
  private Boolean hasMore;

  @JsonProperty("object")
  private String _object;

  /**
   * 
   * @return data
   */
  public List<FineTuningJob> getData() {
    return data;
  }

  public void setData(List<FineTuningJob> data) {
    this.data = data;
  }

  /**
   * 
   * @return hasMore
   */
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  /**
   * 
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
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
    return Objects.equals(this.data, listPaginatedFineTuningJobsResponse.data) &&
        Objects.equals(this.hasMore, listPaginatedFineTuningJobsResponse.hasMore) &&
        Objects.equals(this._object, listPaginatedFineTuningJobsResponse._object);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

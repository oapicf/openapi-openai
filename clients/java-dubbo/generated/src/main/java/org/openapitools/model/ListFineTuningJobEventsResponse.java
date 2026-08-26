package org.openapitools.model;

import org.openapitools.model.FineTuningJobEvent;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ListFineTuningJobEventsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private List<FineTuningJobEvent> data = new ArrayList<>();

  @JsonProperty("object")
  private String _object;

  /**
   * 
   * @return data
   */
  public List<FineTuningJobEvent> getData() {
    return data;
  }

  public void setData(List<FineTuningJobEvent> data) {
    this.data = data;
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
    ListFineTuningJobEventsResponse listFineTuningJobEventsResponse = (ListFineTuningJobEventsResponse) o;
    return Objects.equals(this.data, listFineTuningJobEventsResponse.data) &&
        Objects.equals(this._object, listFineTuningJobEventsResponse._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFineTuningJobEventsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

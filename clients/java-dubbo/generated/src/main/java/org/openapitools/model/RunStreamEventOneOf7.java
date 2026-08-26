package org.openapitools.model;

import org.openapitools.model.RunObject;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;cancelling&#x60; status.
 */
public class RunStreamEventOneOf7 implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("event")
  private String event;

  @JsonProperty("data")
  private RunObject data;

  /**
   * 
   * @return event
   */
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  /**
   * 
   * @return data
   */
  public RunObject getData() {
    return data;
  }

  public void setData(RunObject data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStreamEventOneOf7 runStreamEventOneOf7 = (RunStreamEventOneOf7) o;
    return Objects.equals(this.event, runStreamEventOneOf7.event) &&
        Objects.equals(this.data, runStreamEventOneOf7.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStreamEventOneOf7 {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

package org.openapitools.model;

import org.openapitools.model.RunStepObject;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is created.
 */
public class RunStepStreamEventOneOf implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("event")
  private String event;

  @JsonProperty("data")
  private RunStepObject data;

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
  public RunStepObject getData() {
    return data;
  }

  public void setData(RunStepObject data) {
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
    RunStepStreamEventOneOf runStepStreamEventOneOf = (RunStepStreamEventOneOf) o;
    return Objects.equals(this.event, runStepStreamEventOneOf.event) &&
        Objects.equals(this.data, runStepStreamEventOneOf.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepStreamEventOneOf {\n");
    
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

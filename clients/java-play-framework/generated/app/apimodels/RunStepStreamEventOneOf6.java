package apimodels;

import apimodels.RunStepObject;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepStreamEventOneOf6   {
  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_RUN_STEP_EXPIRED("thread.run.step.expired");

    private final String value;

    EventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("event")
  @NotNull

  private EventEnum event;

  @JsonProperty("data")
  @NotNull
@Valid

  private RunStepObject data;

  public RunStepStreamEventOneOf6 event(EventEnum event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  public EventEnum getEvent() {
    return event;
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }

  public RunStepStreamEventOneOf6 data(RunStepObject data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
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
    RunStepStreamEventOneOf6 runStepStreamEventOneOf6 = (RunStepStreamEventOneOf6) o;
    return Objects.equals(event, runStepStreamEventOneOf6.event) &&
        Objects.equals(data, runStepStreamEventOneOf6.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepStreamEventOneOf6 {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


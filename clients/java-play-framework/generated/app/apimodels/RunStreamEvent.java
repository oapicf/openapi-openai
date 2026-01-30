package apimodels;

import apimodels.RunObject;
import apimodels.RunStreamEventOneOf;
import apimodels.RunStreamEventOneOf1;
import apimodels.RunStreamEventOneOf2;
import apimodels.RunStreamEventOneOf3;
import apimodels.RunStreamEventOneOf4;
import apimodels.RunStreamEventOneOf5;
import apimodels.RunStreamEventOneOf6;
import apimodels.RunStreamEventOneOf7;
import apimodels.RunStreamEventOneOf8;
import apimodels.RunStreamEventOneOf9;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunStreamEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStreamEvent   {
  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_RUN_EXPIRED("thread.run.expired");

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

  private RunObject data;

  public RunStreamEvent event(EventEnum event) {
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

  public RunStreamEvent data(RunObject data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
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
    RunStreamEvent runStreamEvent = (RunStreamEvent) o;
    return Objects.equals(event, runStreamEvent.event) &&
        Objects.equals(data, runStreamEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStreamEvent {\n");
    
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ThreadObject;



/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 **/

@ApiModel(description = "Occurs when a new [thread](/docs/api-reference/threads/object) is created.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ThreadStreamEvent   {
  @JsonProperty("enabled")
  private Boolean enabled;

  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_CREATED("thread.created");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventEnum fromValue(String text) {
      for (EventEnum b : EventEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("event")
  private EventEnum event;

  @JsonProperty("data")
  private ThreadObject data;

  /**
   * Whether to enable input audio transcription.
   **/
  public ThreadStreamEvent enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to enable input audio transcription.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  public ThreadStreamEvent event(EventEnum event) {
    this.event = event;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("event")
  public EventEnum getEvent() {
    return event;
  }
  public void setEvent(EventEnum event) {
    this.event = event;
  }

  /**
   **/
  public ThreadStreamEvent data(ThreadObject data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  public ThreadObject getData() {
    return data;
  }
  public void setData(ThreadObject data) {
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
    ThreadStreamEvent threadStreamEvent = (ThreadStreamEvent) o;
    return Objects.equals(enabled, threadStreamEvent.enabled) &&
        Objects.equals(event, threadStreamEvent.event) &&
        Objects.equals(data, threadStreamEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadStreamEvent {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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


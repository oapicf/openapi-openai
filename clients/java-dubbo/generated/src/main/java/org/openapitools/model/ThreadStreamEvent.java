package org.openapitools.model;

import org.openapitools.model.ThreadObject;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */
public class ThreadStreamEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Whether to enable input audio transcription.
   */
  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("event")
  private String event;

  @JsonProperty("data")
  private ThreadObject data;

  /**
   * Whether to enable input audio transcription.
   * @return enabled
   */
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

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
    return Objects.equals(this.enabled, threadStreamEvent.enabled) &&
        Objects.equals(this.event, threadStreamEvent.event) &&
        Objects.equals(this.data, threadStreamEvent.data);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FineTuneEvent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTuneEvent {

  private String _object;

  private Integer createdAt;

  private String level;

  private String message;

  public FineTuneEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FineTuneEvent(String _object, Integer createdAt, String level, String message) {
    this._object = _object;
    this.createdAt = createdAt;
    this.level = level;
    this.message = message;
  }

  public FineTuneEvent _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public FineTuneEvent createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public FineTuneEvent level(String level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @NotNull 
  @Schema(name = "level", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public FineTuneEvent message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneEvent fineTuneEvent = (FineTuneEvent) o;
    return Objects.equals(this._object, fineTuneEvent._object) &&
        Objects.equals(this.createdAt, fineTuneEvent.createdAt) &&
        Objects.equals(this.level, fineTuneEvent.level) &&
        Objects.equals(this.message, fineTuneEvent.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, createdAt, level, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneEvent {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FineTuneEvent  {
  
  @ApiModelProperty(required = true, value = "")
  private String _object;

  @ApiModelProperty(required = true, value = "")
  private Integer createdAt;

  @ApiModelProperty(required = true, value = "")
  private String level;

  @ApiModelProperty(required = true, value = "")
  private String message;
 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public FineTuneEvent _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get createdAt
   * @return createdAt
  **/
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public FineTuneEvent createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Get level
   * @return level
  **/
  @JsonProperty("level")
  @NotNull
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public FineTuneEvent level(String level) {
    this.level = level;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  @NotNull
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FineTuneEvent message(String message) {
    this.message = message;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


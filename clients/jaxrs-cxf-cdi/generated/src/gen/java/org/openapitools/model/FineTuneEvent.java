package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class FineTuneEvent   {
  
  private String _object;

  private Integer createdAt;

  private String level;

  private String message;

  /**
   **/
  public FineTuneEvent _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }


  /**
   **/
  public FineTuneEvent createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  /**
   **/
  public FineTuneEvent level(String level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("level")
  @NotNull
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }


  /**
   **/
  public FineTuneEvent message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("message")
  @NotNull
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


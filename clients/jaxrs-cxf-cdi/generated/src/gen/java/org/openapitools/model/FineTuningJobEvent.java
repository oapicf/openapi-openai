package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Fine-tuning job event object
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Fine-tuning job event object")
public class FineTuningJobEvent   {
  

public enum ObjectEnum {

    @JsonProperty("fine_tuning.job.event") FINE_TUNING_JOB_EVENT(String.valueOf("fine_tuning.job.event"));


    private String value;

    ObjectEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ObjectEnum _object;

  private String id;

  private Integer createdAt;


public enum LevelEnum {

    @JsonProperty("info") INFO(String.valueOf("info")), @JsonProperty("warn") WARN(String.valueOf("warn")), @JsonProperty("error") ERROR(String.valueOf("error"));


    private String value;

    LevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LevelEnum fromValue(String value) {
        for (LevelEnum b : LevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private LevelEnum level;

  private String message;


public enum TypeEnum {

    @JsonProperty("message") MESSAGE(String.valueOf("message")), @JsonProperty("metrics") METRICS(String.valueOf("metrics"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TypeEnum type;

  private Object data;

  /**
   * The object type, which is always \&quot;fine_tuning.job.event\&quot;.
   **/
  public FineTuningJobEvent _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job.event\".")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  /**
   * The object identifier.
   **/
  public FineTuningJobEvent id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object identifier.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was created.
   **/
  public FineTuningJobEvent createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the fine-tuning job was created.")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * The log level of the event.
   **/
  public FineTuningJobEvent level(LevelEnum level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The log level of the event.")
  @JsonProperty("level")
  @NotNull
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  /**
   * The message of the event.
   **/
  public FineTuningJobEvent message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The message of the event.")
  @JsonProperty("message")
  @NotNull
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * The type of event.
   **/
  public FineTuningJobEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of event.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The data associated with the event.
   **/
  public FineTuningJobEvent data(Object data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "The data associated with the event.")
  @JsonProperty("data")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
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
    FineTuningJobEvent fineTuningJobEvent = (FineTuningJobEvent) o;
    return Objects.equals(this._object, fineTuningJobEvent._object) &&
        Objects.equals(this.id, fineTuningJobEvent.id) &&
        Objects.equals(this.createdAt, fineTuningJobEvent.createdAt) &&
        Objects.equals(this.level, fineTuningJobEvent.level) &&
        Objects.equals(this.message, fineTuningJobEvent.message) &&
        Objects.equals(this.type, fineTuningJobEvent.type) &&
        Objects.equals(this.data, fineTuningJobEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, createdAt, level, message, type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobEvent {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


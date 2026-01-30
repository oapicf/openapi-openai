package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Fine-tuning job event object
 */
@ApiModel(description="Fine-tuning job event object")

public class FineTuningJobEvent  {
  
public enum ObjectEnum {

    @JsonProperty("fine_tuning.job.event") FINE_TUNING_JOB_EVENT(String.valueOf("fine_tuning.job.event"));

    private String value;

    ObjectEnum (String v) {
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

 /**
  * The object type, which is always \"fine_tuning.job.event\".
  */
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job.event\".")
  private ObjectEnum _object;

 /**
  * The object identifier.
  */
  @ApiModelProperty(required = true, value = "The object identifier.")
  private String id;

 /**
  * The Unix timestamp (in seconds) for when the fine-tuning job was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the fine-tuning job was created.")
  private Integer createdAt;

public enum LevelEnum {

    @JsonProperty("info") INFO(String.valueOf("info")),
    @JsonProperty("warn") WARN(String.valueOf("warn")),
    @JsonProperty("error") ERROR(String.valueOf("error"));

    private String value;

    LevelEnum (String v) {
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

 /**
  * The log level of the event.
  */
  @ApiModelProperty(required = true, value = "The log level of the event.")
  private LevelEnum level;

 /**
  * The message of the event.
  */
  @ApiModelProperty(required = true, value = "The message of the event.")
  private String message;

public enum TypeEnum {

    @JsonProperty("message") MESSAGE(String.valueOf("message")),
    @JsonProperty("metrics") METRICS(String.valueOf("metrics"));

    private String value;

    TypeEnum (String v) {
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

 /**
  * The type of event.
  */
  @ApiModelProperty(value = "The type of event.")
  private TypeEnum type;

 /**
  * The data associated with the event.
  */
  @ApiModelProperty(value = "The data associated with the event.")
  private Object data;
 /**
  * The object type, which is always \&quot;fine_tuning.job.event\&quot;.
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public FineTuningJobEvent _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The object identifier.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public FineTuningJobEvent id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the fine-tuning job was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public FineTuningJobEvent createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The log level of the event.
  * @return level
  */
  @JsonProperty("level")
  @NotNull
  public String getLevel() {
    return level == null ? null : level.value();
  }

  /**
   * Sets the <code>level</code> property.
   */
 public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   * Sets the <code>level</code> property.
   */
  public FineTuningJobEvent level(LevelEnum level) {
    this.level = level;
    return this;
  }

 /**
  * The message of the event.
  * @return message
  */
  @JsonProperty("message")
  @NotNull
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public FineTuningJobEvent message(String message) {
    this.message = message;
    return this;
  }

 /**
  * The type of event.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public FineTuningJobEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The data associated with the event.
  * @return data
  */
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(Object data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public FineTuningJobEvent data(Object data) {
    this.data = data;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


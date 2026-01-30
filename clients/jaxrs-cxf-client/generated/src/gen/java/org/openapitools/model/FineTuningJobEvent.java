package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Fine-tuning job event object
 */
@ApiModel(description="Fine-tuning job event object")

public class FineTuningJobEvent  {
  
public enum ObjectEnum {

FINE_TUNING_JOB_EVENT(String.valueOf("fine_tuning.job.event"));


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

INFO(String.valueOf("info")), WARN(String.valueOf("warn")), ERROR(String.valueOf("error"));


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

MESSAGE(String.valueOf("message")), METRICS(String.valueOf("metrics"));


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
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public FineTuningJobEvent _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The object identifier.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FineTuningJobEvent id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public FineTuningJobEvent createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The log level of the event.
   * @return level
  **/
  @JsonProperty("level")
  public String getLevel() {
    if (level == null) {
      return null;
    }
    return level.value();
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public FineTuningJobEvent level(LevelEnum level) {
    this.level = level;
    return this;
  }

 /**
   * The message of the event.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FineTuningJobEvent message(String message) {
    this.message = message;
    return this;
  }

 /**
   * The type of event.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FineTuningJobEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The data associated with the event.
   * @return data
  **/
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

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


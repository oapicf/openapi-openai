package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Fine-tuning job event object
 **/

@ApiModel(description = "Fine-tuning job event object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningJobEvent   {
  /**
   * The object type, which is always \"fine_tuning.job.event\".
   */
  public enum ObjectEnum {
    FINE_TUNING_JOB_EVENT("fine_tuning.job.event");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("id")
  private String id;

  @JsonProperty("created_at")
  private Integer createdAt;

  /**
   * The log level of the event.
   */
  public enum LevelEnum {
    INFO("info"),
    
    WARN("warn"),
    
    ERROR("error");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LevelEnum fromValue(String text) {
      for (LevelEnum b : LevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("level")
  private LevelEnum level;

  @JsonProperty("message")
  private String message;

  /**
   * The type of event.
   */
  public enum TypeEnum {
    MESSAGE("message"),
    
    METRICS("metrics");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("data")
  private Object data;

  /**
   * The object type, which is always \"fine_tuning.job.event\".
   **/
  public FineTuningJobEvent _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job.event\".")
  @JsonProperty("object")
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
    return Objects.equals(_object, fineTuningJobEvent._object) &&
        Objects.equals(id, fineTuningJobEvent.id) &&
        Objects.equals(createdAt, fineTuningJobEvent.createdAt) &&
        Objects.equals(level, fineTuningJobEvent.level) &&
        Objects.equals(message, fineTuningJobEvent.message) &&
        Objects.equals(type, fineTuningJobEvent.type) &&
        Objects.equals(data, fineTuningJobEvent.data);
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


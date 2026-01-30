package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Fine-tuning job event object
 */
@ApiModel(description = "Fine-tuning job event object")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  public FineTuningJobEvent _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always \"fine_tuning.job.event\".
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job.event\".")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public FineTuningJobEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The object identifier.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The object identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FineTuningJobEvent createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was created.
   * @return createdAt
   */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the fine-tuning job was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public FineTuningJobEvent level(LevelEnum level) {
    this.level = level;
    return this;
  }

  /**
   * The log level of the event.
   * @return level
   */
  @ApiModelProperty(required = true, value = "The log level of the event.")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public FineTuningJobEvent message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message of the event.
   * @return message
   */
  @ApiModelProperty(required = true, value = "The message of the event.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FineTuningJobEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of event.
   * @return type
   */
  @ApiModelProperty(value = "The type of event.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FineTuningJobEvent data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * The data associated with the event.
   * @return data
   */
  @ApiModelProperty(value = "The data associated with the event.")
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


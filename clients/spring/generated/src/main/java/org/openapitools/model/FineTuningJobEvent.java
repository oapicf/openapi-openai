package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Fine-tuning job event object
 */

@Schema(name = "FineTuningJobEvent", description = "Fine-tuning job event object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningJobEvent {

  /**
   * The object type, which is always \"fine_tuning.job.event\".
   */
  public enum ObjectEnum {
    FINE_TUNING_JOB_EVENT("fine_tuning.job.event");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
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

  /**
   * The log level of the event.
   */
  public enum LevelEnum {
    INFO("info"),
    
    WARN("warn"),
    
    ERROR("error");

    private final String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
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

  /**
   * The type of event.
   */
  public enum TypeEnum {
    MESSAGE("message"),
    
    METRICS("metrics");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

  private @Nullable Object data;

  public FineTuningJobEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FineTuningJobEvent(ObjectEnum _object, String id, Integer createdAt, LevelEnum level, String message) {
    this._object = _object;
    this.id = id;
    this.createdAt = createdAt;
    this.level = level;
    this.message = message;
  }

  public FineTuningJobEvent _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always \"fine_tuning.job.event\".
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always \"fine_tuning.job.event\".", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
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
  @NotNull 
  @Schema(name = "id", description = "The object identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  @NotNull 
  @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the fine-tuning job was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
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
  @NotNull 
  @Schema(name = "level", description = "The log level of the event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
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
  @NotNull 
  @Schema(name = "message", description = "The message of the event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FineTuningJobEvent type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of event.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public FineTuningJobEvent data(@Nullable Object data) {
    this.data = data;
    return this;
  }

  /**
   * The data associated with the event.
   * @return data
   */
  
  @Schema(name = "data", description = "The data associated with the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public @Nullable Object getData() {
    return data;
  }

  public void setData(@Nullable Object data) {
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


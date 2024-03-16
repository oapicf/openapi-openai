package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FineTuneEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FineTuneEvent   {
  @JsonProperty("object")
  @NotNull

  private String _object;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("level")
  @NotNull

  private String level;

  @JsonProperty("message")
  @NotNull

  private String message;

  public FineTuneEvent _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(_object, fineTuneEvent._object) &&
        Objects.equals(createdAt, fineTuneEvent.createdAt) &&
        Objects.equals(level, fineTuneEvent.level) &&
        Objects.equals(message, fineTuneEvent.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, createdAt, level, message);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepDeltaObjectDelta;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 */

@Schema(name = "RunStepDeltaObject", description = "Represents a run step delta i.e. any changed fields on a run step during streaming. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaObject {

  private String id;

  /**
   * The object type, which is always `thread.run.step.delta`.
   */
  public enum ObjectEnum {
    THREAD_RUN_STEP_DELTA("thread.run.step.delta");

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

  private RunStepDeltaObjectDelta delta;

  public RunStepDeltaObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStepDeltaObject(String id, ObjectEnum _object, RunStepDeltaObjectDelta delta) {
    this.id = id;
    this._object = _object;
    this.delta = delta;
  }

  public RunStepDeltaObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the run step, which can be referenced in API endpoints.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The identifier of the run step, which can be referenced in API endpoints.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDeltaObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `thread.run.step.delta`.
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `thread.run.step.delta`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public RunStepDeltaObject delta(RunStepDeltaObjectDelta delta) {
    this.delta = delta;
    return this;
  }

  /**
   * Get delta
   * @return delta
   */
  @NotNull @Valid 
  @Schema(name = "delta", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("delta")
  public RunStepDeltaObjectDelta getDelta() {
    return delta;
  }

  public void setDelta(RunStepDeltaObjectDelta delta) {
    this.delta = delta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaObject runStepDeltaObject = (RunStepDeltaObject) o;
    return Objects.equals(this.id, runStepDeltaObject.id) &&
        Objects.equals(this._object, runStepDeltaObject._object) &&
        Objects.equals(this.delta, runStepDeltaObject.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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


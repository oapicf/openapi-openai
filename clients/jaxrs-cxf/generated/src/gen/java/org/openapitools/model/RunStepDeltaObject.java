package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.RunStepDeltaObjectDelta;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 **/
@ApiModel(description="Represents a run step delta i.e. any changed fields on a run step during streaming. ")

public class RunStepDeltaObject  {
  
  @ApiModelProperty(required = true, value = "The identifier of the run step, which can be referenced in API endpoints.")
 /**
   * The identifier of the run step, which can be referenced in API endpoints.
  **/
  private String id;

public enum ObjectEnum {

THREAD_RUN_STEP_DELTA(String.valueOf("thread.run.step.delta"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(required = true, value = "The object type, which is always `thread.run.step.delta`.")
 /**
   * The object type, which is always `thread.run.step.delta`.
  **/
  private ObjectEnum _object;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepDeltaObjectDelta delta;
 /**
   * The identifier of the run step, which can be referenced in API endpoints.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDeltaObject id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The object type, which is always &#x60;thread.run.step.delta&#x60;.
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public RunStepDeltaObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get delta
   * @return delta
  **/
  @JsonProperty("delta")
  @NotNull
  public RunStepDeltaObjectDelta getDelta() {
    return delta;
  }

  public void setDelta(RunStepDeltaObjectDelta delta) {
    this.delta = delta;
  }

  public RunStepDeltaObject delta(RunStepDeltaObjectDelta delta) {
    this.delta = delta;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


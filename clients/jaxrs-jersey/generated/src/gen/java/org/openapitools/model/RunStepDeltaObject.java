/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaObjectDelta;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 */
@ApiModel(description = "Represents a run step delta i.e. any changed fields on a run step during streaming. ")
@JsonPropertyOrder({
  RunStepDeltaObject.JSON_PROPERTY_ID,
  RunStepDeltaObject.JSON_PROPERTY_OBJECT,
  RunStepDeltaObject.JSON_PROPERTY_DELTA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepDeltaObject   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  /**
   * The object type, which is always &#x60;thread.run.step.delta&#x60;.
   */
  public enum ObjectEnum {
    THREAD_RUN_STEP_DELTA("thread.run.step.delta");

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
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OBJECT = "object";
  @JsonProperty(JSON_PROPERTY_OBJECT)
  private ObjectEnum _object;

  public static final String JSON_PROPERTY_DELTA = "delta";
  @JsonProperty(JSON_PROPERTY_DELTA)
  private RunStepDeltaObjectDelta delta;

  public RunStepDeltaObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the run step, which can be referenced in API endpoints.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(required = true, value = "The identifier of the run step, which can be referenced in API endpoints.")
  @NotNull 
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
   * The object type, which is always &#x60;thread.run.step.delta&#x60;.
   * @return _object
   **/
  @JsonProperty(value = "object")
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.run.step.delta`.")
  @NotNull 
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
   **/
  @JsonProperty(value = "delta")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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


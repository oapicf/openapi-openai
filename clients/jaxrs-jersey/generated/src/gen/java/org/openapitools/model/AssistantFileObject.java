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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
 */
@ApiModel(description = "A list of [Files](/docs/api-reference/files) attached to an `assistant`.")
@JsonPropertyOrder({
  AssistantFileObject.JSON_PROPERTY_ID,
  AssistantFileObject.JSON_PROPERTY_OBJECT,
  AssistantFileObject.JSON_PROPERTY_CREATED_AT,
  AssistantFileObject.JSON_PROPERTY_ASSISTANT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AssistantFileObject   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  /**
   * The object type, which is always &#x60;assistant.file&#x60;.
   */
  public enum ObjectEnum {
    ASSISTANT_FILE("assistant.file");

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

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  private Integer createdAt;

  public static final String JSON_PROPERTY_ASSISTANT_ID = "assistant_id";
  @JsonProperty(JSON_PROPERTY_ASSISTANT_ID)
  private String assistantId;

  public AssistantFileObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @NotNull 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssistantFileObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always &#x60;assistant.file&#x60;.
   * @return _object
   **/
  @JsonProperty(value = "object")
  @ApiModelProperty(required = true, value = "The object type, which is always `assistant.file`.")
  @NotNull 
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public AssistantFileObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the assistant file was created.
   * @return createdAt
   **/
  @JsonProperty(value = "created_at")
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the assistant file was created.")
  @NotNull 
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public AssistantFileObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

  /**
   * The assistant ID that the file is attached to.
   * @return assistantId
   **/
  @JsonProperty(value = "assistant_id")
  @ApiModelProperty(required = true, value = "The assistant ID that the file is attached to.")
  @NotNull 
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantFileObject assistantFileObject = (AssistantFileObject) o;
    return Objects.equals(this.id, assistantFileObject.id) &&
        Objects.equals(this._object, assistantFileObject._object) &&
        Objects.equals(this.createdAt, assistantFileObject.createdAt) &&
        Objects.equals(this.assistantId, assistantFileObject.assistantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, assistantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantFileObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
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


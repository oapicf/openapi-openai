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
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 */
@ApiModel(description = "Represents a thread that contains [messages](/docs/api-reference/messages).")
@JsonPropertyOrder({
  ThreadObject.JSON_PROPERTY_ID,
  ThreadObject.JSON_PROPERTY_OBJECT,
  ThreadObject.JSON_PROPERTY_CREATED_AT,
  ThreadObject.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ThreadObject   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  /**
   * The object type, which is always &#x60;thread&#x60;.
   */
  public enum ObjectEnum {
    THREAD("thread");

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

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @JsonProperty(JSON_PROPERTY_METADATA)
  private Object metadata;

  public ThreadObject id(String id) {
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

  public ThreadObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always &#x60;thread&#x60;.
   * @return _object
   **/
  @JsonProperty(value = "object")
  @ApiModelProperty(required = true, value = "The object type, which is always `thread`.")
  @NotNull 
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ThreadObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the thread was created.
   * @return createdAt
   **/
  @JsonProperty(value = "created_at")
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the thread was created.")
  @NotNull 
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public ThreadObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
   **/
  @JsonProperty(value = "metadata")
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  @NotNull 
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreadObject threadObject = (ThreadObject) o;
    return Objects.equals(this.id, threadObject.id) &&
        Objects.equals(this._object, threadObject._object) &&
        Objects.equals(this.createdAt, threadObject.createdAt) &&
        Objects.equals(this.metadata, threadObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


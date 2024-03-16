/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateChatCompletionResponseChoicesInner;
import org.openapitools.model.CreateCompletionResponseUsage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CreateChatCompletionResponse
 */
@JsonPropertyOrder({
  CreateChatCompletionResponse.JSON_PROPERTY_ID,
  CreateChatCompletionResponse.JSON_PROPERTY_OBJECT,
  CreateChatCompletionResponse.JSON_PROPERTY_CREATED,
  CreateChatCompletionResponse.JSON_PROPERTY_MODEL,
  CreateChatCompletionResponse.JSON_PROPERTY_CHOICES,
  CreateChatCompletionResponse.JSON_PROPERTY_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionResponse   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  @JsonProperty(JSON_PROPERTY_OBJECT)
  private String _object;

  public static final String JSON_PROPERTY_CREATED = "created";
  @JsonProperty(JSON_PROPERTY_CREATED)
  private Integer created;

  public static final String JSON_PROPERTY_MODEL = "model";
  @JsonProperty(JSON_PROPERTY_MODEL)
  private String model;

  public static final String JSON_PROPERTY_CHOICES = "choices";
  @JsonProperty(JSON_PROPERTY_CHOICES)
  private List<@Valid CreateChatCompletionResponseChoicesInner> choices = new ArrayList<>();

  public static final String JSON_PROPERTY_USAGE = "usage";
  @JsonProperty(JSON_PROPERTY_USAGE)
  private CreateCompletionResponseUsage usage;

  public CreateChatCompletionResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateChatCompletionResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   **/
  @JsonProperty(value = "object")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public CreateChatCompletionResponse created(Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @JsonProperty(value = "created")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateChatCompletionResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
  @JsonProperty(value = "model")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionResponse choices(List<@Valid CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionResponse addChoicesItem(CreateChatCompletionResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * Get choices
   * @return choices
   **/
  @JsonProperty(value = "choices")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public List<@Valid CreateChatCompletionResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<@Valid CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionResponse usage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   **/
  @JsonProperty(value = "usage")
  @ApiModelProperty(value = "")
  @Valid 
  public CreateCompletionResponseUsage getUsage() {
    return usage;
  }

  public void setUsage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionResponse createChatCompletionResponse = (CreateChatCompletionResponse) o;
    return Objects.equals(this.id, createChatCompletionResponse.id) &&
        Objects.equals(this._object, createChatCompletionResponse._object) &&
        Objects.equals(this.created, createChatCompletionResponse.created) &&
        Objects.equals(this.model, createChatCompletionResponse.model) &&
        Objects.equals(this.choices, createChatCompletionResponse.choices) &&
        Objects.equals(this.usage, createChatCompletionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, created, model, choices, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateChatCompletionResponseChoicesInner;
import org.openapitools.model.CreateCompletionResponseUsage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateChatCompletionResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private String id;

  @ApiModelProperty(required = true, value = "")
  private String _object;

  @ApiModelProperty(required = true, value = "")
  private Integer created;

  @ApiModelProperty(required = true, value = "")
  private String model;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid CreateChatCompletionResponseChoicesInner> choices = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private CreateCompletionResponseUsage usage;
 /**
   * Get id
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

  public CreateChatCompletionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public CreateChatCompletionResponse _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  @NotNull
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateChatCompletionResponse created(Integer created) {
    this.created = created;
    return this;
  }

 /**
   * Get model
   * @return model
  **/
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionResponse model(String model) {
    this.model = model;
    return this;
  }

 /**
   * Get choices
   * @return choices
  **/
  @JsonProperty("choices")
  @NotNull
  public List<@Valid CreateChatCompletionResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<@Valid CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionResponse choices(List<@Valid CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionResponse addChoicesItem(CreateChatCompletionResponseChoicesInner choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

 /**
   * Get usage
   * @return usage
  **/
  @JsonProperty("usage")
  public CreateCompletionResponseUsage getUsage() {
    return usage;
  }

  public void setUsage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
  }

  public CreateChatCompletionResponse usage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


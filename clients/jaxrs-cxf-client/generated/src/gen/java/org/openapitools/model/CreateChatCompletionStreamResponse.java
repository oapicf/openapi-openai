package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateChatCompletionStreamResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private String id;

  @ApiModelProperty(required = true, value = "")
  private String _object;

  @ApiModelProperty(required = true, value = "")
  private Integer created;

  @ApiModelProperty(required = true, value = "")
  private String model;

  @ApiModelProperty(required = true, value = "")
  private List<CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public CreateChatCompletionStreamResponse _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateChatCompletionStreamResponse created(Integer created) {
    this.created = created;
    return this;
  }

 /**
   * Get model
   * @return model
  **/
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionStreamResponse model(String model) {
    this.model = model;
    return this;
  }

 /**
   * Get choices
   * @return choices
  **/
  @JsonProperty("choices")
  public List<CreateChatCompletionStreamResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionStreamResponse choices(List<CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionStreamResponse addChoicesItem(CreateChatCompletionStreamResponseChoicesInner choicesItem) {
    this.choices.add(choicesItem);
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
    CreateChatCompletionStreamResponse createChatCompletionStreamResponse = (CreateChatCompletionStreamResponse) o;
    return Objects.equals(this.id, createChatCompletionStreamResponse.id) &&
        Objects.equals(this._object, createChatCompletionStreamResponse._object) &&
        Objects.equals(this.created, createChatCompletionStreamResponse.created) &&
        Objects.equals(this.model, createChatCompletionStreamResponse.model) &&
        Objects.equals(this.choices, createChatCompletionStreamResponse.choices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, created, model, choices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionStreamResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
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


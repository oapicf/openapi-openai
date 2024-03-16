package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateChatCompletionStreamResponse   {
  
  private String id;

  private String _object;

  private Integer created;

  private String model;

  private List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();

  /**
   **/
  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public CreateChatCompletionStreamResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }


  /**
   **/
  public CreateChatCompletionStreamResponse created(Integer created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("created")
  @NotNull
  public Integer getCreated() {
    return created;
  }
  public void setCreated(Integer created) {
    this.created = created;
  }


  /**
   **/
  public CreateChatCompletionStreamResponse model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }


  /**
   **/
  public CreateChatCompletionStreamResponse choices(List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("choices")
  @NotNull
  public List<@Valid CreateChatCompletionStreamResponseChoicesInner> getChoices() {
    return choices;
  }
  public void setChoices(List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionStreamResponse addChoicesItem(CreateChatCompletionStreamResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


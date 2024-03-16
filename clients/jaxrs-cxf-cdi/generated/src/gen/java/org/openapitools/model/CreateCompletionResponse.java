package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateCompletionResponseChoicesInner;
import org.openapitools.model.CreateCompletionResponseUsage;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateCompletionResponse   {
  
  private String id;

  private String _object;

  private Integer created;

  private String model;

  private List<@Valid CreateCompletionResponseChoicesInner> choices = new ArrayList<>();

  private CreateCompletionResponseUsage usage;

  /**
   **/
  public CreateCompletionResponse id(String id) {
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
  public CreateCompletionResponse _object(String _object) {
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
  public CreateCompletionResponse created(Integer created) {
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
  public CreateCompletionResponse model(String model) {
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
  public CreateCompletionResponse choices(List<@Valid CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("choices")
  @NotNull
  public List<@Valid CreateCompletionResponseChoicesInner> getChoices() {
    return choices;
  }
  public void setChoices(List<@Valid CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateCompletionResponse addChoicesItem(CreateCompletionResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }


  /**
   **/
  public CreateCompletionResponse usage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usage")
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
    CreateCompletionResponse createCompletionResponse = (CreateCompletionResponse) o;
    return Objects.equals(this.id, createCompletionResponse.id) &&
        Objects.equals(this._object, createCompletionResponse._object) &&
        Objects.equals(this.created, createCompletionResponse.created) &&
        Objects.equals(this.model, createCompletionResponse.model) &&
        Objects.equals(this.choices, createCompletionResponse.choices) &&
        Objects.equals(this.usage, createCompletionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, created, model, choices, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponse {\n");
    
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


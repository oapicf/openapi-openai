package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CreateCompletionResponseChoicesInner;
import com.prokarma.pkmst.model.CreateCompletionResponseUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateCompletionResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-16T01:12:49.513446343Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateCompletionResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("object")
  private String _object;

  @JsonProperty("created")
  private Integer created;

  @JsonProperty("model")
  private String model;

  @JsonProperty("choices")
  
  private List<CreateCompletionResponseChoicesInner> choices = new ArrayList<>();

  @JsonProperty("usage")
  private CreateCompletionResponseUsage usage;

  public CreateCompletionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateCompletionResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public CreateCompletionResponse created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateCompletionResponse model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateCompletionResponse choices(List<CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateCompletionResponse addChoicesItem(CreateCompletionResponseChoicesInner choicesItem) {
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
  @ApiModelProperty(required = true, value = "")
  public List<CreateCompletionResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateCompletionResponse usage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
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


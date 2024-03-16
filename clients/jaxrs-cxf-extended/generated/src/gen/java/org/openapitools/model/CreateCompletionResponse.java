package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateCompletionResponseChoicesInner;
import org.openapitools.model.CreateCompletionResponseUsage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateCompletionResponse  {
  
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
  private List<@Valid CreateCompletionResponseChoicesInner> choices = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private CreateCompletionResponseUsage usage;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CreateCompletionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get _object
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public CreateCompletionResponse _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get created
  * @return created
  */
  @JsonProperty("created")
  @NotNull
  public Integer getCreated() {
    return created;
  }

  /**
   * Sets the <code>created</code> property.
   */
 public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * Sets the <code>created</code> property.
   */
  public CreateCompletionResponse created(Integer created) {
    this.created = created;
    return this;
  }

 /**
  * Get model
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateCompletionResponse model(String model) {
    this.model = model;
    return this;
  }

 /**
  * Get choices
  * @return choices
  */
  @JsonProperty("choices")
  @NotNull
  public List<@Valid CreateCompletionResponseChoicesInner> getChoices() {
    return choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
 public void setChoices(List<@Valid CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
  public CreateCompletionResponse choices(List<@Valid CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  /**
   * Adds a new item to the <code>choices</code> list.
   */
  public CreateCompletionResponse addChoicesItem(CreateCompletionResponseChoicesInner choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

 /**
  * Get usage
  * @return usage
  */
  @JsonProperty("usage")
  public CreateCompletionResponseUsage getUsage() {
    return usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
 public void setUsage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
  public CreateCompletionResponse usage(CreateCompletionResponseUsage usage) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


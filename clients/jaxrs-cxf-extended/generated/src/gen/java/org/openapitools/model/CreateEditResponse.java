package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateCompletionResponseUsage;
import org.openapitools.model.CreateEditResponseChoicesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEditResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private String _object;

  @ApiModelProperty(required = true, value = "")
  private Integer created;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid CreateEditResponseChoicesInner> choices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateCompletionResponseUsage usage;
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
  public CreateEditResponse _object(String _object) {
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
  public CreateEditResponse created(Integer created) {
    this.created = created;
    return this;
  }

 /**
  * Get choices
  * @return choices
  */
  @JsonProperty("choices")
  @NotNull
  public List<@Valid CreateEditResponseChoicesInner> getChoices() {
    return choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
 public void setChoices(List<@Valid CreateEditResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
  public CreateEditResponse choices(List<@Valid CreateEditResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  /**
   * Adds a new item to the <code>choices</code> list.
   */
  public CreateEditResponse addChoicesItem(CreateEditResponseChoicesInner choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

 /**
  * Get usage
  * @return usage
  */
  @JsonProperty("usage")
  @NotNull
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
  public CreateEditResponse usage(CreateCompletionResponseUsage usage) {
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
    CreateEditResponse createEditResponse = (CreateEditResponse) o;
    return Objects.equals(this._object, createEditResponse._object) &&
        Objects.equals(this.created, createEditResponse.created) &&
        Objects.equals(this.choices, createEditResponse.choices) &&
        Objects.equals(this.usage, createEditResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, created, choices, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEditResponse {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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


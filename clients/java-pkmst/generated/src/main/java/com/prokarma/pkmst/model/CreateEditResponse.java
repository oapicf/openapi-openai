package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CreateCompletionResponseUsage;
import com.prokarma.pkmst.model.CreateEditResponseChoicesInner;
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
 * CreateEditResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-16T01:12:49.513446343Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEditResponse   {
  @JsonProperty("object")
  private String _object;

  @JsonProperty("created")
  private Integer created;

  @JsonProperty("choices")
  
  private List<CreateEditResponseChoicesInner> choices = new ArrayList<>();

  @JsonProperty("usage")
  private CreateCompletionResponseUsage usage;

  public CreateEditResponse _object(String _object) {
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

  public CreateEditResponse created(Integer created) {
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

  public CreateEditResponse choices(List<CreateEditResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateEditResponse addChoicesItem(CreateEditResponseChoicesInner choicesItem) {
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
  public List<CreateEditResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<CreateEditResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateEditResponse usage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(required = true, value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateCompletionResponseUsage;
import org.openapitools.model.CreateEditResponseChoicesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateEditResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEditResponse   {
  private @Valid String _object;
  private @Valid Integer created;
  private @Valid List<@Valid CreateEditResponseChoicesInner> choices = new ArrayList<>();
  private @Valid CreateCompletionResponseUsage usage;

  /**
   **/
  public CreateEditResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  public CreateEditResponse created(Integer created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("created")
  @NotNull
  public Integer getCreated() {
    return created;
  }

  @JsonProperty("created")
  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   **/
  public CreateEditResponse choices(List<@Valid CreateEditResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("choices")
  @NotNull
  public List<CreateEditResponseChoicesInner> getChoices() {
    return choices;
  }

  @JsonProperty("choices")
  public void setChoices(List<@Valid CreateEditResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateEditResponse addChoicesItem(CreateEditResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }

    this.choices.add(choicesItem);
    return this;
  }

  public CreateEditResponse removeChoicesItem(CreateEditResponseChoicesInner choicesItem) {
    if (choicesItem != null && this.choices != null) {
      this.choices.remove(choicesItem);
    }

    return this;
  }
  /**
   **/
  public CreateEditResponse usage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("usage")
  @NotNull
  public CreateCompletionResponseUsage getUsage() {
    return usage;
  }

  @JsonProperty("usage")
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateCompletionResponseUsage;
import org.openapitools.model.CreateEditResponseChoicesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateEditResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-16T01:13:12.257183065Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEditResponse {

  private String _object;

  private Integer created;

  @Valid
  private List<@Valid CreateEditResponseChoicesInner> choices = new ArrayList<>();

  private CreateCompletionResponseUsage usage;

  public CreateEditResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateEditResponse(String _object, Integer created, List<@Valid CreateEditResponseChoicesInner> choices, CreateCompletionResponseUsage usage) {
    this._object = _object;
    this.created = created;
    this.choices = choices;
    this.usage = usage;
  }

  public CreateEditResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
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
  */
  @NotNull 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateEditResponse choices(List<@Valid CreateEditResponseChoicesInner> choices) {
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
  */
  @NotNull @Valid 
  @Schema(name = "choices", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("choices")
  public List<@Valid CreateEditResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<@Valid CreateEditResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateEditResponse usage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
  */
  @NotNull @Valid 
  @Schema(name = "usage", requiredMode = Schema.RequiredMode.REQUIRED)
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


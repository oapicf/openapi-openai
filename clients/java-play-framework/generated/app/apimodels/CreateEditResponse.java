package apimodels;

import apimodels.CreateCompletionResponseUsage;
import apimodels.CreateEditResponseChoicesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateEditResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateEditResponse   {
  @JsonProperty("object")
  @NotNull

  private String _object;

  @JsonProperty("created")
  @NotNull

  private Integer created;

  @JsonProperty("choices")
  @NotNull
@Valid

  private List<@Valid CreateEditResponseChoicesInner> choices = new ArrayList<>();

  @JsonProperty("usage")
  @NotNull
@Valid

  private CreateCompletionResponseUsage usage;

  public CreateEditResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
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
  **/
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
  **/
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
    return Objects.equals(_object, createEditResponse._object) &&
        Objects.equals(created, createEditResponse.created) &&
        Objects.equals(choices, createEditResponse.choices) &&
        Objects.equals(usage, createEditResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, created, choices, usage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


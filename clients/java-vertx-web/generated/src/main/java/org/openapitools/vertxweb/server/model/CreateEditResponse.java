package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CreateCompletionResponseUsage;
import org.openapitools.vertxweb.server.model.CreateEditResponseChoicesInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEditResponse   {
  
  private String _object;
  private Integer created;
  private List<CreateEditResponseChoicesInner> choices = new ArrayList<>();
  private CreateCompletionResponseUsage usage;

  public CreateEditResponse () {

  }

  public CreateEditResponse (String _object, Integer created, List<CreateEditResponseChoicesInner> choices, CreateCompletionResponseUsage usage) {
    this._object = _object;
    this.created = created;
    this.choices = choices;
    this.usage = usage;
  }

    
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

    
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }
  public void setCreated(Integer created) {
    this.created = created;
  }

    
  @JsonProperty("choices")
  public List<CreateEditResponseChoicesInner> getChoices() {
    return choices;
  }
  public void setChoices(List<CreateEditResponseChoicesInner> choices) {
    this.choices = choices;
  }

    
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
    return Objects.equals(_object, createEditResponse._object) &&
        Objects.equals(created, createEditResponse.created) &&
        Objects.equals(choices, createEditResponse.choices) &&
        Objects.equals(usage, createEditResponse.usage);
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

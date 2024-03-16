package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CreateCompletionResponseChoicesInner;
import org.openapitools.server.api.model.CreateCompletionResponseUsage;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCompletionResponse   {
  
  private String id;
  private String _object;
  private Integer created;
  private String model;
  private List<CreateCompletionResponseChoicesInner> choices = new ArrayList<>();
  private CreateCompletionResponseUsage usage;

  public CreateCompletionResponse () {

  }

  public CreateCompletionResponse (String id, String _object, Integer created, String model, List<CreateCompletionResponseChoicesInner> choices, CreateCompletionResponseUsage usage) {
    this.id = id;
    this._object = _object;
    this.created = created;
    this.model = model;
    this.choices = choices;
    this.usage = usage;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("choices")
  public List<CreateCompletionResponseChoicesInner> getChoices() {
    return choices;
  }
  public void setChoices(List<CreateCompletionResponseChoicesInner> choices) {
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
    CreateCompletionResponse createCompletionResponse = (CreateCompletionResponse) o;
    return Objects.equals(id, createCompletionResponse.id) &&
        Objects.equals(_object, createCompletionResponse._object) &&
        Objects.equals(created, createCompletionResponse.created) &&
        Objects.equals(model, createCompletionResponse.model) &&
        Objects.equals(choices, createCompletionResponse.choices) &&
        Objects.equals(usage, createCompletionResponse.usage);
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

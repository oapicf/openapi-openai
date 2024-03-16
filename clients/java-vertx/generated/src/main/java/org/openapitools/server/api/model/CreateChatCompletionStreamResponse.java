package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CreateChatCompletionStreamResponseChoicesInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionStreamResponse   {
  
  private String id;
  private String _object;
  private Integer created;
  private String model;
  private List<CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();

  public CreateChatCompletionStreamResponse () {

  }

  public CreateChatCompletionStreamResponse (String id, String _object, Integer created, String model, List<CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.id = id;
    this._object = _object;
    this.created = created;
    this.model = model;
    this.choices = choices;
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
  public List<CreateChatCompletionStreamResponseChoicesInner> getChoices() {
    return choices;
  }
  public void setChoices(List<CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionStreamResponse createChatCompletionStreamResponse = (CreateChatCompletionStreamResponse) o;
    return Objects.equals(id, createChatCompletionStreamResponse.id) &&
        Objects.equals(_object, createChatCompletionStreamResponse._object) &&
        Objects.equals(created, createChatCompletionStreamResponse.created) &&
        Objects.equals(model, createChatCompletionStreamResponse.model) &&
        Objects.equals(choices, createChatCompletionStreamResponse.choices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, created, model, choices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionStreamResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
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

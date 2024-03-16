package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-16T01:12:27.532392463Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionStreamResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("object")
  private String _object;

  @JsonProperty("created")
  private Integer created;

  @JsonProperty("model")
  private String model;

  @JsonProperty("choices")
  private List<CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();

  /**
   **/
  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public CreateChatCompletionStreamResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  public CreateChatCompletionStreamResponse created(Integer created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }
  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   **/
  public CreateChatCompletionStreamResponse model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   **/
  public CreateChatCompletionStreamResponse choices(List<CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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


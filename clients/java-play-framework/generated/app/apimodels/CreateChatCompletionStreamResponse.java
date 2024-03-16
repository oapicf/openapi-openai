package apimodels;

import apimodels.CreateChatCompletionStreamResponseChoicesInner;
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
 * CreateChatCompletionStreamResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateChatCompletionStreamResponse   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("object")
  @NotNull

  private String _object;

  @JsonProperty("created")
  @NotNull

  private Integer created;

  @JsonProperty("model")
  @NotNull

  private String model;

  @JsonProperty("choices")
  @NotNull
@Valid

  private List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();

  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateChatCompletionStreamResponse _object(String _object) {
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

  public CreateChatCompletionStreamResponse created(Integer created) {
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

  public CreateChatCompletionStreamResponse model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionStreamResponse choices(List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionStreamResponse addChoicesItem(CreateChatCompletionStreamResponseChoicesInner choicesItem) {
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
  public List<@Valid CreateChatCompletionStreamResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


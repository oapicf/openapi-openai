package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateChatCompletionStreamResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-16T01:13:12.257183065Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionStreamResponse {

  private String id;

  private String _object;

  private Integer created;

  private String model;

  @Valid
  private List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();

  public CreateChatCompletionStreamResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatCompletionStreamResponse(String id, String _object, Integer created, String model, List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.id = id;
    this._object = _object;
    this.created = created;
    this.model = model;
    this.choices = choices;
  }

  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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

  public CreateChatCompletionStreamResponse created(Integer created) {
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

  public CreateChatCompletionStreamResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @NotNull 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
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
  */
  @NotNull @Valid 
  @Schema(name = "choices", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("choices")
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
    return Objects.equals(this.id, createChatCompletionStreamResponse.id) &&
        Objects.equals(this._object, createChatCompletionStreamResponse._object) &&
        Objects.equals(this.created, createChatCompletionStreamResponse.created) &&
        Objects.equals(this.model, createChatCompletionStreamResponse.model) &&
        Objects.equals(this.choices, createChatCompletionStreamResponse.choices);
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


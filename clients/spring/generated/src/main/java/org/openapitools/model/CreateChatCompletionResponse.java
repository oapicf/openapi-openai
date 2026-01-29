package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateChatCompletionResponseChoicesInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 */

@Schema(name = "CreateChatCompletionResponse", description = "Represents a chat completion response returned by model, based on the provided input.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionResponse {

  private String id;

  @Valid
  private List<@Valid CreateChatCompletionResponseChoicesInner> choices = new ArrayList<>();

  private Integer created;

  private String model;

  private @Nullable String systemFingerprint;

  /**
   * The object type, which is always `chat.completion`.
   */
  public enum ObjectEnum {
    CHAT_COMPLETION("chat.completion");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ObjectEnum _object;

  private @Nullable CompletionUsage usage;

  public CreateChatCompletionResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatCompletionResponse(String id, List<@Valid CreateChatCompletionResponseChoicesInner> choices, Integer created, String model, ObjectEnum _object) {
    this.id = id;
    this.choices = choices;
    this.created = created;
    this.model = model;
    this._object = _object;
  }

  public CreateChatCompletionResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the chat completion.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "A unique identifier for the chat completion.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateChatCompletionResponse choices(List<@Valid CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionResponse addChoicesItem(CreateChatCompletionResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * A list of chat completion choices. Can be more than one if `n` is greater than 1.
   * @return choices
   */
  @NotNull @Valid 
  @Schema(name = "choices", description = "A list of chat completion choices. Can be more than one if `n` is greater than 1.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("choices")
  public List<@Valid CreateChatCompletionResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<@Valid CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionResponse created(Integer created) {
    this.created = created;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the chat completion was created.
   * @return created
   */
  @NotNull 
  @Schema(name = "created", description = "The Unix timestamp (in seconds) of when the chat completion was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateChatCompletionResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * The model used for the chat completion.
   * @return model
   */
  @NotNull 
  @Schema(name = "model", description = "The model used for the chat completion.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionResponse systemFingerprint(@Nullable String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

  /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
   * @return systemFingerprint
   */
  
  @Schema(name = "system_fingerprint", description = "This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("system_fingerprint")
  public @Nullable String getSystemFingerprint() {
    return systemFingerprint;
  }

  public void setSystemFingerprint(@Nullable String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  public CreateChatCompletionResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `chat.completion`.
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `chat.completion`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public CreateChatCompletionResponse usage(@Nullable CompletionUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @Valid 
  @Schema(name = "usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public @Nullable CompletionUsage getUsage() {
    return usage;
  }

  public void setUsage(@Nullable CompletionUsage usage) {
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
    CreateChatCompletionResponse createChatCompletionResponse = (CreateChatCompletionResponse) o;
    return Objects.equals(this.id, createChatCompletionResponse.id) &&
        Objects.equals(this.choices, createChatCompletionResponse.choices) &&
        Objects.equals(this.created, createChatCompletionResponse.created) &&
        Objects.equals(this.model, createChatCompletionResponse.model) &&
        Objects.equals(this.systemFingerprint, createChatCompletionResponse.systemFingerprint) &&
        Objects.equals(this._object, createChatCompletionResponse._object) &&
        Objects.equals(this.usage, createChatCompletionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, systemFingerprint, _object, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    systemFingerprint: ").append(toIndentedString(systemFingerprint)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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


package apimodels;

import apimodels.CompletionUsage;
import apimodels.CreateChatCompletionFunctionResponseChoicesInner;
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
 * Represents a chat completion response returned by model, based on the provided input.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateChatCompletionFunctionResponse   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("choices")
  @NotNull
@Valid

  private List<@Valid CreateChatCompletionFunctionResponseChoicesInner> choices = new ArrayList<>();

  @JsonProperty("created")
  @NotNull

  private Integer created;

  @JsonProperty("model")
  @NotNull

  private String model;

  @JsonProperty("system_fingerprint")
  
  private String systemFingerprint;

  /**
   * The object type, which is always `chat.completion`.
   */
  public enum ObjectEnum {
    CHAT_COMPLETION("chat.completion");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  @JsonProperty("usage")
  @Valid

  private CompletionUsage usage;

  public CreateChatCompletionFunctionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the chat completion.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateChatCompletionFunctionResponse choices(List<@Valid CreateChatCompletionFunctionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionFunctionResponse addChoicesItem(CreateChatCompletionFunctionResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

   /**
   * A list of chat completion choices. Can be more than one if `n` is greater than 1.
   * @return choices
  **/
  public List<@Valid CreateChatCompletionFunctionResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<@Valid CreateChatCompletionFunctionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionFunctionResponse created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) of when the chat completion was created.
   * @return created
  **/
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateChatCompletionFunctionResponse model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model used for the chat completion.
   * @return model
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionFunctionResponse systemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

   /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
   * @return systemFingerprint
  **/
  public String getSystemFingerprint() {
    return systemFingerprint;
  }

  public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  public CreateChatCompletionFunctionResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `chat.completion`.
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public CreateChatCompletionFunctionResponse usage(CompletionUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  public CompletionUsage getUsage() {
    return usage;
  }

  public void setUsage(CompletionUsage usage) {
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
    CreateChatCompletionFunctionResponse createChatCompletionFunctionResponse = (CreateChatCompletionFunctionResponse) o;
    return Objects.equals(id, createChatCompletionFunctionResponse.id) &&
        Objects.equals(choices, createChatCompletionFunctionResponse.choices) &&
        Objects.equals(created, createChatCompletionFunctionResponse.created) &&
        Objects.equals(model, createChatCompletionFunctionResponse.model) &&
        Objects.equals(systemFingerprint, createChatCompletionFunctionResponse.systemFingerprint) &&
        Objects.equals(_object, createChatCompletionFunctionResponse._object) &&
        Objects.equals(usage, createChatCompletionFunctionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, systemFingerprint, _object, usage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionFunctionResponse {\n");
    
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


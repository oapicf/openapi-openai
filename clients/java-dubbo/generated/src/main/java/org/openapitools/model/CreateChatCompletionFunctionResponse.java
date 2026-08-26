package org.openapitools.model;

import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateChatCompletionFunctionResponseChoicesInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents a chat completion response returned by model, based on the provided input.
 */
public class CreateChatCompletionFunctionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A unique identifier for the chat completion.
   */
  @JsonProperty("id")
  private String id;

  /**
   * A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
   */
  @JsonProperty("choices")
  private List<CreateChatCompletionFunctionResponseChoicesInner> choices = new ArrayList<>();

  /**
   * The Unix timestamp (in seconds) of when the chat completion was created.
   */
  @JsonProperty("created")
  private Integer created;

  /**
   * The model used for the chat completion.
   */
  @JsonProperty("model")
  private String model;

  /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
   */
  @JsonProperty("system_fingerprint")
  private String systemFingerprint;

  /**
   * The object type, which is always &#x60;chat.completion&#x60;.
   */
  @JsonProperty("object")
  private String _object;

  @JsonProperty("usage")
  private CompletionUsage usage;

  /**
   * A unique identifier for the chat completion.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
   * @return choices
   */
  public List<CreateChatCompletionFunctionResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<CreateChatCompletionFunctionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   * The Unix timestamp (in seconds) of when the chat completion was created.
   * @return created
   */
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * The model used for the chat completion.
   * @return model
   */
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
   * @return systemFingerprint
   */
  public String getSystemFingerprint() {
    return systemFingerprint;
  }

  public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  /**
   * The object type, which is always &#x60;chat.completion&#x60;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * 
   * @return usage
   */
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
    return Objects.equals(this.id, createChatCompletionFunctionResponse.id) &&
        Objects.equals(this.choices, createChatCompletionFunctionResponse.choices) &&
        Objects.equals(this.created, createChatCompletionFunctionResponse.created) &&
        Objects.equals(this.model, createChatCompletionFunctionResponse.model) &&
        Objects.equals(this.systemFingerprint, createChatCompletionFunctionResponse.systemFingerprint) &&
        Objects.equals(this._object, createChatCompletionFunctionResponse._object) &&
        Objects.equals(this.usage, createChatCompletionFunctionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, systemFingerprint, _object, usage);
  }

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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

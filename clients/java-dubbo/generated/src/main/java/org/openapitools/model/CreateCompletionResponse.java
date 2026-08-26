package org.openapitools.model;

import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateCompletionResponseChoicesInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 */
public class CreateCompletionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A unique identifier for the completion.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The list of completion choices the model generated for the input prompt.
   */
  @JsonProperty("choices")
  private List<CreateCompletionResponseChoicesInner> choices = new ArrayList<>();

  /**
   * The Unix timestamp (in seconds) of when the completion was created.
   */
  @JsonProperty("created")
  private Integer created;

  /**
   * The model used for completion.
   */
  @JsonProperty("model")
  private String model;

  /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
   */
  @JsonProperty("system_fingerprint")
  private String systemFingerprint;

  /**
   * The object type, which is always \&quot;text_completion\&quot;
   */
  @JsonProperty("object")
  private String _object;

  @JsonProperty("usage")
  private CompletionUsage usage;

  /**
   * A unique identifier for the completion.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The list of completion choices the model generated for the input prompt.
   * @return choices
   */
  public List<CreateCompletionResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   * The Unix timestamp (in seconds) of when the completion was created.
   * @return created
   */
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * The model used for completion.
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
   * The object type, which is always \&quot;text_completion\&quot;
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
    CreateCompletionResponse createCompletionResponse = (CreateCompletionResponse) o;
    return Objects.equals(this.id, createCompletionResponse.id) &&
        Objects.equals(this.choices, createCompletionResponse.choices) &&
        Objects.equals(this.created, createCompletionResponse.created) &&
        Objects.equals(this.model, createCompletionResponse.model) &&
        Objects.equals(this.systemFingerprint, createCompletionResponse.systemFingerprint) &&
        Objects.equals(this._object, createCompletionResponse._object) &&
        Objects.equals(this.usage, createCompletionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, systemFingerprint, _object, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponse {\n");
    
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

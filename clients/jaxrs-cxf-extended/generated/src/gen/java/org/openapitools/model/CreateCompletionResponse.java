package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateCompletionResponseChoicesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 */
@ApiModel(description="Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). ")

public class CreateCompletionResponse  {
  
 /**
  * A unique identifier for the completion.
  */
  @ApiModelProperty(required = true, value = "A unique identifier for the completion.")
  private String id;

 /**
  * The list of completion choices the model generated for the input prompt.
  */
  @ApiModelProperty(required = true, value = "The list of completion choices the model generated for the input prompt.")
  @Valid
  private List<@Valid CreateCompletionResponseChoicesInner> choices = new ArrayList<>();

 /**
  * The Unix timestamp (in seconds) of when the completion was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the completion was created.")
  private Integer created;

 /**
  * The model used for completion.
  */
  @ApiModelProperty(required = true, value = "The model used for completion.")
  private String model;

 /**
  * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  */
  @ApiModelProperty(value = "This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
  private String systemFingerprint;

public enum ObjectEnum {

    @JsonProperty("text_completion") TEXT_COMPLETION(String.valueOf("text_completion"));

    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The object type, which is always \"text_completion\"
  */
  @ApiModelProperty(required = true, value = "The object type, which is always \"text_completion\"")
  private ObjectEnum _object;

  @ApiModelProperty(value = "")
  @Valid
  private CompletionUsage usage;
 /**
  * A unique identifier for the completion.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CreateCompletionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The list of completion choices the model generated for the input prompt.
  * @return choices
  */
  @JsonProperty("choices")
  @NotNull
  public List<@Valid CreateCompletionResponseChoicesInner> getChoices() {
    return choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
 public void setChoices(List<@Valid CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
  public CreateCompletionResponse choices(List<@Valid CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  /**
   * Adds a new item to the <code>choices</code> list.
   */
  public CreateCompletionResponse addChoicesItem(CreateCompletionResponseChoicesInner choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

 /**
  * The Unix timestamp (in seconds) of when the completion was created.
  * @return created
  */
  @JsonProperty("created")
  @NotNull
  public Integer getCreated() {
    return created;
  }

  /**
   * Sets the <code>created</code> property.
   */
 public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * Sets the <code>created</code> property.
   */
  public CreateCompletionResponse created(Integer created) {
    this.created = created;
    return this;
  }

 /**
  * The model used for completion.
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateCompletionResponse model(String model) {
    this.model = model;
    return this;
  }

 /**
  * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
  * @return systemFingerprint
  */
  @JsonProperty("system_fingerprint")
  public String getSystemFingerprint() {
    return systemFingerprint;
  }

  /**
   * Sets the <code>systemFingerprint</code> property.
   */
 public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  /**
   * Sets the <code>systemFingerprint</code> property.
   */
  public CreateCompletionResponse systemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

 /**
  * The object type, which is always \&quot;text_completion\&quot;
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public CreateCompletionResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get usage
  * @return usage
  */
  @JsonProperty("usage")
  public CompletionUsage getUsage() {
    return usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
 public void setUsage(CompletionUsage usage) {
    this.usage = usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
  public CreateCompletionResponse usage(CompletionUsage usage) {
    this.usage = usage;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


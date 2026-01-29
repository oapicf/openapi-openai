package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateCompletionResponseChoicesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 **/
@ApiModel(description = "Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). ")
@JsonTypeName("CreateCompletionResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T10:45:34.459631427Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateCompletionResponse   {
  private String id;
  private @Valid List<@Valid CreateCompletionResponseChoicesInner> choices = new ArrayList<>();
  private Integer created;
  private String model;
  private String systemFingerprint;
  public enum ObjectEnum {

    TEXT_COMPLETION(String.valueOf("text_completion"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private CompletionUsage usage;

  public CreateCompletionResponse() {
  }

  @JsonCreator
  public CreateCompletionResponse(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "choices") List<@Valid CreateCompletionResponseChoicesInner> choices,
    @JsonProperty(required = true, value = "created") Integer created,
    @JsonProperty(required = true, value = "model") String model,
    @JsonProperty(required = true, value = "object") ObjectEnum _object
  ) {
    this.id = id;
    this.choices = choices;
    this.created = created;
    this.model = model;
    this._object = _object;
  }

  /**
   * A unique identifier for the completion.
   **/
  public CreateCompletionResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A unique identifier for the completion.")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The list of completion choices the model generated for the input prompt.
   **/
  public CreateCompletionResponse choices(List<@Valid CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The list of completion choices the model generated for the input prompt.")
  @JsonProperty(required = true, value = "choices")
  @NotNull @Valid public List<@Valid CreateCompletionResponseChoicesInner> getChoices() {
    return choices;
  }

  @JsonProperty(required = true, value = "choices")
  public void setChoices(List<@Valid CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateCompletionResponse addChoicesItem(CreateCompletionResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }

    this.choices.add(choicesItem);
    return this;
  }

  public CreateCompletionResponse removeChoicesItem(CreateCompletionResponseChoicesInner choicesItem) {
    if (choicesItem != null && this.choices != null) {
      this.choices.remove(choicesItem);
    }

    return this;
  }
  /**
   * The Unix timestamp (in seconds) of when the completion was created.
   **/
  public CreateCompletionResponse created(Integer created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the completion was created.")
  @JsonProperty(required = true, value = "created")
  @NotNull public Integer getCreated() {
    return created;
  }

  @JsonProperty(required = true, value = "created")
  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * The model used for completion.
   **/
  public CreateCompletionResponse model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The model used for completion.")
  @JsonProperty(required = true, value = "model")
  @NotNull public String getModel() {
    return model;
  }

  @JsonProperty(required = true, value = "model")
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
   **/
  public CreateCompletionResponse systemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

  
  @ApiModelProperty(value = "This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
  @JsonProperty("system_fingerprint")
  public String getSystemFingerprint() {
    return systemFingerprint;
  }

  @JsonProperty("system_fingerprint")
  public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  /**
   * The object type, which is always \&quot;text_completion\&quot;
   **/
  public CreateCompletionResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always \"text_completion\"")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   **/
  public CreateCompletionResponse usage(CompletionUsage usage) {
    this.usage = usage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usage")
  @Valid public CompletionUsage getUsage() {
    return usage;
  }

  @JsonProperty("usage")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


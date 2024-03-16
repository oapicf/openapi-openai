/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateEmbeddingResponseDataInner;
import org.openapitools.model.CreateEmbeddingResponseUsage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CreateEmbeddingResponse
 */
@JsonPropertyOrder({
  CreateEmbeddingResponse.JSON_PROPERTY_OBJECT,
  CreateEmbeddingResponse.JSON_PROPERTY_MODEL,
  CreateEmbeddingResponse.JSON_PROPERTY_DATA,
  CreateEmbeddingResponse.JSON_PROPERTY_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEmbeddingResponse   {
  public static final String JSON_PROPERTY_OBJECT = "object";
  @JsonProperty(JSON_PROPERTY_OBJECT)
  private String _object;

  public static final String JSON_PROPERTY_MODEL = "model";
  @JsonProperty(JSON_PROPERTY_MODEL)
  private String model;

  public static final String JSON_PROPERTY_DATA = "data";
  @JsonProperty(JSON_PROPERTY_DATA)
  private List<@Valid CreateEmbeddingResponseDataInner> data = new ArrayList<>();

  public static final String JSON_PROPERTY_USAGE = "usage";
  @JsonProperty(JSON_PROPERTY_USAGE)
  private CreateEmbeddingResponseUsage usage;

  public CreateEmbeddingResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   **/
  @JsonProperty(value = "object")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public CreateEmbeddingResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
  @JsonProperty(value = "model")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateEmbeddingResponse data(List<@Valid CreateEmbeddingResponseDataInner> data) {
    this.data = data;
    return this;
  }

  public CreateEmbeddingResponse addDataItem(CreateEmbeddingResponseDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @JsonProperty(value = "data")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public List<@Valid CreateEmbeddingResponseDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid CreateEmbeddingResponseDataInner> data) {
    this.data = data;
  }

  public CreateEmbeddingResponse usage(CreateEmbeddingResponseUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   **/
  @JsonProperty(value = "usage")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public CreateEmbeddingResponseUsage getUsage() {
    return usage;
  }

  public void setUsage(CreateEmbeddingResponseUsage usage) {
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
    CreateEmbeddingResponse createEmbeddingResponse = (CreateEmbeddingResponse) o;
    return Objects.equals(this._object, createEmbeddingResponse._object) &&
        Objects.equals(this.model, createEmbeddingResponse.model) &&
        Objects.equals(this.data, createEmbeddingResponse.data) &&
        Objects.equals(this.usage, createEmbeddingResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, model, data, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingResponse {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

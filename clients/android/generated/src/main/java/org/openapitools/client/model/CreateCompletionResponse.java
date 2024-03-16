/**
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

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CreateCompletionResponseChoicesInner;
import org.openapitools.client.model.CreateCompletionResponseUsage;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateCompletionResponse {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("created")
  private Integer created = null;
  @SerializedName("model")
  private String model = null;
  @SerializedName("choices")
  private List<CreateCompletionResponseChoicesInner> choices = null;
  @SerializedName("usage")
  private CreateCompletionResponseUsage usage = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCreated() {
    return created;
  }
  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CreateCompletionResponseChoicesInner> getChoices() {
    return choices;
  }
  public void setChoices(List<CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CreateCompletionResponseUsage getUsage() {
    return usage;
  }
  public void setUsage(CreateCompletionResponseUsage usage) {
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
    return (this.id == null ? createCompletionResponse.id == null : this.id.equals(createCompletionResponse.id)) &&
        (this._object == null ? createCompletionResponse._object == null : this._object.equals(createCompletionResponse._object)) &&
        (this.created == null ? createCompletionResponse.created == null : this.created.equals(createCompletionResponse.created)) &&
        (this.model == null ? createCompletionResponse.model == null : this.model.equals(createCompletionResponse.model)) &&
        (this.choices == null ? createCompletionResponse.choices == null : this.choices.equals(createCompletionResponse.choices)) &&
        (this.usage == null ? createCompletionResponse.usage == null : this.usage.equals(createCompletionResponse.usage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    result = 31 * result + (this.choices == null ? 0: this.choices.hashCode());
    result = 31 * result + (this.usage == null ? 0: this.usage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  choices: ").append(choices).append("\n");
    sb.append("  usage: ").append(usage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

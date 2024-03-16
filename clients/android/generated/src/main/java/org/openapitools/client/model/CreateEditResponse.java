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
import org.openapitools.client.model.CreateCompletionResponseUsage;
import org.openapitools.client.model.CreateEditResponseChoicesInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateEditResponse {
  
  @SerializedName("object")
  private String _object = null;
  @SerializedName("created")
  private Integer created = null;
  @SerializedName("choices")
  private List<CreateEditResponseChoicesInner> choices = null;
  @SerializedName("usage")
  private CreateCompletionResponseUsage usage = null;

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
  public List<CreateEditResponseChoicesInner> getChoices() {
    return choices;
  }
  public void setChoices(List<CreateEditResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    CreateEditResponse createEditResponse = (CreateEditResponse) o;
    return (this._object == null ? createEditResponse._object == null : this._object.equals(createEditResponse._object)) &&
        (this.created == null ? createEditResponse.created == null : this.created.equals(createEditResponse.created)) &&
        (this.choices == null ? createEditResponse.choices == null : this.choices.equals(createEditResponse.choices)) &&
        (this.usage == null ? createEditResponse.usage == null : this.usage.equals(createEditResponse.usage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.choices == null ? 0: this.choices.hashCode());
    result = 31 * result + (this.usage == null ? 0: this.usage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEditResponse {\n");
    
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  choices: ").append(choices).append("\n");
    sb.append("  usage: ").append(usage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

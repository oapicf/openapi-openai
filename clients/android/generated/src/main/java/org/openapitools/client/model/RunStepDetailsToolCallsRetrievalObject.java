/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class RunStepDetailsToolCallsRetrievalObject {
  
  @SerializedName("id")
  private String id = null;
  public enum TypeEnum {
     retrieval, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("retrieval")
  private Object retrieval = null;

  /**
   * The ID of the tool call object.
   **/
  @ApiModelProperty(required = true, value = "The ID of the tool call object.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call. This is always going to be `retrieval` for this type of tool call.
   **/
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `retrieval` for this type of tool call.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * For now, this is always going to be an empty object.
   **/
  @ApiModelProperty(required = true, value = "For now, this is always going to be an empty object.")
  public Object getRetrieval() {
    return retrieval;
  }
  public void setRetrieval(Object retrieval) {
    this.retrieval = retrieval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsRetrievalObject runStepDetailsToolCallsRetrievalObject = (RunStepDetailsToolCallsRetrievalObject) o;
    return (this.id == null ? runStepDetailsToolCallsRetrievalObject.id == null : this.id.equals(runStepDetailsToolCallsRetrievalObject.id)) &&
        (this.type == null ? runStepDetailsToolCallsRetrievalObject.type == null : this.type.equals(runStepDetailsToolCallsRetrievalObject.type)) &&
        (this.retrieval == null ? runStepDetailsToolCallsRetrievalObject.retrieval == null : this.retrieval.equals(runStepDetailsToolCallsRetrievalObject.retrieval));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.retrieval == null ? 0: this.retrieval.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsRetrievalObject {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  retrieval: ").append(retrieval).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
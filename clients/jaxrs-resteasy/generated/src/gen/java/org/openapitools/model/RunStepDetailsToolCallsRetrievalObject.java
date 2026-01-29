package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T10:45:28.938980301Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsRetrievalObject   {
  
  private String id;

  /**
   * The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.
   */
  public enum TypeEnum {
    RETRIEVAL("retrieval");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private Object retrieval;

  /**
   * The ID of the tool call object.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the tool call object.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.
   **/
  
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `retrieval` for this type of tool call.")
  @JsonProperty("type")
  @NotNull
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
  @JsonProperty("retrieval")
  @NotNull
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
    return Objects.equals(this.id, runStepDetailsToolCallsRetrievalObject.id) &&
        Objects.equals(this.type, runStepDetailsToolCallsRetrievalObject.type) &&
        Objects.equals(this.retrieval, runStepDetailsToolCallsRetrievalObject.retrieval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, retrieval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsRetrievalObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    retrieval: ").append(toIndentedString(retrieval)).append("\n");
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


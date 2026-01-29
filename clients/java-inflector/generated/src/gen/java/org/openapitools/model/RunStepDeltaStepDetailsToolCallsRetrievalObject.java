package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T10:44:48.545388249Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsToolCallsRetrievalObject   {
  @JsonProperty("index")
  private Integer index;

  @JsonProperty("id")
  private String id;

  /**
   * The type of tool call. This is always going to be `retrieval` for this type of tool call.
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

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("retrieval")
  private Object retrieval;

  /**
   * The index of the tool call in the tool calls array.
   **/
  public RunStepDeltaStepDetailsToolCallsRetrievalObject index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the tool call in the tool calls array.")
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * The ID of the tool call object.
   **/
  public RunStepDeltaStepDetailsToolCallsRetrievalObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the tool call object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call. This is always going to be `retrieval` for this type of tool call.
   **/
  public RunStepDeltaStepDetailsToolCallsRetrievalObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `retrieval` for this type of tool call.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * For now, this is always going to be an empty object.
   **/
  public RunStepDeltaStepDetailsToolCallsRetrievalObject retrieval(Object retrieval) {
    this.retrieval = retrieval;
    return this;
  }

  
  @ApiModelProperty(value = "For now, this is always going to be an empty object.")
  @JsonProperty("retrieval")
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
    RunStepDeltaStepDetailsToolCallsRetrievalObject runStepDeltaStepDetailsToolCallsRetrievalObject = (RunStepDeltaStepDetailsToolCallsRetrievalObject) o;
    return Objects.equals(index, runStepDeltaStepDetailsToolCallsRetrievalObject.index) &&
        Objects.equals(id, runStepDeltaStepDetailsToolCallsRetrievalObject.id) &&
        Objects.equals(type, runStepDeltaStepDetailsToolCallsRetrievalObject.type) &&
        Objects.equals(retrieval, runStepDeltaStepDetailsToolCallsRetrievalObject.retrieval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, retrieval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsRetrievalObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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


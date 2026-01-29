package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RunStepDeltaStepDetailsToolCallsRetrievalObject  {
  
 /**
  * The index of the tool call in the tool calls array.
  */
  @ApiModelProperty(required = true, value = "The index of the tool call in the tool calls array.")

  private Integer index;

 /**
  * The ID of the tool call object.
  */
  @ApiModelProperty(value = "The ID of the tool call object.")

  private String id;

public enum TypeEnum {

RETRIEVAL(String.valueOf("retrieval"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The type of tool call. This is always going to be `retrieval` for this type of tool call.
  */
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `retrieval` for this type of tool call.")

  private TypeEnum type;

 /**
  * For now, this is always going to be an empty object.
  */
  @ApiModelProperty(value = "For now, this is always going to be an empty object.")

  private Object retrieval;
 /**
   * The index of the tool call in the tool calls array.
   * @return index
  **/
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsRetrievalObject index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * The ID of the tool call object.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDeltaStepDetailsToolCallsRetrievalObject id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsRetrievalObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * For now, this is always going to be an empty object.
   * @return retrieval
  **/
  @JsonProperty("retrieval")
  public Object getRetrieval() {
    return retrieval;
  }

  public void setRetrieval(Object retrieval) {
    this.retrieval = retrieval;
  }

  public RunStepDeltaStepDetailsToolCallsRetrievalObject retrieval(Object retrieval) {
    this.retrieval = retrieval;
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
    RunStepDeltaStepDetailsToolCallsRetrievalObject runStepDeltaStepDetailsToolCallsRetrievalObject = (RunStepDeltaStepDetailsToolCallsRetrievalObject) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsRetrievalObject.index) &&
        Objects.equals(this.id, runStepDeltaStepDetailsToolCallsRetrievalObject.id) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsRetrievalObject.type) &&
        Objects.equals(this.retrieval, runStepDeltaStepDetailsToolCallsRetrievalObject.retrieval);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


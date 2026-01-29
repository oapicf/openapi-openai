package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RunStepDeltaStepDetailsToolCallsRetrievalObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsToolCallsRetrievalObject implements RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {

  private Integer index;

  private @Nullable String id;

  /**
   * The type of tool call. This is always going to be `retrieval` for this type of tool call.
   */
  public enum TypeEnum {
    RETRIEVAL("retrieval");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private @Nullable Object retrieval;

  public RunStepDeltaStepDetailsToolCallsRetrievalObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStepDeltaStepDetailsToolCallsRetrievalObject(Integer index, TypeEnum type) {
    this.index = index;
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsRetrievalObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the tool call in the tool calls array.
   * @return index
   */
  @NotNull 
  @Schema(name = "index", description = "The index of the tool call in the tool calls array.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsRetrievalObject id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the tool call object.
   * @return id
   */
  
  @Schema(name = "id", description = "The ID of the tool call object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public RunStepDeltaStepDetailsToolCallsRetrievalObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of tool call. This is always going to be `retrieval` for this type of tool call.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The type of tool call. This is always going to be `retrieval` for this type of tool call.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsRetrievalObject retrieval(@Nullable Object retrieval) {
    this.retrieval = retrieval;
    return this;
  }

  /**
   * For now, this is always going to be an empty object.
   * @return retrieval
   */
  
  @Schema(name = "retrieval", description = "For now, this is always going to be an empty object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retrieval")
  public @Nullable Object getRetrieval() {
    return retrieval;
  }

  public void setRetrieval(@Nullable Object retrieval) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


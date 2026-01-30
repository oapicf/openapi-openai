package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RealtimeConversationItem;
import org.openapitools.model.RealtimeResponseStatusDetails;
import org.openapitools.model.RealtimeResponseUsage;
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
 * The response resource.
 **/
@ApiModel(description = "The response resource.")
@JsonTypeName("RealtimeResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponse   {
  private String id;
  public enum ObjectEnum {

    REALTIME_RESPONSE(String.valueOf("realtime.response"));


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
  public enum StatusEnum {

    COMPLETED(String.valueOf("completed")), CANCELLED(String.valueOf("cancelled")), FAILED(String.valueOf("failed")), INCOMPLETE(String.valueOf("incomplete"));


    private String value;

    StatusEnum (String v) {
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
    public static StatusEnum fromString(String s) {
        for (StatusEnum b : StatusEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StatusEnum status;
  private RealtimeResponseStatusDetails statusDetails;
  private @Valid List<@Valid RealtimeConversationItem> output = new ArrayList<>();
  private Object metadata;
  private RealtimeResponseUsage usage;

  public RealtimeResponse() {
  }

  /**
   * The unique ID of the response.
   **/
  public RealtimeResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The unique ID of the response.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, must be &#x60;realtime.response&#x60;.
   **/
  public RealtimeResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(value = "The object type, must be `realtime.response`.")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The final status of the response (&#x60;completed&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, or  &#x60;incomplete&#x60;). 
   **/
  public RealtimeResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`). ")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  public RealtimeResponse statusDetails(RealtimeResponseStatusDetails statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status_details")
  @Valid public RealtimeResponseStatusDetails getStatusDetails() {
    return statusDetails;
  }

  @JsonProperty("status_details")
  public void setStatusDetails(RealtimeResponseStatusDetails statusDetails) {
    this.statusDetails = statusDetails;
  }

  /**
   * The list of output items generated by the response.
   **/
  public RealtimeResponse output(List<@Valid RealtimeConversationItem> output) {
    this.output = output;
    return this;
  }

  
  @ApiModelProperty(value = "The list of output items generated by the response.")
  @JsonProperty("output")
  @Valid public List<@Valid RealtimeConversationItem> getOutput() {
    return output;
  }

  @JsonProperty("output")
  public void setOutput(List<@Valid RealtimeConversationItem> output) {
    this.output = output;
  }

  public RealtimeResponse addOutputItem(RealtimeConversationItem outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<>();
    }

    this.output.add(outputItem);
    return this;
  }

  public RealtimeResponse removeOutputItem(RealtimeConversationItem outputItem) {
    if (outputItem != null && this.output != null) {
      this.output.remove(outputItem);
    }

    return this;
  }
  /**
   * Developer-provided string key-value pairs associated with this response. 
   **/
  public RealtimeResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Developer-provided string key-value pairs associated with this response. ")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  public RealtimeResponse usage(RealtimeResponseUsage usage) {
    this.usage = usage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usage")
  @Valid public RealtimeResponseUsage getUsage() {
    return usage;
  }

  @JsonProperty("usage")
  public void setUsage(RealtimeResponseUsage usage) {
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
    RealtimeResponse realtimeResponse = (RealtimeResponse) o;
    return Objects.equals(this.id, realtimeResponse.id) &&
        Objects.equals(this._object, realtimeResponse._object) &&
        Objects.equals(this.status, realtimeResponse.status) &&
        Objects.equals(this.statusDetails, realtimeResponse.statusDetails) &&
        Objects.equals(this.output, realtimeResponse.output) &&
        Objects.equals(this.metadata, realtimeResponse.metadata) &&
        Objects.equals(this.usage, realtimeResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, status, statusDetails, output, metadata, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.RealtimeConversationItem;
import org.openapitools.vertxweb.server.model.RealtimeResponseStatusDetails;
import org.openapitools.vertxweb.server.model.RealtimeResponseUsage;

/**
 * The response resource.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeResponse   {
  
  private String id;


  public enum ObjectEnum {
    REALTIME_RESPONSE("realtime.response");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;


  public enum StatusEnum {
    COMPLETED("completed"),
    CANCELLED("cancelled"),
    FAILED("failed"),
    INCOMPLETE("incomplete");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status;
  private RealtimeResponseStatusDetails statusDetails;
  private List<RealtimeConversationItem> output = new ArrayList<>();
  private Object metadata;
  private RealtimeResponseUsage usage;

  public RealtimeResponse () {

  }

  public RealtimeResponse (String id, ObjectEnum _object, StatusEnum status, RealtimeResponseStatusDetails statusDetails, List<RealtimeConversationItem> output, Object metadata, RealtimeResponseUsage usage) {
    this.id = id;
    this._object = _object;
    this.status = status;
    this.statusDetails = statusDetails;
    this.output = output;
    this.metadata = metadata;
    this.usage = usage;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("status_details")
  public RealtimeResponseStatusDetails getStatusDetails() {
    return statusDetails;
  }
  public void setStatusDetails(RealtimeResponseStatusDetails statusDetails) {
    this.statusDetails = statusDetails;
  }

    
  @JsonProperty("output")
  public List<RealtimeConversationItem> getOutput() {
    return output;
  }
  public void setOutput(List<RealtimeConversationItem> output) {
    this.output = output;
  }

    
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

    
  @JsonProperty("usage")
  public RealtimeResponseUsage getUsage() {
    return usage;
  }
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
    return Objects.equals(id, realtimeResponse.id) &&
        Objects.equals(_object, realtimeResponse._object) &&
        Objects.equals(status, realtimeResponse.status) &&
        Objects.equals(statusDetails, realtimeResponse.statusDetails) &&
        Objects.equals(output, realtimeResponse.output) &&
        Objects.equals(metadata, realtimeResponse.metadata) &&
        Objects.equals(usage, realtimeResponse.usage);
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

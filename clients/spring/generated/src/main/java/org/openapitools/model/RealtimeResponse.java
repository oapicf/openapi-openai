package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RealtimeConversationItem;
import org.openapitools.model.RealtimeResponseStatusDetails;
import org.openapitools.model.RealtimeResponseUsage;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The response resource.
 */

@Schema(name = "RealtimeResponse", description = "The response resource.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponse {

  private @Nullable String id;

  /**
   * The object type, must be `realtime.response`.
   */
  public enum ObjectEnum {
    REALTIME_RESPONSE("realtime.response");

    private final String value;

    ObjectEnum(String value) {
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
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ObjectEnum _object;

  /**
   * The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`). 
   */
  public enum StatusEnum {
    COMPLETED("completed"),
    
    CANCELLED("cancelled"),
    
    FAILED("failed"),
    
    INCOMPLETE("incomplete");

    private final String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StatusEnum status;

  private @Nullable RealtimeResponseStatusDetails statusDetails;

  @Valid
  private List<@Valid RealtimeConversationItem> output = new ArrayList<>();

  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  private @Nullable RealtimeResponseUsage usage;

  public RealtimeResponse id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the response.
   * @return id
   */
  
  @Schema(name = "id", description = "The unique ID of the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public RealtimeResponse _object(@Nullable ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, must be `realtime.response`.
   * @return _object
   */
  
  @Schema(name = "object", description = "The object type, must be `realtime.response`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("object")
  public @Nullable ObjectEnum getObject() {
    return _object;
  }

  public void setObject(@Nullable ObjectEnum _object) {
    this._object = _object;
  }

  public RealtimeResponse status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`). 
   * @return status
   */
  
  @Schema(name = "status", description = "The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public RealtimeResponse statusDetails(@Nullable RealtimeResponseStatusDetails statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Get statusDetails
   * @return statusDetails
   */
  @Valid 
  @Schema(name = "status_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status_details")
  public @Nullable RealtimeResponseStatusDetails getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(@Nullable RealtimeResponseStatusDetails statusDetails) {
    this.statusDetails = statusDetails;
  }

  public RealtimeResponse output(List<@Valid RealtimeConversationItem> output) {
    this.output = output;
    return this;
  }

  public RealtimeResponse addOutputItem(RealtimeConversationItem outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<>();
    }
    this.output.add(outputItem);
    return this;
  }

  /**
   * The list of output items generated by the response.
   * @return output
   */
  @Valid 
  @Schema(name = "output", description = "The list of output items generated by the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output")
  public List<@Valid RealtimeConversationItem> getOutput() {
    return output;
  }

  public void setOutput(List<@Valid RealtimeConversationItem> output) {
    this.output = output;
  }

  public RealtimeResponse metadata(Object metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  /**
   * Developer-provided string key-value pairs associated with this response. 
   * @return metadata
   */
  
  @Schema(name = "metadata", description = "Developer-provided string key-value pairs associated with this response. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public JsonNullable<Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public RealtimeResponse usage(@Nullable RealtimeResponseUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @Valid 
  @Schema(name = "usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public @Nullable RealtimeResponseUsage getUsage() {
    return usage;
  }

  public void setUsage(@Nullable RealtimeResponseUsage usage) {
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
        equalsNullable(this.metadata, realtimeResponse.metadata) &&
        Objects.equals(this.usage, realtimeResponse.usage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, status, statusDetails, output, hashCodeNullable(metadata), usage);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CreateModerationRequestInput;
import org.openapitools.model.CreateModerationRequestModel;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateModerationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateModerationRequest {

  private CreateModerationRequestInput input;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CreateModerationRequestModel model;

  public CreateModerationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateModerationRequest(CreateModerationRequestInput input) {
    this.input = input;
  }

  public CreateModerationRequest input(CreateModerationRequestInput input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
   */
  @NotNull @Valid 
  @Schema(name = "input", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("input")
  public CreateModerationRequestInput getInput() {
    return input;
  }

  @JsonProperty("input")
  public void setInput(CreateModerationRequestInput input) {
    this.input = input;
  }

  public CreateModerationRequest model(@Nullable CreateModerationRequestModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @Valid 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public @Nullable CreateModerationRequestModel getModel() {
    return model;
  }

  @JsonProperty("model")
  public void setModel(@Nullable CreateModerationRequestModel model) {
    this.model = model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationRequest createModerationRequest = (CreateModerationRequest) o;
    return Objects.equals(this.input, createModerationRequest.input) &&
        Objects.equals(this.model, createModerationRequest.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequest {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


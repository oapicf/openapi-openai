package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateModerationResponseResultsInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents if a given text input is potentially harmful.
 */

@Schema(name = "CreateModerationResponse", description = "Represents if a given text input is potentially harmful.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationResponse {

  private String id;

  private String model;

  @Valid
  private List<@Valid CreateModerationResponseResultsInner> results = new ArrayList<>();

  public CreateModerationResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateModerationResponse(String id, String model, List<@Valid CreateModerationResponseResultsInner> results) {
    this.id = id;
    this.model = model;
    this.results = results;
  }

  public CreateModerationResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the moderation request.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The unique identifier for the moderation request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateModerationResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * The model used to generate the moderation results.
   * @return model
   */
  @NotNull 
  @Schema(name = "model", description = "The model used to generate the moderation results.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateModerationResponse results(List<@Valid CreateModerationResponseResultsInner> results) {
    this.results = results;
    return this;
  }

  public CreateModerationResponse addResultsItem(CreateModerationResponseResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * A list of moderation objects.
   * @return results
   */
  @NotNull @Valid 
  @Schema(name = "results", description = "A list of moderation objects.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
  public List<@Valid CreateModerationResponseResultsInner> getResults() {
    return results;
  }

  public void setResults(List<@Valid CreateModerationResponseResultsInner> results) {
    this.results = results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponse createModerationResponse = (CreateModerationResponse) o;
    return Objects.equals(this.id, createModerationResponse.id) &&
        Objects.equals(this.model, createModerationResponse.model) &&
        Objects.equals(this.results, createModerationResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, model, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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


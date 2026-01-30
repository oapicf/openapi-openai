package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateModerationResponseResultsInner;
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
 * Represents if a given text input is potentially harmful.
 **/
@ApiModel(description = "Represents if a given text input is potentially harmful.")
@JsonTypeName("CreateModerationResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationResponse   {
  private String id;
  private String model;
  private @Valid List<@Valid CreateModerationResponseResultsInner> results = new ArrayList<>();

  public CreateModerationResponse() {
  }

  @JsonCreator
  public CreateModerationResponse(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "model") String model,
    @JsonProperty(required = true, value = "results") List<@Valid CreateModerationResponseResultsInner> results
  ) {
    this.id = id;
    this.model = model;
    this.results = results;
  }

  /**
   * The unique identifier for the moderation request.
   **/
  public CreateModerationResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique identifier for the moderation request.")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The model used to generate the moderation results.
   **/
  public CreateModerationResponse model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The model used to generate the moderation results.")
  @JsonProperty(required = true, value = "model")
  @NotNull public String getModel() {
    return model;
  }

  @JsonProperty(required = true, value = "model")
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * A list of moderation objects.
   **/
  public CreateModerationResponse results(List<@Valid CreateModerationResponseResultsInner> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moderation objects.")
  @JsonProperty(required = true, value = "results")
  @NotNull @Valid public List<@Valid CreateModerationResponseResultsInner> getResults() {
    return results;
  }

  @JsonProperty(required = true, value = "results")
  public void setResults(List<@Valid CreateModerationResponseResultsInner> results) {
    this.results = results;
  }

  public CreateModerationResponse addResultsItem(CreateModerationResponseResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }

    this.results.add(resultsItem);
    return this;
  }

  public CreateModerationResponse removeResultsItem(CreateModerationResponseResultsInner resultsItem) {
    if (resultsItem != null && this.results != null) {
      this.results.remove(resultsItem);
    }

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


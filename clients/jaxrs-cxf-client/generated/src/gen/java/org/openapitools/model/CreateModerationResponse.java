package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateModerationResponseResultsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Represents if a given text input is potentially harmful.
 **/
@ApiModel(description="Represents if a given text input is potentially harmful.")

public class CreateModerationResponse  {
  
  @ApiModelProperty(required = true, value = "The unique identifier for the moderation request.")
 /**
   * The unique identifier for the moderation request.
  **/
  private String id;

  @ApiModelProperty(required = true, value = "The model used to generate the moderation results.")
 /**
   * The model used to generate the moderation results.
  **/
  private String model;

  @ApiModelProperty(required = true, value = "A list of moderation objects.")
 /**
   * A list of moderation objects.
  **/
  private List<CreateModerationResponseResultsInner> results = new ArrayList<>();
 /**
   * The unique identifier for the moderation request.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateModerationResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The model used to generate the moderation results.
   * @return model
  **/
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateModerationResponse model(String model) {
    this.model = model;
    return this;
  }

 /**
   * A list of moderation objects.
   * @return results
  **/
  @JsonProperty("results")
  public List<CreateModerationResponseResultsInner> getResults() {
    return results;
  }

  public void setResults(List<CreateModerationResponseResultsInner> results) {
    this.results = results;
  }

  public CreateModerationResponse results(List<CreateModerationResponseResultsInner> results) {
    this.results = results;
    return this;
  }

  public CreateModerationResponse addResultsItem(CreateModerationResponseResultsInner resultsItem) {
    this.results.add(resultsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


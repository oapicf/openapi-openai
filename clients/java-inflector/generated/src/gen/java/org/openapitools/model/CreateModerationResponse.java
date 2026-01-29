package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateModerationResponseResultsInner;



/**
 * Represents if a given text input is potentially harmful.
 **/

@ApiModel(description = "Represents if a given text input is potentially harmful.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T10:44:48.545388249Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("model")
  private String model;

  @JsonProperty("results")
  private List<CreateModerationResponseResultsInner> results = new ArrayList<>();

  /**
   * The unique identifier for the moderation request.
   **/
  public CreateModerationResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique identifier for the moderation request.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
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
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * A list of moderation objects.
   **/
  public CreateModerationResponse results(List<CreateModerationResponseResultsInner> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of moderation objects.")
  @JsonProperty("results")
  public List<CreateModerationResponseResultsInner> getResults() {
    return results;
  }
  public void setResults(List<CreateModerationResponseResultsInner> results) {
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
    return Objects.equals(id, createModerationResponse.id) &&
        Objects.equals(model, createModerationResponse.model) &&
        Objects.equals(results, createModerationResponse.results);
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


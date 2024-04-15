/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryScores;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CreateModerationResponseResultsInner
 */
@JsonPropertyOrder({
  CreateModerationResponseResultsInner.JSON_PROPERTY_FLAGGED,
  CreateModerationResponseResultsInner.JSON_PROPERTY_CATEGORIES,
  CreateModerationResponseResultsInner.JSON_PROPERTY_CATEGORY_SCORES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateModerationResponseResultsInner   {
  public static final String JSON_PROPERTY_FLAGGED = "flagged";
  @JsonProperty(JSON_PROPERTY_FLAGGED)
  private Boolean flagged;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  private CreateModerationResponseResultsInnerCategories categories;

  public static final String JSON_PROPERTY_CATEGORY_SCORES = "category_scores";
  @JsonProperty(JSON_PROPERTY_CATEGORY_SCORES)
  private CreateModerationResponseResultsInnerCategoryScores categoryScores;

  public CreateModerationResponseResultsInner flagged(Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

  /**
   * Whether any of the below categories are flagged.
   * @return flagged
   **/
  @JsonProperty(value = "flagged")
  @ApiModelProperty(required = true, value = "Whether any of the below categories are flagged.")
  @NotNull 
  public Boolean getFlagged() {
    return flagged;
  }

  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  public CreateModerationResponseResultsInner categories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Get categories
   * @return categories
   **/
  @JsonProperty(value = "categories")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }

  public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }

  public CreateModerationResponseResultsInner categoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
    return this;
  }

  /**
   * Get categoryScores
   * @return categoryScores
   **/
  @JsonProperty(value = "category_scores")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }

  public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponseResultsInner createModerationResponseResultsInner = (CreateModerationResponseResultsInner) o;
    return Objects.equals(this.flagged, createModerationResponseResultsInner.flagged) &&
        Objects.equals(this.categories, createModerationResponseResultsInner.categories) &&
        Objects.equals(this.categoryScores, createModerationResponseResultsInner.categoryScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagged, categories, categoryScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInner {\n");
    
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n");
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

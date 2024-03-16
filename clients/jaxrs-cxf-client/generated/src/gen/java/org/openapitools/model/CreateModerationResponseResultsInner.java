package org.openapitools.model;

import org.openapitools.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryScores;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateModerationResponseResultsInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean flagged;

  @ApiModelProperty(required = true, value = "")
  private CreateModerationResponseResultsInnerCategories categories;

  @ApiModelProperty(required = true, value = "")
  private CreateModerationResponseResultsInnerCategoryScores categoryScores;
 /**
   * Get flagged
   * @return flagged
  **/
  @JsonProperty("flagged")
  public Boolean getFlagged() {
    return flagged;
  }

  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  public CreateModerationResponseResultsInner flagged(Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }

  public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }

  public CreateModerationResponseResultsInner categories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
    return this;
  }

 /**
   * Get categoryScores
   * @return categoryScores
  **/
  @JsonProperty("category_scores")
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }

  public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }

  public CreateModerationResponseResultsInner categoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


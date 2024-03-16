package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryScores;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateModerationResponseResultsInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean flagged;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateModerationResponseResultsInnerCategories categories;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateModerationResponseResultsInnerCategoryScores categoryScores;
 /**
  * Get flagged
  * @return flagged
  */
  @JsonProperty("flagged")
  @NotNull
  public Boolean getFlagged() {
    return flagged;
  }

  /**
   * Sets the <code>flagged</code> property.
   */
 public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  /**
   * Sets the <code>flagged</code> property.
   */
  public CreateModerationResponseResultsInner flagged(Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

 /**
  * Get categories
  * @return categories
  */
  @JsonProperty("categories")
  @NotNull
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }

  /**
   * Sets the <code>categories</code> property.
   */
 public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }

  /**
   * Sets the <code>categories</code> property.
   */
  public CreateModerationResponseResultsInner categories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
    return this;
  }

 /**
  * Get categoryScores
  * @return categoryScores
  */
  @JsonProperty("category_scores")
  @NotNull
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }

  /**
   * Sets the <code>categoryScores</code> property.
   */
 public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }

  /**
   * Sets the <code>categoryScores</code> property.
   */
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


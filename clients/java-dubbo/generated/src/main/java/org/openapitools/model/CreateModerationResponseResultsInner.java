package org.openapitools.model;

import org.openapitools.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryAppliedInputTypes;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryScores;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateModerationResponseResultsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Whether any of the below categories are flagged.
   */
  @JsonProperty("flagged")
  private Boolean flagged;

  @JsonProperty("categories")
  private CreateModerationResponseResultsInnerCategories categories;

  @JsonProperty("category_scores")
  private CreateModerationResponseResultsInnerCategoryScores categoryScores;

  @JsonProperty("category_applied_input_types")
  private CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes;

  /**
   * Whether any of the below categories are flagged.
   * @return flagged
   */
  public Boolean getFlagged() {
    return flagged;
  }

  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  /**
   * 
   * @return categories
   */
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }

  public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }

  /**
   * 
   * @return categoryScores
   */
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }

  public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }

  /**
   * 
   * @return categoryAppliedInputTypes
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes getCategoryAppliedInputTypes() {
    return categoryAppliedInputTypes;
  }

  public void setCategoryAppliedInputTypes(CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes) {
    this.categoryAppliedInputTypes = categoryAppliedInputTypes;
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
        Objects.equals(this.categoryScores, createModerationResponseResultsInner.categoryScores) &&
        Objects.equals(this.categoryAppliedInputTypes, createModerationResponseResultsInner.categoryAppliedInputTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagged, categories, categoryScores, categoryAppliedInputTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInner {\n");
    
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n");
    sb.append("    categoryAppliedInputTypes: ").append(toIndentedString(categoryAppliedInputTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.vertxweb.server.model.CreateModerationResponseResultsInnerCategoryAppliedInputTypes;
import org.openapitools.vertxweb.server.model.CreateModerationResponseResultsInnerCategoryScores;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationResponseResultsInner   {
  
  private Boolean flagged;
  private CreateModerationResponseResultsInnerCategories categories;
  private CreateModerationResponseResultsInnerCategoryScores categoryScores;
  private CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes;

  public CreateModerationResponseResultsInner () {

  }

  public CreateModerationResponseResultsInner (Boolean flagged, CreateModerationResponseResultsInnerCategories categories, CreateModerationResponseResultsInnerCategoryScores categoryScores, CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes) {
    this.flagged = flagged;
    this.categories = categories;
    this.categoryScores = categoryScores;
    this.categoryAppliedInputTypes = categoryAppliedInputTypes;
  }

    
  @JsonProperty("flagged")
  public Boolean getFlagged() {
    return flagged;
  }
  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

    
  @JsonProperty("categories")
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }
  public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }

    
  @JsonProperty("category_scores")
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }
  public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }

    
  @JsonProperty("category_applied_input_types")
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
    return Objects.equals(flagged, createModerationResponseResultsInner.flagged) &&
        Objects.equals(categories, createModerationResponseResultsInner.categories) &&
        Objects.equals(categoryScores, createModerationResponseResultsInner.categoryScores) &&
        Objects.equals(categoryAppliedInputTypes, createModerationResponseResultsInner.categoryAppliedInputTypes);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

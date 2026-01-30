package apimodels;

import apimodels.CreateModerationResponseResultsInnerCategories;
import apimodels.CreateModerationResponseResultsInnerCategoryAppliedInputTypes;
import apimodels.CreateModerationResponseResultsInnerCategoryScores;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateModerationResponseResultsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateModerationResponseResultsInner   {
  @JsonProperty("flagged")
  @NotNull

  private Boolean flagged;

  @JsonProperty("categories")
  @NotNull
@Valid

  private CreateModerationResponseResultsInnerCategories categories;

  @JsonProperty("category_scores")
  @NotNull
@Valid

  private CreateModerationResponseResultsInnerCategoryScores categoryScores;

  @JsonProperty("category_applied_input_types")
  @NotNull
@Valid

  private CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes;

  public CreateModerationResponseResultsInner flagged(Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

   /**
   * Whether any of the below categories are flagged.
   * @return flagged
  **/
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
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }

  public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }

  public CreateModerationResponseResultsInner categoryAppliedInputTypes(CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes) {
    this.categoryAppliedInputTypes = categoryAppliedInputTypes;
    return this;
  }

   /**
   * Get categoryAppliedInputTypes
   * @return categoryAppliedInputTypes
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


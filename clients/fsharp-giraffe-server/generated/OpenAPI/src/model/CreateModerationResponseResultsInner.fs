namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateModerationResponseResultsInnerCategories
open OpenAPI.Model.CreateModerationResponseResultsInnerCategoryAppliedInputTypes
open OpenAPI.Model.CreateModerationResponseResultsInnerCategoryScores

module CreateModerationResponseResultsInner =

  //#region CreateModerationResponseResultsInner


  type CreateModerationResponse_results_inner = {
    Flagged : bool;
    Categories : CreateModerationResponseResultsInnerCategories;
    CategoryScores : CreateModerationResponseResultsInnerCategoryScores;
    CategoryAppliedInputTypes : CreateModerationResponseResultsInnerCategoryAppliedInputTypes;
  }
  //#endregion

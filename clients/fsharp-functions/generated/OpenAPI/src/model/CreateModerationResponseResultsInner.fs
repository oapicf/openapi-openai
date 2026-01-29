namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateModerationResponseResultsInnerCategories
open OpenAPI.Model.CreateModerationResponseResultsInnerCategoryScores

module CreateModerationResponseResultsInner =

  //#region CreateModerationResponseResultsInner

  [<CLIMutable>]
  type CreateModerationResponseResultsInner = {
    [<JsonProperty(PropertyName = "flagged")>]
    Flagged : bool;
    [<JsonProperty(PropertyName = "categories")>]
    Categories : CreateModerationResponseResultsInnerCategories;
    [<JsonProperty(PropertyName = "category_scores")>]
    CategoryScores : CreateModerationResponseResultsInnerCategoryScores;
  }

  //#endregion

namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateModerationResponseResultsInner

module CreateModerationResponse =

  //#region CreateModerationResponse

  [<CLIMutable>]
  type CreateModerationResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : CreateModerationResponseResultsInner[];
  }

  //#endregion

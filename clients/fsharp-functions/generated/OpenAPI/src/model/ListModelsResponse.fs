namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Model

module ListModelsResponse =

  //#region ListModelsResponse

  [<CLIMutable>]
  type ListModelsResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : Model[];
  }

  //#endregion

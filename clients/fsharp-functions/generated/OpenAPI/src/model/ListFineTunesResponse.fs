namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTune

module ListFineTunesResponse =

  //#region ListFineTunesResponse

  [<CLIMutable>]
  type ListFineTunesResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : FineTune[];
  }

  //#endregion

namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AutoChunkingStrategy =

  //#region AutoChunkingStrategy

  [<CLIMutable>]
  type AutoChunkingStrategy = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion

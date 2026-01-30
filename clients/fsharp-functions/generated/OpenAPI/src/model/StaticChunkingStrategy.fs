namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.StaticChunkingStrategyStatic

module StaticChunkingStrategy =

  //#region StaticChunkingStrategy

  [<CLIMutable>]
  type StaticChunkingStrategy = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "static")>]
    Static : StaticChunkingStrategyStatic;
  }

  //#endregion

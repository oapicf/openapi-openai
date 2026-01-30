namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.StaticChunkingStrategy

module StaticChunkingStrategyResponseParam =

  //#region StaticChunkingStrategyResponseParam

  [<CLIMutable>]
  type StaticChunkingStrategyResponseParam = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "static")>]
    Static : StaticChunkingStrategy;
  }

  //#endregion

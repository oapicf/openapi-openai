namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.StaticChunkingStrategy

module StaticChunkingStrategyRequestParam =

  //#region StaticChunkingStrategyRequestParam

  [<CLIMutable>]
  type StaticChunkingStrategyRequestParam = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "static")>]
    Static : StaticChunkingStrategy;
  }

  //#endregion

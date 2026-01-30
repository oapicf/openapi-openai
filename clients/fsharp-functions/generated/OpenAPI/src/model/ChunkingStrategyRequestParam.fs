namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AutoChunkingStrategyRequestParam
open OpenAPI.Model.StaticChunkingStrategy
open OpenAPI.Model.StaticChunkingStrategyRequestParam

module ChunkingStrategyRequestParam =

  //#region ChunkingStrategyRequestParam

  [<CLIMutable>]
  type ChunkingStrategyRequestParam = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "static")>]
    Static : StaticChunkingStrategy;
  }

  //#endregion

namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OtherChunkingStrategyResponseParam
open OpenAPI.Model.StaticChunkingStrategy
open OpenAPI.Model.StaticChunkingStrategyResponseParam

module VectorStoreFileObjectChunkingStrategy =

  //#region VectorStoreFileObjectChunkingStrategy

  [<CLIMutable>]
  type VectorStoreFileObjectChunkingStrategy = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "static")>]
    Static : StaticChunkingStrategy;
  }

  //#endregion

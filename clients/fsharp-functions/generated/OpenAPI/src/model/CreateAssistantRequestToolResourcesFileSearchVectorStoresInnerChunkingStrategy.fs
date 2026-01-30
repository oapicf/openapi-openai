namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AutoChunkingStrategy
open OpenAPI.Model.StaticChunkingStrategy
open OpenAPI.Model.StaticChunkingStrategyStatic

module CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy =

  //#region CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

  [<CLIMutable>]
  type CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "static")>]
    Static : StaticChunkingStrategyStatic;
  }

  //#endregion

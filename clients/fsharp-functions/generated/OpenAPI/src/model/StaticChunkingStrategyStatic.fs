namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module StaticChunkingStrategyStatic =

  //#region StaticChunkingStrategyStatic

  [<CLIMutable>]
  type StaticChunkingStrategyStatic = {
    [<JsonProperty(PropertyName = "max_chunk_size_tokens")>]
    MaxChunkSizeTokens : int;
    [<JsonProperty(PropertyName = "chunk_overlap_tokens")>]
    ChunkOverlapTokens : int;
  }

  //#endregion

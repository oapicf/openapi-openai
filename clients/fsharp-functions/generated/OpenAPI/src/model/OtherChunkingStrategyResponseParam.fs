namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OtherChunkingStrategyResponseParam =

  //#region OtherChunkingStrategyResponseParam

  [<CLIMutable>]
  type OtherChunkingStrategyResponseParam = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion

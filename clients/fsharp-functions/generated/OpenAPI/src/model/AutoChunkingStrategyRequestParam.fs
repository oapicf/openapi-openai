namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AutoChunkingStrategyRequestParam =

  //#region AutoChunkingStrategyRequestParam

  [<CLIMutable>]
  type AutoChunkingStrategyRequestParam = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion

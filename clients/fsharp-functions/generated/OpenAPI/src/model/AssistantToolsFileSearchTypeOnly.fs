namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssistantToolsFileSearchTypeOnly =

  //#region AssistantToolsFileSearchTypeOnly

  [<CLIMutable>]
  type AssistantToolsFileSearchTypeOnly = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion

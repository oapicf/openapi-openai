namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateAssistantRequestToolResourcesCodeInterpreter =

  //#region CreateAssistantRequestToolResourcesCodeInterpreter

  [<CLIMutable>]
  type CreateAssistantRequestToolResourcesCodeInterpreter = {
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
  }

  //#endregion

namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateAssistantFileRequest =

  //#region CreateAssistantFileRequest

  [<CLIMutable>]
  type CreateAssistantFileRequest = {
    [<JsonProperty(PropertyName = "file_id")>]
    FileId : string;
  }

  //#endregion

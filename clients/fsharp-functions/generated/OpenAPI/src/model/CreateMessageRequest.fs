namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateMessageRequest =

  //#region CreateMessageRequest

  [<CLIMutable>]
  type CreateMessageRequest = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : string;
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion

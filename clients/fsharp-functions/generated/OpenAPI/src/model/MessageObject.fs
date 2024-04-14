namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageObjectContentInner
open OpenAPI.Model.MessageObjectIncompleteDetails
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module MessageObject =

  //#region MessageObject

  [<CLIMutable>]
  type MessageObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "thread_id")>]
    ThreadId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "incomplete_details")>]
    IncompleteDetails : MessageObjectIncompleteDetails;
    [<JsonProperty(PropertyName = "completed_at")>]
    CompletedAt : int option;
    [<JsonProperty(PropertyName = "incomplete_at")>]
    IncompleteAt : int option;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : MessageObjectContentInner[];
    [<JsonProperty(PropertyName = "assistant_id")>]
    AssistantId : string option;
    [<JsonProperty(PropertyName = "run_id")>]
    RunId : string option;
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion

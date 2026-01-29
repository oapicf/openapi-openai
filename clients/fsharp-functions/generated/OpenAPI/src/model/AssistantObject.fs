namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.string option

module AssistantObject =

  //#region AssistantObject

  [<CLIMutable>]
  type AssistantObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "instructions")>]
    Instructions : string option;
    [<JsonProperty(PropertyName = "tools")>]
    Tools : AssistantObjectToolsInner[];
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion

namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeConversationItemContentInner

module RealtimeConversationItem =

  //#region RealtimeConversationItem

  [<CLIMutable>]
  type RealtimeConversationItem = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : RealtimeConversationItemContentInner[];
    [<JsonProperty(PropertyName = "call_id")>]
    CallId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "arguments")>]
    Arguments : string;
    [<JsonProperty(PropertyName = "output")>]
    Output : string;
  }

  //#endregion

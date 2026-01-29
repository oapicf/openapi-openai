namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageFileObject =

  //#region MessageFileObject

  [<CLIMutable>]
  type MessageFileObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "message_id")>]
    MessageId : string;
  }

  //#endregion

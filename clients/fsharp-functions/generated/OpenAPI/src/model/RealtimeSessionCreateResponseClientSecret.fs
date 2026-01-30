namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeSessionCreateResponseClientSecret =

  //#region RealtimeSessionCreateResponseClientSecret

  [<CLIMutable>]
  type RealtimeSessionCreateResponseClientSecret = {
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
    [<JsonProperty(PropertyName = "expires_at")>]
    ExpiresAt : int;
  }

  //#endregion

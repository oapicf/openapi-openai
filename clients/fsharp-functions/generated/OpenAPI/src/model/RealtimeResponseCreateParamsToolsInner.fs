namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeResponseCreateParamsToolsInner =

  //#region RealtimeResponseCreateParamsToolsInner

  [<CLIMutable>]
  type RealtimeResponseCreateParamsToolsInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "parameters")>]
    Parameters : obj;
  }

  //#endregion

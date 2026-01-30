namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DoneEvent
open OpenAPI.Model.ErrorEvent
open OpenAPI.Model.MessageStreamEvent
open OpenAPI.Model.RunStepStreamEvent
open OpenAPI.Model.RunStreamEvent
open OpenAPI.Model.ThreadStreamEvent

module AssistantStreamEvent =

  //#region AssistantStreamEvent

  [<CLIMutable>]
  type AssistantStreamEvent = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : bool;
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
  }

  //#endregion

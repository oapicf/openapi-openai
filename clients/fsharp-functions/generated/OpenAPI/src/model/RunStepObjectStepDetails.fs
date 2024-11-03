namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsMessageCreationObject
open OpenAPI.Model.RunStepDetailsMessageCreationObjectMessageCreation
open OpenAPI.Model.RunStepDetailsToolCallsObject
open OpenAPI.Model.RunStepDetailsToolCallsObjectToolCallsInner

module RunStepObjectStepDetails =

  //#region RunStepObjectStepDetails

  [<CLIMutable>]
  type RunStepObjectStepDetails = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "message_creation")>]
    MessageCreation : RunStepDetailsMessageCreationObjectMessageCreation;
    [<JsonProperty(PropertyName = "tool_calls")>]
    ToolCalls : RunStepDetailsToolCallsObjectToolCallsInner[];
  }

  //#endregion

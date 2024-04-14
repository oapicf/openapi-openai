namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaStepDetailsMessageCreationObject
open OpenAPI.Model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

module RunStepDeltaObjectDeltaStepDetails =

  //#region RunStepDeltaObjectDeltaStepDetails

  [<CLIMutable>]
  type RunStepDeltaObjectDeltaStepDetails = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "message_creation")>]
    MessageCreation : RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
    [<JsonProperty(PropertyName = "tool_calls")>]
    ToolCalls : RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[];
  }

  //#endregion

namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsMessageCreationObject
open OpenAPI.Model.RunStepDetailsMessageCreationObjectMessageCreation
open OpenAPI.Model.RunStepDetailsToolCallsObject
open OpenAPI.Model.RunStepDetailsToolCallsObjectToolCallsInner

module RunStepObjectStepDetails =

  //#region RunStepObjectStepDetails

  //#region enums
  type TypeEnum = MessageCreationEnum of string  |  ToolCallsEnum of string  
  //#endregion

  type RunStepObject_step_details = {
    Type : TypeEnum;
    MessageCreation : RunStepDetailsMessageCreationObjectMessageCreation;
    ToolCalls : RunStepDetailsToolCallsObjectToolCallsInner[];
  }
  //#endregion

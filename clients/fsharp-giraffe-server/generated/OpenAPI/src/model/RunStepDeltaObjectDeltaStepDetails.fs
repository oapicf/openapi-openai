namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaStepDetailsMessageCreationObject
open OpenAPI.Model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

module RunStepDeltaObjectDeltaStepDetails =

  //#region RunStepDeltaObjectDeltaStepDetails

  //#region enums
  type TypeEnum = MessageCreationEnum of string  |  ToolCallsEnum of string  
  //#endregion

  type RunStepDeltaObject_delta_step_details = {
    Type : TypeEnum;
    MessageCreation : RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
    ToolCalls : RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[];
  }
  //#endregion

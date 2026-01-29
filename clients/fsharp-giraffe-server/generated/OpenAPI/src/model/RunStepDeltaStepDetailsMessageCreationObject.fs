namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation

module RunStepDeltaStepDetailsMessageCreationObject =

  //#region RunStepDeltaStepDetailsMessageCreationObject

  //#region enums
  type TypeEnum = MessageCreationEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsMessageCreationObject = {
    Type : TypeEnum;
    MessageCreation : RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
  }
  //#endregion

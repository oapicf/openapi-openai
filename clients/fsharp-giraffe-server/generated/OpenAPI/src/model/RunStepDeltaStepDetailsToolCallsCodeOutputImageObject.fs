namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage

module RunStepDeltaStepDetailsToolCallsCodeOutputImageObject =

  //#region RunStepDeltaStepDetailsToolCallsCodeOutputImageObject

  //#region enums
  type TypeEnum = ImageEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsCodeOutputImageObject = {
    Index : int;
    Type : TypeEnum;
    Image : RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
  }
  //#endregion

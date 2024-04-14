namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsCodeOutputImageObjectImage

module RunStepDetailsToolCallsCodeOutputImageObject =

  //#region RunStepDetailsToolCallsCodeOutputImageObject

  //#region enums
  type TypeEnum = ImageEnum of string  
  //#endregion

  type RunStepDetailsToolCallsCodeOutputImageObject = {
    Type : TypeEnum;
    Image : RunStepDetailsToolCallsCodeOutputImageObjectImage;
  }
  //#endregion

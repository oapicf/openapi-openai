namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaObjectDelta

module RunStepDeltaObject =

  //#region RunStepDeltaObject

  //#region enums
  type ObjectEnum = ThreadRunStepDeltaEnum of string  
  //#endregion

  type RunStepDeltaObject = {
    Id : string;
    Object : ObjectEnum;
    Delta : RunStepDeltaObjectDelta;
  }
  //#endregion

namespace OpenAPI.Model

open System
open System.Collections.Generic

module FineTuningJobEvent =

  //#region FineTuningJobEvent

  //#region enums
  type LevelEnum = InfoEnum of string  |  WarnEnum of string  |  ErrorEnum of string  
  //#endregion
  //#region enums
  type ObjectEnum = FineTuningJobEventEnum of string  
  //#endregion

  type FineTuningJobEvent = {
    Id : string;
    CreatedAt : int;
    Level : LevelEnum;
    Message : string;
    Object : ObjectEnum;
  }
  //#endregion

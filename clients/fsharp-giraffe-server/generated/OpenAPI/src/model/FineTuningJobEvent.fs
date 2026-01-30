namespace OpenAPI.Model

open System
open System.Collections.Generic

module FineTuningJobEvent =

  //#region FineTuningJobEvent

  //#region enums
  type ObjectEnum = FineTuningJobEventEnum of string  
  //#endregion
  //#region enums
  type LevelEnum = InfoEnum of string  |  WarnEnum of string  |  ErrorEnum of string  
  //#endregion
  //#region enums
  type TypeEnum = MessageEnum of string  |  MetricsEnum of string  
  //#endregion

  type FineTuningJobEvent = {
    Object : ObjectEnum;
    Id : string;
    CreatedAt : int;
    Level : LevelEnum;
    Message : string;
    Type : TypeEnum;
    Data : obj;
  }
  //#endregion

namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuningJobEvent

module ListFineTuningJobEventsResponse =

  //#region ListFineTuningJobEventsResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ListFineTuningJobEventsResponse = {
    Data : FineTuningJobEvent[];
    Object : ObjectEnum;
  }
  //#endregion

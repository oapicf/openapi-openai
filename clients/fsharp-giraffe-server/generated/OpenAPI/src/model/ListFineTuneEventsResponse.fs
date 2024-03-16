namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuneEvent

module ListFineTuneEventsResponse =

  //#region ListFineTuneEventsResponse


  type ListFineTuneEventsResponse = {
    Object : string;
    Data : FineTuneEvent[];
  }
  //#endregion

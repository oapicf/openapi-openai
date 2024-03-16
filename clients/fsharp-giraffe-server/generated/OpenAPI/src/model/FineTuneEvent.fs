namespace OpenAPI.Model

open System
open System.Collections.Generic

module FineTuneEvent =

  //#region FineTuneEvent


  type FineTuneEvent = {
    Object : string;
    CreatedAt : int;
    Level : string;
    Message : string;
  }
  //#endregion

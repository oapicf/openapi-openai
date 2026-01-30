namespace OpenAPI.Model

open System
open System.Collections.Generic

module BatchRequestCounts =

  //#region BatchRequestCounts


  type Batch_request_counts = {
    Total : int;
    Completed : int;
    Failed : int;
  }
  //#endregion

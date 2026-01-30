namespace OpenAPI.Model

open System
open System.Collections.Generic

module VectorStoreObjectFileCounts =

  //#region VectorStoreObjectFileCounts


  type VectorStoreObject_file_counts = {
    InProgress : int;
    Completed : int;
    Failed : int;
    Cancelled : int;
    Total : int;
  }
  //#endregion

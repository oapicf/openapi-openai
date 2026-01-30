namespace OpenAPI.Model

open System
open System.Collections.Generic

module VectorStoreFileBatchObjectFileCounts =

  //#region VectorStoreFileBatchObjectFileCounts


  type VectorStoreFileBatchObject_file_counts = {
    InProgress : int;
    Completed : int;
    Failed : int;
    Cancelled : int;
    Total : int;
  }
  //#endregion

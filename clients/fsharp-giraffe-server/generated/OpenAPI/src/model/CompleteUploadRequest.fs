namespace OpenAPI.Model

open System
open System.Collections.Generic

module CompleteUploadRequest =

  //#region CompleteUploadRequest


  type CompleteUploadRequest = {
    PartIds : string[];
    Md5 : string;
  }
  //#endregion

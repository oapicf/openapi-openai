namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchErrorsDataInner

module BatchErrors =

  //#region BatchErrors


  type Batch_errors = {
    Object : string;
    Data : BatchErrorsDataInner[];
  }
  //#endregion

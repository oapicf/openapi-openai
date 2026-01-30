namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module BatchErrorsDataInner =

  //#region BatchErrorsDataInner


  type Batch_errors_data_inner = {
    Code : string;
    Message : string;
    Param : string option;
    Line : int option;
  }
  //#endregion

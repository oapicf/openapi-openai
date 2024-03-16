namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateEditRequestModel
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateEditRequest =

  //#region CreateEditRequest


  type CreateEditRequest = {
    Model : CreateEditRequestModel;
    Input : string option;
    Instruction : string;
    N : int option;
    Temperature : decimal option;
    TopP : decimal option;
  }
  //#endregion

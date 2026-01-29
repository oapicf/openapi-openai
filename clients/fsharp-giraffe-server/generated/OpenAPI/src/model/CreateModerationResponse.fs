namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateModerationResponseResultsInner

module CreateModerationResponse =

  //#region CreateModerationResponse


  type CreateModerationResponse = {
    Id : string;
    Model : string;
    Results : CreateModerationResponseResultsInner[];
  }
  //#endregion

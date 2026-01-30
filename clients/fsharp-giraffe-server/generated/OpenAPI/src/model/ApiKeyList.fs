namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdminApiKey

module ApiKeyList =

  //#region ApiKeyList


  type ApiKeyList = {
    Object : string;
    Data : AdminApiKey[];
    HasMore : bool;
    FirstId : string;
    LastId : string;
  }
  //#endregion

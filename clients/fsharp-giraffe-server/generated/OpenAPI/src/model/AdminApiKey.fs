namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdminApiKeyOwner

module AdminApiKey =

  //#region AdminApiKey


  type AdminApiKey = {
    Object : string;
    Id : string;
    Name : string;
    RedactedValue : string;
    Value : string;
    CreatedAt : int64;
    Owner : AdminApiKeyOwner;
  }
  //#endregion

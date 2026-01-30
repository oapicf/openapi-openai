namespace OpenAPI.Model

open System
open System.Collections.Generic

module AdminApiKeyOwner =

  //#region AdminApiKeyOwner


  type AdminApiKey_owner = {
    Type : string;
    Id : string;
    Name : string;
    CreatedAt : int64;
    Role : string;
  }
  //#endregion

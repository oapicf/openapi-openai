namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProjectApiKeyOwner

module ProjectApiKey =

  //#region ProjectApiKey

  //#region enums
  type ObjectEnum = OrganizationProjectApiKeyEnum of string  
  //#endregion

  type ProjectApiKey = {
    Object : ObjectEnum;
    RedactedValue : string;
    Name : string;
    CreatedAt : int;
    Id : string;
    Owner : ProjectApiKeyOwner;
  }
  //#endregion

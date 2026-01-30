namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuditLog

module ListAuditLogsResponse =

  //#region ListAuditLogsResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ListAuditLogsResponse = {
    Object : ObjectEnum;
    Data : AuditLog[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion

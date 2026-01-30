namespace OpenAPI
open AuditLogsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AuditLogsApiServiceInterface =

    //#region Service interface
    type IAuditLogsApiService =
      abstract member ListAuditLogs:HttpContext -> ListAuditLogsArgs->ListAuditLogsResult
    //#endregion
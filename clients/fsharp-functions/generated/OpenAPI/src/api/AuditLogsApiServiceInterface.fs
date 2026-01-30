namespace OpenAPI
open AuditLogsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AuditLogsApiServiceInterface =

    //#region Service interface
    type IAuditLogsApiService =
      abstract member ListAuditLogs : unit -> ListAuditLogsResult
    //#endregion
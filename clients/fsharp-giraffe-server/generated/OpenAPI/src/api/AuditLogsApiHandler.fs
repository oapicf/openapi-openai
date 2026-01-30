namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AuditLogsApiHandlerParams
open AuditLogsApiServiceInterface
open AuditLogsApiServiceImplementation
open OpenAPI.Model.AuditLogEventType
open OpenAPI.Model.ListAuditLogsEffectiveAtParameter
open OpenAPI.Model.ListAuditLogsResponse

module AuditLogsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ListAuditLogs
    /// <summary>
    /// List user actions and configuration changes within this organization.
    /// </summary>

    let ListAuditLogs  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListAuditLogsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ListAuditLogsArgs
          let result = AuditLogsApiService.ListAuditLogs ctx serviceArgs
          return! (match result with
                      | ListAuditLogsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion


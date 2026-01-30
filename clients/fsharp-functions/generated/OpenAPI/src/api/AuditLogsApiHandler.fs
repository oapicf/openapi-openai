namespace OpenAPI

open AuditLogsApiHandlerParams
open AuditLogsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module AuditLogsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ListAuditLogs
    /// <summary>
    /// List user actions and configuration changes within this organization.
    /// </summary>
   [<FunctionName("ListAuditLogs")>]
    let ListAuditLogs
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/audit_logs")>]
        req:HttpRequest ) =

      let result = AuditLogsApiService.ListAuditLogs ()
      match result with
      | ListAuditLogsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))


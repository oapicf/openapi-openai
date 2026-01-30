namespace OpenAPI
open OpenAPI.Model.AuditLogEventType
open OpenAPI.Model.ListAuditLogsEffectiveAtParameter
open OpenAPI.Model.ListAuditLogsResponse
open AuditLogsApiHandlerParams
open AuditLogsApiServiceInterface
open System.Collections.Generic
open System

module AuditLogsApiServiceImplementation =

    //#region Service implementation
    type AuditLogsApiServiceImpl() =
      interface IAuditLogsApiService with

        member this.ListAuditLogs () =
            let content = "Audit logs listed successfully." :> obj :?> ListAuditLogsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListAuditLogsStatusCode200 { content = content }

      //#endregion

    let AuditLogsApiService = AuditLogsApiServiceImpl() :> IAuditLogsApiService
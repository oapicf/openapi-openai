namespace OpenAPI

open OpenAPI.Model.AuditLogEventType
open OpenAPI.Model.ListAuditLogsEffectiveAtParameter
open OpenAPI.Model.ListAuditLogsResponse
open System.Collections.Generic
open System

module AuditLogsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ListAuditLogsQueryParams = {
      effectiveAt : ListAuditLogsEffectiveAtParameter option;


      projectIds : string[] option;


      eventTypes : AuditLogEventType[] option;


      actorIds : string[] option;


      actorEmails : string[] option;


      resourceIds : string[] option;


      limit : int option;


      after : string option;


      before : string option;

    }
    //#endregion


    type ListAuditLogsStatusCode200Response = {
      content:ListAuditLogsResponse;
      
    }
    type ListAuditLogsResult = ListAuditLogsStatusCode200 of ListAuditLogsStatusCode200Response

    type ListAuditLogsArgs = {
      queryParams:Result<ListAuditLogsQueryParams,string>;
    }

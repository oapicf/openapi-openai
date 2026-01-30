namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open AuditLogsApiHandlerTestsHelper
open OpenAPI.AuditLogsApiHandler
open OpenAPI.AuditLogsApiHandlerParams
open OpenAPI.Model.AuditLogEventType
open OpenAPI.Model.ListAuditLogsEffectiveAtParameter
open OpenAPI.Model.ListAuditLogsResponse

module AuditLogsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``ListAuditLogs - List user actions and configuration changes within this organization. returns 200 where Audit logs listed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/audit_logs" + "?effectiveAt=ADDME&projectIds=ADDME&eventTypes=ADDME&actorIds=ADDME&actorEmails=ADDME&resourceIds=ADDME&limit=ADDME&after=ADDME&before=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }


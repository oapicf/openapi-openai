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
open InvitesApiHandlerTestsHelper
open OpenAPI.InvitesApiHandler
open OpenAPI.InvitesApiHandlerParams
open OpenAPI.Model.Invite
open OpenAPI.Model.InviteDeleteResponse
open OpenAPI.Model.InviteListResponse
open OpenAPI.Model.InviteRequest

module InvitesApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``DeleteInvite - Delete an invite. If the invite has already been accepted, it cannot be deleted. returns 200 where Invite deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/invites/{invite_id}".Replace("inviteId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``InviteUser - Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. returns 200 where User invited successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/invites"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getInviteUserExample "application/json")
      // or pass a body of type InviteRequest
      let body = obj() :?> InviteRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ListInvites - Returns a list of invites in the organization. returns 200 where Invites listed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/invites" + "?limit=ADDME&after=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RetrieveInvite - Retrieves an invite. returns 200 where Invite retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/invites/{invite_id}".Replace("inviteId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }


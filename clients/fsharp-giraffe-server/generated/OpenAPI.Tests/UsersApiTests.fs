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
open UsersApiHandlerTestsHelper
open OpenAPI.UsersApiHandler
open OpenAPI.UsersApiHandlerParams
open OpenAPI.Model.User
open OpenAPI.Model.UserDeleteResponse
open OpenAPI.Model.UserListResponse
open OpenAPI.Model.UserRoleUpdateRequest

module UsersApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``DeleteUser - Deletes a user from the organization. returns 200 where User deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/users/{user_id}".Replace("userId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListUsers - Lists all of the users in the organization. returns 200 where Users listed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/users" + "?limit=ADDME&after=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ModifyUser - Modifies a user&#39;s role in the organization. returns 200 where User role updated successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/users/{user_id}".Replace("userId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyUserExample "application/json")
      // or pass a body of type UserRoleUpdateRequest
      let body = obj() :?> UserRoleUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``RetrieveUser - Retrieves a user by their identifier. returns 200 where User retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/users/{user_id}".Replace("userId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }


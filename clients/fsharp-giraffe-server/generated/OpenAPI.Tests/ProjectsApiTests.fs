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
open ProjectsApiHandlerTestsHelper
open OpenAPI.ProjectsApiHandler
open OpenAPI.ProjectsApiHandlerParams
open OpenAPI.Model.ErrorResponse
open OpenAPI.Model.Project
open OpenAPI.Model.ProjectApiKey
open OpenAPI.Model.ProjectApiKeyDeleteResponse
open OpenAPI.Model.ProjectApiKeyListResponse
open OpenAPI.Model.ProjectCreateRequest
open OpenAPI.Model.ProjectListResponse
open OpenAPI.Model.ProjectRateLimit
open OpenAPI.Model.ProjectRateLimitListResponse
open OpenAPI.Model.ProjectRateLimitUpdateRequest
open OpenAPI.Model.ProjectServiceAccount
open OpenAPI.Model.ProjectServiceAccountCreateRequest
open OpenAPI.Model.ProjectServiceAccountCreateResponse
open OpenAPI.Model.ProjectServiceAccountDeleteResponse
open OpenAPI.Model.ProjectServiceAccountListResponse
open OpenAPI.Model.ProjectUpdateRequest
open OpenAPI.Model.ProjectUser
open OpenAPI.Model.ProjectUserCreateRequest
open OpenAPI.Model.ProjectUserDeleteResponse
open OpenAPI.Model.ProjectUserListResponse
open OpenAPI.Model.ProjectUserUpdateRequest

module ProjectsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``ArchiveProject - Archives a project in the organization. Archived projects cannot be used or updated. returns 200 where Project archived successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/archive".Replace("projectId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CreateProject - Create a new project in the organization. Projects can be created and archived, but cannot be deleted. returns 200 where Project created successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateProjectExample "application/json")
      // or pass a body of type ProjectCreateRequest
      let body = obj() :?> ProjectCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateProjectServiceAccount - Creates a new service account in the project. This also returns an unredacted API key for the service account. returns 200 where Project service account created successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/service_accounts".Replace("projectId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateProjectServiceAccountExample "application/json")
      // or pass a body of type ProjectServiceAccountCreateRequest
      let body = obj() :?> ProjectServiceAccountCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateProjectServiceAccount - Creates a new service account in the project. This also returns an unredacted API key for the service account. returns 400 where Error response when project is archived.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/service_accounts".Replace("projectId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateProjectServiceAccountExample "application/json")
      // or pass a body of type ProjectServiceAccountCreateRequest
      let body = obj() :?> ProjectServiceAccountCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateProjectUser - Adds a user to the project. Users must already be members of the organization to be added to a project. returns 200 where User added to project successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/users".Replace("projectId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateProjectUserExample "application/json")
      // or pass a body of type ProjectUserCreateRequest
      let body = obj() :?> ProjectUserCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateProjectUser - Adds a user to the project. Users must already be members of the organization to be added to a project. returns 400 where Error response for various conditions.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/users".Replace("projectId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateProjectUserExample "application/json")
      // or pass a body of type ProjectUserCreateRequest
      let body = obj() :?> ProjectUserCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteProjectApiKey - Deletes an API key from the project. returns 200 where Project API key deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/api_keys/{key_id}".Replace("projectId", "ADDME").Replace("keyId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteProjectApiKey - Deletes an API key from the project. returns 400 where Error response for various conditions.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/api_keys/{key_id}".Replace("projectId", "ADDME").Replace("keyId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteProjectServiceAccount - Deletes a service account from the project. returns 200 where Project service account deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}".Replace("projectId", "ADDME").Replace("serviceAccountId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteProjectUser - Deletes a user from the project. returns 200 where Project user deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/users/{user_id}".Replace("projectId", "ADDME").Replace("userId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteProjectUser - Deletes a user from the project. returns 400 where Error response for various conditions.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/users/{user_id}".Replace("projectId", "ADDME").Replace("userId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListProjectApiKeys - Returns a list of API keys in the project. returns 200 where Project API keys listed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/api_keys".Replace("projectId", "ADDME") + "?limit=ADDME&after=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListProjectRateLimits - Returns the rate limits per model for a project. returns 200 where Project rate limits listed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/rate_limits".Replace("projectId", "ADDME") + "?limit=ADDME&after=ADDME&before=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListProjectServiceAccounts - Returns a list of service accounts in the project. returns 200 where Project service accounts listed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/service_accounts".Replace("projectId", "ADDME") + "?limit=ADDME&after=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListProjectServiceAccounts - Returns a list of service accounts in the project. returns 400 where Error response when project is archived.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/service_accounts".Replace("projectId", "ADDME") + "?limit=ADDME&after=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListProjectUsers - Returns a list of users in the project. returns 200 where Project users listed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/users".Replace("projectId", "ADDME") + "?limit=ADDME&after=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListProjectUsers - Returns a list of users in the project. returns 400 where Error response when project is archived.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/users".Replace("projectId", "ADDME") + "?limit=ADDME&after=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListProjects - Returns a list of projects. returns 200 where Projects listed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects" + "?limit=ADDME&after=ADDME&includeArchived=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ModifyProject - Modifies a project in the organization. returns 200 where Project updated successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}".Replace("projectId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyProjectExample "application/json")
      // or pass a body of type ProjectUpdateRequest
      let body = obj() :?> ProjectUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ModifyProject - Modifies a project in the organization. returns 400 where Error response when updating the default project.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}".Replace("projectId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyProjectExample "application/json")
      // or pass a body of type ProjectUpdateRequest
      let body = obj() :?> ProjectUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ModifyProjectUser - Modifies a user&#39;s role in the project. returns 200 where Project user&#39;s role updated successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/users/{user_id}".Replace("projectId", "ADDME").Replace("userId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyProjectUserExample "application/json")
      // or pass a body of type ProjectUserUpdateRequest
      let body = obj() :?> ProjectUserUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ModifyProjectUser - Modifies a user&#39;s role in the project. returns 400 where Error response for various conditions.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/users/{user_id}".Replace("projectId", "ADDME").Replace("userId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyProjectUserExample "application/json")
      // or pass a body of type ProjectUserUpdateRequest
      let body = obj() :?> ProjectUserUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``RetrieveProject - Retrieves a project. returns 200 where Project retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}".Replace("projectId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RetrieveProjectApiKey - Retrieves an API key in the project. returns 200 where Project API key retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/api_keys/{key_id}".Replace("projectId", "ADDME").Replace("keyId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RetrieveProjectServiceAccount - Retrieves a service account in the project. returns 200 where Project service account retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}".Replace("projectId", "ADDME").Replace("serviceAccountId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RetrieveProjectUser - Retrieves a user in the project. returns 200 where Project user retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/users/{user_id}".Replace("projectId", "ADDME").Replace("userId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateProjectRateLimits - Updates a project rate limit. returns 200 where Project rate limit updated successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}".Replace("projectId", "ADDME").Replace("rateLimitId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateProjectRateLimitsExample "application/json")
      // or pass a body of type ProjectRateLimitUpdateRequest
      let body = obj() :?> ProjectRateLimitUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateProjectRateLimits - Updates a project rate limit. returns 400 where Error response for various conditions.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}".Replace("projectId", "ADDME").Replace("rateLimitId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateProjectRateLimitsExample "application/json")
      // or pass a body of type ProjectRateLimitUpdateRequest
      let body = obj() :?> ProjectRateLimitUpdateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }


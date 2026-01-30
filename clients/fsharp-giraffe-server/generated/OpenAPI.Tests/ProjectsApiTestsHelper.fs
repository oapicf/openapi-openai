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
open TestHelper
open OpenAPI.ProjectsApiHandler
open OpenAPI.ProjectsApiHandlerParams

module ProjectsApiHandlerTestsHelper =

  ()


  let mutable CreateProjectExamples = Map.empty
  let mutable CreateProjectBody = ""

  CreateProjectBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;name&quot;
}"
  CreateProjectExamples <- CreateProjectExamples.Add("application/json", CreateProjectBody)

  let getCreateProjectExample mediaType =
    CreateProjectExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateProjectServiceAccountExamples = Map.empty
  let mutable CreateProjectServiceAccountBody = ""

  CreateProjectServiceAccountBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;name&quot;
}"
  CreateProjectServiceAccountExamples <- CreateProjectServiceAccountExamples.Add("application/json", CreateProjectServiceAccountBody)

  let getCreateProjectServiceAccountExample mediaType =
    CreateProjectServiceAccountExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateProjectUserExamples = Map.empty
  let mutable CreateProjectUserBody = ""

  CreateProjectUserBody <- WebUtility.HtmlDecode "{
  &quot;role&quot; : &quot;owner&quot;,
  &quot;user_id&quot; : &quot;user_id&quot;
}"
  CreateProjectUserExamples <- CreateProjectUserExamples.Add("application/json", CreateProjectUserBody)

  let getCreateProjectUserExample mediaType =
    CreateProjectUserExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()


  let mutable ModifyProjectExamples = Map.empty
  let mutable ModifyProjectBody = ""

  ModifyProjectBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;name&quot;
}"
  ModifyProjectExamples <- ModifyProjectExamples.Add("application/json", ModifyProjectBody)

  let getModifyProjectExample mediaType =
    ModifyProjectExamples.[mediaType]
      |> getConverter mediaType

  let mutable ModifyProjectUserExamples = Map.empty
  let mutable ModifyProjectUserBody = ""

  ModifyProjectUserBody <- WebUtility.HtmlDecode "{
  &quot;role&quot; : &quot;owner&quot;
}"
  ModifyProjectUserExamples <- ModifyProjectUserExamples.Add("application/json", ModifyProjectUserBody)

  let getModifyProjectUserExample mediaType =
    ModifyProjectUserExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable UpdateProjectRateLimitsExamples = Map.empty
  let mutable UpdateProjectRateLimitsBody = ""

  UpdateProjectRateLimitsBody <- WebUtility.HtmlDecode "{
  &quot;batch_1_day_max_input_tokens&quot; : 2,
  &quot;max_tokens_per_1_minute&quot; : 6,
  &quot;max_images_per_1_minute&quot; : 1,
  &quot;max_audio_megabytes_per_1_minute&quot; : 5,
  &quot;max_requests_per_1_minute&quot; : 0,
  &quot;max_requests_per_1_day&quot; : 5
}"
  UpdateProjectRateLimitsExamples <- UpdateProjectRateLimitsExamples.Add("application/json", UpdateProjectRateLimitsBody)

  let getUpdateProjectRateLimitsExample mediaType =
    UpdateProjectRateLimitsExamples.[mediaType]
      |> getConverter mediaType

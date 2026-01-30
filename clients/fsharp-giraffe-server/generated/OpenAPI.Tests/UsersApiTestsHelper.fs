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
open OpenAPI.UsersApiHandler
open OpenAPI.UsersApiHandlerParams

module UsersApiHandlerTestsHelper =

  ()

  ()


  let mutable ModifyUserExamples = Map.empty
  let mutable ModifyUserBody = ""

  ModifyUserBody <- WebUtility.HtmlDecode "{
  &quot;role&quot; : &quot;owner&quot;
}"
  ModifyUserExamples <- ModifyUserExamples.Add("application/json", ModifyUserBody)

  let getModifyUserExample mediaType =
    ModifyUserExamples.[mediaType]
      |> getConverter mediaType
  ()


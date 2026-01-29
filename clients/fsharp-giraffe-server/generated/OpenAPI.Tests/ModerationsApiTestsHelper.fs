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
open OpenAPI.ModerationsApiHandler
open OpenAPI.ModerationsApiHandlerParams

module ModerationsApiHandlerTestsHelper =


  let mutable CreateModerationExamples = Map.empty
  let mutable CreateModerationBody = ""

  CreateModerationBody <- WebUtility.HtmlDecode "{
  &quot;input&quot; : &quot;I want to kill them.&quot;,
  &quot;model&quot; : &quot;text-moderation-stable&quot;
}"
  CreateModerationExamples <- CreateModerationExamples.Add("application/json", CreateModerationBody)

  let getCreateModerationExample mediaType =
    CreateModerationExamples.[mediaType]
      |> getConverter mediaType

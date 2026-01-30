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
open OpenAPI.DefaultApiHandler
open OpenAPI.DefaultApiHandlerParams

module DefaultApiHandlerTestsHelper =


  let mutable AdminApiKeysCreateExamples = Map.empty
  let mutable AdminApiKeysCreateBody = ""

  AdminApiKeysCreateBody <- WebUtility.HtmlDecode ""
  AdminApiKeysCreateExamples <- AdminApiKeysCreateExamples.Add("", AdminApiKeysCreateBody)

  let getAdminApiKeysCreateExample mediaType =
    AdminApiKeysCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


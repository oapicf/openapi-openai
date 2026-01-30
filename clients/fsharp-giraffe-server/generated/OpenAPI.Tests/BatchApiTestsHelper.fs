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
open OpenAPI.BatchApiHandler
open OpenAPI.BatchApiHandlerParams

module BatchApiHandlerTestsHelper =

  ()


  let mutable CreateBatchExamples = Map.empty
  let mutable CreateBatchBody = ""

  CreateBatchBody <- WebUtility.HtmlDecode ""
  CreateBatchExamples <- CreateBatchExamples.Add("", CreateBatchBody)

  let getCreateBatchExample mediaType =
    CreateBatchExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


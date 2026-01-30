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
open OpenAPI.InvitesApiHandler
open OpenAPI.InvitesApiHandlerParams

module InvitesApiHandlerTestsHelper =

  ()


  let mutable InviteUserExamples = Map.empty
  let mutable InviteUserBody = ""

  InviteUserBody <- WebUtility.HtmlDecode "{
  &quot;role&quot; : &quot;reader&quot;,
  &quot;projects&quot; : [ {
    &quot;role&quot; : &quot;member&quot;,
    &quot;id&quot; : &quot;id&quot;
  }, {
    &quot;role&quot; : &quot;member&quot;,
    &quot;id&quot; : &quot;id&quot;
  } ],
  &quot;email&quot; : &quot;email&quot;
}"
  InviteUserExamples <- InviteUserExamples.Add("application/json", InviteUserBody)

  let getInviteUserExample mediaType =
    InviteUserExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


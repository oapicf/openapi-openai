namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateSpeechRequestModel

module CreateSpeechRequest =

  //#region CreateSpeechRequest

  [<CLIMutable>]
  type CreateSpeechRequest = {
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateSpeechRequestModel;
    [<JsonProperty(PropertyName = "input")>]
    Input : string;
    [<JsonProperty(PropertyName = "voice")>]
    Voice : string;
    [<JsonProperty(PropertyName = "response_format")>]
    ResponseFormat : string;
    [<JsonProperty(PropertyName = "speed")>]
    Speed : decimal;
  }

  //#endregion

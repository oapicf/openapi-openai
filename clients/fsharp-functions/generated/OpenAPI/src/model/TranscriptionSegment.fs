namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TranscriptionSegment =

  //#region TranscriptionSegment

  [<CLIMutable>]
  type TranscriptionSegment = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "seek")>]
    Seek : int;
    [<JsonProperty(PropertyName = "start")>]
    Start : float;
    [<JsonProperty(PropertyName = "end")>]
    End : float;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "tokens")>]
    Tokens : int[];
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : float;
    [<JsonProperty(PropertyName = "avg_logprob")>]
    AvgLogprob : float;
    [<JsonProperty(PropertyName = "compression_ratio")>]
    CompressionRatio : float;
    [<JsonProperty(PropertyName = "no_speech_prob")>]
    NoSpeechProb : float;
  }

  //#endregion

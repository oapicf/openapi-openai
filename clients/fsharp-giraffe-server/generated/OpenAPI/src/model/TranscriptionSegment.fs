namespace OpenAPI.Model

open System
open System.Collections.Generic

module TranscriptionSegment =

  //#region TranscriptionSegment


  type TranscriptionSegment = {
    Id : int;
    Seek : int;
    Start : float;
    End : float;
    Text : string;
    Tokens : int[];
    Temperature : float;
    AvgLogprob : float;
    CompressionRatio : float;
    NoSpeechProb : float;
  }
  //#endregion

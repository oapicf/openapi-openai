namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AudioResponseFormat =

  //#region AudioResponseFormat

  let JsonEnum = "json"
  let TextEnum = "text"
  let SrtEnum = "srt"
  let VerboseJsonEnum = "verbose_json"
  let VttEnum = "vtt"
  type AudioResponseFormat = string

  //#endregion

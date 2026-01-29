namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open System.Collections.Generic

module ChatCompletionFunctions =

  //#region ChatCompletionFunctions


  type ChatCompletionFunctions = {
    Description : string;
    Name : string;
    Parameters : IDictionary<string, AnyType>;
  }
  //#endregion

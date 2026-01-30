namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeResponseCreateParamsToolsInner =

  //#region RealtimeResponseCreateParamsToolsInner

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type RealtimeResponseCreateParams_tools_inner = {
    Type : TypeEnum;
    Name : string;
    Description : string;
    Parameters : obj;
  }
  //#endregion

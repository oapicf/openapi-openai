namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UsageTimeBucketResultInner

module UsageTimeBucket =

  //#region UsageTimeBucket

  //#region enums
  type ObjectEnum = BucketEnum of string  
  //#endregion

  type UsageTimeBucket = {
    Object : ObjectEnum;
    StartTime : int;
    EndTime : int;
    Result : UsageTimeBucketResultInner[];
  }
  //#endregion

namespace OpenAPI

open OpenAPI.Model.CreateFineTuningJobRequest
open OpenAPI.Model.FineTuningJob
open OpenAPI.Model.ListFineTuningJobCheckpointsResponse
open OpenAPI.Model.ListFineTuningJobEventsResponse
open OpenAPI.Model.ListPaginatedFineTuningJobsResponse
open System.Collections.Generic
open System

module FineTuningApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CancelFineTuningJobPathParams = {
      fineTuningJobId : string ;
    }
    //#endregion


    type CancelFineTuningJobStatusCode200Response = {
      content:FineTuningJob;
      
    }
    type CancelFineTuningJobResult = CancelFineTuningJobStatusCode200 of CancelFineTuningJobStatusCode200Response

    type CancelFineTuningJobArgs = {
      pathParams:CancelFineTuningJobPathParams;
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateFineTuningJobBodyParams = CreateFineTuningJobRequest
    //#endregion


    type CreateFineTuningJobStatusCode200Response = {
      content:FineTuningJob;
      
    }
    type CreateFineTuningJobResult = CreateFineTuningJobStatusCode200 of CreateFineTuningJobStatusCode200Response

    type CreateFineTuningJobArgs = {
      bodyParams:CreateFineTuningJobBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListFineTuningEventsPathParams = {
      fineTuningJobId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListFineTuningEventsQueryParams = {
      after : string option;


      limit : int option;

    }
    //#endregion


    type ListFineTuningEventsStatusCode200Response = {
      content:ListFineTuningJobEventsResponse;
      
    }
    type ListFineTuningEventsResult = ListFineTuningEventsStatusCode200 of ListFineTuningEventsStatusCode200Response

    type ListFineTuningEventsArgs = {
      pathParams:ListFineTuningEventsPathParams;
      queryParams:Result<ListFineTuningEventsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListFineTuningJobCheckpointsPathParams = {
      fineTuningJobId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListFineTuningJobCheckpointsQueryParams = {
      after : string option;


      limit : int option;

    }
    //#endregion


    type ListFineTuningJobCheckpointsStatusCode200Response = {
      content:ListFineTuningJobCheckpointsResponse;
      
    }
    type ListFineTuningJobCheckpointsResult = ListFineTuningJobCheckpointsStatusCode200 of ListFineTuningJobCheckpointsStatusCode200Response

    type ListFineTuningJobCheckpointsArgs = {
      pathParams:ListFineTuningJobCheckpointsPathParams;
      queryParams:Result<ListFineTuningJobCheckpointsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ListPaginatedFineTuningJobsQueryParams = {
      after : string option;


      limit : int option;

    }
    //#endregion


    type ListPaginatedFineTuningJobsStatusCode200Response = {
      content:ListPaginatedFineTuningJobsResponse;
      
    }
    type ListPaginatedFineTuningJobsResult = ListPaginatedFineTuningJobsStatusCode200 of ListPaginatedFineTuningJobsStatusCode200Response

    type ListPaginatedFineTuningJobsArgs = {
      queryParams:Result<ListPaginatedFineTuningJobsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveFineTuningJobPathParams = {
      fineTuningJobId : string ;
    }
    //#endregion


    type RetrieveFineTuningJobStatusCode200Response = {
      content:FineTuningJob;
      
    }
    type RetrieveFineTuningJobResult = RetrieveFineTuningJobStatusCode200 of RetrieveFineTuningJobStatusCode200Response

    type RetrieveFineTuningJobArgs = {
      pathParams:RetrieveFineTuningJobPathParams;
    }

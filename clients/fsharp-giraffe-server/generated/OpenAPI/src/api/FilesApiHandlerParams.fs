namespace OpenAPI

open OpenAPI.Model.DeleteFileResponse
open OpenAPI.Model.ListFilesResponse
open OpenAPI.Model.OpenAIFile
open System.Collections.Generic
open System

module FilesApiHandlerParams =


    //#region Form parameters
    [<CLIMutable>]
    type CreateFileFormParams = {
      file : System.IO.Stream ;
    //#endregion

    //#region Form parameters
      purpose : string ;
    }
    //#endregion


    type CreateFileStatusCode200Response = {
      content:OpenAIFile;
      
    }
    type CreateFileResult = CreateFileStatusCode200 of CreateFileStatusCode200Response

    type CreateFileArgs = {
      formParams:Result<CreateFileFormParams,string>
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteFilePathParams = {
      fileId : string ;
    }
    //#endregion


    type DeleteFileStatusCode200Response = {
      content:DeleteFileResponse;
      
    }
    type DeleteFileResult = DeleteFileStatusCode200 of DeleteFileStatusCode200Response

    type DeleteFileArgs = {
      pathParams:DeleteFilePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DownloadFilePathParams = {
      fileId : string ;
    }
    //#endregion


    type DownloadFileStatusCode200Response = {
      content:string;
      
    }
    type DownloadFileResult = DownloadFileStatusCode200 of DownloadFileStatusCode200Response

    type DownloadFileArgs = {
      pathParams:DownloadFilePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ListFilesQueryParams = {
      purpose : string option;

    }
    //#endregion


    type ListFilesStatusCode200Response = {
      content:ListFilesResponse;
      
    }
    type ListFilesResult = ListFilesStatusCode200 of ListFilesStatusCode200Response

    type ListFilesArgs = {
      queryParams:Result<ListFilesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveFilePathParams = {
      fileId : string ;
    }
    //#endregion


    type RetrieveFileStatusCode200Response = {
      content:OpenAIFile;
      
    }
    type RetrieveFileResult = RetrieveFileStatusCode200 of RetrieveFileStatusCode200Response

    type RetrieveFileArgs = {
      pathParams:RetrieveFilePathParams;
    }

// tslint:disable
/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    DeleteFileResponse,
    DeleteFileResponseFromJSON,
    DeleteFileResponseToJSON,
    ListFilesResponse,
    ListFilesResponseFromJSON,
    ListFilesResponseToJSON,
    OpenAIFile,
    OpenAIFileFromJSON,
    OpenAIFileToJSON,
} from '../models';

export interface CreateFileRequest {
    file: Blob;
    purpose: CreateFilePurposeEnum;
}

export interface DeleteFileRequest {
    fileId: string;
}

export interface DownloadFileRequest {
    fileId: string;
}

export interface ListFilesRequest {
    purpose?: string;
}

export interface RetrieveFileRequest {
    fileId: string;
}


/**
 * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
 */
function createFileRaw<T>(requestParameters: CreateFileRequest, requestConfig: runtime.TypedQueryConfig<T, OpenAIFile> = {}): QueryConfig<T> {
    if (requestParameters.file === null || requestParameters.file === undefined) {
        throw new runtime.RequiredError('file','Required parameter requestParameters.file was null or undefined when calling createFile.');
    }

    if (requestParameters.purpose === null || requestParameters.purpose === undefined) {
        throw new runtime.RequiredError('purpose','Required parameter requestParameters.purpose was null or undefined when calling createFile.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['bearer'];
    const formData = new FormData();
    if (requestParameters.file !== undefined) {
        formData.append('file', requestParameters.file as any);
    }

    if (requestParameters.purpose !== undefined) {
        formData.append('purpose', requestParameters.purpose as any);
    }

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/files`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: formData,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(OpenAIFileFromJSON(body), text);
    }

    return config;
}

/**
* Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
*/
export function createFile<T>(requestParameters: CreateFileRequest, requestConfig?: runtime.TypedQueryConfig<T, OpenAIFile>): QueryConfig<T> {
    return createFileRaw(requestParameters, requestConfig);
}

/**
 * Delete a file.
 */
function deleteFileRaw<T>(requestParameters: DeleteFileRequest, requestConfig: runtime.TypedQueryConfig<T, DeleteFileResponse> = {}): QueryConfig<T> {
    if (requestParameters.fileId === null || requestParameters.fileId === undefined) {
        throw new runtime.RequiredError('fileId','Required parameter requestParameters.fileId was null or undefined when calling deleteFile.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['bearer'];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/files/{file_id}`.replace(`{${"file_id"}}`, encodeURIComponent(String(requestParameters.fileId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'DELETE',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(DeleteFileResponseFromJSON(body), text);
    }

    return config;
}

/**
* Delete a file.
*/
export function deleteFile<T>(requestParameters: DeleteFileRequest, requestConfig?: runtime.TypedQueryConfig<T, DeleteFileResponse>): QueryConfig<T> {
    return deleteFileRaw(requestParameters, requestConfig);
}

/**
 * Returns the contents of the specified file.
 */
function downloadFileRaw<T>(requestParameters: DownloadFileRequest, requestConfig: runtime.TypedQueryConfig<T, string> = {}): QueryConfig<T> {
    if (requestParameters.fileId === null || requestParameters.fileId === undefined) {
        throw new runtime.RequiredError('fileId','Required parameter requestParameters.fileId was null or undefined when calling downloadFile.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['bearer'];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/files/{file_id}/content`.replace(`{${"file_id"}}`, encodeURIComponent(String(requestParameters.fileId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        throw "OH NO";
    }

    return config;
}

/**
* Returns the contents of the specified file.
*/
export function downloadFile<T>(requestParameters: DownloadFileRequest, requestConfig?: runtime.TypedQueryConfig<T, string>): QueryConfig<T> {
    return downloadFileRaw(requestParameters, requestConfig);
}

/**
 * Returns a list of files that belong to the user\'s organization.
 */
function listFilesRaw<T>(requestParameters: ListFilesRequest, requestConfig: runtime.TypedQueryConfig<T, ListFilesResponse> = {}): QueryConfig<T> {
    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.purpose !== undefined) {
        queryParameters['purpose'] = requestParameters.purpose;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['bearer'];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/files`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ListFilesResponseFromJSON(body), text);
    }

    return config;
}

/**
* Returns a list of files that belong to the user\'s organization.
*/
export function listFiles<T>(requestParameters: ListFilesRequest, requestConfig?: runtime.TypedQueryConfig<T, ListFilesResponse>): QueryConfig<T> {
    return listFilesRaw(requestParameters, requestConfig);
}

/**
 * Returns information about a specific file.
 */
function retrieveFileRaw<T>(requestParameters: RetrieveFileRequest, requestConfig: runtime.TypedQueryConfig<T, OpenAIFile> = {}): QueryConfig<T> {
    if (requestParameters.fileId === null || requestParameters.fileId === undefined) {
        throw new runtime.RequiredError('fileId','Required parameter requestParameters.fileId was null or undefined when calling retrieveFile.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['bearer'];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/files/{file_id}`.replace(`{${"file_id"}}`, encodeURIComponent(String(requestParameters.fileId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(OpenAIFileFromJSON(body), text);
    }

    return config;
}

/**
* Returns information about a specific file.
*/
export function retrieveFile<T>(requestParameters: RetrieveFileRequest, requestConfig?: runtime.TypedQueryConfig<T, OpenAIFile>): QueryConfig<T> {
    return retrieveFileRaw(requestParameters, requestConfig);
}


/**
    * @export
    * @enum {string}
    */
export enum CreateFilePurposeEnum {
    FineTune = 'fine-tune',
    Assistants = 'assistants'
}

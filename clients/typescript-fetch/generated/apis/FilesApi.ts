/* tslint:disable */
/* eslint-disable */
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


import * as runtime from '../runtime';
import type {
  DeleteFileResponse,
  ListFilesResponse,
  OpenAIFile,
} from '../models/index';
import {
    DeleteFileResponseFromJSON,
    DeleteFileResponseToJSON,
    ListFilesResponseFromJSON,
    ListFilesResponseToJSON,
    OpenAIFileFromJSON,
    OpenAIFileToJSON,
} from '../models/index';

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
 * 
 */
export class FilesApi extends runtime.BaseAPI {

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     */
    async createFileRaw(requestParameters: CreateFileRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<OpenAIFile>> {
        if (requestParameters['file'] == null) {
            throw new runtime.RequiredError(
                'file',
                'Required parameter "file" was null or undefined when calling createFile().'
            );
        }

        if (requestParameters['purpose'] == null) {
            throw new runtime.RequiredError(
                'purpose',
                'Required parameter "purpose" was null or undefined when calling createFile().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("ApiKeyAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const consumes: runtime.Consume[] = [
            { contentType: 'multipart/form-data' },
        ];
        // @ts-ignore: canConsumeForm may be unused
        const canConsumeForm = runtime.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): any };
        let useForm = false;
        // use FormData to transmit files using content-type "multipart/form-data"
        useForm = canConsumeForm;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new URLSearchParams();
        }

        if (requestParameters['file'] != null) {
            formParams.append('file', requestParameters['file'] as any);
        }

        if (requestParameters['purpose'] != null) {
            formParams.append('purpose', requestParameters['purpose'] as any);
        }

        const response = await this.request({
            path: `/files`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: formParams,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => OpenAIFileFromJSON(jsonValue));
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     */
    async createFile(requestParameters: CreateFileRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<OpenAIFile> {
        const response = await this.createFileRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Delete a file.
     */
    async deleteFileRaw(requestParameters: DeleteFileRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<DeleteFileResponse>> {
        if (requestParameters['fileId'] == null) {
            throw new runtime.RequiredError(
                'fileId',
                'Required parameter "fileId" was null or undefined when calling deleteFile().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("ApiKeyAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/files/{file_id}`.replace(`{${"file_id"}}`, encodeURIComponent(String(requestParameters['fileId']))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => DeleteFileResponseFromJSON(jsonValue));
    }

    /**
     * Delete a file.
     */
    async deleteFile(requestParameters: DeleteFileRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<DeleteFileResponse> {
        const response = await this.deleteFileRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Returns the contents of the specified file.
     */
    async downloadFileRaw(requestParameters: DownloadFileRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>> {
        if (requestParameters['fileId'] == null) {
            throw new runtime.RequiredError(
                'fileId',
                'Required parameter "fileId" was null or undefined when calling downloadFile().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("ApiKeyAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/files/{file_id}/content`.replace(`{${"file_id"}}`, encodeURIComponent(String(requestParameters['fileId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        if (this.isJsonMime(response.headers.get('content-type'))) {
            return new runtime.JSONApiResponse<string>(response);
        } else {
            return new runtime.TextApiResponse(response) as any;
        }
    }

    /**
     * Returns the contents of the specified file.
     */
    async downloadFile(requestParameters: DownloadFileRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string> {
        const response = await this.downloadFileRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     */
    async listFilesRaw(requestParameters: ListFilesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ListFilesResponse>> {
        const queryParameters: any = {};

        if (requestParameters['purpose'] != null) {
            queryParameters['purpose'] = requestParameters['purpose'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("ApiKeyAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/files`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ListFilesResponseFromJSON(jsonValue));
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     */
    async listFiles(requestParameters: ListFilesRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ListFilesResponse> {
        const response = await this.listFilesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Returns information about a specific file.
     */
    async retrieveFileRaw(requestParameters: RetrieveFileRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<OpenAIFile>> {
        if (requestParameters['fileId'] == null) {
            throw new runtime.RequiredError(
                'fileId',
                'Required parameter "fileId" was null or undefined when calling retrieveFile().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("ApiKeyAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/files/{file_id}`.replace(`{${"file_id"}}`, encodeURIComponent(String(requestParameters['fileId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => OpenAIFileFromJSON(jsonValue));
    }

    /**
     * Returns information about a specific file.
     */
    async retrieveFile(requestParameters: RetrieveFileRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<OpenAIFile> {
        const response = await this.retrieveFileRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

/**
 * @export
 */
export const CreateFilePurposeEnum = {
    FineTune: 'fine-tune',
    Assistants: 'assistants'
} as const;
export type CreateFilePurposeEnum = typeof CreateFilePurposeEnum[keyof typeof CreateFilePurposeEnum];

import localVarRequest from 'request';

export * from './chatCompletionFunctions';
export * from './chatCompletionRequestMessage';
export * from './chatCompletionRequestMessageFunctionCall';
export * from './chatCompletionResponseMessage';
export * from './chatCompletionStreamResponseDelta';
export * from './createChatCompletionRequest';
export * from './createChatCompletionRequestFunctionCall';
export * from './createChatCompletionRequestFunctionCallOneOf';
export * from './createChatCompletionRequestModel';
export * from './createChatCompletionRequestStop';
export * from './createChatCompletionResponse';
export * from './createChatCompletionResponseChoicesInner';
export * from './createChatCompletionStreamResponse';
export * from './createChatCompletionStreamResponseChoicesInner';
export * from './createCompletionRequest';
export * from './createCompletionRequestModel';
export * from './createCompletionRequestPrompt';
export * from './createCompletionRequestStop';
export * from './createCompletionResponse';
export * from './createCompletionResponseChoicesInner';
export * from './createCompletionResponseChoicesInnerLogprobs';
export * from './createCompletionResponseUsage';
export * from './createEditRequest';
export * from './createEditRequestModel';
export * from './createEditResponse';
export * from './createEditResponseChoicesInner';
export * from './createEmbeddingRequest';
export * from './createEmbeddingRequestInput';
export * from './createEmbeddingRequestModel';
export * from './createEmbeddingResponse';
export * from './createEmbeddingResponseDataInner';
export * from './createEmbeddingResponseUsage';
export * from './createFineTuneRequest';
export * from './createFineTuneRequestModel';
export * from './createImageRequest';
export * from './createModerationRequest';
export * from './createModerationRequestInput';
export * from './createModerationRequestModel';
export * from './createModerationResponse';
export * from './createModerationResponseResultsInner';
export * from './createModerationResponseResultsInnerCategories';
export * from './createModerationResponseResultsInnerCategoryScores';
export * from './createTranscriptionRequestModel';
export * from './createTranscriptionResponse';
export * from './createTranslationResponse';
export * from './deleteFileResponse';
export * from './deleteModelResponse';
export * from './errorResponse';
export * from './fineTune';
export * from './fineTuneEvent';
export * from './imagesResponse';
export * from './imagesResponseDataInner';
export * from './listFilesResponse';
export * from './listFineTuneEventsResponse';
export * from './listFineTunesResponse';
export * from './listModelsResponse';
export * from './model';
export * from './modelError';
export * from './openAIFile';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { ChatCompletionFunctions } from './chatCompletionFunctions';
import { ChatCompletionRequestMessage } from './chatCompletionRequestMessage';
import { ChatCompletionRequestMessageFunctionCall } from './chatCompletionRequestMessageFunctionCall';
import { ChatCompletionResponseMessage } from './chatCompletionResponseMessage';
import { ChatCompletionStreamResponseDelta } from './chatCompletionStreamResponseDelta';
import { CreateChatCompletionRequest } from './createChatCompletionRequest';
import { CreateChatCompletionRequestFunctionCall } from './createChatCompletionRequestFunctionCall';
import { CreateChatCompletionRequestFunctionCallOneOf } from './createChatCompletionRequestFunctionCallOneOf';
import { CreateChatCompletionRequestModel } from './createChatCompletionRequestModel';
import { CreateChatCompletionRequestStop } from './createChatCompletionRequestStop';
import { CreateChatCompletionResponse } from './createChatCompletionResponse';
import { CreateChatCompletionResponseChoicesInner } from './createChatCompletionResponseChoicesInner';
import { CreateChatCompletionStreamResponse } from './createChatCompletionStreamResponse';
import { CreateChatCompletionStreamResponseChoicesInner } from './createChatCompletionStreamResponseChoicesInner';
import { CreateCompletionRequest } from './createCompletionRequest';
import { CreateCompletionRequestModel } from './createCompletionRequestModel';
import { CreateCompletionRequestPrompt } from './createCompletionRequestPrompt';
import { CreateCompletionRequestStop } from './createCompletionRequestStop';
import { CreateCompletionResponse } from './createCompletionResponse';
import { CreateCompletionResponseChoicesInner } from './createCompletionResponseChoicesInner';
import { CreateCompletionResponseChoicesInnerLogprobs } from './createCompletionResponseChoicesInnerLogprobs';
import { CreateCompletionResponseUsage } from './createCompletionResponseUsage';
import { CreateEditRequest } from './createEditRequest';
import { CreateEditRequestModel } from './createEditRequestModel';
import { CreateEditResponse } from './createEditResponse';
import { CreateEditResponseChoicesInner } from './createEditResponseChoicesInner';
import { CreateEmbeddingRequest } from './createEmbeddingRequest';
import { CreateEmbeddingRequestInput } from './createEmbeddingRequestInput';
import { CreateEmbeddingRequestModel } from './createEmbeddingRequestModel';
import { CreateEmbeddingResponse } from './createEmbeddingResponse';
import { CreateEmbeddingResponseDataInner } from './createEmbeddingResponseDataInner';
import { CreateEmbeddingResponseUsage } from './createEmbeddingResponseUsage';
import { CreateFineTuneRequest } from './createFineTuneRequest';
import { CreateFineTuneRequestModel } from './createFineTuneRequestModel';
import { CreateImageRequest } from './createImageRequest';
import { CreateModerationRequest } from './createModerationRequest';
import { CreateModerationRequestInput } from './createModerationRequestInput';
import { CreateModerationRequestModel } from './createModerationRequestModel';
import { CreateModerationResponse } from './createModerationResponse';
import { CreateModerationResponseResultsInner } from './createModerationResponseResultsInner';
import { CreateModerationResponseResultsInnerCategories } from './createModerationResponseResultsInnerCategories';
import { CreateModerationResponseResultsInnerCategoryScores } from './createModerationResponseResultsInnerCategoryScores';
import { CreateTranscriptionRequestModel } from './createTranscriptionRequestModel';
import { CreateTranscriptionResponse } from './createTranscriptionResponse';
import { CreateTranslationResponse } from './createTranslationResponse';
import { DeleteFileResponse } from './deleteFileResponse';
import { DeleteModelResponse } from './deleteModelResponse';
import { ErrorResponse } from './errorResponse';
import { FineTune } from './fineTune';
import { FineTuneEvent } from './fineTuneEvent';
import { ImagesResponse } from './imagesResponse';
import { ImagesResponseDataInner } from './imagesResponseDataInner';
import { ListFilesResponse } from './listFilesResponse';
import { ListFineTuneEventsResponse } from './listFineTuneEventsResponse';
import { ListFineTunesResponse } from './listFineTunesResponse';
import { ListModelsResponse } from './listModelsResponse';
import { Model } from './model';
import { ModelError } from './modelError';
import { OpenAIFile } from './openAIFile';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "ChatCompletionRequestMessage.RoleEnum": ChatCompletionRequestMessage.RoleEnum,
        "ChatCompletionResponseMessage.RoleEnum": ChatCompletionResponseMessage.RoleEnum,
        "ChatCompletionStreamResponseDelta.RoleEnum": ChatCompletionStreamResponseDelta.RoleEnum,
        "CreateChatCompletionResponseChoicesInner.FinishReasonEnum": CreateChatCompletionResponseChoicesInner.FinishReasonEnum,
        "CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum": CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum,
        "CreateCompletionResponseChoicesInner.FinishReasonEnum": CreateCompletionResponseChoicesInner.FinishReasonEnum,
        "CreateEditResponseChoicesInner.FinishReasonEnum": CreateEditResponseChoicesInner.FinishReasonEnum,
        "CreateImageRequest.SizeEnum": CreateImageRequest.SizeEnum,
        "CreateImageRequest.ResponseFormatEnum": CreateImageRequest.ResponseFormatEnum,
}

let typeMap: {[index: string]: any} = {
    "ChatCompletionFunctions": ChatCompletionFunctions,
    "ChatCompletionRequestMessage": ChatCompletionRequestMessage,
    "ChatCompletionRequestMessageFunctionCall": ChatCompletionRequestMessageFunctionCall,
    "ChatCompletionResponseMessage": ChatCompletionResponseMessage,
    "ChatCompletionStreamResponseDelta": ChatCompletionStreamResponseDelta,
    "CreateChatCompletionRequest": CreateChatCompletionRequest,
    "CreateChatCompletionRequestFunctionCall": CreateChatCompletionRequestFunctionCall,
    "CreateChatCompletionRequestFunctionCallOneOf": CreateChatCompletionRequestFunctionCallOneOf,
    "CreateChatCompletionRequestModel": CreateChatCompletionRequestModel,
    "CreateChatCompletionRequestStop": CreateChatCompletionRequestStop,
    "CreateChatCompletionResponse": CreateChatCompletionResponse,
    "CreateChatCompletionResponseChoicesInner": CreateChatCompletionResponseChoicesInner,
    "CreateChatCompletionStreamResponse": CreateChatCompletionStreamResponse,
    "CreateChatCompletionStreamResponseChoicesInner": CreateChatCompletionStreamResponseChoicesInner,
    "CreateCompletionRequest": CreateCompletionRequest,
    "CreateCompletionRequestModel": CreateCompletionRequestModel,
    "CreateCompletionRequestPrompt": CreateCompletionRequestPrompt,
    "CreateCompletionRequestStop": CreateCompletionRequestStop,
    "CreateCompletionResponse": CreateCompletionResponse,
    "CreateCompletionResponseChoicesInner": CreateCompletionResponseChoicesInner,
    "CreateCompletionResponseChoicesInnerLogprobs": CreateCompletionResponseChoicesInnerLogprobs,
    "CreateCompletionResponseUsage": CreateCompletionResponseUsage,
    "CreateEditRequest": CreateEditRequest,
    "CreateEditRequestModel": CreateEditRequestModel,
    "CreateEditResponse": CreateEditResponse,
    "CreateEditResponseChoicesInner": CreateEditResponseChoicesInner,
    "CreateEmbeddingRequest": CreateEmbeddingRequest,
    "CreateEmbeddingRequestInput": CreateEmbeddingRequestInput,
    "CreateEmbeddingRequestModel": CreateEmbeddingRequestModel,
    "CreateEmbeddingResponse": CreateEmbeddingResponse,
    "CreateEmbeddingResponseDataInner": CreateEmbeddingResponseDataInner,
    "CreateEmbeddingResponseUsage": CreateEmbeddingResponseUsage,
    "CreateFineTuneRequest": CreateFineTuneRequest,
    "CreateFineTuneRequestModel": CreateFineTuneRequestModel,
    "CreateImageRequest": CreateImageRequest,
    "CreateModerationRequest": CreateModerationRequest,
    "CreateModerationRequestInput": CreateModerationRequestInput,
    "CreateModerationRequestModel": CreateModerationRequestModel,
    "CreateModerationResponse": CreateModerationResponse,
    "CreateModerationResponseResultsInner": CreateModerationResponseResultsInner,
    "CreateModerationResponseResultsInnerCategories": CreateModerationResponseResultsInnerCategories,
    "CreateModerationResponseResultsInnerCategoryScores": CreateModerationResponseResultsInnerCategoryScores,
    "CreateTranscriptionRequestModel": CreateTranscriptionRequestModel,
    "CreateTranscriptionResponse": CreateTranscriptionResponse,
    "CreateTranslationResponse": CreateTranslationResponse,
    "DeleteFileResponse": DeleteFileResponse,
    "DeleteModelResponse": DeleteModelResponse,
    "ErrorResponse": ErrorResponse,
    "FineTune": FineTune,
    "FineTuneEvent": FineTuneEvent,
    "ImagesResponse": ImagesResponse,
    "ImagesResponseDataInner": ImagesResponseDataInner,
    "ListFilesResponse": ListFilesResponse,
    "ListFineTuneEventsResponse": ListFineTuneEventsResponse,
    "ListFineTunesResponse": ListFineTunesResponse,
    "ListModelsResponse": ListModelsResponse,
    "Model": Model,
    "ModelError": ModelError,
    "OpenAIFile": OpenAIFile,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);

export * from '../models/ChatCompletionFunctions';
export * from '../models/ChatCompletionRequestMessage';
export * from '../models/ChatCompletionRequestMessageFunctionCall';
export * from '../models/ChatCompletionResponseMessage';
export * from '../models/ChatCompletionStreamResponseDelta';
export * from '../models/CreateChatCompletionRequest';
export * from '../models/CreateChatCompletionRequestFunctionCall';
export * from '../models/CreateChatCompletionRequestFunctionCallOneOf';
export * from '../models/CreateChatCompletionRequestModel';
export * from '../models/CreateChatCompletionRequestStop';
export * from '../models/CreateChatCompletionResponse';
export * from '../models/CreateChatCompletionResponseChoicesInner';
export * from '../models/CreateChatCompletionStreamResponse';
export * from '../models/CreateChatCompletionStreamResponseChoicesInner';
export * from '../models/CreateCompletionRequest';
export * from '../models/CreateCompletionRequestModel';
export * from '../models/CreateCompletionRequestPrompt';
export * from '../models/CreateCompletionRequestStop';
export * from '../models/CreateCompletionResponse';
export * from '../models/CreateCompletionResponseChoicesInner';
export * from '../models/CreateCompletionResponseChoicesInnerLogprobs';
export * from '../models/CreateCompletionResponseUsage';
export * from '../models/CreateEditRequest';
export * from '../models/CreateEditRequestModel';
export * from '../models/CreateEditResponse';
export * from '../models/CreateEditResponseChoicesInner';
export * from '../models/CreateEmbeddingRequest';
export * from '../models/CreateEmbeddingRequestInput';
export * from '../models/CreateEmbeddingRequestModel';
export * from '../models/CreateEmbeddingResponse';
export * from '../models/CreateEmbeddingResponseDataInner';
export * from '../models/CreateEmbeddingResponseUsage';
export * from '../models/CreateFineTuneRequest';
export * from '../models/CreateFineTuneRequestModel';
export * from '../models/CreateImageRequest';
export * from '../models/CreateModerationRequest';
export * from '../models/CreateModerationRequestInput';
export * from '../models/CreateModerationRequestModel';
export * from '../models/CreateModerationResponse';
export * from '../models/CreateModerationResponseResultsInner';
export * from '../models/CreateModerationResponseResultsInnerCategories';
export * from '../models/CreateModerationResponseResultsInnerCategoryScores';
export * from '../models/CreateTranscriptionRequestModel';
export * from '../models/CreateTranscriptionResponse';
export * from '../models/CreateTranslationResponse';
export * from '../models/DeleteFileResponse';
export * from '../models/DeleteModelResponse';
export * from '../models/ErrorResponse';
export * from '../models/FineTune';
export * from '../models/FineTuneEvent';
export * from '../models/ImagesResponse';
export * from '../models/ImagesResponseDataInner';
export * from '../models/ListFilesResponse';
export * from '../models/ListFineTuneEventsResponse';
export * from '../models/ListFineTunesResponse';
export * from '../models/ListModelsResponse';
export * from '../models/Model';
export * from '../models/ModelError';
export * from '../models/OpenAIFile';

import { ChatCompletionFunctions } from '../models/ChatCompletionFunctions';
import { ChatCompletionRequestMessage, ChatCompletionRequestMessageRoleEnum      } from '../models/ChatCompletionRequestMessage';
import { ChatCompletionRequestMessageFunctionCall } from '../models/ChatCompletionRequestMessageFunctionCall';
import { ChatCompletionResponseMessage, ChatCompletionResponseMessageRoleEnum     } from '../models/ChatCompletionResponseMessage';
import { ChatCompletionStreamResponseDelta, ChatCompletionStreamResponseDeltaRoleEnum     } from '../models/ChatCompletionStreamResponseDelta';
import { CreateChatCompletionRequest } from '../models/CreateChatCompletionRequest';
import { CreateChatCompletionRequestFunctionCall } from '../models/CreateChatCompletionRequestFunctionCall';
import { CreateChatCompletionRequestFunctionCallOneOf } from '../models/CreateChatCompletionRequestFunctionCallOneOf';
import { CreateChatCompletionRequestModel } from '../models/CreateChatCompletionRequestModel';
import { CreateChatCompletionRequestStop } from '../models/CreateChatCompletionRequestStop';
import { CreateChatCompletionResponse } from '../models/CreateChatCompletionResponse';
import { CreateChatCompletionResponseChoicesInner  , CreateChatCompletionResponseChoicesInnerFinishReasonEnum   } from '../models/CreateChatCompletionResponseChoicesInner';
import { CreateChatCompletionStreamResponse } from '../models/CreateChatCompletionStreamResponse';
import { CreateChatCompletionStreamResponseChoicesInner  , CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum   } from '../models/CreateChatCompletionStreamResponseChoicesInner';
import { CreateCompletionRequest } from '../models/CreateCompletionRequest';
import { CreateCompletionRequestModel } from '../models/CreateCompletionRequestModel';
import { CreateCompletionRequestPrompt } from '../models/CreateCompletionRequestPrompt';
import { CreateCompletionRequestStop } from '../models/CreateCompletionRequestStop';
import { CreateCompletionResponse } from '../models/CreateCompletionResponse';
import { CreateCompletionResponseChoicesInner   , CreateCompletionResponseChoicesInnerFinishReasonEnum   } from '../models/CreateCompletionResponseChoicesInner';
import { CreateCompletionResponseChoicesInnerLogprobs } from '../models/CreateCompletionResponseChoicesInnerLogprobs';
import { CreateCompletionResponseUsage } from '../models/CreateCompletionResponseUsage';
import { CreateEditRequest } from '../models/CreateEditRequest';
import { CreateEditRequestModel } from '../models/CreateEditRequestModel';
import { CreateEditResponse } from '../models/CreateEditResponse';
import { CreateEditResponseChoicesInner   , CreateEditResponseChoicesInnerFinishReasonEnum   } from '../models/CreateEditResponseChoicesInner';
import { CreateEmbeddingRequest } from '../models/CreateEmbeddingRequest';
import { CreateEmbeddingRequestInput } from '../models/CreateEmbeddingRequestInput';
import { CreateEmbeddingRequestModel } from '../models/CreateEmbeddingRequestModel';
import { CreateEmbeddingResponse } from '../models/CreateEmbeddingResponse';
import { CreateEmbeddingResponseDataInner } from '../models/CreateEmbeddingResponseDataInner';
import { CreateEmbeddingResponseUsage } from '../models/CreateEmbeddingResponseUsage';
import { CreateFineTuneRequest } from '../models/CreateFineTuneRequest';
import { CreateFineTuneRequestModel } from '../models/CreateFineTuneRequestModel';
import { CreateImageRequest  , CreateImageRequestSizeEnum  , CreateImageRequestResponseFormatEnum    } from '../models/CreateImageRequest';
import { CreateModerationRequest } from '../models/CreateModerationRequest';
import { CreateModerationRequestInput } from '../models/CreateModerationRequestInput';
import { CreateModerationRequestModel } from '../models/CreateModerationRequestModel';
import { CreateModerationResponse } from '../models/CreateModerationResponse';
import { CreateModerationResponseResultsInner } from '../models/CreateModerationResponseResultsInner';
import { CreateModerationResponseResultsInnerCategories } from '../models/CreateModerationResponseResultsInnerCategories';
import { CreateModerationResponseResultsInnerCategoryScores } from '../models/CreateModerationResponseResultsInnerCategoryScores';
import { CreateTranscriptionRequestModel } from '../models/CreateTranscriptionRequestModel';
import { CreateTranscriptionResponse } from '../models/CreateTranscriptionResponse';
import { CreateTranslationResponse } from '../models/CreateTranslationResponse';
import { DeleteFileResponse } from '../models/DeleteFileResponse';
import { DeleteModelResponse } from '../models/DeleteModelResponse';
import { ErrorResponse } from '../models/ErrorResponse';
import { FineTune } from '../models/FineTune';
import { FineTuneEvent } from '../models/FineTuneEvent';
import { ImagesResponse } from '../models/ImagesResponse';
import { ImagesResponseDataInner } from '../models/ImagesResponseDataInner';
import { ListFilesResponse } from '../models/ListFilesResponse';
import { ListFineTuneEventsResponse } from '../models/ListFineTuneEventsResponse';
import { ListFineTunesResponse } from '../models/ListFineTunesResponse';
import { ListModelsResponse } from '../models/ListModelsResponse';
import { Model } from '../models/Model';
import { ModelError } from '../models/ModelError';
import { OpenAIFile } from '../models/OpenAIFile';

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

let enumsMap: Set<string> = new Set<string>([
    "ChatCompletionRequestMessageRoleEnum",
    "ChatCompletionResponseMessageRoleEnum",
    "ChatCompletionStreamResponseDeltaRoleEnum",
    "CreateChatCompletionResponseChoicesInnerFinishReasonEnum",
    "CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum",
    "CreateCompletionResponseChoicesInnerFinishReasonEnum",
    "CreateEditResponseChoicesInnerFinishReasonEnum",
    "CreateImageRequestSizeEnum",
    "CreateImageRequestResponseFormatEnum",
]);

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

type MimeTypeDescriptor = {
    type: string;
    subtype: string;
    subtypeTokens: string[];
};

/**
 * Every mime-type consists of a type, subtype, and optional parameters.
 * The subtype can be composite, including information about the content format.
 * For example: `application/json-patch+json`, `application/merge-patch+json`.
 *
 * This helper transforms a string mime-type into an internal representation.
 * This simplifies the implementation of predicates that in turn define common rules for parsing or stringifying
 * the payload.
 */
const parseMimeType = (mimeType: string): MimeTypeDescriptor => {
    const [type, subtype] = mimeType.split('/');
    return {
        type,
        subtype,
        subtypeTokens: subtype.split('+'),
    };
};

type MimeTypePredicate = (mimeType: string) => boolean;

// This factory creates a predicate function that checks a string mime-type against defined rules.
const mimeTypePredicateFactory = (predicate: (descriptor: MimeTypeDescriptor) => boolean): MimeTypePredicate => (mimeType) => predicate(parseMimeType(mimeType));

// Use this factory when you need to define a simple predicate based only on type and, if applicable, subtype.
const mimeTypeSimplePredicateFactory = (type: string, subtype?: string): MimeTypePredicate => mimeTypePredicateFactory((descriptor) => {
    if (descriptor.type !== type) return false;
    if (subtype != null && descriptor.subtype !== subtype) return false;
    return true;
});

// Creating a set of named predicates that will help us determine how to handle different mime-types
const isTextLikeMimeType = mimeTypeSimplePredicateFactory('text');
const isJsonMimeType = mimeTypeSimplePredicateFactory('application', 'json');
const isJsonLikeMimeType = mimeTypePredicateFactory((descriptor) => descriptor.type === 'application' && descriptor.subtypeTokens.some((item) => item === 'json'));
const isOctetStreamMimeType = mimeTypeSimplePredicateFactory('application', 'octet-stream');
const isFormUrlencodedMimeType = mimeTypeSimplePredicateFactory('application', 'x-www-form-urlencoded');

// Defining a list of mime-types in the order of prioritization for handling.
const supportedMimeTypePredicatesWithPriority: MimeTypePredicate[] = [
    isJsonMimeType,
    isJsonLikeMimeType,
    isTextLikeMimeType,
    isOctetStreamMimeType,
    isFormUrlencodedMimeType,
];

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap.has(expectedType)) {
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

    public static serialize(data: any, type: string, format: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let date of data) {
                transformedData.push(ObjectSerializer.serialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            if (format == "date") {
                let month = data.getMonth()+1
                month = month < 10 ? "0" + month.toString() : month.toString()
                let day = data.getDate();
                day = day < 10 ? "0" + day.toString() : day.toString();

                return data.getFullYear() + "-" + month + "-" + day;
            } else {
                return data.toISOString();
            }
        } else {
            if (enumsMap.has(type)) {
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
            for (let attributeType of attributeTypes) {
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type, attributeType.format);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string, format: string) {
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
            for (let date of data) {
                transformedData.push(ObjectSerializer.deserialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap.has(type)) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let attributeType of attributeTypes) {
                let value = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type, attributeType.format);
                if (value !== undefined) {
                    instance[attributeType.name] = value;
                }
            }
            return instance;
        }
    }


    /**
     * Normalize media type
     *
     * We currently do not handle any media types attributes, i.e. anything
     * after a semicolon. All content is assumed to be UTF-8 compatible.
     */
    public static normalizeMediaType(mediaType: string | undefined): string | undefined {
        if (mediaType === undefined) {
            return undefined;
        }
        return mediaType.split(";")[0].trim().toLowerCase();
    }

    /**
     * From a list of possible media types, choose the one we can handle best.
     *
     * The order of the given media types does not have any impact on the choice
     * made.
     */
    public static getPreferredMediaType(mediaTypes: Array<string>): string {
        /** According to OAS 3 we should default to json */
        if (mediaTypes.length === 0) {
            return "application/json";
        }

        const normalMediaTypes = mediaTypes.map(this.normalizeMediaType);

        for (const predicate of supportedMimeTypePredicatesWithPriority) {
            for (const mediaType of normalMediaTypes) {
                if (mediaType != null && predicate(mediaType)) {
                    return mediaType;
                }
            }
        }

        throw new Error("None of the given media types are supported: " + mediaTypes.join(", "));
    }

    /**
     * Convert data to a string according the given media type
     */
    public static stringify(data: any, mediaType: string): string {
        if (isTextLikeMimeType(mediaType)) {
            return String(data);
        }

        if (isJsonLikeMimeType(mediaType)) {
            return JSON.stringify(data);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.stringify.");
    }

    /**
     * Parse data from a string according to the given media type
     */
    public static parse(rawData: string, mediaType: string | undefined) {
        if (mediaType === undefined) {
            throw new Error("Cannot parse content. No Content-Type defined.");
        }

        if (isTextLikeMimeType(mediaType)) {
            return rawData;
        }

        if (isJsonLikeMimeType(mediaType)) {
            return JSON.parse(rawData);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.parse.");
    }
}

#import "OAIOpenAIApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICreateChatCompletionRequest.h"
#import "OAICreateChatCompletionResponse.h"
#import "OAICreateCompletionRequest.h"
#import "OAICreateCompletionResponse.h"
#import "OAICreateEditRequest.h"
#import "OAICreateEditResponse.h"
#import "OAICreateEmbeddingRequest.h"
#import "OAICreateEmbeddingResponse.h"
#import "OAICreateFineTuneRequest.h"
#import "OAICreateImageRequest.h"
#import "OAICreateModerationRequest.h"
#import "OAICreateModerationResponse.h"
#import "OAICreateTranscriptionRequestModel.h"
#import "OAICreateTranscriptionResponse.h"
#import "OAICreateTranslationResponse.h"
#import "OAIDeleteFileResponse.h"
#import "OAIDeleteModelResponse.h"
#import "OAIFineTune.h"
#import "OAIImagesResponse.h"
#import "OAIListFilesResponse.h"
#import "OAIListFineTuneEventsResponse.h"
#import "OAIListFineTunesResponse.h"
#import "OAIListModelsResponse.h"
#import "OAIModel.h"
#import "OAIOpenAIFile.h"


@interface OAIOpenAIApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIOpenAIApi

NSString* kOAIOpenAIApiErrorDomain = @"OAIOpenAIApiErrorDomain";
NSInteger kOAIOpenAIApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Immediately cancel a fine-tune job. 
/// 
///  @param fineTuneId The ID of the fine-tune job to cancel  
///
///  @returns OAIFineTune*
///
-(NSURLSessionTask*) cancelFineTuneWithFineTuneId: (NSString*) fineTuneId
    completionHandler: (void (^)(OAIFineTune* output, NSError* error)) handler {
    // verify the required parameter 'fineTuneId' is set
    if (fineTuneId == nil) {
        NSParameterAssert(fineTuneId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fineTuneId"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine-tunes/{fine_tune_id}/cancel"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fineTuneId != nil) {
        pathParams[@"fine_tune_id"] = fineTuneId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIFineTune*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFineTune*)data, error);
                                }
                            }];
}

///
/// Creates a model response for the given chat conversation.
/// 
///  @param createChatCompletionRequest  
///
///  @returns OAICreateChatCompletionResponse*
///
-(NSURLSessionTask*) createChatCompletionWithCreateChatCompletionRequest: (OAICreateChatCompletionRequest*) createChatCompletionRequest
    completionHandler: (void (^)(OAICreateChatCompletionResponse* output, NSError* error)) handler {
    // verify the required parameter 'createChatCompletionRequest' is set
    if (createChatCompletionRequest == nil) {
        NSParameterAssert(createChatCompletionRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createChatCompletionRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/chat/completions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createChatCompletionRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAICreateChatCompletionResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateChatCompletionResponse*)data, error);
                                }
                            }];
}

///
/// Creates a completion for the provided prompt and parameters.
/// 
///  @param createCompletionRequest  
///
///  @returns OAICreateCompletionResponse*
///
-(NSURLSessionTask*) createCompletionWithCreateCompletionRequest: (OAICreateCompletionRequest*) createCompletionRequest
    completionHandler: (void (^)(OAICreateCompletionResponse* output, NSError* error)) handler {
    // verify the required parameter 'createCompletionRequest' is set
    if (createCompletionRequest == nil) {
        NSParameterAssert(createCompletionRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createCompletionRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/completions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createCompletionRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAICreateCompletionResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateCompletionResponse*)data, error);
                                }
                            }];
}

///
/// Creates a new edit for the provided input, instruction, and parameters.
/// 
///  @param createEditRequest  
///
///  @returns OAICreateEditResponse*
///
-(NSURLSessionTask*) createEditWithCreateEditRequest: (OAICreateEditRequest*) createEditRequest
    completionHandler: (void (^)(OAICreateEditResponse* output, NSError* error)) handler {
    // verify the required parameter 'createEditRequest' is set
    if (createEditRequest == nil) {
        NSParameterAssert(createEditRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createEditRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/edits"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createEditRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAICreateEditResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateEditResponse*)data, error);
                                }
                            }];
}

///
/// Creates an embedding vector representing the input text.
/// 
///  @param createEmbeddingRequest  
///
///  @returns OAICreateEmbeddingResponse*
///
-(NSURLSessionTask*) createEmbeddingWithCreateEmbeddingRequest: (OAICreateEmbeddingRequest*) createEmbeddingRequest
    completionHandler: (void (^)(OAICreateEmbeddingResponse* output, NSError* error)) handler {
    // verify the required parameter 'createEmbeddingRequest' is set
    if (createEmbeddingRequest == nil) {
        NSParameterAssert(createEmbeddingRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createEmbeddingRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/embeddings"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createEmbeddingRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAICreateEmbeddingResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateEmbeddingResponse*)data, error);
                                }
                            }];
}

///
/// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
/// 
///  @param file Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  
///
///  @param purpose The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  
///
///  @returns OAIOpenAIFile*
///
-(NSURLSessionTask*) createFileWithFile: (NSURL*) file
    purpose: (NSString*) purpose
    completionHandler: (void (^)(OAIOpenAIFile* output, NSError* error)) handler {
    // verify the required parameter 'file' is set
    if (file == nil) {
        NSParameterAssert(file);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"file"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'purpose' is set
    if (purpose == nil) {
        NSParameterAssert(purpose);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"purpose"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"file"] = file;
    if (purpose) {
        formParams[@"purpose"] = purpose;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIOpenAIFile*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIOpenAIFile*)data, error);
                                }
                            }];
}

///
/// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
/// 
///  @param createFineTuneRequest  
///
///  @returns OAIFineTune*
///
-(NSURLSessionTask*) createFineTuneWithCreateFineTuneRequest: (OAICreateFineTuneRequest*) createFineTuneRequest
    completionHandler: (void (^)(OAIFineTune* output, NSError* error)) handler {
    // verify the required parameter 'createFineTuneRequest' is set
    if (createFineTuneRequest == nil) {
        NSParameterAssert(createFineTuneRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createFineTuneRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine-tunes"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createFineTuneRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIFineTune*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFineTune*)data, error);
                                }
                            }];
}

///
/// Creates an image given a prompt.
/// 
///  @param createImageRequest  
///
///  @returns OAIImagesResponse*
///
-(NSURLSessionTask*) createImageWithCreateImageRequest: (OAICreateImageRequest*) createImageRequest
    completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler {
    // verify the required parameter 'createImageRequest' is set
    if (createImageRequest == nil) {
        NSParameterAssert(createImageRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createImageRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/images/generations"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createImageRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIImagesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIImagesResponse*)data, error);
                                }
                            }];
}

///
/// Creates an edited or extended image given an original image and a prompt.
/// 
///  @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. 
///
///  @param prompt A text description of the desired image(s). The maximum length is 1000 characters. 
///
///  @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
///
///  @param n The number of images to generate. Must be between 1 and 10. (optional, default to @1)
///
///  @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional, default to @"1024x1024")
///
///  @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional, default to @"url")
///
///  @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
///
///  @returns OAIImagesResponse*
///
-(NSURLSessionTask*) createImageEditWithImage: (NSURL*) image
    prompt: (NSString*) prompt
    mask: (NSURL*) mask
    n: (NSNumber*) n
    size: (NSString*) size
    responseFormat: (NSString*) responseFormat
    user: (NSString*) user
    completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler {
    // verify the required parameter 'image' is set
    if (image == nil) {
        NSParameterAssert(image);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"image"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'prompt' is set
    if (prompt == nil) {
        NSParameterAssert(prompt);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"prompt"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/images/edits"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"image"] = image;
    localVarFiles[@"mask"] = mask;
    if (prompt) {
        formParams[@"prompt"] = prompt;
    }
    if (n) {
        formParams[@"n"] = n;
    }
    if (size) {
        formParams[@"size"] = size;
    }
    if (responseFormat) {
        formParams[@"response_format"] = responseFormat;
    }
    if (user) {
        formParams[@"user"] = user;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIImagesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIImagesResponse*)data, error);
                                }
                            }];
}

///
/// Creates a variation of a given image.
/// 
///  @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. 
///
///  @param n The number of images to generate. Must be between 1 and 10. (optional, default to @1)
///
///  @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional, default to @"1024x1024")
///
///  @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional, default to @"url")
///
///  @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
///
///  @returns OAIImagesResponse*
///
-(NSURLSessionTask*) createImageVariationWithImage: (NSURL*) image
    n: (NSNumber*) n
    size: (NSString*) size
    responseFormat: (NSString*) responseFormat
    user: (NSString*) user
    completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler {
    // verify the required parameter 'image' is set
    if (image == nil) {
        NSParameterAssert(image);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"image"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/images/variations"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"image"] = image;
    if (n) {
        formParams[@"n"] = n;
    }
    if (size) {
        formParams[@"size"] = size;
    }
    if (responseFormat) {
        formParams[@"response_format"] = responseFormat;
    }
    if (user) {
        formParams[@"user"] = user;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIImagesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIImagesResponse*)data, error);
                                }
                            }];
}

///
/// Classifies if text violates OpenAI's Content Policy
/// 
///  @param createModerationRequest  
///
///  @returns OAICreateModerationResponse*
///
-(NSURLSessionTask*) createModerationWithCreateModerationRequest: (OAICreateModerationRequest*) createModerationRequest
    completionHandler: (void (^)(OAICreateModerationResponse* output, NSError* error)) handler {
    // verify the required parameter 'createModerationRequest' is set
    if (createModerationRequest == nil) {
        NSParameterAssert(createModerationRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createModerationRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/moderations"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createModerationRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAICreateModerationResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateModerationResponse*)data, error);
                                }
                            }];
}

///
/// Transcribes audio into the input language.
/// 
///  @param file The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  
///
///  @param model  
///
///  @param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
///
///  @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to @"json")
///
///  @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to @0)
///
///  @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
///
///  @returns OAICreateTranscriptionResponse*
///
-(NSURLSessionTask*) createTranscriptionWithFile: (NSURL*) file
    model: (OAICreateTranscriptionRequestModel*) model
    prompt: (NSString*) prompt
    responseFormat: (NSString*) responseFormat
    temperature: (NSNumber*) temperature
    language: (NSString*) language
    completionHandler: (void (^)(OAICreateTranscriptionResponse* output, NSError* error)) handler {
    // verify the required parameter 'file' is set
    if (file == nil) {
        NSParameterAssert(file);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"file"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'model' is set
    if (model == nil) {
        NSParameterAssert(model);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"model"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/audio/transcriptions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"file"] = file;
    if (model) {
        formParams[@"model"] = model;
    }
    if (prompt) {
        formParams[@"prompt"] = prompt;
    }
    if (responseFormat) {
        formParams[@"response_format"] = responseFormat;
    }
    if (temperature) {
        formParams[@"temperature"] = temperature;
    }
    if (language) {
        formParams[@"language"] = language;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAICreateTranscriptionResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateTranscriptionResponse*)data, error);
                                }
                            }];
}

///
/// Translates audio into English.
/// 
///  @param file The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  
///
///  @param model  
///
///  @param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
///
///  @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to @"json")
///
///  @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to @0)
///
///  @returns OAICreateTranslationResponse*
///
-(NSURLSessionTask*) createTranslationWithFile: (NSURL*) file
    model: (OAICreateTranscriptionRequestModel*) model
    prompt: (NSString*) prompt
    responseFormat: (NSString*) responseFormat
    temperature: (NSNumber*) temperature
    completionHandler: (void (^)(OAICreateTranslationResponse* output, NSError* error)) handler {
    // verify the required parameter 'file' is set
    if (file == nil) {
        NSParameterAssert(file);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"file"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'model' is set
    if (model == nil) {
        NSParameterAssert(model);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"model"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/audio/translations"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"file"] = file;
    if (model) {
        formParams[@"model"] = model;
    }
    if (prompt) {
        formParams[@"prompt"] = prompt;
    }
    if (responseFormat) {
        formParams[@"response_format"] = responseFormat;
    }
    if (temperature) {
        formParams[@"temperature"] = temperature;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAICreateTranslationResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICreateTranslationResponse*)data, error);
                                }
                            }];
}

///
/// Delete a file.
/// 
///  @param fileId The ID of the file to use for this request 
///
///  @returns OAIDeleteFileResponse*
///
-(NSURLSessionTask*) deleteFileWithFileId: (NSString*) fileId
    completionHandler: (void (^)(OAIDeleteFileResponse* output, NSError* error)) handler {
    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files/{file_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fileId != nil) {
        pathParams[@"file_id"] = fileId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIDeleteFileResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteFileResponse*)data, error);
                                }
                            }];
}

///
/// Delete a fine-tuned model. You must have the Owner role in your organization.
/// 
///  @param model The model to delete 
///
///  @returns OAIDeleteModelResponse*
///
-(NSURLSessionTask*) deleteModelWithModel: (NSString*) model
    completionHandler: (void (^)(OAIDeleteModelResponse* output, NSError* error)) handler {
    // verify the required parameter 'model' is set
    if (model == nil) {
        NSParameterAssert(model);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"model"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/models/{model}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (model != nil) {
        pathParams[@"model"] = model;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIDeleteModelResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteModelResponse*)data, error);
                                }
                            }];
}

///
/// Returns the contents of the specified file
/// 
///  @param fileId The ID of the file to use for this request 
///
///  @returns NSString*
///
-(NSURLSessionTask*) downloadFileWithFileId: (NSString*) fileId
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files/{file_id}/content"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fileId != nil) {
        pathParams[@"file_id"] = fileId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// Returns a list of files that belong to the user's organization.
/// 
///  @returns OAIListFilesResponse*
///
-(NSURLSessionTask*) listFilesWithCompletionHandler: 
    (void (^)(OAIListFilesResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIListFilesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListFilesResponse*)data, error);
                                }
                            }];
}

///
/// Get fine-grained status updates for a fine-tune job. 
/// 
///  @param fineTuneId The ID of the fine-tune job to get events for.  
///
///  @param stream Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional, default to @(NO))
///
///  @returns OAIListFineTuneEventsResponse*
///
-(NSURLSessionTask*) listFineTuneEventsWithFineTuneId: (NSString*) fineTuneId
    stream: (NSNumber*) stream
    completionHandler: (void (^)(OAIListFineTuneEventsResponse* output, NSError* error)) handler {
    // verify the required parameter 'fineTuneId' is set
    if (fineTuneId == nil) {
        NSParameterAssert(fineTuneId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fineTuneId"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine-tunes/{fine_tune_id}/events"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fineTuneId != nil) {
        pathParams[@"fine_tune_id"] = fineTuneId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (stream != nil) {
        queryParams[@"stream"] = [stream isEqual:@(YES)] ? @"true" : @"false";
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIListFineTuneEventsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListFineTuneEventsResponse*)data, error);
                                }
                            }];
}

///
/// List your organization's fine-tuning jobs 
/// 
///  @returns OAIListFineTunesResponse*
///
-(NSURLSessionTask*) listFineTunesWithCompletionHandler: 
    (void (^)(OAIListFineTunesResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine-tunes"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIListFineTunesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListFineTunesResponse*)data, error);
                                }
                            }];
}

///
/// Lists the currently available models, and provides basic information about each one such as the owner and availability.
/// 
///  @returns OAIListModelsResponse*
///
-(NSURLSessionTask*) listModelsWithCompletionHandler: 
    (void (^)(OAIListModelsResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/models"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIListModelsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListModelsResponse*)data, error);
                                }
                            }];
}

///
/// Returns information about a specific file.
/// 
///  @param fileId The ID of the file to use for this request 
///
///  @returns OAIOpenAIFile*
///
-(NSURLSessionTask*) retrieveFileWithFileId: (NSString*) fileId
    completionHandler: (void (^)(OAIOpenAIFile* output, NSError* error)) handler {
    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files/{file_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fileId != nil) {
        pathParams[@"file_id"] = fileId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIOpenAIFile*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIOpenAIFile*)data, error);
                                }
                            }];
}

///
/// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
/// 
///  @param fineTuneId The ID of the fine-tune job  
///
///  @returns OAIFineTune*
///
-(NSURLSessionTask*) retrieveFineTuneWithFineTuneId: (NSString*) fineTuneId
    completionHandler: (void (^)(OAIFineTune* output, NSError* error)) handler {
    // verify the required parameter 'fineTuneId' is set
    if (fineTuneId == nil) {
        NSParameterAssert(fineTuneId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fineTuneId"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine-tunes/{fine_tune_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fineTuneId != nil) {
        pathParams[@"fine_tune_id"] = fineTuneId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIFineTune*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFineTune*)data, error);
                                }
                            }];
}

///
/// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
/// 
///  @param model The ID of the model to use for this request 
///
///  @returns OAIModel*
///
-(NSURLSessionTask*) retrieveModelWithModel: (NSString*) model
    completionHandler: (void (^)(OAIModel* output, NSError* error)) handler {
    // verify the required parameter 'model' is set
    if (model == nil) {
        NSParameterAssert(model);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"model"] };
            NSError* error = [NSError errorWithDomain:kOAIOpenAIApiErrorDomain code:kOAIOpenAIApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/models/{model}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (model != nil) {
        pathParams[@"model"] = model;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIModel*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIModel*)data, error);
                                }
                            }];
}



@end

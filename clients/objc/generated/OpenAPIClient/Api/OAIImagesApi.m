#import "OAIImagesApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICreateImageEditRequestModel.h"
#import "OAICreateImageRequest.h"
#import "OAIImagesResponse.h"


@interface OAIImagesApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIImagesApi

NSString* kOAIImagesApiErrorDomain = @"OAIImagesApiErrorDomain";
NSInteger kOAIImagesApiMissingParamErrorCode = 234513;

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
            NSError* error = [NSError errorWithDomain:kOAIImagesApiErrorDomain code:kOAIImagesApiMissingParamErrorCode userInfo:userInfo];
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
    NSArray *authSettings = @[@"ApiKeyAuth"];

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
///  @param model  (optional)
///
///  @param n The number of images to generate. Must be between 1 and 10. (optional, default to @1)
///
///  @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional, default to @"1024x1024")
///
///  @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional, default to @"url")
///
///  @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
///
///  @returns OAIImagesResponse*
///
-(NSURLSessionTask*) createImageEditWithImage: (NSURL*) image
    prompt: (NSString*) prompt
    mask: (NSURL*) mask
    model: (OAICreateImageEditRequestModel*) model
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
            NSError* error = [NSError errorWithDomain:kOAIImagesApiErrorDomain code:kOAIImagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'prompt' is set
    if (prompt == nil) {
        NSParameterAssert(prompt);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"prompt"] };
            NSError* error = [NSError errorWithDomain:kOAIImagesApiErrorDomain code:kOAIImagesApiMissingParamErrorCode userInfo:userInfo];
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
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"image"] = image;
    if (prompt) {
        formParams[@"prompt"] = prompt;
    }
    localVarFiles[@"mask"] = mask;
    if (model) {
        formParams[@"model"] = model;
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
///  @param model  (optional)
///
///  @param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional, default to @1)
///
///  @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional, default to @"url")
///
///  @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional, default to @"1024x1024")
///
///  @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
///
///  @returns OAIImagesResponse*
///
-(NSURLSessionTask*) createImageVariationWithImage: (NSURL*) image
    model: (OAICreateImageEditRequestModel*) model
    n: (NSNumber*) n
    responseFormat: (NSString*) responseFormat
    size: (NSString*) size
    user: (NSString*) user
    completionHandler: (void (^)(OAIImagesResponse* output, NSError* error)) handler {
    // verify the required parameter 'image' is set
    if (image == nil) {
        NSParameterAssert(image);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"image"] };
            NSError* error = [NSError errorWithDomain:kOAIImagesApiErrorDomain code:kOAIImagesApiMissingParamErrorCode userInfo:userInfo];
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
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"image"] = image;
    if (model) {
        formParams[@"model"] = model;
    }
    if (n) {
        formParams[@"n"] = n;
    }
    if (responseFormat) {
        formParams[@"response_format"] = responseFormat;
    }
    if (size) {
        formParams[@"size"] = size;
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



@end

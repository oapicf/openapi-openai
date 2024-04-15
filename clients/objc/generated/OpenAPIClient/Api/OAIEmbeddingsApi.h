#import <Foundation/Foundation.h>
#import "OAICreateEmbeddingRequest.h"
#import "OAICreateEmbeddingResponse.h"
#import "OAIApi.h"

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



@interface OAIEmbeddingsApi: NSObject <OAIApi>

extern NSString* kOAIEmbeddingsApiErrorDomain;
extern NSInteger kOAIEmbeddingsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Creates an embedding vector representing the input text.
/// 
///
/// @param createEmbeddingRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAICreateEmbeddingResponse*
-(NSURLSessionTask*) createEmbeddingWithCreateEmbeddingRequest: (OAICreateEmbeddingRequest*) createEmbeddingRequest
    completionHandler: (void (^)(OAICreateEmbeddingResponse* output, NSError* error)) handler;



@end
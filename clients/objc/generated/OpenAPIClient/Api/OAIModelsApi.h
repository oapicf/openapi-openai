#import <Foundation/Foundation.h>
#import "OAIDeleteModelResponse.h"
#import "OAIListModelsResponse.h"
#import "OAIModel.h"
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



@interface OAIModelsApi: NSObject <OAIApi>

extern NSString* kOAIModelsApiErrorDomain;
extern NSInteger kOAIModelsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
/// 
///
/// @param model The model to delete
/// 
///  code:200 message:"OK"
///
/// @return OAIDeleteModelResponse*
-(NSURLSessionTask*) deleteModelWithModel: (NSString*) model
    completionHandler: (void (^)(OAIDeleteModelResponse* output, NSError* error)) handler;


/// Lists the currently available models, and provides basic information about each one such as the owner and availability.
/// 
///
/// 
///  code:200 message:"OK"
///
/// @return OAIListModelsResponse*
-(NSURLSessionTask*) listModelsWithCompletionHandler: 
    (void (^)(OAIListModelsResponse* output, NSError* error)) handler;


/// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
/// 
///
/// @param model The ID of the model to use for this request
/// 
///  code:200 message:"OK"
///
/// @return OAIModel*
-(NSURLSessionTask*) retrieveModelWithModel: (NSString*) model
    completionHandler: (void (^)(OAIModel* output, NSError* error)) handler;



@end

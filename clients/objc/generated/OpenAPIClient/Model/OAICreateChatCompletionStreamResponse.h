#import <Foundation/Foundation.h>
#import "OAIObject.h"

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


#import "OAICreateChatCompletionStreamResponseChoicesInner.h"
@protocol OAICreateChatCompletionStreamResponseChoicesInner;
@class OAICreateChatCompletionStreamResponseChoicesInner;



@protocol OAICreateChatCompletionStreamResponse
@end

@interface OAICreateChatCompletionStreamResponse : OAIObject

/* A unique identifier for the chat completion. Each chunk has the same ID. 
 */
@property(nonatomic) NSString* _id;
/* A list of chat completion choices. Can be more than one if `n` is greater than 1. 
 */
@property(nonatomic) NSArray<OAICreateChatCompletionStreamResponseChoicesInner>* choices;
/* The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. 
 */
@property(nonatomic) NSNumber* created;
/* The model to generate the completion. 
 */
@property(nonatomic) NSString* model;
/* This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  [optional]
 */
@property(nonatomic) NSString* systemFingerprint;
/* The object type, which is always `chat.completion.chunk`. 
 */
@property(nonatomic) NSString* object;

@end

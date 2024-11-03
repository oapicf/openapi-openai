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





@protocol OAICreateEmbeddingResponseUsage
@end

@interface OAICreateEmbeddingResponseUsage : OAIObject

/* The number of tokens used by the prompt. 
 */
@property(nonatomic) NSNumber* promptTokens;
/* The total number of tokens used by the request. 
 */
@property(nonatomic) NSNumber* totalTokens;

@end

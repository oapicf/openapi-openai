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





@protocol OAIRunCompletionUsage
@end

@interface OAIRunCompletionUsage : OAIObject

/* Number of completion tokens used over the course of the run. 
 */
@property(nonatomic) NSNumber* completionTokens;
/* Number of prompt tokens used over the course of the run. 
 */
@property(nonatomic) NSNumber* promptTokens;
/* Total number of tokens used (prompt + completion). 
 */
@property(nonatomic) NSNumber* totalTokens;

@end
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


#import "OAIChatCompletionNamedToolChoice.h"
#import "OAIChatCompletionNamedToolChoiceFunction.h"
@protocol OAIChatCompletionNamedToolChoice;
@class OAIChatCompletionNamedToolChoice;
@protocol OAIChatCompletionNamedToolChoiceFunction;
@class OAIChatCompletionNamedToolChoiceFunction;



@protocol OAIChatCompletionToolChoiceOption
@end

@interface OAIChatCompletionToolChoiceOption : OAIObject

/* The type of the tool. Currently, only `function` is supported. 
 */
@property(nonatomic) NSString* type;

@property(nonatomic) OAIChatCompletionNamedToolChoiceFunction* function;

@end
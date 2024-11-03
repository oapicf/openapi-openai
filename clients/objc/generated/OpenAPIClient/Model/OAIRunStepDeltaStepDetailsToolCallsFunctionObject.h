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


#import "OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction.h"
@protocol OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
@class OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction;



@protocol OAIRunStepDeltaStepDetailsToolCallsFunctionObject
@end

@interface OAIRunStepDeltaStepDetailsToolCallsFunctionObject : OAIObject

/* The index of the tool call in the tool calls array. 
 */
@property(nonatomic) NSNumber* index;
/* The ID of the tool call object. [optional]
 */
@property(nonatomic) NSString* _id;
/* The type of tool call. This is always going to be `function` for this type of tool call. 
 */
@property(nonatomic) NSString* type;

@property(nonatomic) OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction* function;

@end

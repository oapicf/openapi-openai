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


#import "OAIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.h"
@protocol OAIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;
@class OAIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;



@protocol OAIRunStepDetailsToolCallsCodeObjectCodeInterpreter
@end

@interface OAIRunStepDetailsToolCallsCodeObjectCodeInterpreter : OAIObject

/* The input to the Code Interpreter tool call. 
 */
@property(nonatomic) NSString* input;
/* The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. 
 */
@property(nonatomic) NSArray<OAIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>* outputs;

@end

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


#import "OAIRunStepDeltaStepDetailsToolCallsCodeObject.h"
#import "OAIRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.h"
#import "OAIRunStepDeltaStepDetailsToolCallsFunctionObject.h"
#import "OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction.h"
#import "OAIRunStepDeltaStepDetailsToolCallsRetrievalObject.h"
@protocol OAIRunStepDeltaStepDetailsToolCallsCodeObject;
@class OAIRunStepDeltaStepDetailsToolCallsCodeObject;
@protocol OAIRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
@class OAIRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
@protocol OAIRunStepDeltaStepDetailsToolCallsFunctionObject;
@class OAIRunStepDeltaStepDetailsToolCallsFunctionObject;
@protocol OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
@class OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
@protocol OAIRunStepDeltaStepDetailsToolCallsRetrievalObject;
@class OAIRunStepDeltaStepDetailsToolCallsRetrievalObject;



@protocol OAIRunStepDeltaStepDetailsToolCallsObjectToolCallsInner
@end

@interface OAIRunStepDeltaStepDetailsToolCallsObjectToolCallsInner : OAIObject

/* The index of the tool call in the tool calls array. 
 */
@property(nonatomic) NSNumber* index;
/* The ID of the tool call object. [optional]
 */
@property(nonatomic) NSString* _id;
/* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. 
 */
@property(nonatomic) NSString* type;

@property(nonatomic) OAIRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter* codeInterpreter;
/* For now, this is always going to be an empty object. [optional]
 */
@property(nonatomic) NSObject* retrieval;

@property(nonatomic) OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction* function;

@end

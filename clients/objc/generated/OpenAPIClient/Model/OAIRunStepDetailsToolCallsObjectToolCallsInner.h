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


#import "OAIRunStepDetailsToolCallsCodeObject.h"
#import "OAIRunStepDetailsToolCallsCodeObjectCodeInterpreter.h"
#import "OAIRunStepDetailsToolCallsFunctionObject.h"
#import "OAIRunStepDetailsToolCallsFunctionObjectFunction.h"
#import "OAIRunStepDetailsToolCallsRetrievalObject.h"
@protocol OAIRunStepDetailsToolCallsCodeObject;
@class OAIRunStepDetailsToolCallsCodeObject;
@protocol OAIRunStepDetailsToolCallsCodeObjectCodeInterpreter;
@class OAIRunStepDetailsToolCallsCodeObjectCodeInterpreter;
@protocol OAIRunStepDetailsToolCallsFunctionObject;
@class OAIRunStepDetailsToolCallsFunctionObject;
@protocol OAIRunStepDetailsToolCallsFunctionObjectFunction;
@class OAIRunStepDetailsToolCallsFunctionObjectFunction;
@protocol OAIRunStepDetailsToolCallsRetrievalObject;
@class OAIRunStepDetailsToolCallsRetrievalObject;



@protocol OAIRunStepDetailsToolCallsObjectToolCallsInner
@end

@interface OAIRunStepDetailsToolCallsObjectToolCallsInner : OAIObject

/* The ID of the tool call object. 
 */
@property(nonatomic) NSString* _id;
/* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. 
 */
@property(nonatomic) NSString* type;

@property(nonatomic) OAIRunStepDetailsToolCallsCodeObjectCodeInterpreter* codeInterpreter;
/* For now, this is always going to be an empty object. 
 */
@property(nonatomic) NSObject* retrieval;

@property(nonatomic) OAIRunStepDetailsToolCallsFunctionObjectFunction* function;

@end
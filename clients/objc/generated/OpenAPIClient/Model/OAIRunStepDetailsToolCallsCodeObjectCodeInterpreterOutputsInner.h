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


#import "OAIRunStepDetailsToolCallsCodeOutputImageObject.h"
#import "OAIRunStepDetailsToolCallsCodeOutputImageObjectImage.h"
#import "OAIRunStepDetailsToolCallsCodeOutputLogsObject.h"
@protocol OAIRunStepDetailsToolCallsCodeOutputImageObject;
@class OAIRunStepDetailsToolCallsCodeOutputImageObject;
@protocol OAIRunStepDetailsToolCallsCodeOutputImageObjectImage;
@class OAIRunStepDetailsToolCallsCodeOutputImageObjectImage;
@protocol OAIRunStepDetailsToolCallsCodeOutputLogsObject;
@class OAIRunStepDetailsToolCallsCodeOutputLogsObject;



@protocol OAIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
@end

@interface OAIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner : OAIObject

/* Always `logs`. 
 */
@property(nonatomic) NSString* type;
/* The text output from the Code Interpreter tool call. 
 */
@property(nonatomic) NSString* logs;

@property(nonatomic) OAIRunStepDetailsToolCallsCodeOutputImageObjectImage* image;

@end

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





@protocol OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction
@end

@interface OAIRunStepDeltaStepDetailsToolCallsFunctionObjectFunction : OAIObject

/* The name of the function. [optional]
 */
@property(nonatomic) NSString* name;
/* The arguments passed to the function. [optional]
 */
@property(nonatomic) NSString* arguments;
/* The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. [optional]
 */
@property(nonatomic) NSString* output;

@end

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





@protocol OAISubmitToolOutputsRunRequestToolOutputsInner
@end

@interface OAISubmitToolOutputsRunRequestToolOutputsInner : OAIObject

/* The ID of the tool call in the `required_action` object within the run object the output is being submitted for. [optional]
 */
@property(nonatomic) NSString* toolCallId;
/* The output of the tool call to be submitted to continue the run. [optional]
 */
@property(nonatomic) NSString* output;

@end

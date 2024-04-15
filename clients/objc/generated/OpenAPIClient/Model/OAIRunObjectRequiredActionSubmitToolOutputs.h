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


#import "OAIRunToolCallObject.h"
@protocol OAIRunToolCallObject;
@class OAIRunToolCallObject;



@protocol OAIRunObjectRequiredActionSubmitToolOutputs
@end

@interface OAIRunObjectRequiredActionSubmitToolOutputs : OAIObject

/* A list of the relevant tool calls. 
 */
@property(nonatomic) NSArray<OAIRunToolCallObject>* toolCalls;

@end
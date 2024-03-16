#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/





@protocol OAIChatCompletionRequestMessageFunctionCall
@end

@interface OAIChatCompletionRequestMessageFunctionCall : OAIObject

/* The name of the function to call. [optional]
 */
@property(nonatomic) NSString* name;
/* The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. [optional]
 */
@property(nonatomic) NSString* arguments;

@end

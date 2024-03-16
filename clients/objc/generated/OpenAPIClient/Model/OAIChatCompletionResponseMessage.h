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


#import "OAIChatCompletionRequestMessageFunctionCall.h"
@protocol OAIChatCompletionRequestMessageFunctionCall;
@class OAIChatCompletionRequestMessageFunctionCall;



@protocol OAIChatCompletionResponseMessage
@end

@interface OAIChatCompletionResponseMessage : OAIObject

/* The role of the author of this message. 
 */
@property(nonatomic) NSString* role;
/* The contents of the message. [optional]
 */
@property(nonatomic) NSString* content;

@property(nonatomic) OAIChatCompletionRequestMessageFunctionCall* functionCall;

@end
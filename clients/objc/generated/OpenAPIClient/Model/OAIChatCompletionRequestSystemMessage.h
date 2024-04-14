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





@protocol OAIChatCompletionRequestSystemMessage
@end

@interface OAIChatCompletionRequestSystemMessage : OAIObject

/* The contents of the system message. 
 */
@property(nonatomic) NSString* content;
/* The role of the messages author, in this case `system`. 
 */
@property(nonatomic) NSString* role;
/* An optional name for the participant. Provides the model information to differentiate between participants of the same role. [optional]
 */
@property(nonatomic) NSString* name;

@end

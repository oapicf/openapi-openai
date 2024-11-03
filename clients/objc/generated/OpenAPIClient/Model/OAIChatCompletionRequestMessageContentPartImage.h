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


#import "OAIChatCompletionRequestMessageContentPartImageImageUrl.h"
@protocol OAIChatCompletionRequestMessageContentPartImageImageUrl;
@class OAIChatCompletionRequestMessageContentPartImageImageUrl;



@protocol OAIChatCompletionRequestMessageContentPartImage
@end

@interface OAIChatCompletionRequestMessageContentPartImage : OAIObject

/* The type of the content part. 
 */
@property(nonatomic) NSString* type;

@property(nonatomic) OAIChatCompletionRequestMessageContentPartImageImageUrl* imageUrl;

@end

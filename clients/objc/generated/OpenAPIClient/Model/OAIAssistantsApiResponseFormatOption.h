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


#import "OAIAssistantsApiResponseFormat.h"
@protocol OAIAssistantsApiResponseFormat;
@class OAIAssistantsApiResponseFormat;



@protocol OAIAssistantsApiResponseFormatOption
@end

@interface OAIAssistantsApiResponseFormatOption : OAIObject

/* Must be one of `text` or `json_object`. [optional]
 */
@property(nonatomic) NSString* type;

@end

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


#import "OAIRunStepDetailsToolCallsCodeOutputImageObjectImage.h"
@protocol OAIRunStepDetailsToolCallsCodeOutputImageObjectImage;
@class OAIRunStepDetailsToolCallsCodeOutputImageObjectImage;



@protocol OAIRunStepDetailsToolCallsCodeOutputImageObject
@end

@interface OAIRunStepDetailsToolCallsCodeOutputImageObject : OAIObject

/* Always `image`. 
 */
@property(nonatomic) NSString* type;

@property(nonatomic) OAIRunStepDetailsToolCallsCodeOutputImageObjectImage* image;

@end
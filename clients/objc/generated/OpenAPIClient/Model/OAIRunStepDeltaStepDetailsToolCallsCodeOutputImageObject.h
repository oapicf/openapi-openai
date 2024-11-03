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


#import "OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.h"
@protocol OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
@class OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;



@protocol OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject
@end

@interface OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject : OAIObject

/* The index of the output in the outputs array. 
 */
@property(nonatomic) NSNumber* index;
/* Always `image`. 
 */
@property(nonatomic) NSString* type;

@property(nonatomic) OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage* image;

@end

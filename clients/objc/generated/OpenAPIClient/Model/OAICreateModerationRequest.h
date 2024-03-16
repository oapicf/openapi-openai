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


#import "OAICreateModerationRequestInput.h"
#import "OAICreateModerationRequestModel.h"
@protocol OAICreateModerationRequestInput;
@class OAICreateModerationRequestInput;
@protocol OAICreateModerationRequestModel;
@class OAICreateModerationRequestModel;



@protocol OAICreateModerationRequest
@end

@interface OAICreateModerationRequest : OAIObject


@property(nonatomic) OAICreateModerationRequestInput* input;

@property(nonatomic) OAICreateModerationRequestModel* model;

@end
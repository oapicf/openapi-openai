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


#import "OAICreateFineTuningJobRequestIntegrationsInnerType.h"
#import "OAICreateFineTuningJobRequestIntegrationsInnerWandb.h"
@protocol OAICreateFineTuningJobRequestIntegrationsInnerType;
@class OAICreateFineTuningJobRequestIntegrationsInnerType;
@protocol OAICreateFineTuningJobRequestIntegrationsInnerWandb;
@class OAICreateFineTuningJobRequestIntegrationsInnerWandb;



@protocol OAICreateFineTuningJobRequestIntegrationsInner
@end

@interface OAICreateFineTuningJobRequestIntegrationsInner : OAIObject


@property(nonatomic) OAICreateFineTuningJobRequestIntegrationsInnerType* type;

@property(nonatomic) OAICreateFineTuningJobRequestIntegrationsInnerWandb* wandb;

@end

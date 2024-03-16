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





@protocol OAIFineTuneEvent
@end

@interface OAIFineTuneEvent : OAIObject


@property(nonatomic) NSString* object;

@property(nonatomic) NSNumber* createdAt;

@property(nonatomic) NSString* level;

@property(nonatomic) NSString* message;

@end

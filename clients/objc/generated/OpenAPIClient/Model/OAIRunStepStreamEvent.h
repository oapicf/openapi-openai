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


#import "OAIRunStepObject.h"
#import "OAIRunStepStreamEventOneOf.h"
#import "OAIRunStepStreamEventOneOf1.h"
#import "OAIRunStepStreamEventOneOf2.h"
#import "OAIRunStepStreamEventOneOf3.h"
#import "OAIRunStepStreamEventOneOf4.h"
#import "OAIRunStepStreamEventOneOf5.h"
#import "OAIRunStepStreamEventOneOf6.h"
@protocol OAIRunStepObject;
@class OAIRunStepObject;
@protocol OAIRunStepStreamEventOneOf;
@class OAIRunStepStreamEventOneOf;
@protocol OAIRunStepStreamEventOneOf1;
@class OAIRunStepStreamEventOneOf1;
@protocol OAIRunStepStreamEventOneOf2;
@class OAIRunStepStreamEventOneOf2;
@protocol OAIRunStepStreamEventOneOf3;
@class OAIRunStepStreamEventOneOf3;
@protocol OAIRunStepStreamEventOneOf4;
@class OAIRunStepStreamEventOneOf4;
@protocol OAIRunStepStreamEventOneOf5;
@class OAIRunStepStreamEventOneOf5;
@protocol OAIRunStepStreamEventOneOf6;
@class OAIRunStepStreamEventOneOf6;



@protocol OAIRunStepStreamEvent
@end

@interface OAIRunStepStreamEvent : OAIObject


@property(nonatomic) NSString* event;

@property(nonatomic) OAIRunStepObject* data;

@end

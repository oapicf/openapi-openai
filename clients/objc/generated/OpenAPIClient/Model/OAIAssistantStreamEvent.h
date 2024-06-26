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


#import "OAIDoneEvent.h"
#import "OAIErrorEvent.h"
#import "OAIMessageStreamEvent.h"
#import "OAIRunStepStreamEvent.h"
#import "OAIRunStreamEvent.h"
#import "OAIThreadStreamEvent.h"
@protocol OAIDoneEvent;
@class OAIDoneEvent;
@protocol OAIErrorEvent;
@class OAIErrorEvent;
@protocol OAIMessageStreamEvent;
@class OAIMessageStreamEvent;
@protocol OAIRunStepStreamEvent;
@class OAIRunStepStreamEvent;
@protocol OAIRunStreamEvent;
@class OAIRunStreamEvent;
@protocol OAIThreadStreamEvent;
@class OAIThreadStreamEvent;



@protocol OAIAssistantStreamEvent
@end

@interface OAIAssistantStreamEvent : OAIObject


@property(nonatomic) NSString* event;

@property(nonatomic) NSString* data;

@end

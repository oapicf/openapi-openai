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


#import "OAIThreadObject.h"
#import "OAIThreadStreamEventOneOf.h"
@protocol OAIThreadObject;
@class OAIThreadObject;
@protocol OAIThreadStreamEventOneOf;
@class OAIThreadStreamEventOneOf;



@protocol OAIThreadStreamEvent
@end

@interface OAIThreadStreamEvent : OAIObject


@property(nonatomic) NSString* event;

@property(nonatomic) OAIThreadObject* data;

@end

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


#import "OAIMessageObject.h"
#import "OAIMessageStreamEventOneOf.h"
#import "OAIMessageStreamEventOneOf1.h"
#import "OAIMessageStreamEventOneOf2.h"
#import "OAIMessageStreamEventOneOf3.h"
#import "OAIMessageStreamEventOneOf4.h"
@protocol OAIMessageObject;
@class OAIMessageObject;
@protocol OAIMessageStreamEventOneOf;
@class OAIMessageStreamEventOneOf;
@protocol OAIMessageStreamEventOneOf1;
@class OAIMessageStreamEventOneOf1;
@protocol OAIMessageStreamEventOneOf2;
@class OAIMessageStreamEventOneOf2;
@protocol OAIMessageStreamEventOneOf3;
@class OAIMessageStreamEventOneOf3;
@protocol OAIMessageStreamEventOneOf4;
@class OAIMessageStreamEventOneOf4;



@protocol OAIMessageStreamEvent
@end

@interface OAIMessageStreamEvent : OAIObject


@property(nonatomic) NSString* event;

@property(nonatomic) OAIMessageObject* data;

@end

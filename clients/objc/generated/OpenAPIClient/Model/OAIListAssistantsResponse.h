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


#import "OAIAssistantObject.h"
@protocol OAIAssistantObject;
@class OAIAssistantObject;



@protocol OAIListAssistantsResponse
@end

@interface OAIListAssistantsResponse : OAIObject


@property(nonatomic) NSString* object;

@property(nonatomic) NSArray<OAIAssistantObject>* data;

@property(nonatomic) NSString* firstId;

@property(nonatomic) NSString* lastId;

@property(nonatomic) NSNumber* hasMore;

@end

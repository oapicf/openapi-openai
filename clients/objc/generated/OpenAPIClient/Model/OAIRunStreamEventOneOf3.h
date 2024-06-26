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


#import "OAIRunObject.h"
@protocol OAIRunObject;
@class OAIRunObject;



@protocol OAIRunStreamEventOneOf3
@end

@interface OAIRunStreamEventOneOf3 : OAIObject


@property(nonatomic) NSString* event;

@property(nonatomic) OAIRunObject* data;

@end

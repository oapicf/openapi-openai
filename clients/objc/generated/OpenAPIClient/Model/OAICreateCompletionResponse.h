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


#import "OAICreateCompletionResponseChoicesInner.h"
#import "OAICreateCompletionResponseUsage.h"
@protocol OAICreateCompletionResponseChoicesInner;
@class OAICreateCompletionResponseChoicesInner;
@protocol OAICreateCompletionResponseUsage;
@class OAICreateCompletionResponseUsage;



@protocol OAICreateCompletionResponse
@end

@interface OAICreateCompletionResponse : OAIObject


@property(nonatomic) NSString* _id;

@property(nonatomic) NSString* object;

@property(nonatomic) NSNumber* created;

@property(nonatomic) NSString* model;

@property(nonatomic) NSArray<OAICreateCompletionResponseChoicesInner>* choices;

@property(nonatomic) OAICreateCompletionResponseUsage* usage;

@end

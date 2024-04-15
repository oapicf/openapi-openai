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


#import "OAIRunStepDeltaObjectDelta.h"
@protocol OAIRunStepDeltaObjectDelta;
@class OAIRunStepDeltaObjectDelta;



@protocol OAIRunStepDeltaObject
@end

@interface OAIRunStepDeltaObject : OAIObject

/* The identifier of the run step, which can be referenced in API endpoints. 
 */
@property(nonatomic) NSString* _id;
/* The object type, which is always `thread.run.step.delta`. 
 */
@property(nonatomic) NSString* object;

@property(nonatomic) OAIRunStepDeltaObjectDelta* delta;

@end
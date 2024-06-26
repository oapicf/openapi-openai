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


#import "OAIRunStepCompletionUsage.h"
#import "OAIRunStepObjectLastError.h"
#import "OAIRunStepObjectStepDetails.h"
@protocol OAIRunStepCompletionUsage;
@class OAIRunStepCompletionUsage;
@protocol OAIRunStepObjectLastError;
@class OAIRunStepObjectLastError;
@protocol OAIRunStepObjectStepDetails;
@class OAIRunStepObjectStepDetails;



@protocol OAIRunStepObject
@end

@interface OAIRunStepObject : OAIObject

/* The identifier of the run step, which can be referenced in API endpoints. 
 */
@property(nonatomic) NSString* _id;
/* The object type, which is always `thread.run.step`. 
 */
@property(nonatomic) NSString* object;
/* The Unix timestamp (in seconds) for when the run step was created. 
 */
@property(nonatomic) NSNumber* createdAt;
/* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. 
 */
@property(nonatomic) NSString* assistantId;
/* The ID of the [thread](/docs/api-reference/threads) that was run. 
 */
@property(nonatomic) NSString* threadId;
/* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. 
 */
@property(nonatomic) NSString* runId;
/* The type of run step, which can be either `message_creation` or `tool_calls`. 
 */
@property(nonatomic) NSString* type;
/* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. 
 */
@property(nonatomic) NSString* status;

@property(nonatomic) OAIRunStepObjectStepDetails* stepDetails;

@property(nonatomic) OAIRunStepObjectLastError* lastError;
/* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. 
 */
@property(nonatomic) NSNumber* expiredAt;
/* The Unix timestamp (in seconds) for when the run step was cancelled. 
 */
@property(nonatomic) NSNumber* cancelledAt;
/* The Unix timestamp (in seconds) for when the run step failed. 
 */
@property(nonatomic) NSNumber* failedAt;
/* The Unix timestamp (in seconds) for when the run step completed. 
 */
@property(nonatomic) NSNumber* completedAt;
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  
 */
@property(nonatomic) NSObject* metadata;

@property(nonatomic) OAIRunStepCompletionUsage* usage;

@end

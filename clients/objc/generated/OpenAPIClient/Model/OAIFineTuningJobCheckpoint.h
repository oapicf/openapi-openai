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


#import "OAIFineTuningJobCheckpointMetrics.h"
@protocol OAIFineTuningJobCheckpointMetrics;
@class OAIFineTuningJobCheckpointMetrics;



@protocol OAIFineTuningJobCheckpoint
@end

@interface OAIFineTuningJobCheckpoint : OAIObject

/* The checkpoint identifier, which can be referenced in the API endpoints. 
 */
@property(nonatomic) NSString* _id;
/* The Unix timestamp (in seconds) for when the checkpoint was created. 
 */
@property(nonatomic) NSNumber* createdAt;
/* The name of the fine-tuned checkpoint model that is created. 
 */
@property(nonatomic) NSString* fineTunedModelCheckpoint;
/* The step number that the checkpoint was created at. 
 */
@property(nonatomic) NSNumber* stepNumber;

@property(nonatomic) OAIFineTuningJobCheckpointMetrics* metrics;
/* The name of the fine-tuning job that this checkpoint was created from. 
 */
@property(nonatomic) NSString* fineTuningJobId;
/* The object type, which is always \"fine_tuning.job.checkpoint\". 
 */
@property(nonatomic) NSString* object;

@end

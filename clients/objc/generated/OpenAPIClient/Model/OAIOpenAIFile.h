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





@protocol OAIOpenAIFile
@end

@interface OAIOpenAIFile : OAIObject

/* The file identifier, which can be referenced in the API endpoints. 
 */
@property(nonatomic) NSString* _id;
/* The size of the file, in bytes. 
 */
@property(nonatomic) NSNumber* bytes;
/* The Unix timestamp (in seconds) for when the file was created. 
 */
@property(nonatomic) NSNumber* createdAt;
/* The name of the file. 
 */
@property(nonatomic) NSString* filename;
/* The object type, which is always `file`. 
 */
@property(nonatomic) NSString* object;
/* The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. 
 */
@property(nonatomic) NSString* purpose;
/* Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. 
 */
@property(nonatomic) NSString* status;
/* Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. [optional]
 */
@property(nonatomic) NSString* statusDetails;

@end
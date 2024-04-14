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


#import "OAIAssistantObjectToolsInner.h"
@protocol OAIAssistantObjectToolsInner;
@class OAIAssistantObjectToolsInner;



@protocol OAIAssistantObject
@end

@interface OAIAssistantObject : OAIObject

/* The identifier, which can be referenced in API endpoints. 
 */
@property(nonatomic) NSString* _id;
/* The object type, which is always `assistant`. 
 */
@property(nonatomic) NSString* object;
/* The Unix timestamp (in seconds) for when the assistant was created. 
 */
@property(nonatomic) NSNumber* createdAt;
/* The name of the assistant. The maximum length is 256 characters.  
 */
@property(nonatomic) NSString* name;
/* The description of the assistant. The maximum length is 512 characters.  
 */
@property(nonatomic) NSString* _description;
/* ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.  
 */
@property(nonatomic) NSString* model;
/* The system instructions that the assistant uses. The maximum length is 256,000 characters.  
 */
@property(nonatomic) NSString* instructions;
/* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.  
 */
@property(nonatomic) NSArray<OAIAssistantObjectToolsInner>* tools;
/* A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  
 */
@property(nonatomic) NSArray<NSString*>* fileIds;
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  
 */
@property(nonatomic) NSObject* metadata;

@end

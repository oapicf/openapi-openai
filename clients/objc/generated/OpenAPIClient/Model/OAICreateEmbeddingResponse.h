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


#import "OAICreateEmbeddingResponseUsage.h"
#import "OAIEmbedding.h"
@protocol OAICreateEmbeddingResponseUsage;
@class OAICreateEmbeddingResponseUsage;
@protocol OAIEmbedding;
@class OAIEmbedding;



@protocol OAICreateEmbeddingResponse
@end

@interface OAICreateEmbeddingResponse : OAIObject

/* The list of embeddings generated by the model. 
 */
@property(nonatomic) NSArray<OAIEmbedding>* data;
/* The name of the model used to generate the embedding. 
 */
@property(nonatomic) NSString* model;
/* The object type, which is always \"list\". 
 */
@property(nonatomic) NSString* object;

@property(nonatomic) OAICreateEmbeddingResponseUsage* usage;

@end

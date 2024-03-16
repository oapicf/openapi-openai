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


#import "OAIAnyType.h"
@protocol OAIAnyType;
@class OAIAnyType;



@protocol OAIChatCompletionFunctions
@end

@interface OAIChatCompletionFunctions : OAIObject

/* The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. 
 */
@property(nonatomic) NSString* name;
/* The description of what the function does. [optional]
 */
@property(nonatomic) NSString* _description;
/* The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. [optional]
 */
@property(nonatomic) NSDictionary<OAIAnyType>* parameters;

@end

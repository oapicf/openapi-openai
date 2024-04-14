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


#import "OAIMessageContentTextObjectTextAnnotationsInner.h"
@protocol OAIMessageContentTextObjectTextAnnotationsInner;
@class OAIMessageContentTextObjectTextAnnotationsInner;



@protocol OAIMessageContentTextObjectText
@end

@interface OAIMessageContentTextObjectText : OAIObject

/* The data that makes up the text. 
 */
@property(nonatomic) NSString* value;

@property(nonatomic) NSArray<OAIMessageContentTextObjectTextAnnotationsInner>* annotations;

@end

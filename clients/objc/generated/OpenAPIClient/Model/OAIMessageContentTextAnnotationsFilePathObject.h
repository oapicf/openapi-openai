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


#import "OAIMessageContentTextAnnotationsFilePathObjectFilePath.h"
@protocol OAIMessageContentTextAnnotationsFilePathObjectFilePath;
@class OAIMessageContentTextAnnotationsFilePathObjectFilePath;



@protocol OAIMessageContentTextAnnotationsFilePathObject
@end

@interface OAIMessageContentTextAnnotationsFilePathObject : OAIObject

/* Always `file_path`. 
 */
@property(nonatomic) NSString* type;
/* The text in the message content that needs to be replaced. 
 */
@property(nonatomic) NSString* text;

@property(nonatomic) OAIMessageContentTextAnnotationsFilePathObjectFilePath* filePath;

@property(nonatomic) NSNumber* startIndex;

@property(nonatomic) NSNumber* endIndex;

@end
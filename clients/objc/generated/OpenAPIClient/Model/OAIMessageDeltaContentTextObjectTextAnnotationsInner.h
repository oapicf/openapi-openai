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


#import "OAIMessageDeltaContentTextAnnotationsFileCitationObject.h"
#import "OAIMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.h"
#import "OAIMessageDeltaContentTextAnnotationsFilePathObject.h"
#import "OAIMessageDeltaContentTextAnnotationsFilePathObjectFilePath.h"
@protocol OAIMessageDeltaContentTextAnnotationsFileCitationObject;
@class OAIMessageDeltaContentTextAnnotationsFileCitationObject;
@protocol OAIMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
@class OAIMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
@protocol OAIMessageDeltaContentTextAnnotationsFilePathObject;
@class OAIMessageDeltaContentTextAnnotationsFilePathObject;
@protocol OAIMessageDeltaContentTextAnnotationsFilePathObjectFilePath;
@class OAIMessageDeltaContentTextAnnotationsFilePathObjectFilePath;



@protocol OAIMessageDeltaContentTextObjectTextAnnotationsInner
@end

@interface OAIMessageDeltaContentTextObjectTextAnnotationsInner : OAIObject

/* The index of the annotation in the text content part. 
 */
@property(nonatomic) NSNumber* index;
/* Always `file_citation`. 
 */
@property(nonatomic) NSString* type;
/* The text in the message content that needs to be replaced. [optional]
 */
@property(nonatomic) NSString* text;

@property(nonatomic) OAIMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation* fileCitation;

@property(nonatomic) NSNumber* startIndex;

@property(nonatomic) NSNumber* endIndex;

@property(nonatomic) OAIMessageDeltaContentTextAnnotationsFilePathObjectFilePath* filePath;

@end

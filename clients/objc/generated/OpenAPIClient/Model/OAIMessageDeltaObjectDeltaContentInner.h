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


#import "OAIMessageDeltaContentImageFileObject.h"
#import "OAIMessageDeltaContentImageFileObjectImageFile.h"
#import "OAIMessageDeltaContentTextObject.h"
#import "OAIMessageDeltaContentTextObjectText.h"
@protocol OAIMessageDeltaContentImageFileObject;
@class OAIMessageDeltaContentImageFileObject;
@protocol OAIMessageDeltaContentImageFileObjectImageFile;
@class OAIMessageDeltaContentImageFileObjectImageFile;
@protocol OAIMessageDeltaContentTextObject;
@class OAIMessageDeltaContentTextObject;
@protocol OAIMessageDeltaContentTextObjectText;
@class OAIMessageDeltaContentTextObjectText;



@protocol OAIMessageDeltaObjectDeltaContentInner
@end

@interface OAIMessageDeltaObjectDeltaContentInner : OAIObject

/* The index of the content part in the message. 
 */
@property(nonatomic) NSNumber* index;
/* Always `image_file`. 
 */
@property(nonatomic) NSString* type;

@property(nonatomic) OAIMessageDeltaContentImageFileObjectImageFile* imageFile;

@property(nonatomic) OAIMessageDeltaContentTextObjectText* text;

@end

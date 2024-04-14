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





@protocol OAICreateModerationResponseResultsInnerCategoryScores
@end

@interface OAICreateModerationResponseResultsInnerCategoryScores : OAIObject

/* The score for the category 'hate'. 
 */
@property(nonatomic) NSNumber* hate;
/* The score for the category 'hate/threatening'. 
 */
@property(nonatomic) NSNumber* hateThreatening;
/* The score for the category 'harassment'. 
 */
@property(nonatomic) NSNumber* harassment;
/* The score for the category 'harassment/threatening'. 
 */
@property(nonatomic) NSNumber* harassmentThreatening;
/* The score for the category 'self-harm'. 
 */
@property(nonatomic) NSNumber* selfHarm;
/* The score for the category 'self-harm/intent'. 
 */
@property(nonatomic) NSNumber* selfHarmIntent;
/* The score for the category 'self-harm/instructions'. 
 */
@property(nonatomic) NSNumber* selfHarmInstructions;
/* The score for the category 'sexual'. 
 */
@property(nonatomic) NSNumber* sexual;
/* The score for the category 'sexual/minors'. 
 */
@property(nonatomic) NSNumber* sexualMinors;
/* The score for the category 'violence'. 
 */
@property(nonatomic) NSNumber* violence;
/* The score for the category 'violence/graphic'. 
 */
@property(nonatomic) NSNumber* violenceGraphic;

@end

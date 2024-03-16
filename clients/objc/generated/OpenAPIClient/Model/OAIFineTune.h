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


#import "OAIFineTuneEvent.h"
#import "OAIOpenAIFile.h"
@protocol OAIFineTuneEvent;
@class OAIFineTuneEvent;
@protocol OAIOpenAIFile;
@class OAIOpenAIFile;



@protocol OAIFineTune
@end

@interface OAIFineTune : OAIObject


@property(nonatomic) NSString* _id;

@property(nonatomic) NSString* object;

@property(nonatomic) NSNumber* createdAt;

@property(nonatomic) NSNumber* updatedAt;

@property(nonatomic) NSString* model;

@property(nonatomic) NSString* fineTunedModel;

@property(nonatomic) NSString* organizationId;

@property(nonatomic) NSString* status;

@property(nonatomic) NSObject* hyperparams;

@property(nonatomic) NSArray<OAIOpenAIFile>* trainingFiles;

@property(nonatomic) NSArray<OAIOpenAIFile>* validationFiles;

@property(nonatomic) NSArray<OAIOpenAIFile>* resultFiles;

@property(nonatomic) NSArray<OAIFineTuneEvent>* events;

@end

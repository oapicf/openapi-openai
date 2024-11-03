#import "OAIFineTuningJob.h"

@implementation OAIFineTuningJob

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"createdAt": @"created_at", @"error": @"error", @"fineTunedModel": @"fine_tuned_model", @"finishedAt": @"finished_at", @"hyperparameters": @"hyperparameters", @"model": @"model", @"object": @"object", @"organizationId": @"organization_id", @"resultFiles": @"result_files", @"status": @"status", @"trainedTokens": @"trained_tokens", @"trainingFile": @"training_file", @"validationFile": @"validation_file", @"integrations": @"integrations", @"seed": @"seed" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"integrations", ];
  return [optionalProperties containsObject:propertyName];
}

@end

#import "OAIFineTune.h"

@implementation OAIFineTune

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"object": @"object", @"createdAt": @"created_at", @"updatedAt": @"updated_at", @"model": @"model", @"fineTunedModel": @"fine_tuned_model", @"organizationId": @"organization_id", @"status": @"status", @"hyperparams": @"hyperparams", @"trainingFiles": @"training_files", @"validationFiles": @"validation_files", @"resultFiles": @"result_files", @"events": @"events" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"events"];
  return [optionalProperties containsObject:propertyName];
}

@end

#import "OAICreateFineTuningJobRequest.h"

@implementation OAICreateFineTuningJobRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"model": @"model", @"trainingFile": @"training_file", @"hyperparameters": @"hyperparameters", @"suffix": @"suffix", @"validationFile": @"validation_file", @"integrations": @"integrations", @"seed": @"seed", @"method": @"method" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"hyperparameters", @"suffix", @"validationFile", @"integrations", @"seed", @"method"];
  return [optionalProperties containsObject:propertyName];
}

@end

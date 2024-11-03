#import "OAIFineTuningJobCheckpointMetrics.h"

@implementation OAIFineTuningJobCheckpointMetrics

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"step": @"step", @"trainLoss": @"train_loss", @"trainMeanTokenAccuracy": @"train_mean_token_accuracy", @"validLoss": @"valid_loss", @"validMeanTokenAccuracy": @"valid_mean_token_accuracy", @"fullValidLoss": @"full_valid_loss", @"fullValidMeanTokenAccuracy": @"full_valid_mean_token_accuracy" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"step", @"trainLoss", @"trainMeanTokenAccuracy", @"validLoss", @"validMeanTokenAccuracy", @"fullValidLoss", @"fullValidMeanTokenAccuracy"];
  return [optionalProperties containsObject:propertyName];
}

@end

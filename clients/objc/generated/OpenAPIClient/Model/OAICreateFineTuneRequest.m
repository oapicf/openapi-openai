#import "OAICreateFineTuneRequest.h"

@implementation OAICreateFineTuneRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.nEpochs = @4;
    self.promptLossWeight = @0.01;
    self.computeClassificationMetrics = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"trainingFile": @"training_file", @"validationFile": @"validation_file", @"model": @"model", @"nEpochs": @"n_epochs", @"batchSize": @"batch_size", @"learningRateMultiplier": @"learning_rate_multiplier", @"promptLossWeight": @"prompt_loss_weight", @"computeClassificationMetrics": @"compute_classification_metrics", @"classificationNClasses": @"classification_n_classes", @"classificationPositiveClass": @"classification_positive_class", @"classificationBetas": @"classification_betas", @"suffix": @"suffix" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"validationFile", @"model", @"nEpochs", @"batchSize", @"learningRateMultiplier", @"promptLossWeight", @"computeClassificationMetrics", @"classificationNClasses", @"classificationPositiveClass", @"classificationBetas", @"suffix"];
  return [optionalProperties containsObject:propertyName];
}

@end

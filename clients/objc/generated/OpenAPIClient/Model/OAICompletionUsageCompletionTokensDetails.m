#import "OAICompletionUsageCompletionTokensDetails.h"

@implementation OAICompletionUsageCompletionTokensDetails

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"acceptedPredictionTokens": @"accepted_prediction_tokens", @"audioTokens": @"audio_tokens", @"reasoningTokens": @"reasoning_tokens", @"rejectedPredictionTokens": @"rejected_prediction_tokens" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"acceptedPredictionTokens", @"audioTokens", @"reasoningTokens", @"rejectedPredictionTokens"];
  return [optionalProperties containsObject:propertyName];
}

@end

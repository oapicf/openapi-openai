#import "OAICompletionUsage.h"

@implementation OAICompletionUsage

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"completionTokens": @"completion_tokens", @"promptTokens": @"prompt_tokens", @"totalTokens": @"total_tokens", @"completionTokensDetails": @"completion_tokens_details", @"promptTokensDetails": @"prompt_tokens_details" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"completionTokensDetails", @"promptTokensDetails"];
  return [optionalProperties containsObject:propertyName];
}

@end

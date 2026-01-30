#import "OAIFineTunePreferenceRequestInputPreferredCompletionInner.h"

@implementation OAIFineTunePreferenceRequestInputPreferredCompletionInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"content": @"content", @"refusal": @"refusal", @"role": @"role", @"name": @"name", @"audio": @"audio", @"toolCalls": @"tool_calls", @"functionCall": @"function_call" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"content", @"refusal", @"name", @"audio", @"toolCalls", @"functionCall"];
  return [optionalProperties containsObject:propertyName];
}

@end

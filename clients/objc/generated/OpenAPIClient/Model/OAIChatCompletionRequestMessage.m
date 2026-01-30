#import "OAIChatCompletionRequestMessage.h"

@implementation OAIChatCompletionRequestMessage

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"content": @"content", @"role": @"role", @"name": @"name", @"refusal": @"refusal", @"audio": @"audio", @"toolCalls": @"tool_calls", @"functionCall": @"function_call", @"toolCallId": @"tool_call_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"refusal", @"audio", @"toolCalls", @"functionCall", ];
  return [optionalProperties containsObject:propertyName];
}

@end

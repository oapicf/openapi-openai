#import "OAICreateRunRequest.h"

@implementation OAICreateRunRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.temperature = @1;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"assistantId": @"assistant_id", @"model": @"model", @"instructions": @"instructions", @"additionalInstructions": @"additional_instructions", @"additionalMessages": @"additional_messages", @"tools": @"tools", @"metadata": @"metadata", @"temperature": @"temperature", @"stream": @"stream", @"maxPromptTokens": @"max_prompt_tokens", @"maxCompletionTokens": @"max_completion_tokens", @"truncationStrategy": @"truncation_strategy", @"toolChoice": @"tool_choice", @"responseFormat": @"response_format" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"model", @"instructions", @"additionalInstructions", @"additionalMessages", @"tools", @"metadata", @"temperature", @"stream", @"maxPromptTokens", @"maxCompletionTokens", @"truncationStrategy", @"toolChoice", @"responseFormat"];
  return [optionalProperties containsObject:propertyName];
}

@end

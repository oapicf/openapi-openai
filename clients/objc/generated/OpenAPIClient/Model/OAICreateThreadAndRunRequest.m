#import "OAICreateThreadAndRunRequest.h"

@implementation OAICreateThreadAndRunRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.temperature = @1;
    self.topP = @1;
    self.parallelToolCalls = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"assistantId": @"assistant_id", @"thread": @"thread", @"model": @"model", @"instructions": @"instructions", @"tools": @"tools", @"toolResources": @"tool_resources", @"metadata": @"metadata", @"temperature": @"temperature", @"topP": @"top_p", @"stream": @"stream", @"maxPromptTokens": @"max_prompt_tokens", @"maxCompletionTokens": @"max_completion_tokens", @"truncationStrategy": @"truncation_strategy", @"toolChoice": @"tool_choice", @"parallelToolCalls": @"parallel_tool_calls", @"responseFormat": @"response_format" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"thread", @"model", @"instructions", @"tools", @"toolResources", @"metadata", @"temperature", @"topP", @"stream", @"maxPromptTokens", @"maxCompletionTokens", @"truncationStrategy", @"toolChoice", @"parallelToolCalls", @"responseFormat"];
  return [optionalProperties containsObject:propertyName];
}

@end

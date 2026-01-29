#import "OAICreateChatCompletionRequest.h"

@implementation OAICreateChatCompletionRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.frequencyPenalty = @0;
    self.logprobs = @(NO);
    self.n = @1;
    self.presencePenalty = @0;
    self.stream = @(NO);
    self.temperature = @1;
    self.topP = @1;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"messages": @"messages", @"model": @"model", @"frequencyPenalty": @"frequency_penalty", @"logitBias": @"logit_bias", @"logprobs": @"logprobs", @"topLogprobs": @"top_logprobs", @"maxTokens": @"max_tokens", @"n": @"n", @"presencePenalty": @"presence_penalty", @"responseFormat": @"response_format", @"seed": @"seed", @"stop": @"stop", @"stream": @"stream", @"temperature": @"temperature", @"topP": @"top_p", @"tools": @"tools", @"toolChoice": @"tool_choice", @"user": @"user", @"functionCall": @"function_call", @"functions": @"functions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"frequencyPenalty", @"logitBias", @"logprobs", @"topLogprobs", @"maxTokens", @"n", @"presencePenalty", @"responseFormat", @"seed", @"stop", @"stream", @"temperature", @"topP", @"tools", @"toolChoice", @"user", @"functionCall", @"functions"];
  return [optionalProperties containsObject:propertyName];
}

@end

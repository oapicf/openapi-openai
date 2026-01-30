#import "OAICreateChatCompletionRequest.h"

@implementation OAICreateChatCompletionRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.store = @(NO);
    self.reasoningEffort = @"medium";
    self.frequencyPenalty = @0;
    self.logprobs = @(NO);
    self.n = @1;
    self.presencePenalty = @0;
    self.serviceTier = @"auto";
    self.stream = @(NO);
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"messages": @"messages", @"model": @"model", @"store": @"store", @"reasoningEffort": @"reasoning_effort", @"metadata": @"metadata", @"frequencyPenalty": @"frequency_penalty", @"logitBias": @"logit_bias", @"logprobs": @"logprobs", @"topLogprobs": @"top_logprobs", @"maxTokens": @"max_tokens", @"maxCompletionTokens": @"max_completion_tokens", @"n": @"n", @"modalities": @"modalities", @"prediction": @"prediction", @"audio": @"audio", @"presencePenalty": @"presence_penalty", @"responseFormat": @"response_format", @"seed": @"seed", @"serviceTier": @"service_tier", @"stop": @"stop", @"stream": @"stream", @"streamOptions": @"stream_options", @"temperature": @"temperature", @"topP": @"top_p", @"tools": @"tools", @"toolChoice": @"tool_choice", @"parallelToolCalls": @"parallel_tool_calls", @"user": @"user", @"functionCall": @"function_call", @"functions": @"functions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"store", @"reasoningEffort", @"metadata", @"frequencyPenalty", @"logitBias", @"logprobs", @"topLogprobs", @"maxTokens", @"maxCompletionTokens", @"n", @"modalities", @"prediction", @"audio", @"presencePenalty", @"responseFormat", @"seed", @"serviceTier", @"stop", @"stream", @"streamOptions", @"temperature", @"topP", @"tools", @"toolChoice", @"parallelToolCalls", @"user", @"functionCall", @"functions"];
  return [optionalProperties containsObject:propertyName];
}

@end

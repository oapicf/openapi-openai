#import "OAICreateChatCompletionRequest.h"

@implementation OAICreateChatCompletionRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.temperature = @1;
    self.topP = @1;
    self.n = @1;
    self.stream = @(NO);
    self.presencePenalty = @0;
    self.frequencyPenalty = @0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"model": @"model", @"messages": @"messages", @"functions": @"functions", @"functionCall": @"function_call", @"temperature": @"temperature", @"topP": @"top_p", @"n": @"n", @"stream": @"stream", @"stop": @"stop", @"maxTokens": @"max_tokens", @"presencePenalty": @"presence_penalty", @"frequencyPenalty": @"frequency_penalty", @"logitBias": @"logit_bias", @"user": @"user" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"functions", @"functionCall", @"temperature", @"topP", @"n", @"stream", @"stop", @"maxTokens", @"presencePenalty", @"frequencyPenalty", @"logitBias", @"user"];
  return [optionalProperties containsObject:propertyName];
}

@end

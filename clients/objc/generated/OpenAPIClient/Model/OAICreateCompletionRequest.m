#import "OAICreateCompletionRequest.h"

@implementation OAICreateCompletionRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.bestOf = @1;
    self.echo = @(NO);
    self.frequencyPenalty = @0;
    self.maxTokens = @16;
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"model": @"model", @"prompt": @"prompt", @"bestOf": @"best_of", @"echo": @"echo", @"frequencyPenalty": @"frequency_penalty", @"logitBias": @"logit_bias", @"logprobs": @"logprobs", @"maxTokens": @"max_tokens", @"n": @"n", @"presencePenalty": @"presence_penalty", @"seed": @"seed", @"stop": @"stop", @"stream": @"stream", @"suffix": @"suffix", @"temperature": @"temperature", @"topP": @"top_p", @"user": @"user" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"bestOf", @"echo", @"frequencyPenalty", @"logitBias", @"logprobs", @"maxTokens", @"n", @"presencePenalty", @"seed", @"stop", @"stream", @"suffix", @"temperature", @"topP", @"user"];
  return [optionalProperties containsObject:propertyName];
}

@end

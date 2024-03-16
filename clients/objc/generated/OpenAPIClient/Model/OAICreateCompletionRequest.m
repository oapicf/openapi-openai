#import "OAICreateCompletionRequest.h"

@implementation OAICreateCompletionRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.maxTokens = @16;
    self.temperature = @1;
    self.topP = @1;
    self.n = @1;
    self.stream = @(NO);
    self.echo = @(NO);
    self.presencePenalty = @0;
    self.frequencyPenalty = @0;
    self.bestOf = @1;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"model": @"model", @"prompt": @"prompt", @"suffix": @"suffix", @"maxTokens": @"max_tokens", @"temperature": @"temperature", @"topP": @"top_p", @"n": @"n", @"stream": @"stream", @"logprobs": @"logprobs", @"echo": @"echo", @"stop": @"stop", @"presencePenalty": @"presence_penalty", @"frequencyPenalty": @"frequency_penalty", @"bestOf": @"best_of", @"logitBias": @"logit_bias", @"user": @"user" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"suffix", @"maxTokens", @"temperature", @"topP", @"n", @"stream", @"logprobs", @"echo", @"stop", @"presencePenalty", @"frequencyPenalty", @"bestOf", @"logitBias", @"user"];
  return [optionalProperties containsObject:propertyName];
}

@end

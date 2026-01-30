#import "OAIUsageCompletionsResult.h"

@implementation OAIUsageCompletionsResult

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"object": @"object", @"inputTokens": @"input_tokens", @"inputCachedTokens": @"input_cached_tokens", @"outputTokens": @"output_tokens", @"inputAudioTokens": @"input_audio_tokens", @"outputAudioTokens": @"output_audio_tokens", @"numModelRequests": @"num_model_requests", @"projectId": @"project_id", @"userId": @"user_id", @"apiKeyId": @"api_key_id", @"model": @"model", @"batch": @"batch" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"inputCachedTokens", @"inputAudioTokens", @"outputAudioTokens", @"projectId", @"userId", @"apiKeyId", @"model", @"batch"];
  return [optionalProperties containsObject:propertyName];
}

@end

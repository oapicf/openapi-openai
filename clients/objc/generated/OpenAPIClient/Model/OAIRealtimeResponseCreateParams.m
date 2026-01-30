#import "OAIRealtimeResponseCreateParams.h"

@implementation OAIRealtimeResponseCreateParams

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"modalities": @"modalities", @"instructions": @"instructions", @"voice": @"voice", @"outputAudioFormat": @"output_audio_format", @"tools": @"tools", @"toolChoice": @"tool_choice", @"temperature": @"temperature", @"maxResponseOutputTokens": @"max_response_output_tokens", @"conversation": @"conversation", @"metadata": @"metadata", @"input": @"input" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"modalities", @"instructions", @"voice", @"outputAudioFormat", @"tools", @"toolChoice", @"temperature", @"maxResponseOutputTokens", @"conversation", @"metadata", @"input"];
  return [optionalProperties containsObject:propertyName];
}

@end

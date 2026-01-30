#import "OAIRealtimeSession.h"

@implementation OAIRealtimeSession

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"modalities": @"modalities", @"model": @"model", @"instructions": @"instructions", @"voice": @"voice", @"inputAudioFormat": @"input_audio_format", @"outputAudioFormat": @"output_audio_format", @"inputAudioTranscription": @"input_audio_transcription", @"turnDetection": @"turn_detection", @"tools": @"tools", @"toolChoice": @"tool_choice", @"temperature": @"temperature", @"maxResponseOutputTokens": @"max_response_output_tokens" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"modalities", @"model", @"instructions", @"voice", @"inputAudioFormat", @"outputAudioFormat", @"inputAudioTranscription", @"turnDetection", @"tools", @"toolChoice", @"temperature", @"maxResponseOutputTokens"];
  return [optionalProperties containsObject:propertyName];
}

@end

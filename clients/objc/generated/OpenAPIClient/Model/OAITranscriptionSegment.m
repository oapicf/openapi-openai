#import "OAITranscriptionSegment.h"

@implementation OAITranscriptionSegment

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"seek": @"seek", @"start": @"start", @"end": @"end", @"text": @"text", @"tokens": @"tokens", @"temperature": @"temperature", @"avgLogprob": @"avg_logprob", @"compressionRatio": @"compression_ratio", @"noSpeechProb": @"no_speech_prob" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end

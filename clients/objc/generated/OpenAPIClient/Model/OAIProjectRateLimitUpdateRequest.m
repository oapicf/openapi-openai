#import "OAIProjectRateLimitUpdateRequest.h"

@implementation OAIProjectRateLimitUpdateRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"maxRequestsPer1Minute": @"max_requests_per_1_minute", @"maxTokensPer1Minute": @"max_tokens_per_1_minute", @"maxImagesPer1Minute": @"max_images_per_1_minute", @"maxAudioMegabytesPer1Minute": @"max_audio_megabytes_per_1_minute", @"maxRequestsPer1Day": @"max_requests_per_1_day", @"batch1DayMaxInputTokens": @"batch_1_day_max_input_tokens" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"maxRequestsPer1Minute", @"maxTokensPer1Minute", @"maxImagesPer1Minute", @"maxAudioMegabytesPer1Minute", @"maxRequestsPer1Day", @"batch1DayMaxInputTokens"];
  return [optionalProperties containsObject:propertyName];
}

@end

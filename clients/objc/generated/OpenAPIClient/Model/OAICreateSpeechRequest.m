#import "OAICreateSpeechRequest.h"

@implementation OAICreateSpeechRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.responseFormat = @"mp3";
    self.speed = @1;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"model": @"model", @"input": @"input", @"voice": @"voice", @"responseFormat": @"response_format", @"speed": @"speed" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"responseFormat", @"speed"];
  return [optionalProperties containsObject:propertyName];
}

@end

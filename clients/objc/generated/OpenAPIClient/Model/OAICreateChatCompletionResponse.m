#import "OAICreateChatCompletionResponse.h"

@implementation OAICreateChatCompletionResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"choices": @"choices", @"created": @"created", @"model": @"model", @"systemFingerprint": @"system_fingerprint", @"object": @"object", @"usage": @"usage" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"systemFingerprint", @"usage"];
  return [optionalProperties containsObject:propertyName];
}

@end

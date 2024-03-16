#import "OAICreateChatCompletionResponseChoicesInner.h"

@implementation OAICreateChatCompletionResponseChoicesInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"index": @"index", @"message": @"message", @"finishReason": @"finish_reason" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"index", @"message", @"finishReason"];
  return [optionalProperties containsObject:propertyName];
}

@end

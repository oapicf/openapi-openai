#import "OAIRunStepDeltaStepDetailsToolCallsObjectToolCallsInner.h"

@implementation OAIRunStepDeltaStepDetailsToolCallsObjectToolCallsInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"index": @"index", @"_id": @"id", @"type": @"type", @"codeInterpreter": @"code_interpreter", @"fileSearch": @"file_search", @"function": @"function" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"codeInterpreter", @"function"];
  return [optionalProperties containsObject:propertyName];
}

@end

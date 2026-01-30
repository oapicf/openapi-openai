#import "OAIFineTuneChatRequestInput.h"

@implementation OAIFineTuneChatRequestInput

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.parallelToolCalls = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"messages": @"messages", @"tools": @"tools", @"parallelToolCalls": @"parallel_tool_calls", @"functions": @"functions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"messages", @"tools", @"parallelToolCalls", @"functions"];
  return [optionalProperties containsObject:propertyName];
}

@end

#import "OAICreateEditRequest.h"

@implementation OAICreateEditRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.input = @"";
    self.n = @1;
    self.temperature = @1;
    self.topP = @1;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"model": @"model", @"input": @"input", @"instruction": @"instruction", @"n": @"n", @"temperature": @"temperature", @"topP": @"top_p" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"input", @"n", @"temperature", @"topP"];
  return [optionalProperties containsObject:propertyName];
}

@end

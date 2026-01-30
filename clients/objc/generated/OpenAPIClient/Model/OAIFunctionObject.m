#import "OAIFunctionObject.h"

@implementation OAIFunctionObject

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.strict = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_description": @"description", @"name": @"name", @"parameters": @"parameters", @"strict": @"strict" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_description", @"parameters", @"strict"];
  return [optionalProperties containsObject:propertyName];
}

@end

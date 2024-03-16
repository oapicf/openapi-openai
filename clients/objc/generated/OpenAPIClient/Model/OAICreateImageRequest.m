#import "OAICreateImageRequest.h"

@implementation OAICreateImageRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.n = @1;
    self.size = @"1024x1024";
    self.responseFormat = @"url";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"prompt": @"prompt", @"n": @"n", @"size": @"size", @"responseFormat": @"response_format", @"user": @"user" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"n", @"size", @"responseFormat", @"user"];
  return [optionalProperties containsObject:propertyName];
}

@end

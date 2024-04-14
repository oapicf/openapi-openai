#import "OAICreateImageRequest.h"

@implementation OAICreateImageRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.n = @1;
    self.quality = @"standard";
    self.responseFormat = @"url";
    self.size = @"1024x1024";
    self.style = @"vivid";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"prompt": @"prompt", @"model": @"model", @"n": @"n", @"quality": @"quality", @"responseFormat": @"response_format", @"size": @"size", @"style": @"style", @"user": @"user" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"model", @"n", @"quality", @"responseFormat", @"size", @"style", @"user"];
  return [optionalProperties containsObject:propertyName];
}

@end

#import "OAICreateEmbeddingRequest.h"

@implementation OAICreateEmbeddingRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.encodingFormat = @"float";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"input": @"input", @"model": @"model", @"encodingFormat": @"encoding_format", @"dimensions": @"dimensions", @"user": @"user" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"encodingFormat", @"dimensions", @"user"];
  return [optionalProperties containsObject:propertyName];
}

@end

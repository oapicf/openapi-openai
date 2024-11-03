#import "OAICreateAssistantRequest.h"

@implementation OAICreateAssistantRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"model": @"model", @"name": @"name", @"_description": @"description", @"instructions": @"instructions", @"tools": @"tools", @"fileIds": @"file_ids", @"metadata": @"metadata" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"_description", @"instructions", @"tools", @"fileIds", @"metadata"];
  return [optionalProperties containsObject:propertyName];
}

@end

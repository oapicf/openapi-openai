#import "OAIAssistantObject.h"

@implementation OAIAssistantObject

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"object": @"object", @"createdAt": @"created_at", @"name": @"name", @"_description": @"description", @"model": @"model", @"instructions": @"instructions", @"tools": @"tools", @"toolResources": @"tool_resources", @"metadata": @"metadata", @"temperature": @"temperature", @"topP": @"top_p", @"responseFormat": @"response_format" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"toolResources", @"temperature", @"topP", @"responseFormat"];
  return [optionalProperties containsObject:propertyName];
}

@end

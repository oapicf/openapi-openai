#import "OAIModifyAssistantRequest.h"

@implementation OAIModifyAssistantRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"model": @"model", @"name": @"name", @"_description": @"description", @"instructions": @"instructions", @"tools": @"tools", @"toolResources": @"tool_resources", @"metadata": @"metadata", @"temperature": @"temperature", @"topP": @"top_p", @"responseFormat": @"response_format" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"model", @"name", @"_description", @"instructions", @"tools", @"toolResources", @"metadata", @"temperature", @"topP", @"responseFormat"];
  return [optionalProperties containsObject:propertyName];
}

@end

#import "OAIRealtimeConversationItem.h"

@implementation OAIRealtimeConversationItem

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"type": @"type", @"object": @"object", @"status": @"status", @"role": @"role", @"content": @"content", @"callId": @"call_id", @"name": @"name", @"arguments": @"arguments", @"output": @"output" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"type", @"object", @"status", @"role", @"content", @"callId", @"name", @"arguments", @"output"];
  return [optionalProperties containsObject:propertyName];
}

@end

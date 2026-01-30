#import "OAIAdminApiKey.h"

@implementation OAIAdminApiKey

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"object": @"object", @"_id": @"id", @"name": @"name", @"redactedValue": @"redacted_value", @"value": @"value", @"createdAt": @"created_at", @"owner": @"owner" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"object", @"_id", @"name", @"redactedValue", @"value", @"createdAt", @"owner"];
  return [optionalProperties containsObject:propertyName];
}

@end

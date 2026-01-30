#import "OAIVectorStoreObject.h"

@implementation OAIVectorStoreObject

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"object": @"object", @"createdAt": @"created_at", @"name": @"name", @"usageBytes": @"usage_bytes", @"fileCounts": @"file_counts", @"status": @"status", @"expiresAfter": @"expires_after", @"expiresAt": @"expires_at", @"lastActiveAt": @"last_active_at", @"metadata": @"metadata" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"expiresAfter", @"expiresAt", ];
  return [optionalProperties containsObject:propertyName];
}

@end

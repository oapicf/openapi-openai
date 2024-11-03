#import "OAIOpenAIFile.h"

@implementation OAIOpenAIFile

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"bytes": @"bytes", @"createdAt": @"created_at", @"filename": @"filename", @"object": @"object", @"purpose": @"purpose", @"status": @"status", @"statusDetails": @"status_details" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"statusDetails"];
  return [optionalProperties containsObject:propertyName];
}

@end

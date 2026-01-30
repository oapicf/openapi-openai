#import "OAIInvite.h"

@implementation OAIInvite

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"object": @"object", @"_id": @"id", @"email": @"email", @"role": @"role", @"status": @"status", @"invitedAt": @"invited_at", @"expiresAt": @"expires_at", @"acceptedAt": @"accepted_at", @"projects": @"projects" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"acceptedAt", @"projects"];
  return [optionalProperties containsObject:propertyName];
}

@end

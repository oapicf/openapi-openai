#import "OAIRunStepObject.h"

@implementation OAIRunStepObject

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"object": @"object", @"createdAt": @"created_at", @"assistantId": @"assistant_id", @"threadId": @"thread_id", @"runId": @"run_id", @"type": @"type", @"status": @"status", @"stepDetails": @"step_details", @"lastError": @"last_error", @"expiredAt": @"expired_at", @"cancelledAt": @"cancelled_at", @"failedAt": @"failed_at", @"completedAt": @"completed_at", @"metadata": @"metadata", @"usage": @"usage" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end

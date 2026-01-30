#import "OAIBatch.h"

@implementation OAIBatch

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"object": @"object", @"endpoint": @"endpoint", @"errors": @"errors", @"inputFileId": @"input_file_id", @"completionWindow": @"completion_window", @"status": @"status", @"outputFileId": @"output_file_id", @"errorFileId": @"error_file_id", @"createdAt": @"created_at", @"inProgressAt": @"in_progress_at", @"expiresAt": @"expires_at", @"finalizingAt": @"finalizing_at", @"completedAt": @"completed_at", @"failedAt": @"failed_at", @"expiredAt": @"expired_at", @"cancellingAt": @"cancelling_at", @"cancelledAt": @"cancelled_at", @"requestCounts": @"request_counts", @"metadata": @"metadata" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"errors", @"outputFileId", @"errorFileId", @"inProgressAt", @"expiresAt", @"finalizingAt", @"completedAt", @"failedAt", @"expiredAt", @"cancellingAt", @"cancelledAt", @"requestCounts", @"metadata"];
  return [optionalProperties containsObject:propertyName];
}

@end

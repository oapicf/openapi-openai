#import "OAIAuditLog.h"

@implementation OAIAuditLog

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"type": @"type", @"effectiveAt": @"effective_at", @"project": @"project", @"actor": @"actor", @"apiKeyCreated": @"api_key.created", @"apiKeyUpdated": @"api_key.updated", @"apiKeyDeleted": @"api_key.deleted", @"inviteSent": @"invite.sent", @"inviteAccepted": @"invite.accepted", @"inviteDeleted": @"invite.deleted", @"loginFailed": @"login.failed", @"logoutFailed": @"logout.failed", @"organizationUpdated": @"organization.updated", @"projectCreated": @"project.created", @"projectUpdated": @"project.updated", @"projectArchived": @"project.archived", @"rateLimitUpdated": @"rate_limit.updated", @"rateLimitDeleted": @"rate_limit.deleted", @"serviceAccountCreated": @"service_account.created", @"serviceAccountUpdated": @"service_account.updated", @"serviceAccountDeleted": @"service_account.deleted", @"userAdded": @"user.added", @"userUpdated": @"user.updated", @"userDeleted": @"user.deleted" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"project", @"apiKeyCreated", @"apiKeyUpdated", @"apiKeyDeleted", @"inviteSent", @"inviteAccepted", @"inviteDeleted", @"loginFailed", @"logoutFailed", @"organizationUpdated", @"projectCreated", @"projectUpdated", @"projectArchived", @"rateLimitUpdated", @"rateLimitDeleted", @"serviceAccountCreated", @"serviceAccountUpdated", @"serviceAccountDeleted", @"userAdded", @"userUpdated", @"userDeleted"];
  return [optionalProperties containsObject:propertyName];
}

@end

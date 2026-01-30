#import "OAIAuditLogOrganizationUpdatedChangesRequestedSettings.h"

@implementation OAIAuditLogOrganizationUpdatedChangesRequestedSettings

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"threadsUiVisibility": @"threads_ui_visibility", @"usageDashboardVisibility": @"usage_dashboard_visibility" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"threadsUiVisibility", @"usageDashboardVisibility"];
  return [optionalProperties containsObject:propertyName];
}

@end

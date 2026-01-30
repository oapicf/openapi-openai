#import "OAIUsageModerationsResult.h"

@implementation OAIUsageModerationsResult

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"object": @"object", @"inputTokens": @"input_tokens", @"numModelRequests": @"num_model_requests", @"projectId": @"project_id", @"userId": @"user_id", @"apiKeyId": @"api_key_id", @"model": @"model" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"projectId", @"userId", @"apiKeyId", @"model"];
  return [optionalProperties containsObject:propertyName];
}

@end

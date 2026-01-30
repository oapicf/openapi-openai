#import "OAIRunObject.h"

@implementation OAIRunObject

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.parallelToolCalls = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"object": @"object", @"createdAt": @"created_at", @"threadId": @"thread_id", @"assistantId": @"assistant_id", @"status": @"status", @"requiredAction": @"required_action", @"lastError": @"last_error", @"expiresAt": @"expires_at", @"startedAt": @"started_at", @"cancelledAt": @"cancelled_at", @"failedAt": @"failed_at", @"completedAt": @"completed_at", @"incompleteDetails": @"incomplete_details", @"model": @"model", @"instructions": @"instructions", @"tools": @"tools", @"metadata": @"metadata", @"usage": @"usage", @"temperature": @"temperature", @"topP": @"top_p", @"maxPromptTokens": @"max_prompt_tokens", @"maxCompletionTokens": @"max_completion_tokens", @"truncationStrategy": @"truncation_strategy", @"toolChoice": @"tool_choice", @"parallelToolCalls": @"parallel_tool_calls", @"responseFormat": @"response_format" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"temperature", @"topP", ];
  return [optionalProperties containsObject:propertyName];
}

@end

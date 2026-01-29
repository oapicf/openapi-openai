#import "OAICreateModerationResponseResultsInnerCategoryScores.h"

@implementation OAICreateModerationResponseResultsInnerCategoryScores

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"hate": @"hate", @"hateThreatening": @"hate/threatening", @"harassment": @"harassment", @"harassmentThreatening": @"harassment/threatening", @"selfHarm": @"self-harm", @"selfHarmIntent": @"self-harm/intent", @"selfHarmInstructions": @"self-harm/instructions", @"sexual": @"sexual", @"sexualMinors": @"sexual/minors", @"violence": @"violence", @"violenceGraphic": @"violence/graphic" }];
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

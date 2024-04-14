#import "OAIMessageDeltaContentTextObjectTextAnnotationsInner.h"

@implementation OAIMessageDeltaContentTextObjectTextAnnotationsInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"index": @"index", @"type": @"type", @"text": @"text", @"fileCitation": @"file_citation", @"startIndex": @"start_index", @"endIndex": @"end_index", @"filePath": @"file_path" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"text", @"fileCitation", @"startIndex", @"endIndex", @"filePath"];
  return [optionalProperties containsObject:propertyName];
}

@end

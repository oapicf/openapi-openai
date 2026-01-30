#import "OAIMessageDeltaContentImageFileObjectImageFile.h"

@implementation OAIMessageDeltaContentImageFileObjectImageFile

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.detail = @"auto";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"fileId": @"file_id", @"detail": @"detail" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"fileId", @"detail"];
  return [optionalProperties containsObject:propertyName];
}

@end

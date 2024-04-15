#import <Foundation/Foundation.h>

/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#ifndef OAIDebugLogResponse
#define OAIDebugLogResponse(response, responseObject,request, error) [[OAILogger sharedLogger] logResponse:response responseObject:responseObject request:request error:error];
#endif

/**
 * Log debug message macro
 */
#ifndef OAIDebugLog
#define OAIDebugLog(format, ...) [[OAILogger sharedLogger] debugLog:[NSString stringWithFormat:@"%s", __PRETTY_FUNCTION__] message: format, ##__VA_ARGS__];
#endif

@interface OAILogger : NSObject

+(instancetype)sharedLogger;

/**
 * Enabled switch, default NO - default set by OAIConfiguration debug property
 */
@property (nonatomic, assign, getter=isEnabled) BOOL enabled;

/**
 * Debug file location, default log in console
 */
@property (nonatomic, strong) NSString *loggingFile;

/**
 * Log file handler, this property is used by sdk internally.
 */
@property (nonatomic, strong, readonly) NSFileHandle *loggingFileHandler;

/**
 * Log debug message
 */
-(void)debugLog:(NSString *)method message:(NSString *)format, ...;

/**
 * Logs request and response
 *
 * @param response NSURLResponse for the HTTP request.
 * @param responseObject response object of the HTTP request.
 * @param request   The HTTP request.
 * @param error     The error of the HTTP request.
 */
- (void)logResponse:(NSURLResponse *)response responseObject:(id)responseObject request:(NSURLRequest *)request error:(NSError *)error;

@end
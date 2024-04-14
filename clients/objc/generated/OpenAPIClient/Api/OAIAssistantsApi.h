#import <Foundation/Foundation.h>
#import "OAIAssistantFileObject.h"
#import "OAIAssistantObject.h"
#import "OAICreateAssistantFileRequest.h"
#import "OAICreateAssistantRequest.h"
#import "OAICreateMessageRequest.h"
#import "OAICreateRunRequest.h"
#import "OAICreateThreadAndRunRequest.h"
#import "OAICreateThreadRequest.h"
#import "OAIDeleteAssistantFileResponse.h"
#import "OAIDeleteAssistantResponse.h"
#import "OAIDeleteThreadResponse.h"
#import "OAIListAssistantFilesResponse.h"
#import "OAIListAssistantsResponse.h"
#import "OAIListMessageFilesResponse.h"
#import "OAIListMessagesResponse.h"
#import "OAIListRunStepsResponse.h"
#import "OAIListRunsResponse.h"
#import "OAIMessageFileObject.h"
#import "OAIMessageObject.h"
#import "OAIModifyAssistantRequest.h"
#import "OAIModifyMessageRequest.h"
#import "OAIModifyRunRequest.h"
#import "OAIModifyThreadRequest.h"
#import "OAIRunObject.h"
#import "OAIRunStepObject.h"
#import "OAISubmitToolOutputsRunRequest.h"
#import "OAIThreadObject.h"
#import "OAIApi.h"

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



@interface OAIAssistantsApi: NSObject <OAIApi>

extern NSString* kOAIAssistantsApiErrorDomain;
extern NSInteger kOAIAssistantsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Cancels a run that is `in_progress`.
/// 
///
/// @param threadId The ID of the thread to which this run belongs.
/// @param runId The ID of the run to cancel.
/// 
///  code:200 message:"OK"
///
/// @return OAIRunObject*
-(NSURLSessionTask*) cancelRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;


/// Create an assistant with a model and instructions.
/// 
///
/// @param createAssistantRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIAssistantObject*
-(NSURLSessionTask*) createAssistantWithCreateAssistantRequest: (OAICreateAssistantRequest*) createAssistantRequest
    completionHandler: (void (^)(OAIAssistantObject* output, NSError* error)) handler;


/// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
/// 
///
/// @param assistantId The ID of the assistant for which to create a File. 
/// @param createAssistantFileRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIAssistantFileObject*
-(NSURLSessionTask*) createAssistantFileWithAssistantId: (NSString*) assistantId
    createAssistantFileRequest: (OAICreateAssistantFileRequest*) createAssistantFileRequest
    completionHandler: (void (^)(OAIAssistantFileObject* output, NSError* error)) handler;


/// Create a message.
/// 
///
/// @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
/// @param createMessageRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIMessageObject*
-(NSURLSessionTask*) createMessageWithThreadId: (NSString*) threadId
    createMessageRequest: (OAICreateMessageRequest*) createMessageRequest
    completionHandler: (void (^)(OAIMessageObject* output, NSError* error)) handler;


/// Create a run.
/// 
///
/// @param threadId The ID of the thread to run.
/// @param createRunRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIRunObject*
-(NSURLSessionTask*) createRunWithThreadId: (NSString*) threadId
    createRunRequest: (OAICreateRunRequest*) createRunRequest
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;


/// Create a thread.
/// 
///
/// @param createThreadRequest  (optional)
/// 
///  code:200 message:"OK"
///
/// @return OAIThreadObject*
-(NSURLSessionTask*) createThreadWithCreateThreadRequest: (OAICreateThreadRequest*) createThreadRequest
    completionHandler: (void (^)(OAIThreadObject* output, NSError* error)) handler;


/// Create a thread and run it in one request.
/// 
///
/// @param createThreadAndRunRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIRunObject*
-(NSURLSessionTask*) createThreadAndRunWithCreateThreadAndRunRequest: (OAICreateThreadAndRunRequest*) createThreadAndRunRequest
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;


/// Delete an assistant.
/// 
///
/// @param assistantId The ID of the assistant to delete.
/// 
///  code:200 message:"OK"
///
/// @return OAIDeleteAssistantResponse*
-(NSURLSessionTask*) deleteAssistantWithAssistantId: (NSString*) assistantId
    completionHandler: (void (^)(OAIDeleteAssistantResponse* output, NSError* error)) handler;


/// Delete an assistant file.
/// 
///
/// @param assistantId The ID of the assistant that the file belongs to.
/// @param fileId The ID of the file to delete.
/// 
///  code:200 message:"OK"
///
/// @return OAIDeleteAssistantFileResponse*
-(NSURLSessionTask*) deleteAssistantFileWithAssistantId: (NSString*) assistantId
    fileId: (NSString*) fileId
    completionHandler: (void (^)(OAIDeleteAssistantFileResponse* output, NSError* error)) handler;


/// Delete a thread.
/// 
///
/// @param threadId The ID of the thread to delete.
/// 
///  code:200 message:"OK"
///
/// @return OAIDeleteThreadResponse*
-(NSURLSessionTask*) deleteThreadWithThreadId: (NSString*) threadId
    completionHandler: (void (^)(OAIDeleteThreadResponse* output, NSError* error)) handler;


/// Retrieves an assistant.
/// 
///
/// @param assistantId The ID of the assistant to retrieve.
/// 
///  code:200 message:"OK"
///
/// @return OAIAssistantObject*
-(NSURLSessionTask*) getAssistantWithAssistantId: (NSString*) assistantId
    completionHandler: (void (^)(OAIAssistantObject* output, NSError* error)) handler;


/// Retrieves an AssistantFile.
/// 
///
/// @param assistantId The ID of the assistant who the file belongs to.
/// @param fileId The ID of the file we&#39;re getting.
/// 
///  code:200 message:"OK"
///
/// @return OAIAssistantFileObject*
-(NSURLSessionTask*) getAssistantFileWithAssistantId: (NSString*) assistantId
    fileId: (NSString*) fileId
    completionHandler: (void (^)(OAIAssistantFileObject* output, NSError* error)) handler;


/// Retrieve a message.
/// 
///
/// @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
/// @param messageId The ID of the message to retrieve.
/// 
///  code:200 message:"OK"
///
/// @return OAIMessageObject*
-(NSURLSessionTask*) getMessageWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
    completionHandler: (void (^)(OAIMessageObject* output, NSError* error)) handler;


/// Retrieves a message file.
/// 
///
/// @param threadId The ID of the thread to which the message and File belong.
/// @param messageId The ID of the message the file belongs to.
/// @param fileId The ID of the file being retrieved.
/// 
///  code:200 message:"OK"
///
/// @return OAIMessageFileObject*
-(NSURLSessionTask*) getMessageFileWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
    fileId: (NSString*) fileId
    completionHandler: (void (^)(OAIMessageFileObject* output, NSError* error)) handler;


/// Retrieves a run.
/// 
///
/// @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
/// @param runId The ID of the run to retrieve.
/// 
///  code:200 message:"OK"
///
/// @return OAIRunObject*
-(NSURLSessionTask*) getRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;


/// Retrieves a run step.
/// 
///
/// @param threadId The ID of the thread to which the run and run step belongs.
/// @param runId The ID of the run to which the run step belongs.
/// @param stepId The ID of the run step to retrieve.
/// 
///  code:200 message:"OK"
///
/// @return OAIRunStepObject*
-(NSURLSessionTask*) getRunStepWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    stepId: (NSString*) stepId
    completionHandler: (void (^)(OAIRunStepObject* output, NSError* error)) handler;


/// Retrieves a thread.
/// 
///
/// @param threadId The ID of the thread to retrieve.
/// 
///  code:200 message:"OK"
///
/// @return OAIThreadObject*
-(NSURLSessionTask*) getThreadWithThreadId: (NSString*) threadId
    completionHandler: (void (^)(OAIThreadObject* output, NSError* error)) handler;


/// Returns a list of assistant files.
/// 
///
/// @param assistantId The ID of the assistant the file belongs to.
/// @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
/// @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional) (default to @"desc")
/// @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
/// @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
/// 
///  code:200 message:"OK"
///
/// @return OAIListAssistantFilesResponse*
-(NSURLSessionTask*) listAssistantFilesWithAssistantId: (NSString*) assistantId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListAssistantFilesResponse* output, NSError* error)) handler;


/// Returns a list of assistants.
/// 
///
/// @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
/// @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional) (default to @"desc")
/// @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
/// @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
/// 
///  code:200 message:"OK"
///
/// @return OAIListAssistantsResponse*
-(NSURLSessionTask*) listAssistantsWithLimit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListAssistantsResponse* output, NSError* error)) handler;


/// Returns a list of message files.
/// 
///
/// @param threadId The ID of the thread that the message and files belong to.
/// @param messageId The ID of the message that the files belongs to.
/// @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
/// @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional) (default to @"desc")
/// @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
/// @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
/// 
///  code:200 message:"OK"
///
/// @return OAIListMessageFilesResponse*
-(NSURLSessionTask*) listMessageFilesWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListMessageFilesResponse* output, NSError* error)) handler;


/// Returns a list of messages for a given thread.
/// 
///
/// @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
/// @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
/// @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional) (default to @"desc")
/// @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
/// @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
/// @param runId Filter messages by the run ID that generated them.  (optional)
/// 
///  code:200 message:"OK"
///
/// @return OAIListMessagesResponse*
-(NSURLSessionTask*) listMessagesWithThreadId: (NSString*) threadId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    runId: (NSString*) runId
    completionHandler: (void (^)(OAIListMessagesResponse* output, NSError* error)) handler;


/// Returns a list of run steps belonging to a run.
/// 
///
/// @param threadId The ID of the thread the run and run steps belong to.
/// @param runId The ID of the run the run steps belong to.
/// @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
/// @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional) (default to @"desc")
/// @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
/// @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
/// 
///  code:200 message:"OK"
///
/// @return OAIListRunStepsResponse*
-(NSURLSessionTask*) listRunStepsWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListRunStepsResponse* output, NSError* error)) handler;


/// Returns a list of runs belonging to a thread.
/// 
///
/// @param threadId The ID of the thread the run belongs to.
/// @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
/// @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional) (default to @"desc")
/// @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
/// @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
/// 
///  code:200 message:"OK"
///
/// @return OAIListRunsResponse*
-(NSURLSessionTask*) listRunsWithThreadId: (NSString*) threadId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListRunsResponse* output, NSError* error)) handler;


/// Modifies an assistant.
/// 
///
/// @param assistantId The ID of the assistant to modify.
/// @param modifyAssistantRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIAssistantObject*
-(NSURLSessionTask*) modifyAssistantWithAssistantId: (NSString*) assistantId
    modifyAssistantRequest: (OAIModifyAssistantRequest*) modifyAssistantRequest
    completionHandler: (void (^)(OAIAssistantObject* output, NSError* error)) handler;


/// Modifies a message.
/// 
///
/// @param threadId The ID of the thread to which this message belongs.
/// @param messageId The ID of the message to modify.
/// @param modifyMessageRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIMessageObject*
-(NSURLSessionTask*) modifyMessageWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
    modifyMessageRequest: (OAIModifyMessageRequest*) modifyMessageRequest
    completionHandler: (void (^)(OAIMessageObject* output, NSError* error)) handler;


/// Modifies a run.
/// 
///
/// @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
/// @param runId The ID of the run to modify.
/// @param modifyRunRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIRunObject*
-(NSURLSessionTask*) modifyRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    modifyRunRequest: (OAIModifyRunRequest*) modifyRunRequest
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;


/// Modifies a thread.
/// 
///
/// @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
/// @param modifyThreadRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIThreadObject*
-(NSURLSessionTask*) modifyThreadWithThreadId: (NSString*) threadId
    modifyThreadRequest: (OAIModifyThreadRequest*) modifyThreadRequest
    completionHandler: (void (^)(OAIThreadObject* output, NSError* error)) handler;


/// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
/// 
///
/// @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
/// @param runId The ID of the run that requires the tool output submission.
/// @param submitToolOutputsRunRequest 
/// 
///  code:200 message:"OK"
///
/// @return OAIRunObject*
-(NSURLSessionTask*) submitToolOuputsToRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    submitToolOutputsRunRequest: (OAISubmitToolOutputsRunRequest*) submitToolOutputsRunRequest
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;



@end

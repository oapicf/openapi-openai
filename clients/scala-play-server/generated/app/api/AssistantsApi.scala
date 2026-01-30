package api

import play.api.libs.json._
import model.AssistantObject
import model.CreateAssistantRequest
import model.CreateMessageRequest
import model.CreateRunRequest
import model.CreateThreadAndRunRequest
import model.CreateThreadRequest
import model.DeleteAssistantResponse
import model.DeleteMessageResponse
import model.DeleteThreadResponse
import model.ListAssistantsResponse
import model.ListMessagesResponse
import model.ListRunStepsResponse
import model.ListRunsResponse
import model.MessageObject
import model.ModifyAssistantRequest
import model.ModifyMessageRequest
import model.ModifyRunRequest
import model.ModifyThreadRequest
import model.RunObject
import model.RunStepObject
import model.SubmitToolOutputsRunRequest
import model.ThreadObject

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait AssistantsApi {
  /**
    * Cancels a run that is &#x60;in_progress&#x60;.
    * @param threadId The ID of the thread to which this run belongs.
    * @param runId The ID of the run to cancel.
    */
  def cancelRun(threadId: String, runId: String): RunObject

  /**
    * Create an assistant with a model and instructions.
    */
  def createAssistant(createAssistantRequest: CreateAssistantRequest): AssistantObject

  /**
    * Create a message.
    * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
    */
  def createMessage(threadId: String, createMessageRequest: CreateMessageRequest): MessageObject

  /**
    * Create a run.
    * @param threadId The ID of the thread to run.
    * @param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    */
  def createRun(threadId: String, createRunRequest: CreateRunRequest, includeLeft_Square_BracketRight_Square_Bracket: Option[List[String]]): RunObject

  /**
    * Create a thread.
    */
  def createThread(createThreadRequest: Option[CreateThreadRequest]): ThreadObject

  /**
    * Create a thread and run it in one request.
    */
  def createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest): RunObject

  /**
    * Delete an assistant.
    * @param assistantId The ID of the assistant to delete.
    */
  def deleteAssistant(assistantId: String): DeleteAssistantResponse

  /**
    * Deletes a message.
    * @param threadId The ID of the thread to which this message belongs.
    * @param messageId The ID of the message to delete.
    */
  def deleteMessage(threadId: String, messageId: String): DeleteMessageResponse

  /**
    * Delete a thread.
    * @param threadId The ID of the thread to delete.
    */
  def deleteThread(threadId: String): DeleteThreadResponse

  /**
    * Retrieves an assistant.
    * @param assistantId The ID of the assistant to retrieve.
    */
  def getAssistant(assistantId: String): AssistantObject

  /**
    * Retrieve a message.
    * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
    * @param messageId The ID of the message to retrieve.
    */
  def getMessage(threadId: String, messageId: String): MessageObject

  /**
    * Retrieves a run.
    * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
    * @param runId The ID of the run to retrieve.
    */
  def getRun(threadId: String, runId: String): RunObject

  /**
    * Retrieves a run step.
    * @param threadId The ID of the thread to which the run and run step belongs.
    * @param runId The ID of the run to which the run step belongs.
    * @param stepId The ID of the run step to retrieve.
    * @param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    */
  def getRunStep(threadId: String, runId: String, stepId: String, includeLeft_Square_BracketRight_Square_Bracket: Option[List[String]]): RunStepObject

  /**
    * Retrieves a thread.
    * @param threadId The ID of the thread to retrieve.
    */
  def getThread(threadId: String): ThreadObject

  /**
    * Returns a list of assistants.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    */
  def listAssistants(limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): ListAssistantsResponse

  /**
    * Returns a list of messages for a given thread.
    * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    * @param runId Filter messages by the run ID that generated them. 
    */
  def listMessages(threadId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], runId: Option[String]): ListMessagesResponse

  /**
    * Returns a list of run steps belonging to a run.
    * @param threadId The ID of the thread the run and run steps belong to.
    * @param runId The ID of the run the run steps belong to.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    * @param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    */
  def listRunSteps(threadId: String, runId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], includeLeft_Square_BracketRight_Square_Bracket: Option[List[String]]): ListRunStepsResponse

  /**
    * Returns a list of runs belonging to a thread.
    * @param threadId The ID of the thread the run belongs to.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    */
  def listRuns(threadId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): ListRunsResponse

  /**
    * Modifies an assistant.
    * @param assistantId The ID of the assistant to modify.
    */
  def modifyAssistant(assistantId: String, modifyAssistantRequest: ModifyAssistantRequest): AssistantObject

  /**
    * Modifies a message.
    * @param threadId The ID of the thread to which this message belongs.
    * @param messageId The ID of the message to modify.
    */
  def modifyMessage(threadId: String, messageId: String, modifyMessageRequest: ModifyMessageRequest): MessageObject

  /**
    * Modifies a run.
    * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
    * @param runId The ID of the run to modify.
    */
  def modifyRun(threadId: String, runId: String, modifyRunRequest: ModifyRunRequest): RunObject

  /**
    * Modifies a thread.
    * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
    */
  def modifyThread(threadId: String, modifyThreadRequest: ModifyThreadRequest): ThreadObject

  /**
    * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
    * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
    * @param runId The ID of the run that requires the tool output submission.
    */
  def submitToolOuputsToRun(threadId: String, runId: String, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest): RunObject
}

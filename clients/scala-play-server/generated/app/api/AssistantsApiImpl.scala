package api

import model.AssistantFileObject
import model.AssistantObject
import model.CreateAssistantFileRequest
import model.CreateAssistantRequest
import model.CreateMessageRequest
import model.CreateRunRequest
import model.CreateThreadAndRunRequest
import model.CreateThreadRequest
import model.DeleteAssistantFileResponse
import model.DeleteAssistantResponse
import model.DeleteThreadResponse
import model.ListAssistantFilesResponse
import model.ListAssistantsResponse
import model.ListMessageFilesResponse
import model.ListMessagesResponse
import model.ListRunStepsResponse
import model.ListRunsResponse
import model.MessageFileObject
import model.MessageObject
import model.ModifyAssistantRequest
import model.ModifyMessageRequest
import model.ModifyRunRequest
import model.ModifyThreadRequest
import model.RunObject
import model.RunStepObject
import model.SubmitToolOutputsRunRequest
import model.ThreadObject

/**
  * Provides a default implementation for [[AssistantsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class AssistantsApiImpl extends AssistantsApi {
  /**
    * @inheritdoc
    */
  override def cancelRun(threadId: String, runId: String): RunObject = {
    // TODO: Implement better logic

    RunObject("", "", 0, "", "", "", RunObjectRequiredAction("", RunObjectRequiredActionSubmitToolOutputs(List.empty[RunToolCallObject])), RunObjectLastError("", ""), 0, 0, 0, 0, 0, RunObjectIncompleteDetails(None), "", "", [], [], null, RunCompletionUsage(0, 0, 0), None, 0, 0, TruncationObject(None, None), AssistantsApiToolChoiceOption("", None), AssistantsApiResponseFormatOption(None))
  }

  /**
    * @inheritdoc
    */
  override def createAssistant(createAssistantRequest: CreateAssistantRequest): AssistantObject = {
    // TODO: Implement better logic

    AssistantObject("", "", 0, "", "", "", "", [], [], null)
  }

  /**
    * @inheritdoc
    */
  override def createAssistantFile(assistantId: String, createAssistantFileRequest: CreateAssistantFileRequest): AssistantFileObject = {
    // TODO: Implement better logic

    AssistantFileObject("", "", 0, "")
  }

  /**
    * @inheritdoc
    */
  override def createMessage(threadId: String, createMessageRequest: CreateMessageRequest): MessageObject = {
    // TODO: Implement better logic

    MessageObject("", "", 0, "", "", MessageObjectIncompleteDetails(""), 0, 0, "", List.empty[MessageObjectContentInner], "", "", [], null)
  }

  /**
    * @inheritdoc
    */
  override def createRun(threadId: String, createRunRequest: CreateRunRequest): RunObject = {
    // TODO: Implement better logic

    RunObject("", "", 0, "", "", "", RunObjectRequiredAction("", RunObjectRequiredActionSubmitToolOutputs(List.empty[RunToolCallObject])), RunObjectLastError("", ""), 0, 0, 0, 0, 0, RunObjectIncompleteDetails(None), "", "", [], [], null, RunCompletionUsage(0, 0, 0), None, 0, 0, TruncationObject(None, None), AssistantsApiToolChoiceOption("", None), AssistantsApiResponseFormatOption(None))
  }

  /**
    * @inheritdoc
    */
  override def createThread(createThreadRequest: Option[CreateThreadRequest]): ThreadObject = {
    // TODO: Implement better logic

    ThreadObject("", "", 0, null)
  }

  /**
    * @inheritdoc
    */
  override def createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest): RunObject = {
    // TODO: Implement better logic

    RunObject("", "", 0, "", "", "", RunObjectRequiredAction("", RunObjectRequiredActionSubmitToolOutputs(List.empty[RunToolCallObject])), RunObjectLastError("", ""), 0, 0, 0, 0, 0, RunObjectIncompleteDetails(None), "", "", [], [], null, RunCompletionUsage(0, 0, 0), None, 0, 0, TruncationObject(None, None), AssistantsApiToolChoiceOption("", None), AssistantsApiResponseFormatOption(None))
  }

  /**
    * @inheritdoc
    */
  override def deleteAssistant(assistantId: String): DeleteAssistantResponse = {
    // TODO: Implement better logic

    DeleteAssistantResponse("", false, "")
  }

  /**
    * @inheritdoc
    */
  override def deleteAssistantFile(assistantId: String, fileId: String): DeleteAssistantFileResponse = {
    // TODO: Implement better logic

    DeleteAssistantFileResponse("", false, "")
  }

  /**
    * @inheritdoc
    */
  override def deleteThread(threadId: String): DeleteThreadResponse = {
    // TODO: Implement better logic

    DeleteThreadResponse("", false, "")
  }

  /**
    * @inheritdoc
    */
  override def getAssistant(assistantId: String): AssistantObject = {
    // TODO: Implement better logic

    AssistantObject("", "", 0, "", "", "", "", [], [], null)
  }

  /**
    * @inheritdoc
    */
  override def getAssistantFile(assistantId: String, fileId: String): AssistantFileObject = {
    // TODO: Implement better logic

    AssistantFileObject("", "", 0, "")
  }

  /**
    * @inheritdoc
    */
  override def getMessage(threadId: String, messageId: String): MessageObject = {
    // TODO: Implement better logic

    MessageObject("", "", 0, "", "", MessageObjectIncompleteDetails(""), 0, 0, "", List.empty[MessageObjectContentInner], "", "", [], null)
  }

  /**
    * @inheritdoc
    */
  override def getMessageFile(threadId: String, messageId: String, fileId: String): MessageFileObject = {
    // TODO: Implement better logic

    MessageFileObject("", "", 0, "")
  }

  /**
    * @inheritdoc
    */
  override def getRun(threadId: String, runId: String): RunObject = {
    // TODO: Implement better logic

    RunObject("", "", 0, "", "", "", RunObjectRequiredAction("", RunObjectRequiredActionSubmitToolOutputs(List.empty[RunToolCallObject])), RunObjectLastError("", ""), 0, 0, 0, 0, 0, RunObjectIncompleteDetails(None), "", "", [], [], null, RunCompletionUsage(0, 0, 0), None, 0, 0, TruncationObject(None, None), AssistantsApiToolChoiceOption("", None), AssistantsApiResponseFormatOption(None))
  }

  /**
    * @inheritdoc
    */
  override def getRunStep(threadId: String, runId: String, stepId: String): RunStepObject = {
    // TODO: Implement better logic

    RunStepObject("", "", 0, "", "", "", "", "", RunStepObjectStepDetails("", RunStepDetailsMessageCreationObjectMessageCreation(""), List.empty[RunStepDetailsToolCallsObjectToolCallsInner], Map.empty), RunStepObjectLastError("", ""), 0, 0, 0, 0, null, RunStepCompletionUsage(0, 0, 0))
  }

  /**
    * @inheritdoc
    */
  override def getThread(threadId: String): ThreadObject = {
    // TODO: Implement better logic

    ThreadObject("", "", 0, null)
  }

  /**
    * @inheritdoc
    */
  override def listAssistantFiles(assistantId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): ListAssistantFilesResponse = {
    // TODO: Implement better logic

    ListAssistantFilesResponse("", List.empty[AssistantFileObject], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listAssistants(limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): ListAssistantsResponse = {
    // TODO: Implement better logic

    ListAssistantsResponse("", List.empty[AssistantObject], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listMessageFiles(threadId: String, messageId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): ListMessageFilesResponse = {
    // TODO: Implement better logic

    ListMessageFilesResponse("", List.empty[MessageFileObject], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listMessages(threadId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], runId: Option[String]): ListMessagesResponse = {
    // TODO: Implement better logic

    ListMessagesResponse("", List.empty[MessageObject], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listRunSteps(threadId: String, runId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): ListRunStepsResponse = {
    // TODO: Implement better logic

    ListRunStepsResponse("", List.empty[RunStepObject], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listRuns(threadId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]): ListRunsResponse = {
    // TODO: Implement better logic

    ListRunsResponse("", List.empty[RunObject], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def modifyAssistant(assistantId: String, modifyAssistantRequest: ModifyAssistantRequest): AssistantObject = {
    // TODO: Implement better logic

    AssistantObject("", "", 0, "", "", "", "", [], [], null)
  }

  /**
    * @inheritdoc
    */
  override def modifyMessage(threadId: String, messageId: String, modifyMessageRequest: ModifyMessageRequest): MessageObject = {
    // TODO: Implement better logic

    MessageObject("", "", 0, "", "", MessageObjectIncompleteDetails(""), 0, 0, "", List.empty[MessageObjectContentInner], "", "", [], null)
  }

  /**
    * @inheritdoc
    */
  override def modifyRun(threadId: String, runId: String, modifyRunRequest: ModifyRunRequest): RunObject = {
    // TODO: Implement better logic

    RunObject("", "", 0, "", "", "", RunObjectRequiredAction("", RunObjectRequiredActionSubmitToolOutputs(List.empty[RunToolCallObject])), RunObjectLastError("", ""), 0, 0, 0, 0, 0, RunObjectIncompleteDetails(None), "", "", [], [], null, RunCompletionUsage(0, 0, 0), None, 0, 0, TruncationObject(None, None), AssistantsApiToolChoiceOption("", None), AssistantsApiResponseFormatOption(None))
  }

  /**
    * @inheritdoc
    */
  override def modifyThread(threadId: String, modifyThreadRequest: ModifyThreadRequest): ThreadObject = {
    // TODO: Implement better logic

    ThreadObject("", "", 0, null)
  }

  /**
    * @inheritdoc
    */
  override def submitToolOuputsToRun(threadId: String, runId: String, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest): RunObject = {
    // TODO: Implement better logic

    RunObject("", "", 0, "", "", "", RunObjectRequiredAction("", RunObjectRequiredActionSubmitToolOutputs(List.empty[RunToolCallObject])), RunObjectLastError("", ""), 0, 0, 0, 0, 0, RunObjectIncompleteDetails(None), "", "", [], [], null, RunCompletionUsage(0, 0, 0), None, 0, 0, TruncationObject(None, None), AssistantsApiToolChoiceOption("", None), AssistantsApiResponseFormatOption(None))
  }
}

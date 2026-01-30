{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Assistants where

import           Import


-- | Cancels a run that is &#x60;in_progress&#x60;.
--
-- operationId: cancelRun
postThreadsByTextRunsByTextCancelR :: Text -- ^ The ID of the thread to which this run belongs.
                                   -> Text -- ^ The ID of the run to cancel.
                                   -> Handler Value
postThreadsByTextRunsByTextCancelR threadId runId = notImplemented

-- | Create an assistant with a model and instructions.
--
-- operationId: createAssistant
postAssistantsR :: Handler Value
postAssistantsR = notImplemented

-- | Create a message.
--
-- operationId: createMessage
postThreadsByTextMessagesR :: Text -- ^ The ID of the [thread](/docs/api-reference/threads) to create a message for.
                           -> Handler Value
postThreadsByTextMessagesR threadId = notImplemented

-- | Create a run.
--
-- operationId: createRun
postThreadsByTextRunsR :: Text -- ^ The ID of the thread to run.
                       -> Handler Value
postThreadsByTextRunsR threadId = notImplemented

-- | Create a thread.
--
-- operationId: createThread
postThreadsR :: Handler Value
postThreadsR = notImplemented

-- | Create a thread and run it in one request.
--
-- operationId: createThreadAndRun
postThreadsRunsR :: Handler Value
postThreadsRunsR = notImplemented

-- | Delete an assistant.
--
-- operationId: deleteAssistant
deleteAssistantsByTextR :: Text -- ^ The ID of the assistant to delete.
                        -> Handler Value
deleteAssistantsByTextR assistantId = notImplemented

-- | Deletes a message.
--
-- operationId: deleteMessage
deleteThreadsByTextMessagesByTextR :: Text -- ^ The ID of the thread to which this message belongs.
                                   -> Text -- ^ The ID of the message to delete.
                                   -> Handler Value
deleteThreadsByTextMessagesByTextR threadId messageId = notImplemented

-- | Delete a thread.
--
-- operationId: deleteThread
deleteThreadsByTextR :: Text -- ^ The ID of the thread to delete.
                     -> Handler Value
deleteThreadsByTextR threadId = notImplemented

-- | Retrieves an assistant.
--
-- operationId: getAssistant
getAssistantsByTextR :: Text -- ^ The ID of the assistant to retrieve.
                     -> Handler Value
getAssistantsByTextR assistantId = notImplemented

-- | Retrieve a message.
--
-- operationId: getMessage
getThreadsByTextMessagesByTextR :: Text -- ^ The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
                                -> Text -- ^ The ID of the message to retrieve.
                                -> Handler Value
getThreadsByTextMessagesByTextR threadId messageId = notImplemented

-- | Retrieves a run.
--
-- operationId: getRun
getThreadsByTextRunsByTextR :: Text -- ^ The ID of the [thread](/docs/api-reference/threads) that was run.
                            -> Text -- ^ The ID of the run to retrieve.
                            -> Handler Value
getThreadsByTextRunsByTextR threadId runId = notImplemented

-- | Retrieves a run step.
--
-- operationId: getRunStep
getThreadsByTextRunsByTextStepsByTextR :: Text -- ^ The ID of the thread to which the run and run step belongs.
                                       -> Text -- ^ The ID of the run to which the run step belongs.
                                       -> Text -- ^ The ID of the run step to retrieve.
                                       -> Handler Value
getThreadsByTextRunsByTextStepsByTextR threadId runId stepId = notImplemented

-- | Retrieves a thread.
--
-- operationId: getThread
getThreadsByTextR :: Text -- ^ The ID of the thread to retrieve.
                  -> Handler Value
getThreadsByTextR threadId = notImplemented

-- | Returns a list of assistants.
--
-- operationId: listAssistants
getAssistantsR :: Handler Value
getAssistantsR = notImplemented

-- | Returns a list of messages for a given thread.
--
-- operationId: listMessages
getThreadsByTextMessagesR :: Text -- ^ The ID of the [thread](/docs/api-reference/threads) the messages belong to.
                          -> Handler Value
getThreadsByTextMessagesR threadId = notImplemented

-- | Returns a list of run steps belonging to a run.
--
-- operationId: listRunSteps
getThreadsByTextRunsByTextStepsR :: Text -- ^ The ID of the thread the run and run steps belong to.
                                 -> Text -- ^ The ID of the run the run steps belong to.
                                 -> Handler Value
getThreadsByTextRunsByTextStepsR threadId runId = notImplemented

-- | Returns a list of runs belonging to a thread.
--
-- operationId: listRuns
getThreadsByTextRunsR :: Text -- ^ The ID of the thread the run belongs to.
                      -> Handler Value
getThreadsByTextRunsR threadId = notImplemented

-- | Modifies an assistant.
--
-- operationId: modifyAssistant
postAssistantsByTextR :: Text -- ^ The ID of the assistant to modify.
                      -> Handler Value
postAssistantsByTextR assistantId = notImplemented

-- | Modifies a message.
--
-- operationId: modifyMessage
postThreadsByTextMessagesByTextR :: Text -- ^ The ID of the thread to which this message belongs.
                                 -> Text -- ^ The ID of the message to modify.
                                 -> Handler Value
postThreadsByTextMessagesByTextR threadId messageId = notImplemented

-- | Modifies a run.
--
-- operationId: modifyRun
postThreadsByTextRunsByTextR :: Text -- ^ The ID of the [thread](/docs/api-reference/threads) that was run.
                             -> Text -- ^ The ID of the run to modify.
                             -> Handler Value
postThreadsByTextRunsByTextR threadId runId = notImplemented

-- | Modifies a thread.
--
-- operationId: modifyThread
postThreadsByTextR :: Text -- ^ The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
                   -> Handler Value
postThreadsByTextR threadId = notImplemented

-- | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
--
-- operationId: submitToolOuputsToRun
postThreadsByTextRunsByTextSubmitToolOutputsR :: Text -- ^ The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
                                              -> Text -- ^ The ID of the run that requires the tool output submission.
                                              -> Handler Value
postThreadsByTextRunsByTextSubmitToolOutputsR threadId runId = notImplemented

/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Cancels a run that is `in_progress`.
*
* threadUnderscoreid String The ID of the thread to which this run belongs.
* runUnderscoreid String The ID of the run to cancel.
* returns RunObject
* */
const cancelRun = ({ threadUnderscoreid, runUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        runUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create an assistant with a model and instructions.
*
* createAssistantRequest CreateAssistantRequest 
* returns AssistantObject
* */
const createAssistant = ({ createAssistantRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createAssistantRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create a message.
*
* threadUnderscoreid String The ID of the [thread](/docs/api-reference/threads) to create a message for.
* createMessageRequest CreateMessageRequest 
* returns MessageObject
* */
const createMessage = ({ threadUnderscoreid, createMessageRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        createMessageRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create a run.
*
* threadUnderscoreid String The ID of the thread to run.
* createRunRequest CreateRunRequest 
* includeLeft_Square_BracketRight_Square_Bracket List A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)
* returns RunObject
* */
const createRun = ({ threadUnderscoreid, createRunRequest, includeLeft_Square_BracketRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        createRunRequest,
        includeLeft_Square_BracketRight_Square_Bracket,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create a thread.
*
* createThreadRequest CreateThreadRequest  (optional)
* returns ThreadObject
* */
const createThread = ({ createThreadRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createThreadRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create a thread and run it in one request.
*
* createThreadAndRunRequest CreateThreadAndRunRequest 
* returns RunObject
* */
const createThreadAndRun = ({ createThreadAndRunRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createThreadAndRunRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete an assistant.
*
* assistantUnderscoreid String The ID of the assistant to delete.
* returns DeleteAssistantResponse
* */
const deleteAssistant = ({ assistantUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        assistantUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Deletes a message.
*
* threadUnderscoreid String The ID of the thread to which this message belongs.
* messageUnderscoreid String The ID of the message to delete.
* returns DeleteMessageResponse
* */
const deleteMessage = ({ threadUnderscoreid, messageUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        messageUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete a thread.
*
* threadUnderscoreid String The ID of the thread to delete.
* returns DeleteThreadResponse
* */
const deleteThread = ({ threadUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves an assistant.
*
* assistantUnderscoreid String The ID of the assistant to retrieve.
* returns AssistantObject
* */
const getAssistant = ({ assistantUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        assistantUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieve a message.
*
* threadUnderscoreid String The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
* messageUnderscoreid String The ID of the message to retrieve.
* returns MessageObject
* */
const getMessage = ({ threadUnderscoreid, messageUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        messageUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves a run.
*
* threadUnderscoreid String The ID of the [thread](/docs/api-reference/threads) that was run.
* runUnderscoreid String The ID of the run to retrieve.
* returns RunObject
* */
const getRun = ({ threadUnderscoreid, runUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        runUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves a run step.
*
* threadUnderscoreid String The ID of the thread to which the run and run step belongs.
* runUnderscoreid String The ID of the run to which the run step belongs.
* stepUnderscoreid String The ID of the run step to retrieve.
* includeLeft_Square_BracketRight_Square_Bracket List A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)
* returns RunStepObject
* */
const getRunStep = ({ threadUnderscoreid, runUnderscoreid, stepUnderscoreid, includeLeft_Square_BracketRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        runUnderscoreid,
        stepUnderscoreid,
        includeLeft_Square_BracketRight_Square_Bracket,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves a thread.
*
* threadUnderscoreid String The ID of the thread to retrieve.
* returns ThreadObject
* */
const getThread = ({ threadUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns a list of assistants.
*
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* order String Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* before String A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
* returns ListAssistantsResponse
* */
const listAssistants = ({ limit, order, after, before }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        order,
        after,
        before,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns a list of messages for a given thread.
*
* threadUnderscoreid String The ID of the [thread](/docs/api-reference/threads) the messages belong to.
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* order String Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* before String A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
* runUnderscoreid String Filter messages by the run ID that generated them.  (optional)
* returns ListMessagesResponse
* */
const listMessages = ({ threadUnderscoreid, limit, order, after, before, runUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        limit,
        order,
        after,
        before,
        runUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns a list of run steps belonging to a run.
*
* threadUnderscoreid String The ID of the thread the run and run steps belong to.
* runUnderscoreid String The ID of the run the run steps belong to.
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* order String Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* before String A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
* includeLeft_Square_BracketRight_Square_Bracket List A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)
* returns ListRunStepsResponse
* */
const listRunSteps = ({ threadUnderscoreid, runUnderscoreid, limit, order, after, before, includeLeft_Square_BracketRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        runUnderscoreid,
        limit,
        order,
        after,
        before,
        includeLeft_Square_BracketRight_Square_Bracket,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns a list of runs belonging to a thread.
*
* threadUnderscoreid String The ID of the thread the run belongs to.
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* order String Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* before String A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
* returns ListRunsResponse
* */
const listRuns = ({ threadUnderscoreid, limit, order, after, before }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        limit,
        order,
        after,
        before,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Modifies an assistant.
*
* assistantUnderscoreid String The ID of the assistant to modify.
* modifyAssistantRequest ModifyAssistantRequest 
* returns AssistantObject
* */
const modifyAssistant = ({ assistantUnderscoreid, modifyAssistantRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        assistantUnderscoreid,
        modifyAssistantRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Modifies a message.
*
* threadUnderscoreid String The ID of the thread to which this message belongs.
* messageUnderscoreid String The ID of the message to modify.
* modifyMessageRequest ModifyMessageRequest 
* returns MessageObject
* */
const modifyMessage = ({ threadUnderscoreid, messageUnderscoreid, modifyMessageRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        messageUnderscoreid,
        modifyMessageRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Modifies a run.
*
* threadUnderscoreid String The ID of the [thread](/docs/api-reference/threads) that was run.
* runUnderscoreid String The ID of the run to modify.
* modifyRunRequest ModifyRunRequest 
* returns RunObject
* */
const modifyRun = ({ threadUnderscoreid, runUnderscoreid, modifyRunRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        runUnderscoreid,
        modifyRunRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Modifies a thread.
*
* threadUnderscoreid String The ID of the thread to modify. Only the `metadata` can be modified.
* modifyThreadRequest ModifyThreadRequest 
* returns ThreadObject
* */
const modifyThread = ({ threadUnderscoreid, modifyThreadRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        modifyThreadRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
*
* threadUnderscoreid String The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
* runUnderscoreid String The ID of the run that requires the tool output submission.
* submitToolOutputsRunRequest SubmitToolOutputsRunRequest 
* returns RunObject
* */
const submitToolOuputsToRun = ({ threadUnderscoreid, runUnderscoreid, submitToolOutputsRunRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        threadUnderscoreid,
        runUnderscoreid,
        submitToolOutputsRunRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  cancelRun,
  createAssistant,
  createMessage,
  createRun,
  createThread,
  createThreadAndRun,
  deleteAssistant,
  deleteMessage,
  deleteThread,
  getAssistant,
  getMessage,
  getRun,
  getRunStep,
  getThread,
  listAssistants,
  listMessages,
  listRunSteps,
  listRuns,
  modifyAssistant,
  modifyMessage,
  modifyRun,
  modifyThread,
  submitToolOuputsToRun,
};

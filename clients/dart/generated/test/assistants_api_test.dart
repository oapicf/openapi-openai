//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for AssistantsApi
void main() {
  // final instance = AssistantsApi();

  group('tests for AssistantsApi', () {
    // Cancels a run that is `in_progress`.
    //
    //Future<RunObject> cancelRun(String threadId, String runId) async
    test('test cancelRun', () async {
      // TODO
    });

    // Create an assistant with a model and instructions.
    //
    //Future<AssistantObject> createAssistant(CreateAssistantRequest createAssistantRequest) async
    test('test createAssistant', () async {
      // TODO
    });

    // Create a message.
    //
    //Future<MessageObject> createMessage(String threadId, CreateMessageRequest createMessageRequest) async
    test('test createMessage', () async {
      // TODO
    });

    // Create a run.
    //
    //Future<RunObject> createRun(String threadId, CreateRunRequest createRunRequest, { List<String> includeLeftSquareBracketRightSquareBracket }) async
    test('test createRun', () async {
      // TODO
    });

    // Create a thread.
    //
    //Future<ThreadObject> createThread({ CreateThreadRequest createThreadRequest }) async
    test('test createThread', () async {
      // TODO
    });

    // Create a thread and run it in one request.
    //
    //Future<RunObject> createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest) async
    test('test createThreadAndRun', () async {
      // TODO
    });

    // Delete an assistant.
    //
    //Future<DeleteAssistantResponse> deleteAssistant(String assistantId) async
    test('test deleteAssistant', () async {
      // TODO
    });

    // Deletes a message.
    //
    //Future<DeleteMessageResponse> deleteMessage(String threadId, String messageId) async
    test('test deleteMessage', () async {
      // TODO
    });

    // Delete a thread.
    //
    //Future<DeleteThreadResponse> deleteThread(String threadId) async
    test('test deleteThread', () async {
      // TODO
    });

    // Retrieves an assistant.
    //
    //Future<AssistantObject> getAssistant(String assistantId) async
    test('test getAssistant', () async {
      // TODO
    });

    // Retrieve a message.
    //
    //Future<MessageObject> getMessage(String threadId, String messageId) async
    test('test getMessage', () async {
      // TODO
    });

    // Retrieves a run.
    //
    //Future<RunObject> getRun(String threadId, String runId) async
    test('test getRun', () async {
      // TODO
    });

    // Retrieves a run step.
    //
    //Future<RunStepObject> getRunStep(String threadId, String runId, String stepId, { List<String> includeLeftSquareBracketRightSquareBracket }) async
    test('test getRunStep', () async {
      // TODO
    });

    // Retrieves a thread.
    //
    //Future<ThreadObject> getThread(String threadId) async
    test('test getThread', () async {
      // TODO
    });

    // Returns a list of assistants.
    //
    //Future<ListAssistantsResponse> listAssistants({ int limit, String order, String after, String before }) async
    test('test listAssistants', () async {
      // TODO
    });

    // Returns a list of messages for a given thread.
    //
    //Future<ListMessagesResponse> listMessages(String threadId, { int limit, String order, String after, String before, String runId }) async
    test('test listMessages', () async {
      // TODO
    });

    // Returns a list of run steps belonging to a run.
    //
    //Future<ListRunStepsResponse> listRunSteps(String threadId, String runId, { int limit, String order, String after, String before, List<String> includeLeftSquareBracketRightSquareBracket }) async
    test('test listRunSteps', () async {
      // TODO
    });

    // Returns a list of runs belonging to a thread.
    //
    //Future<ListRunsResponse> listRuns(String threadId, { int limit, String order, String after, String before }) async
    test('test listRuns', () async {
      // TODO
    });

    // Modifies an assistant.
    //
    //Future<AssistantObject> modifyAssistant(String assistantId, ModifyAssistantRequest modifyAssistantRequest) async
    test('test modifyAssistant', () async {
      // TODO
    });

    // Modifies a message.
    //
    //Future<MessageObject> modifyMessage(String threadId, String messageId, ModifyMessageRequest modifyMessageRequest) async
    test('test modifyMessage', () async {
      // TODO
    });

    // Modifies a run.
    //
    //Future<RunObject> modifyRun(String threadId, String runId, ModifyRunRequest modifyRunRequest) async
    test('test modifyRun', () async {
      // TODO
    });

    // Modifies a thread.
    //
    //Future<ThreadObject> modifyThread(String threadId, ModifyThreadRequest modifyThreadRequest) async
    test('test modifyThread', () async {
      // TODO
    });

    // When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    //
    //Future<RunObject> submitToolOuputsToRun(String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest) async
    test('test submitToolOuputsToRun', () async {
      // TODO
    });

  });
}

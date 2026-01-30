import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeResponseCreateParams
void main() {
  final instance = RealtimeResponseCreateParamsBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeResponseCreateParams, () {
    // The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
    // BuiltList<String> modalities
    test('to test the property `modalities`', () async {
      // TODO
    });

    // The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
    // String instructions
    test('to test the property `instructions`', () async {
      // TODO
    });

    // The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
    // String voice
    test('to test the property `voice`', () async {
      // TODO
    });

    // The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
    // String outputAudioFormat
    test('to test the property `outputAudioFormat`', () async {
      // TODO
    });

    // Tools (functions) available to the model.
    // BuiltList<RealtimeResponseCreateParamsToolsInner> tools
    test('to test the property `tools`', () async {
      // TODO
    });

    // How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
    // String toolChoice
    test('to test the property `toolChoice`', () async {
      // TODO
    });

    // Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
    // num temperature
    test('to test the property `temperature`', () async {
      // TODO
    });

    // RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens
    test('to test the property `maxResponseOutputTokens`', () async {
      // TODO
    });

    // RealtimeResponseCreateParamsConversation conversation
    test('to test the property `conversation`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
    // JsonObject metadata
    test('to test the property `metadata`', () async {
      // TODO
    });

    // Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
    // BuiltList<RealtimeConversationItem> input
    test('to test the property `input`', () async {
      // TODO
    });

  });
}

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

// tests for RealtimeSessionCreateRequest
void main() {
  // final instance = RealtimeSessionCreateRequest();

  group('test RealtimeSessionCreateRequest', () {
    // The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
    // List<String> modalities (default value: const [])
    test('to test the property `modalities`', () async {
      // TODO
    });

    // The Realtime model used for this session. 
    // String model
    test('to test the property `model`', () async {
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

    // The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
    // String inputAudioFormat
    test('to test the property `inputAudioFormat`', () async {
      // TODO
    });

    // The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
    // String outputAudioFormat
    test('to test the property `outputAudioFormat`', () async {
      // TODO
    });

    // RealtimeSessionInputAudioTranscription inputAudioTranscription
    test('to test the property `inputAudioTranscription`', () async {
      // TODO
    });

    // RealtimeSessionCreateRequestTurnDetection turnDetection
    test('to test the property `turnDetection`', () async {
      // TODO
    });

    // Tools (functions) available to the model.
    // List<RealtimeResponseCreateParamsToolsInner> tools (default value: const [])
    test('to test the property `tools`', () async {
      // TODO
    });

    // How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
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


  });

}

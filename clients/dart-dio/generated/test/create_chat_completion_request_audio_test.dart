import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateChatCompletionRequestAudio
void main() {
  final instance = CreateChatCompletionRequestAudioBuilder();
  // TODO add properties to the builder and call build()

  group(CreateChatCompletionRequestAudio, () {
    // The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
    // String voice
    test('to test the property `voice`', () async {
      // TODO
    });

    // Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
    // String format
    test('to test the property `format`', () async {
      // TODO
    });

  });
}

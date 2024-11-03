import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateTranscriptionResponseVerboseJson
void main() {
  final instance = CreateTranscriptionResponseVerboseJsonBuilder();
  // TODO add properties to the builder and call build()

  group(CreateTranscriptionResponseVerboseJson, () {
    // The language of the input audio.
    // String language
    test('to test the property `language`', () async {
      // TODO
    });

    // The duration of the input audio.
    // String duration
    test('to test the property `duration`', () async {
      // TODO
    });

    // The transcribed text.
    // String text
    test('to test the property `text`', () async {
      // TODO
    });

    // Extracted words and their corresponding timestamps.
    // BuiltList<TranscriptionWord> words
    test('to test the property `words`', () async {
      // TODO
    });

    // Segments of the transcribed text and their corresponding details.
    // BuiltList<TranscriptionSegment> segments
    test('to test the property `segments`', () async {
      // TODO
    });

  });
}

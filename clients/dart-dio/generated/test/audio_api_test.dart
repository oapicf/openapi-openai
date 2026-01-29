import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AudioApi
void main() {
  final instance = Openapi().getAudioApi();

  group(AudioApi, () {
    // Generates audio from the input text.
    //
    //Future<Uint8List> createSpeech(CreateSpeechRequest createSpeechRequest) async
    test('test createSpeech', () async {
      // TODO
    });

    // Transcribes audio into the input language.
    //
    //Future<CreateTranscription200Response> createTranscription(MultipartFile file, CreateTranscriptionRequestModel model, { String language, String prompt, String responseFormat, num temperature, BuiltList<String> timestampGranularitiesLeftSquareBracketRightSquareBracket }) async
    test('test createTranscription', () async {
      // TODO
    });

    // Translates audio into English.
    //
    //Future<CreateTranslation200Response> createTranslation(MultipartFile file, CreateTranscriptionRequestModel model, { String prompt, String responseFormat, num temperature }) async
    test('test createTranslation', () async {
      // TODO
    });

  });
}

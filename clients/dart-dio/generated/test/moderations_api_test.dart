import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ModerationsApi
void main() {
  final instance = Openapi().getModerationsApi();

  group(ModerationsApi, () {
    // Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    //
    //Future<CreateModerationResponse> createModeration(CreateModerationRequest createModerationRequest) async
    test('test createModeration', () async {
      // TODO
    });

  });
}

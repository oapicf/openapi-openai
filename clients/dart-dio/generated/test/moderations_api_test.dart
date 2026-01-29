import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ModerationsApi
void main() {
  final instance = Openapi().getModerationsApi();

  group(ModerationsApi, () {
    // Classifies if text is potentially harmful.
    //
    //Future<CreateModerationResponse> createModeration(CreateModerationRequest createModerationRequest) async
    test('test createModeration', () async {
      // TODO
    });

  });
}

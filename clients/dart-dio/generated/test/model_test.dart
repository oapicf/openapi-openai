import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Model
void main() {
  final instance = ModelBuilder();
  // TODO add properties to the builder and call build()

  group(Model, () {
    // The model identifier, which can be referenced in the API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) when the model was created.
    // int created
    test('to test the property `created`', () async {
      // TODO
    });

    // The object type, which is always \"model\".
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The organization that owns the model.
    // String ownedBy
    test('to test the property `ownedBy`', () async {
      // TODO
    });

  });
}

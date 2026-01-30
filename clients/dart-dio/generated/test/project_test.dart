import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Project
void main() {
  final instance = ProjectBuilder();
  // TODO add properties to the builder and call build()

  group(Project, () {
    // The identifier, which can be referenced in API endpoints
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `organization.project`
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The name of the project. This appears in reporting.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) of when the project was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) of when the project was archived or `null`.
    // int archivedAt
    test('to test the property `archivedAt`', () async {
      // TODO
    });

    // `active` or `archived`
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

  });
}

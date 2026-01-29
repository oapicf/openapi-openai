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

// tests for ModifyAssistantRequest
void main() {
  // final instance = ModifyAssistantRequest();

  group('test ModifyAssistantRequest', () {
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

    // The name of the assistant. The maximum length is 256 characters. 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The description of the assistant. The maximum length is 512 characters. 
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // The system instructions that the assistant uses. The maximum length is 256,000 characters. 
    // String instructions
    test('to test the property `instructions`', () async {
      // TODO
    });

    // A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
    // List<AssistantObjectToolsInner> tools (default value: const [])
    test('to test the property `tools`', () async {
      // TODO
    });

    // A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
    // List<String> fileIds (default value: const [])
    test('to test the property `fileIds`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    // Object metadata
    test('to test the property `metadata`', () async {
      // TODO
    });


  });

}

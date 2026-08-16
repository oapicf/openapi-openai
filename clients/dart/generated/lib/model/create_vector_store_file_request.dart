//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateVectorStoreFileRequest {
  /// Returns a new [CreateVectorStoreFileRequest] instance.
  CreateVectorStoreFileRequest({
    required this.fileId,
    this.chunkingStrategy,
  });

  /// A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
  String fileId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ChunkingStrategyRequestParam? chunkingStrategy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateVectorStoreFileRequest &&
    other.fileId == fileId &&
    other.chunkingStrategy == chunkingStrategy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileId.hashCode) +
    (chunkingStrategy == null ? 0 : chunkingStrategy!.hashCode);

  @override
  String toString() => 'CreateVectorStoreFileRequest[fileId=$fileId, chunkingStrategy=$chunkingStrategy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'file_id'] = this.fileId;
    if (this.chunkingStrategy != null) {
      json[r'chunking_strategy'] = this.chunkingStrategy;
    } else {
      json[r'chunking_strategy'] = null;
    }
    return json;
  }

  /// Returns a new [CreateVectorStoreFileRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateVectorStoreFileRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateVectorStoreFileRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateVectorStoreFileRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateVectorStoreFileRequest(
        fileId: mapValueOfType<String>(json, r'file_id')!,
        chunkingStrategy: ChunkingStrategyRequestParam.fromJson(json[r'chunking_strategy']),
      );
    }
    return null;
  }

  static List<CreateVectorStoreFileRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateVectorStoreFileRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateVectorStoreFileRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateVectorStoreFileRequest> mapFromJson(dynamic json) {
    final map = <String, CreateVectorStoreFileRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateVectorStoreFileRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateVectorStoreFileRequest-objects as value to a dart map
  static Map<String, List<CreateVectorStoreFileRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateVectorStoreFileRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateVectorStoreFileRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'file_id',
  };
}


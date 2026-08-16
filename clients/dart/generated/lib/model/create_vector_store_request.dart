//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateVectorStoreRequest {
  /// Returns a new [CreateVectorStoreRequest] instance.
  CreateVectorStoreRequest({
    this.fileIds = const [],
    this.name,
    this.expiresAfter,
    this.chunkingStrategy,
    this.metadata,
  });

  /// A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
  List<String> fileIds;

  /// The name of the vector store.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  VectorStoreExpirationAfter? expiresAfter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CreateVectorStoreRequestChunkingStrategy? chunkingStrategy;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  Object? metadata;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateVectorStoreRequest &&
    _deepEquality.equals(other.fileIds, fileIds) &&
    other.name == name &&
    other.expiresAfter == expiresAfter &&
    other.chunkingStrategy == chunkingStrategy &&
    other.metadata == metadata;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileIds.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (expiresAfter == null ? 0 : expiresAfter!.hashCode) +
    (chunkingStrategy == null ? 0 : chunkingStrategy!.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode);

  @override
  String toString() => 'CreateVectorStoreRequest[fileIds=$fileIds, name=$name, expiresAfter=$expiresAfter, chunkingStrategy=$chunkingStrategy, metadata=$metadata]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'file_ids'] = this.fileIds;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.expiresAfter != null) {
      json[r'expires_after'] = this.expiresAfter;
    } else {
      json[r'expires_after'] = null;
    }
    if (this.chunkingStrategy != null) {
      json[r'chunking_strategy'] = this.chunkingStrategy;
    } else {
      json[r'chunking_strategy'] = null;
    }
    if (this.metadata != null) {
      json[r'metadata'] = this.metadata;
    } else {
      json[r'metadata'] = null;
    }
    return json;
  }

  /// Returns a new [CreateVectorStoreRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateVectorStoreRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateVectorStoreRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateVectorStoreRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateVectorStoreRequest(
        fileIds: json[r'file_ids'] is Iterable
            ? (json[r'file_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        name: mapValueOfType<String>(json, r'name'),
        expiresAfter: VectorStoreExpirationAfter.fromJson(json[r'expires_after']),
        chunkingStrategy: CreateVectorStoreRequestChunkingStrategy.fromJson(json[r'chunking_strategy']),
        metadata: mapValueOfType<Object>(json, r'metadata'),
      );
    }
    return null;
  }

  static List<CreateVectorStoreRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateVectorStoreRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateVectorStoreRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateVectorStoreRequest> mapFromJson(dynamic json) {
    final map = <String, CreateVectorStoreRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateVectorStoreRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateVectorStoreRequest-objects as value to a dart map
  static Map<String, List<CreateVectorStoreRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateVectorStoreRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateVectorStoreRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


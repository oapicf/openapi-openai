//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateThreadRequestToolResourcesFileSearchVectorStoresInner {
  /// Returns a new [CreateThreadRequestToolResourcesFileSearchVectorStoresInner] instance.
  CreateThreadRequestToolResourcesFileSearchVectorStoresInner({
    this.fileIds = const [],
    this.chunkingStrategy,
    this.metadata,
  });

  /// A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
  List<String> fileIds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy? chunkingStrategy;

  /// Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? metadata;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateThreadRequestToolResourcesFileSearchVectorStoresInner &&
    _deepEquality.equals(other.fileIds, fileIds) &&
    other.chunkingStrategy == chunkingStrategy &&
    other.metadata == metadata;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileIds.hashCode) +
    (chunkingStrategy == null ? 0 : chunkingStrategy!.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode);

  @override
  String toString() => 'CreateThreadRequestToolResourcesFileSearchVectorStoresInner[fileIds=$fileIds, chunkingStrategy=$chunkingStrategy, metadata=$metadata]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'file_ids'] = this.fileIds;
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

  /// Returns a new [CreateThreadRequestToolResourcesFileSearchVectorStoresInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateThreadRequestToolResourcesFileSearchVectorStoresInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateThreadRequestToolResourcesFileSearchVectorStoresInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateThreadRequestToolResourcesFileSearchVectorStoresInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateThreadRequestToolResourcesFileSearchVectorStoresInner(
        fileIds: json[r'file_ids'] is Iterable
            ? (json[r'file_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        chunkingStrategy: CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.fromJson(json[r'chunking_strategy']),
        metadata: mapValueOfType<Object>(json, r'metadata'),
      );
    }
    return null;
  }

  static List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateThreadRequestToolResourcesFileSearchVectorStoresInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateThreadRequestToolResourcesFileSearchVectorStoresInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateThreadRequestToolResourcesFileSearchVectorStoresInner> mapFromJson(dynamic json) {
    final map = <String, CreateThreadRequestToolResourcesFileSearchVectorStoresInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateThreadRequestToolResourcesFileSearchVectorStoresInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateThreadRequestToolResourcesFileSearchVectorStoresInner-objects as value to a dart map
  static Map<String, List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateThreadRequestToolResourcesFileSearchVectorStoresInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


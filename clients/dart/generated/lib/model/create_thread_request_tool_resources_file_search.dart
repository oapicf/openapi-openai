//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateThreadRequestToolResourcesFileSearch {
  /// Returns a new [CreateThreadRequestToolResourcesFileSearch] instance.
  CreateThreadRequestToolResourcesFileSearch({
    this.vectorStoreIds = const [],
    this.vectorStores = const [],
  });

  /// The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
  List<String> vectorStoreIds;

  /// A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
  List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateThreadRequestToolResourcesFileSearch &&
    _deepEquality.equals(other.vectorStoreIds, vectorStoreIds) &&
    _deepEquality.equals(other.vectorStores, vectorStores);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (vectorStoreIds.hashCode) +
    (vectorStores.hashCode);

  @override
  String toString() => 'CreateThreadRequestToolResourcesFileSearch[vectorStoreIds=$vectorStoreIds, vectorStores=$vectorStores]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'vector_store_ids'] = this.vectorStoreIds;
      json[r'vector_stores'] = this.vectorStores;
    return json;
  }

  /// Returns a new [CreateThreadRequestToolResourcesFileSearch] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateThreadRequestToolResourcesFileSearch? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateThreadRequestToolResourcesFileSearch[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateThreadRequestToolResourcesFileSearch[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateThreadRequestToolResourcesFileSearch(
        vectorStoreIds: json[r'vector_store_ids'] is Iterable
            ? (json[r'vector_store_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        vectorStores: CreateThreadRequestToolResourcesFileSearchVectorStoresInner.listFromJson(json[r'vector_stores']),
      );
    }
    return null;
  }

  static List<CreateThreadRequestToolResourcesFileSearch> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateThreadRequestToolResourcesFileSearch>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateThreadRequestToolResourcesFileSearch.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateThreadRequestToolResourcesFileSearch> mapFromJson(dynamic json) {
    final map = <String, CreateThreadRequestToolResourcesFileSearch>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateThreadRequestToolResourcesFileSearch.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateThreadRequestToolResourcesFileSearch-objects as value to a dart map
  static Map<String, List<CreateThreadRequestToolResourcesFileSearch>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateThreadRequestToolResourcesFileSearch>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateThreadRequestToolResourcesFileSearch.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


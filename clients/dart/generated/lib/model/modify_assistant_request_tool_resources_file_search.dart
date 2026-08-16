//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ModifyAssistantRequestToolResourcesFileSearch {
  /// Returns a new [ModifyAssistantRequestToolResourcesFileSearch] instance.
  ModifyAssistantRequestToolResourcesFileSearch({
    this.vectorStoreIds = const [],
  });

  /// Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  List<String> vectorStoreIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ModifyAssistantRequestToolResourcesFileSearch &&
    _deepEquality.equals(other.vectorStoreIds, vectorStoreIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (vectorStoreIds.hashCode);

  @override
  String toString() => 'ModifyAssistantRequestToolResourcesFileSearch[vectorStoreIds=$vectorStoreIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'vector_store_ids'] = this.vectorStoreIds;
    return json;
  }

  /// Returns a new [ModifyAssistantRequestToolResourcesFileSearch] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ModifyAssistantRequestToolResourcesFileSearch? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ModifyAssistantRequestToolResourcesFileSearch[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ModifyAssistantRequestToolResourcesFileSearch[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ModifyAssistantRequestToolResourcesFileSearch(
        vectorStoreIds: json[r'vector_store_ids'] is Iterable
            ? (json[r'vector_store_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ModifyAssistantRequestToolResourcesFileSearch> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ModifyAssistantRequestToolResourcesFileSearch>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ModifyAssistantRequestToolResourcesFileSearch.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ModifyAssistantRequestToolResourcesFileSearch> mapFromJson(dynamic json) {
    final map = <String, ModifyAssistantRequestToolResourcesFileSearch>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ModifyAssistantRequestToolResourcesFileSearch.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ModifyAssistantRequestToolResourcesFileSearch-objects as value to a dart map
  static Map<String, List<ModifyAssistantRequestToolResourcesFileSearch>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ModifyAssistantRequestToolResourcesFileSearch>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ModifyAssistantRequestToolResourcesFileSearch.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


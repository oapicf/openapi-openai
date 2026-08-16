//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ModifyThreadRequestToolResourcesFileSearch {
  /// Returns a new [ModifyThreadRequestToolResourcesFileSearch] instance.
  ModifyThreadRequestToolResourcesFileSearch({
    this.vectorStoreIds = const [],
  });

  /// The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
  List<String> vectorStoreIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ModifyThreadRequestToolResourcesFileSearch &&
    _deepEquality.equals(other.vectorStoreIds, vectorStoreIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (vectorStoreIds.hashCode);

  @override
  String toString() => 'ModifyThreadRequestToolResourcesFileSearch[vectorStoreIds=$vectorStoreIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'vector_store_ids'] = this.vectorStoreIds;
    return json;
  }

  /// Returns a new [ModifyThreadRequestToolResourcesFileSearch] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ModifyThreadRequestToolResourcesFileSearch? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ModifyThreadRequestToolResourcesFileSearch[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ModifyThreadRequestToolResourcesFileSearch[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ModifyThreadRequestToolResourcesFileSearch(
        vectorStoreIds: json[r'vector_store_ids'] is Iterable
            ? (json[r'vector_store_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ModifyThreadRequestToolResourcesFileSearch> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ModifyThreadRequestToolResourcesFileSearch>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ModifyThreadRequestToolResourcesFileSearch.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ModifyThreadRequestToolResourcesFileSearch> mapFromJson(dynamic json) {
    final map = <String, ModifyThreadRequestToolResourcesFileSearch>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ModifyThreadRequestToolResourcesFileSearch.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ModifyThreadRequestToolResourcesFileSearch-objects as value to a dart map
  static Map<String, List<ModifyThreadRequestToolResourcesFileSearch>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ModifyThreadRequestToolResourcesFileSearch>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ModifyThreadRequestToolResourcesFileSearch.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


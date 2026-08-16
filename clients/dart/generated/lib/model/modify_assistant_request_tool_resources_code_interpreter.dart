//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ModifyAssistantRequestToolResourcesCodeInterpreter {
  /// Returns a new [ModifyAssistantRequestToolResourcesCodeInterpreter] instance.
  ModifyAssistantRequestToolResourcesCodeInterpreter({
    this.fileIds = const [],
  });

  /// Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
  List<String> fileIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ModifyAssistantRequestToolResourcesCodeInterpreter &&
    _deepEquality.equals(other.fileIds, fileIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileIds.hashCode);

  @override
  String toString() => 'ModifyAssistantRequestToolResourcesCodeInterpreter[fileIds=$fileIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'file_ids'] = this.fileIds;
    return json;
  }

  /// Returns a new [ModifyAssistantRequestToolResourcesCodeInterpreter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ModifyAssistantRequestToolResourcesCodeInterpreter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ModifyAssistantRequestToolResourcesCodeInterpreter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ModifyAssistantRequestToolResourcesCodeInterpreter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ModifyAssistantRequestToolResourcesCodeInterpreter(
        fileIds: json[r'file_ids'] is Iterable
            ? (json[r'file_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ModifyAssistantRequestToolResourcesCodeInterpreter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ModifyAssistantRequestToolResourcesCodeInterpreter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ModifyAssistantRequestToolResourcesCodeInterpreter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ModifyAssistantRequestToolResourcesCodeInterpreter> mapFromJson(dynamic json) {
    final map = <String, ModifyAssistantRequestToolResourcesCodeInterpreter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ModifyAssistantRequestToolResourcesCodeInterpreter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ModifyAssistantRequestToolResourcesCodeInterpreter-objects as value to a dart map
  static Map<String, List<ModifyAssistantRequestToolResourcesCodeInterpreter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ModifyAssistantRequestToolResourcesCodeInterpreter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ModifyAssistantRequestToolResourcesCodeInterpreter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


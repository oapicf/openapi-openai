//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssistantObjectToolResourcesCodeInterpreter {
  /// Returns a new [AssistantObjectToolResourcesCodeInterpreter] instance.
  AssistantObjectToolResourcesCodeInterpreter({
    this.fileIds = const [],
  });

  /// A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool. 
  List<String> fileIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssistantObjectToolResourcesCodeInterpreter &&
    _deepEquality.equals(other.fileIds, fileIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileIds.hashCode);

  @override
  String toString() => 'AssistantObjectToolResourcesCodeInterpreter[fileIds=$fileIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'file_ids'] = this.fileIds;
    return json;
  }

  /// Returns a new [AssistantObjectToolResourcesCodeInterpreter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssistantObjectToolResourcesCodeInterpreter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AssistantObjectToolResourcesCodeInterpreter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AssistantObjectToolResourcesCodeInterpreter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AssistantObjectToolResourcesCodeInterpreter(
        fileIds: json[r'file_ids'] is Iterable
            ? (json[r'file_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<AssistantObjectToolResourcesCodeInterpreter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantObjectToolResourcesCodeInterpreter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantObjectToolResourcesCodeInterpreter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssistantObjectToolResourcesCodeInterpreter> mapFromJson(dynamic json) {
    final map = <String, AssistantObjectToolResourcesCodeInterpreter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssistantObjectToolResourcesCodeInterpreter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssistantObjectToolResourcesCodeInterpreter-objects as value to a dart map
  static Map<String, List<AssistantObjectToolResourcesCodeInterpreter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssistantObjectToolResourcesCodeInterpreter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssistantObjectToolResourcesCodeInterpreter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


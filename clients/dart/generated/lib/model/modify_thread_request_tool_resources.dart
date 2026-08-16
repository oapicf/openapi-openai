//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ModifyThreadRequestToolResources {
  /// Returns a new [ModifyThreadRequestToolResources] instance.
  ModifyThreadRequestToolResources({
    this.codeInterpreter,
    this.fileSearch,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CreateAssistantRequestToolResourcesCodeInterpreter? codeInterpreter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ModifyThreadRequestToolResourcesFileSearch? fileSearch;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ModifyThreadRequestToolResources &&
    other.codeInterpreter == codeInterpreter &&
    other.fileSearch == fileSearch;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (codeInterpreter == null ? 0 : codeInterpreter!.hashCode) +
    (fileSearch == null ? 0 : fileSearch!.hashCode);

  @override
  String toString() => 'ModifyThreadRequestToolResources[codeInterpreter=$codeInterpreter, fileSearch=$fileSearch]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.codeInterpreter != null) {
      json[r'code_interpreter'] = this.codeInterpreter;
    } else {
      json[r'code_interpreter'] = null;
    }
    if (this.fileSearch != null) {
      json[r'file_search'] = this.fileSearch;
    } else {
      json[r'file_search'] = null;
    }
    return json;
  }

  /// Returns a new [ModifyThreadRequestToolResources] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ModifyThreadRequestToolResources? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ModifyThreadRequestToolResources[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ModifyThreadRequestToolResources[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ModifyThreadRequestToolResources(
        codeInterpreter: CreateAssistantRequestToolResourcesCodeInterpreter.fromJson(json[r'code_interpreter']),
        fileSearch: ModifyThreadRequestToolResourcesFileSearch.fromJson(json[r'file_search']),
      );
    }
    return null;
  }

  static List<ModifyThreadRequestToolResources> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ModifyThreadRequestToolResources>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ModifyThreadRequestToolResources.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ModifyThreadRequestToolResources> mapFromJson(dynamic json) {
    final map = <String, ModifyThreadRequestToolResources>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ModifyThreadRequestToolResources.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ModifyThreadRequestToolResources-objects as value to a dart map
  static Map<String, List<ModifyThreadRequestToolResources>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ModifyThreadRequestToolResources>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ModifyThreadRequestToolResources.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


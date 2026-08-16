//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateImageEditRequestModel {
  /// Returns a new [CreateImageEditRequestModel] instance.
  CreateImageEditRequestModel({
  });

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateImageEditRequestModel &&

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis

  @override
  String toString() => 'CreateImageEditRequestModel[]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    return json;
  }

  /// Returns a new [CreateImageEditRequestModel] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateImageEditRequestModel? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateImageEditRequestModel[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateImageEditRequestModel[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateImageEditRequestModel(
      );
    }
    return null;
  }

  static List<CreateImageEditRequestModel> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateImageEditRequestModel>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateImageEditRequestModel.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateImageEditRequestModel> mapFromJson(dynamic json) {
    final map = <String, CreateImageEditRequestModel>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateImageEditRequestModel.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateImageEditRequestModel-objects as value to a dart map
  static Map<String, List<CreateImageEditRequestModel>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateImageEditRequestModel>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateImageEditRequestModel.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


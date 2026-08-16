//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FineTuneSupervisedMethod {
  /// Returns a new [FineTuneSupervisedMethod] instance.
  FineTuneSupervisedMethod({
    this.hyperparameters,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FineTuneSupervisedMethodHyperparameters? hyperparameters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FineTuneSupervisedMethod &&
    other.hyperparameters == hyperparameters;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hyperparameters == null ? 0 : hyperparameters!.hashCode);

  @override
  String toString() => 'FineTuneSupervisedMethod[hyperparameters=$hyperparameters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.hyperparameters != null) {
      json[r'hyperparameters'] = this.hyperparameters;
    } else {
      json[r'hyperparameters'] = null;
    }
    return json;
  }

  /// Returns a new [FineTuneSupervisedMethod] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FineTuneSupervisedMethod? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FineTuneSupervisedMethod[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FineTuneSupervisedMethod[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FineTuneSupervisedMethod(
        hyperparameters: FineTuneSupervisedMethodHyperparameters.fromJson(json[r'hyperparameters']),
      );
    }
    return null;
  }

  static List<FineTuneSupervisedMethod> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuneSupervisedMethod>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuneSupervisedMethod.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FineTuneSupervisedMethod> mapFromJson(dynamic json) {
    final map = <String, FineTuneSupervisedMethod>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FineTuneSupervisedMethod.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FineTuneSupervisedMethod-objects as value to a dart map
  static Map<String, List<FineTuneSupervisedMethod>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FineTuneSupervisedMethod>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FineTuneSupervisedMethod.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


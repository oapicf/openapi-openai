//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation {
  /// Returns a new [RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] instance.
  RunStepDeltaStepDetailsMessageCreationObjectMessageCreation({
    this.messageId,
  });

  /// The ID of the message that was created by this run step.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? messageId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaStepDetailsMessageCreationObjectMessageCreation &&
    other.messageId == messageId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (messageId == null ? 0 : messageId!.hashCode);

  @override
  String toString() => 'RunStepDeltaStepDetailsMessageCreationObjectMessageCreation[messageId=$messageId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.messageId != null) {
      json[r'message_id'] = this.messageId;
    } else {
      json[r'message_id'] = null;
    }
    return json;
  }

  /// Returns a new [RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaStepDetailsMessageCreationObjectMessageCreation[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaStepDetailsMessageCreationObjectMessageCreation[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaStepDetailsMessageCreationObjectMessageCreation(
        messageId: mapValueOfType<String>(json, r'message_id'),
      );
    }
    return null;
  }

  static List<RunStepDeltaStepDetailsMessageCreationObjectMessageCreation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsMessageCreationObjectMessageCreation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaStepDetailsMessageCreationObjectMessageCreation> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaStepDetailsMessageCreationObjectMessageCreation>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation-objects as value to a dart map
  static Map<String, List<RunStepDeltaStepDetailsMessageCreationObjectMessageCreation>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaStepDetailsMessageCreationObjectMessageCreation>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


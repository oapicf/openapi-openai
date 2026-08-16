//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FineTunePreferenceRequestInput {
  /// Returns a new [FineTunePreferenceRequestInput] instance.
  FineTunePreferenceRequestInput({
    this.input,
    this.preferredCompletion = const [],
    this.nonPreferredCompletion = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FineTunePreferenceRequestInputInput? input;

  /// The preferred completion message for the output.
  List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion;

  /// The non-preferred completion message for the output.
  List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FineTunePreferenceRequestInput &&
    other.input == input &&
    _deepEquality.equals(other.preferredCompletion, preferredCompletion) &&
    _deepEquality.equals(other.nonPreferredCompletion, nonPreferredCompletion);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (input == null ? 0 : input!.hashCode) +
    (preferredCompletion.hashCode) +
    (nonPreferredCompletion.hashCode);

  @override
  String toString() => 'FineTunePreferenceRequestInput[input=$input, preferredCompletion=$preferredCompletion, nonPreferredCompletion=$nonPreferredCompletion]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.input != null) {
      json[r'input'] = this.input;
    } else {
      json[r'input'] = null;
    }
      json[r'preferred_completion'] = this.preferredCompletion;
      json[r'non_preferred_completion'] = this.nonPreferredCompletion;
    return json;
  }

  /// Returns a new [FineTunePreferenceRequestInput] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FineTunePreferenceRequestInput? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FineTunePreferenceRequestInput[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FineTunePreferenceRequestInput[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FineTunePreferenceRequestInput(
        input: FineTunePreferenceRequestInputInput.fromJson(json[r'input']),
        preferredCompletion: FineTunePreferenceRequestInputPreferredCompletionInner.listFromJson(json[r'preferred_completion']),
        nonPreferredCompletion: FineTunePreferenceRequestInputPreferredCompletionInner.listFromJson(json[r'non_preferred_completion']),
      );
    }
    return null;
  }

  static List<FineTunePreferenceRequestInput> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTunePreferenceRequestInput>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTunePreferenceRequestInput.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FineTunePreferenceRequestInput> mapFromJson(dynamic json) {
    final map = <String, FineTunePreferenceRequestInput>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FineTunePreferenceRequestInput.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FineTunePreferenceRequestInput-objects as value to a dart map
  static Map<String, List<FineTunePreferenceRequestInput>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FineTunePreferenceRequestInput>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FineTunePreferenceRequestInput.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


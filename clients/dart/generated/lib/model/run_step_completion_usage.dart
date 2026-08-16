//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepCompletionUsage {
  /// Returns a new [RunStepCompletionUsage] instance.
  RunStepCompletionUsage({
    required this.completionTokens,
    required this.promptTokens,
    required this.totalTokens,
  });

  /// Number of completion tokens used over the course of the run step.
  int completionTokens;

  /// Number of prompt tokens used over the course of the run step.
  int promptTokens;

  /// Total number of tokens used (prompt + completion).
  int totalTokens;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepCompletionUsage &&
    other.completionTokens == completionTokens &&
    other.promptTokens == promptTokens &&
    other.totalTokens == totalTokens;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (completionTokens.hashCode) +
    (promptTokens.hashCode) +
    (totalTokens.hashCode);

  @override
  String toString() => 'RunStepCompletionUsage[completionTokens=$completionTokens, promptTokens=$promptTokens, totalTokens=$totalTokens]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'completion_tokens'] = this.completionTokens;
      json[r'prompt_tokens'] = this.promptTokens;
      json[r'total_tokens'] = this.totalTokens;
    return json;
  }

  /// Returns a new [RunStepCompletionUsage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepCompletionUsage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepCompletionUsage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepCompletionUsage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepCompletionUsage(
        completionTokens: mapValueOfType<int>(json, r'completion_tokens')!,
        promptTokens: mapValueOfType<int>(json, r'prompt_tokens')!,
        totalTokens: mapValueOfType<int>(json, r'total_tokens')!,
      );
    }
    return null;
  }

  static List<RunStepCompletionUsage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepCompletionUsage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepCompletionUsage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepCompletionUsage> mapFromJson(dynamic json) {
    final map = <String, RunStepCompletionUsage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepCompletionUsage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepCompletionUsage-objects as value to a dart map
  static Map<String, List<RunStepCompletionUsage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepCompletionUsage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepCompletionUsage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'completion_tokens',
    'prompt_tokens',
    'total_tokens',
  };
}


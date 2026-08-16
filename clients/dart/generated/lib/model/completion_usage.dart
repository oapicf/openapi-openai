//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CompletionUsage {
  /// Returns a new [CompletionUsage] instance.
  CompletionUsage({
    required this.completionTokens,
    required this.promptTokens,
    required this.totalTokens,
    this.completionTokensDetails,
    this.promptTokensDetails,
  });

  /// Number of tokens in the generated completion.
  int completionTokens;

  /// Number of tokens in the prompt.
  int promptTokens;

  /// Total number of tokens used in the request (prompt + completion).
  int totalTokens;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CompletionUsageCompletionTokensDetails? completionTokensDetails;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CompletionUsagePromptTokensDetails? promptTokensDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CompletionUsage &&
    other.completionTokens == completionTokens &&
    other.promptTokens == promptTokens &&
    other.totalTokens == totalTokens &&
    other.completionTokensDetails == completionTokensDetails &&
    other.promptTokensDetails == promptTokensDetails;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (completionTokens.hashCode) +
    (promptTokens.hashCode) +
    (totalTokens.hashCode) +
    (completionTokensDetails == null ? 0 : completionTokensDetails!.hashCode) +
    (promptTokensDetails == null ? 0 : promptTokensDetails!.hashCode);

  @override
  String toString() => 'CompletionUsage[completionTokens=$completionTokens, promptTokens=$promptTokens, totalTokens=$totalTokens, completionTokensDetails=$completionTokensDetails, promptTokensDetails=$promptTokensDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'completion_tokens'] = this.completionTokens;
      json[r'prompt_tokens'] = this.promptTokens;
      json[r'total_tokens'] = this.totalTokens;
    if (this.completionTokensDetails != null) {
      json[r'completion_tokens_details'] = this.completionTokensDetails;
    } else {
      json[r'completion_tokens_details'] = null;
    }
    if (this.promptTokensDetails != null) {
      json[r'prompt_tokens_details'] = this.promptTokensDetails;
    } else {
      json[r'prompt_tokens_details'] = null;
    }
    return json;
  }

  /// Returns a new [CompletionUsage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CompletionUsage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CompletionUsage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CompletionUsage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CompletionUsage(
        completionTokens: mapValueOfType<int>(json, r'completion_tokens')!,
        promptTokens: mapValueOfType<int>(json, r'prompt_tokens')!,
        totalTokens: mapValueOfType<int>(json, r'total_tokens')!,
        completionTokensDetails: CompletionUsageCompletionTokensDetails.fromJson(json[r'completion_tokens_details']),
        promptTokensDetails: CompletionUsagePromptTokensDetails.fromJson(json[r'prompt_tokens_details']),
      );
    }
    return null;
  }

  static List<CompletionUsage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CompletionUsage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CompletionUsage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CompletionUsage> mapFromJson(dynamic json) {
    final map = <String, CompletionUsage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CompletionUsage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CompletionUsage-objects as value to a dart map
  static Map<String, List<CompletionUsage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CompletionUsage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CompletionUsage.listFromJson(entry.value, growable: growable,);
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


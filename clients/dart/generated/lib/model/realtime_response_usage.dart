//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeResponseUsage {
  /// Returns a new [RealtimeResponseUsage] instance.
  RealtimeResponseUsage({
    this.totalTokens,
    this.inputTokens,
    this.outputTokens,
    this.inputTokenDetails,
    this.outputTokenDetails,
  });

  /// The total number of tokens in the Response including input and output  text and audio tokens. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? totalTokens;

  /// The number of input tokens used in the Response, including text and  audio tokens. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? inputTokens;

  /// The number of output tokens sent in the Response, including text and  audio tokens. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? outputTokens;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeResponseUsageInputTokenDetails? inputTokenDetails;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeResponseUsageOutputTokenDetails? outputTokenDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeResponseUsage &&
    other.totalTokens == totalTokens &&
    other.inputTokens == inputTokens &&
    other.outputTokens == outputTokens &&
    other.inputTokenDetails == inputTokenDetails &&
    other.outputTokenDetails == outputTokenDetails;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (totalTokens == null ? 0 : totalTokens!.hashCode) +
    (inputTokens == null ? 0 : inputTokens!.hashCode) +
    (outputTokens == null ? 0 : outputTokens!.hashCode) +
    (inputTokenDetails == null ? 0 : inputTokenDetails!.hashCode) +
    (outputTokenDetails == null ? 0 : outputTokenDetails!.hashCode);

  @override
  String toString() => 'RealtimeResponseUsage[totalTokens=$totalTokens, inputTokens=$inputTokens, outputTokens=$outputTokens, inputTokenDetails=$inputTokenDetails, outputTokenDetails=$outputTokenDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.totalTokens != null) {
      json[r'total_tokens'] = this.totalTokens;
    } else {
      json[r'total_tokens'] = null;
    }
    if (this.inputTokens != null) {
      json[r'input_tokens'] = this.inputTokens;
    } else {
      json[r'input_tokens'] = null;
    }
    if (this.outputTokens != null) {
      json[r'output_tokens'] = this.outputTokens;
    } else {
      json[r'output_tokens'] = null;
    }
    if (this.inputTokenDetails != null) {
      json[r'input_token_details'] = this.inputTokenDetails;
    } else {
      json[r'input_token_details'] = null;
    }
    if (this.outputTokenDetails != null) {
      json[r'output_token_details'] = this.outputTokenDetails;
    } else {
      json[r'output_token_details'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeResponseUsage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeResponseUsage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeResponseUsage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeResponseUsage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeResponseUsage(
        totalTokens: mapValueOfType<int>(json, r'total_tokens'),
        inputTokens: mapValueOfType<int>(json, r'input_tokens'),
        outputTokens: mapValueOfType<int>(json, r'output_tokens'),
        inputTokenDetails: RealtimeResponseUsageInputTokenDetails.fromJson(json[r'input_token_details']),
        outputTokenDetails: RealtimeResponseUsageOutputTokenDetails.fromJson(json[r'output_token_details']),
      );
    }
    return null;
  }

  static List<RealtimeResponseUsage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseUsage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseUsage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeResponseUsage> mapFromJson(dynamic json) {
    final map = <String, RealtimeResponseUsage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeResponseUsage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeResponseUsage-objects as value to a dart map
  static Map<String, List<RealtimeResponseUsage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeResponseUsage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeResponseUsage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


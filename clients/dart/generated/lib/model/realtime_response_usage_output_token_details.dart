//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeResponseUsageOutputTokenDetails {
  /// Returns a new [RealtimeResponseUsageOutputTokenDetails] instance.
  RealtimeResponseUsageOutputTokenDetails({
    this.textTokens,
    this.audioTokens,
  });

  /// The number of text tokens used in the Response.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? textTokens;

  /// The number of audio tokens used in the Response.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? audioTokens;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeResponseUsageOutputTokenDetails &&
    other.textTokens == textTokens &&
    other.audioTokens == audioTokens;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (textTokens == null ? 0 : textTokens!.hashCode) +
    (audioTokens == null ? 0 : audioTokens!.hashCode);

  @override
  String toString() => 'RealtimeResponseUsageOutputTokenDetails[textTokens=$textTokens, audioTokens=$audioTokens]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.textTokens != null) {
      json[r'text_tokens'] = this.textTokens;
    } else {
      json[r'text_tokens'] = null;
    }
    if (this.audioTokens != null) {
      json[r'audio_tokens'] = this.audioTokens;
    } else {
      json[r'audio_tokens'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeResponseUsageOutputTokenDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeResponseUsageOutputTokenDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeResponseUsageOutputTokenDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeResponseUsageOutputTokenDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeResponseUsageOutputTokenDetails(
        textTokens: mapValueOfType<int>(json, r'text_tokens'),
        audioTokens: mapValueOfType<int>(json, r'audio_tokens'),
      );
    }
    return null;
  }

  static List<RealtimeResponseUsageOutputTokenDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseUsageOutputTokenDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseUsageOutputTokenDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeResponseUsageOutputTokenDetails> mapFromJson(dynamic json) {
    final map = <String, RealtimeResponseUsageOutputTokenDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeResponseUsageOutputTokenDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeResponseUsageOutputTokenDetails-objects as value to a dart map
  static Map<String, List<RealtimeResponseUsageOutputTokenDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeResponseUsageOutputTokenDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeResponseUsageOutputTokenDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


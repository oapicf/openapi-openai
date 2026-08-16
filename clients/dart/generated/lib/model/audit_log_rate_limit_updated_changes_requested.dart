//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuditLogRateLimitUpdatedChangesRequested {
  /// Returns a new [AuditLogRateLimitUpdatedChangesRequested] instance.
  AuditLogRateLimitUpdatedChangesRequested({
    this.maxRequestsPer1Minute,
    this.maxTokensPer1Minute,
    this.maxImagesPer1Minute,
    this.maxAudioMegabytesPer1Minute,
    this.maxRequestsPer1Day,
    this.batch1DayMaxInputTokens,
  });

  /// The maximum requests per minute.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxRequestsPer1Minute;

  /// The maximum tokens per minute.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxTokensPer1Minute;

  /// The maximum images per minute. Only relevant for certain models.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxImagesPer1Minute;

  /// The maximum audio megabytes per minute. Only relevant for certain models.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxAudioMegabytesPer1Minute;

  /// The maximum requests per day. Only relevant for certain models.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxRequestsPer1Day;

  /// The maximum batch input tokens per day. Only relevant for certain models.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? batch1DayMaxInputTokens;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuditLogRateLimitUpdatedChangesRequested &&
    other.maxRequestsPer1Minute == maxRequestsPer1Minute &&
    other.maxTokensPer1Minute == maxTokensPer1Minute &&
    other.maxImagesPer1Minute == maxImagesPer1Minute &&
    other.maxAudioMegabytesPer1Minute == maxAudioMegabytesPer1Minute &&
    other.maxRequestsPer1Day == maxRequestsPer1Day &&
    other.batch1DayMaxInputTokens == batch1DayMaxInputTokens;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxRequestsPer1Minute == null ? 0 : maxRequestsPer1Minute!.hashCode) +
    (maxTokensPer1Minute == null ? 0 : maxTokensPer1Minute!.hashCode) +
    (maxImagesPer1Minute == null ? 0 : maxImagesPer1Minute!.hashCode) +
    (maxAudioMegabytesPer1Minute == null ? 0 : maxAudioMegabytesPer1Minute!.hashCode) +
    (maxRequestsPer1Day == null ? 0 : maxRequestsPer1Day!.hashCode) +
    (batch1DayMaxInputTokens == null ? 0 : batch1DayMaxInputTokens!.hashCode);

  @override
  String toString() => 'AuditLogRateLimitUpdatedChangesRequested[maxRequestsPer1Minute=$maxRequestsPer1Minute, maxTokensPer1Minute=$maxTokensPer1Minute, maxImagesPer1Minute=$maxImagesPer1Minute, maxAudioMegabytesPer1Minute=$maxAudioMegabytesPer1Minute, maxRequestsPer1Day=$maxRequestsPer1Day, batch1DayMaxInputTokens=$batch1DayMaxInputTokens]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxRequestsPer1Minute != null) {
      json[r'max_requests_per_1_minute'] = this.maxRequestsPer1Minute;
    } else {
      json[r'max_requests_per_1_minute'] = null;
    }
    if (this.maxTokensPer1Minute != null) {
      json[r'max_tokens_per_1_minute'] = this.maxTokensPer1Minute;
    } else {
      json[r'max_tokens_per_1_minute'] = null;
    }
    if (this.maxImagesPer1Minute != null) {
      json[r'max_images_per_1_minute'] = this.maxImagesPer1Minute;
    } else {
      json[r'max_images_per_1_minute'] = null;
    }
    if (this.maxAudioMegabytesPer1Minute != null) {
      json[r'max_audio_megabytes_per_1_minute'] = this.maxAudioMegabytesPer1Minute;
    } else {
      json[r'max_audio_megabytes_per_1_minute'] = null;
    }
    if (this.maxRequestsPer1Day != null) {
      json[r'max_requests_per_1_day'] = this.maxRequestsPer1Day;
    } else {
      json[r'max_requests_per_1_day'] = null;
    }
    if (this.batch1DayMaxInputTokens != null) {
      json[r'batch_1_day_max_input_tokens'] = this.batch1DayMaxInputTokens;
    } else {
      json[r'batch_1_day_max_input_tokens'] = null;
    }
    return json;
  }

  /// Returns a new [AuditLogRateLimitUpdatedChangesRequested] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuditLogRateLimitUpdatedChangesRequested? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuditLogRateLimitUpdatedChangesRequested[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuditLogRateLimitUpdatedChangesRequested[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuditLogRateLimitUpdatedChangesRequested(
        maxRequestsPer1Minute: mapValueOfType<int>(json, r'max_requests_per_1_minute'),
        maxTokensPer1Minute: mapValueOfType<int>(json, r'max_tokens_per_1_minute'),
        maxImagesPer1Minute: mapValueOfType<int>(json, r'max_images_per_1_minute'),
        maxAudioMegabytesPer1Minute: mapValueOfType<int>(json, r'max_audio_megabytes_per_1_minute'),
        maxRequestsPer1Day: mapValueOfType<int>(json, r'max_requests_per_1_day'),
        batch1DayMaxInputTokens: mapValueOfType<int>(json, r'batch_1_day_max_input_tokens'),
      );
    }
    return null;
  }

  static List<AuditLogRateLimitUpdatedChangesRequested> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuditLogRateLimitUpdatedChangesRequested>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuditLogRateLimitUpdatedChangesRequested.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuditLogRateLimitUpdatedChangesRequested> mapFromJson(dynamic json) {
    final map = <String, AuditLogRateLimitUpdatedChangesRequested>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuditLogRateLimitUpdatedChangesRequested.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuditLogRateLimitUpdatedChangesRequested-objects as value to a dart map
  static Map<String, List<AuditLogRateLimitUpdatedChangesRequested>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuditLogRateLimitUpdatedChangesRequested>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuditLogRateLimitUpdatedChangesRequested.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


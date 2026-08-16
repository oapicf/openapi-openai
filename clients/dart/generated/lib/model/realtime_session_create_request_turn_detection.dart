//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeSessionCreateRequestTurnDetection {
  /// Returns a new [RealtimeSessionCreateRequestTurnDetection] instance.
  RealtimeSessionCreateRequestTurnDetection({
    this.type,
    this.threshold,
    this.prefixPaddingMs,
    this.silenceDurationMs,
    this.createResponse = true,
  });

  /// Type of turn detection, only `server_vad` is currently supported. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  /// Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? threshold;

  /// Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? prefixPaddingMs;

  /// Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? silenceDurationMs;

  /// Whether or not to automatically generate a response when VAD is enabled. `true` by default. 
  bool createResponse;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeSessionCreateRequestTurnDetection &&
    other.type == type &&
    other.threshold == threshold &&
    other.prefixPaddingMs == prefixPaddingMs &&
    other.silenceDurationMs == silenceDurationMs &&
    other.createResponse == createResponse;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (threshold == null ? 0 : threshold!.hashCode) +
    (prefixPaddingMs == null ? 0 : prefixPaddingMs!.hashCode) +
    (silenceDurationMs == null ? 0 : silenceDurationMs!.hashCode) +
    (createResponse.hashCode);

  @override
  String toString() => 'RealtimeSessionCreateRequestTurnDetection[type=$type, threshold=$threshold, prefixPaddingMs=$prefixPaddingMs, silenceDurationMs=$silenceDurationMs, createResponse=$createResponse]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.threshold != null) {
      json[r'threshold'] = this.threshold;
    } else {
      json[r'threshold'] = null;
    }
    if (this.prefixPaddingMs != null) {
      json[r'prefix_padding_ms'] = this.prefixPaddingMs;
    } else {
      json[r'prefix_padding_ms'] = null;
    }
    if (this.silenceDurationMs != null) {
      json[r'silence_duration_ms'] = this.silenceDurationMs;
    } else {
      json[r'silence_duration_ms'] = null;
    }
      json[r'create_response'] = this.createResponse;
    return json;
  }

  /// Returns a new [RealtimeSessionCreateRequestTurnDetection] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeSessionCreateRequestTurnDetection? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeSessionCreateRequestTurnDetection[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeSessionCreateRequestTurnDetection[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeSessionCreateRequestTurnDetection(
        type: mapValueOfType<String>(json, r'type'),
        threshold: num.parse('${json[r'threshold']}'),
        prefixPaddingMs: mapValueOfType<int>(json, r'prefix_padding_ms'),
        silenceDurationMs: mapValueOfType<int>(json, r'silence_duration_ms'),
        createResponse: mapValueOfType<bool>(json, r'create_response') ?? true,
      );
    }
    return null;
  }

  static List<RealtimeSessionCreateRequestTurnDetection> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionCreateRequestTurnDetection>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionCreateRequestTurnDetection.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeSessionCreateRequestTurnDetection> mapFromJson(dynamic json) {
    final map = <String, RealtimeSessionCreateRequestTurnDetection>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeSessionCreateRequestTurnDetection.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeSessionCreateRequestTurnDetection-objects as value to a dart map
  static Map<String, List<RealtimeSessionCreateRequestTurnDetection>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeSessionCreateRequestTurnDetection>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeSessionCreateRequestTurnDetection.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


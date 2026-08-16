//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeSessionTurnDetection {
  /// Returns a new [RealtimeSessionTurnDetection] instance.
  RealtimeSessionTurnDetection({
    this.type,
    this.threshold,
    this.prefixPaddingMs,
    this.silenceDurationMs,
  });

  /// Type of turn detection, only `server_vad` is currently supported. 
  RealtimeSessionTurnDetectionTypeEnum? type;

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeSessionTurnDetection &&
    other.type == type &&
    other.threshold == threshold &&
    other.prefixPaddingMs == prefixPaddingMs &&
    other.silenceDurationMs == silenceDurationMs;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (threshold == null ? 0 : threshold!.hashCode) +
    (prefixPaddingMs == null ? 0 : prefixPaddingMs!.hashCode) +
    (silenceDurationMs == null ? 0 : silenceDurationMs!.hashCode);

  @override
  String toString() => 'RealtimeSessionTurnDetection[type=$type, threshold=$threshold, prefixPaddingMs=$prefixPaddingMs, silenceDurationMs=$silenceDurationMs]';

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
    return json;
  }

  /// Returns a new [RealtimeSessionTurnDetection] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeSessionTurnDetection? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeSessionTurnDetection[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeSessionTurnDetection[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeSessionTurnDetection(
        type: RealtimeSessionTurnDetectionTypeEnum.fromJson(json[r'type']),
        threshold: num.parse('${json[r'threshold']}'),
        prefixPaddingMs: mapValueOfType<int>(json, r'prefix_padding_ms'),
        silenceDurationMs: mapValueOfType<int>(json, r'silence_duration_ms'),
      );
    }
    return null;
  }

  static List<RealtimeSessionTurnDetection> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionTurnDetection>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionTurnDetection.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeSessionTurnDetection> mapFromJson(dynamic json) {
    final map = <String, RealtimeSessionTurnDetection>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeSessionTurnDetection.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeSessionTurnDetection-objects as value to a dart map
  static Map<String, List<RealtimeSessionTurnDetection>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeSessionTurnDetection>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeSessionTurnDetection.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Type of turn detection, only `server_vad` is currently supported. 
class RealtimeSessionTurnDetectionTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeSessionTurnDetectionTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const serverVad = RealtimeSessionTurnDetectionTypeEnum._(r'server_vad');

  /// List of all possible values in this [enum][RealtimeSessionTurnDetectionTypeEnum].
  static const values = <RealtimeSessionTurnDetectionTypeEnum>[
    serverVad,
  ];

  static RealtimeSessionTurnDetectionTypeEnum? fromJson(dynamic value) => RealtimeSessionTurnDetectionTypeEnumTypeTransformer().decode(value);

  static List<RealtimeSessionTurnDetectionTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeSessionTurnDetectionTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeSessionTurnDetectionTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeSessionTurnDetectionTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeSessionTurnDetectionTypeEnum].
class RealtimeSessionTurnDetectionTypeEnumTypeTransformer {
  factory RealtimeSessionTurnDetectionTypeEnumTypeTransformer() => _instance ??= const RealtimeSessionTurnDetectionTypeEnumTypeTransformer._();

  const RealtimeSessionTurnDetectionTypeEnumTypeTransformer._();

  String encode(RealtimeSessionTurnDetectionTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeSessionTurnDetectionTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeSessionTurnDetectionTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'server_vad': return RealtimeSessionTurnDetectionTypeEnum.serverVad;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeSessionTurnDetectionTypeEnumTypeTransformer] instance.
  static RealtimeSessionTurnDetectionTypeEnumTypeTransformer? _instance;
}



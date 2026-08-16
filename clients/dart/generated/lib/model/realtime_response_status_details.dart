//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeResponseStatusDetails {
  /// Returns a new [RealtimeResponseStatusDetails] instance.
  RealtimeResponseStatusDetails({
    this.type,
    this.reason,
    this.error,
  });

  /// The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
  RealtimeResponseStatusDetailsTypeEnum? type;

  /// The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
  RealtimeResponseStatusDetailsReasonEnum? reason;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeResponseStatusDetailsError? error;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeResponseStatusDetails &&
    other.type == type &&
    other.reason == reason &&
    other.error == error;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (reason == null ? 0 : reason!.hashCode) +
    (error == null ? 0 : error!.hashCode);

  @override
  String toString() => 'RealtimeResponseStatusDetails[type=$type, reason=$reason, error=$error]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.reason != null) {
      json[r'reason'] = this.reason;
    } else {
      json[r'reason'] = null;
    }
    if (this.error != null) {
      json[r'error'] = this.error;
    } else {
      json[r'error'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeResponseStatusDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeResponseStatusDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeResponseStatusDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeResponseStatusDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeResponseStatusDetails(
        type: RealtimeResponseStatusDetailsTypeEnum.fromJson(json[r'type']),
        reason: RealtimeResponseStatusDetailsReasonEnum.fromJson(json[r'reason']),
        error: RealtimeResponseStatusDetailsError.fromJson(json[r'error']),
      );
    }
    return null;
  }

  static List<RealtimeResponseStatusDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseStatusDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseStatusDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeResponseStatusDetails> mapFromJson(dynamic json) {
    final map = <String, RealtimeResponseStatusDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeResponseStatusDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeResponseStatusDetails-objects as value to a dart map
  static Map<String, List<RealtimeResponseStatusDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeResponseStatusDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeResponseStatusDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
class RealtimeResponseStatusDetailsTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeResponseStatusDetailsTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const completed = RealtimeResponseStatusDetailsTypeEnum._(r'completed');
  static const cancelled = RealtimeResponseStatusDetailsTypeEnum._(r'cancelled');
  static const failed = RealtimeResponseStatusDetailsTypeEnum._(r'failed');
  static const incomplete = RealtimeResponseStatusDetailsTypeEnum._(r'incomplete');

  /// List of all possible values in this [enum][RealtimeResponseStatusDetailsTypeEnum].
  static const values = <RealtimeResponseStatusDetailsTypeEnum>[
    completed,
    cancelled,
    failed,
    incomplete,
  ];

  static RealtimeResponseStatusDetailsTypeEnum? fromJson(dynamic value) => RealtimeResponseStatusDetailsTypeEnumTypeTransformer().decode(value);

  static List<RealtimeResponseStatusDetailsTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseStatusDetailsTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseStatusDetailsTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeResponseStatusDetailsTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeResponseStatusDetailsTypeEnum].
class RealtimeResponseStatusDetailsTypeEnumTypeTransformer {
  factory RealtimeResponseStatusDetailsTypeEnumTypeTransformer() => _instance ??= const RealtimeResponseStatusDetailsTypeEnumTypeTransformer._();

  const RealtimeResponseStatusDetailsTypeEnumTypeTransformer._();

  String encode(RealtimeResponseStatusDetailsTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeResponseStatusDetailsTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeResponseStatusDetailsTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'completed': return RealtimeResponseStatusDetailsTypeEnum.completed;
        case r'cancelled': return RealtimeResponseStatusDetailsTypeEnum.cancelled;
        case r'failed': return RealtimeResponseStatusDetailsTypeEnum.failed;
        case r'incomplete': return RealtimeResponseStatusDetailsTypeEnum.incomplete;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeResponseStatusDetailsTypeEnumTypeTransformer] instance.
  static RealtimeResponseStatusDetailsTypeEnumTypeTransformer? _instance;
}


/// The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
class RealtimeResponseStatusDetailsReasonEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeResponseStatusDetailsReasonEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const turnDetected = RealtimeResponseStatusDetailsReasonEnum._(r'turn_detected');
  static const clientCancelled = RealtimeResponseStatusDetailsReasonEnum._(r'client_cancelled');
  static const maxOutputTokens = RealtimeResponseStatusDetailsReasonEnum._(r'max_output_tokens');
  static const contentFilter = RealtimeResponseStatusDetailsReasonEnum._(r'content_filter');

  /// List of all possible values in this [enum][RealtimeResponseStatusDetailsReasonEnum].
  static const values = <RealtimeResponseStatusDetailsReasonEnum>[
    turnDetected,
    clientCancelled,
    maxOutputTokens,
    contentFilter,
  ];

  static RealtimeResponseStatusDetailsReasonEnum? fromJson(dynamic value) => RealtimeResponseStatusDetailsReasonEnumTypeTransformer().decode(value);

  static List<RealtimeResponseStatusDetailsReasonEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseStatusDetailsReasonEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseStatusDetailsReasonEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeResponseStatusDetailsReasonEnum] to String,
/// and [decode] dynamic data back to [RealtimeResponseStatusDetailsReasonEnum].
class RealtimeResponseStatusDetailsReasonEnumTypeTransformer {
  factory RealtimeResponseStatusDetailsReasonEnumTypeTransformer() => _instance ??= const RealtimeResponseStatusDetailsReasonEnumTypeTransformer._();

  const RealtimeResponseStatusDetailsReasonEnumTypeTransformer._();

  String encode(RealtimeResponseStatusDetailsReasonEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeResponseStatusDetailsReasonEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeResponseStatusDetailsReasonEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'turn_detected': return RealtimeResponseStatusDetailsReasonEnum.turnDetected;
        case r'client_cancelled': return RealtimeResponseStatusDetailsReasonEnum.clientCancelled;
        case r'max_output_tokens': return RealtimeResponseStatusDetailsReasonEnum.maxOutputTokens;
        case r'content_filter': return RealtimeResponseStatusDetailsReasonEnum.contentFilter;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeResponseStatusDetailsReasonEnumTypeTransformer] instance.
  static RealtimeResponseStatusDetailsReasonEnumTypeTransformer? _instance;
}



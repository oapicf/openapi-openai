//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventError {
  /// Returns a new [RealtimeServerEventError] instance.
  RealtimeServerEventError({
    required this.eventId,
    required this.type,
    required this.error,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `error`.
  RealtimeServerEventErrorTypeEnum type;

  RealtimeServerEventErrorError error;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventError &&
    other.eventId == eventId &&
    other.type == type &&
    other.error == error;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (error.hashCode);

  @override
  String toString() => 'RealtimeServerEventError[eventId=$eventId, type=$type, error=$error]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'error'] = this.error;
    return json;
  }

  /// Returns a new [RealtimeServerEventError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'event_id'), 'Required key "RealtimeServerEventError[event_id]" is missing from JSON.');
        assert(json[r'event_id'] != null, 'Required key "RealtimeServerEventError[event_id]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "RealtimeServerEventError[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "RealtimeServerEventError[type]" has a null value in JSON.');
        assert(json.containsKey(r'error'), 'Required key "RealtimeServerEventError[error]" is missing from JSON.');
        assert(json[r'error'] != null, 'Required key "RealtimeServerEventError[error]" has a null value in JSON.');
        return true;
      }());

      return RealtimeServerEventError(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventErrorTypeEnum.fromJson(json[r'type'])!,
        error: RealtimeServerEventErrorError.fromJson(json[r'error'])!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventError> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventError-objects as value to a dart map
  static Map<String, List<RealtimeServerEventError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'error',
  };
}

/// The event type, must be `error`.
enum RealtimeServerEventErrorTypeEnum {
  error._(r'error'),
  ;

  /// Instantiate a new enum with the provided value.
  const RealtimeServerEventErrorTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeServerEventErrorTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeServerEventErrorTypeEnum? fromJson(dynamic value) => RealtimeServerEventErrorTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeServerEventErrorTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeServerEventErrorTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventErrorTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventErrorTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventErrorTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventErrorTypeEnum].
class RealtimeServerEventErrorTypeEnumTypeTransformer {
  factory RealtimeServerEventErrorTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventErrorTypeEnumTypeTransformer._();

  const RealtimeServerEventErrorTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventErrorTypeEnum data) => data._value;

  /// Returns the instance of [RealtimeServerEventErrorTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventErrorTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeServerEventErrorTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'error': return RealtimeServerEventErrorTypeEnum.error;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeServerEventErrorTypeEnumTypeTransformer? _instance;
}



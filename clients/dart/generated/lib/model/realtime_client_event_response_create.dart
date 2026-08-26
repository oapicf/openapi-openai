//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeClientEventResponseCreate {
  /// Returns a new [RealtimeClientEventResponseCreate] instance.
  RealtimeClientEventResponseCreate({
    this.eventId,
    required this.type,
    this.response,
  });

  /// Optional client-generated ID used to identify this event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? eventId;

  /// The event type, must be `response.create`.
  RealtimeClientEventResponseCreateTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RealtimeResponseCreateParams? response;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeClientEventResponseCreate &&
    other.eventId == eventId &&
    other.type == type &&
    other.response == response;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId == null ? 0 : eventId!.hashCode) +
    (type.hashCode) +
    (response == null ? 0 : response!.hashCode);

  @override
  String toString() => 'RealtimeClientEventResponseCreate[eventId=$eventId, type=$type, response=$response]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventId != null) {
      json[r'event_id'] = this.eventId;
    } else {
      json[r'event_id'] = null;
    }
      json[r'type'] = this.type;
    if (this.response != null) {
      json[r'response'] = this.response;
    } else {
      json[r'response'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeClientEventResponseCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeClientEventResponseCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'type'), 'Required key "RealtimeClientEventResponseCreate[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "RealtimeClientEventResponseCreate[type]" has a null value in JSON.');
        return true;
      }());

      return RealtimeClientEventResponseCreate(
        eventId: mapValueOfType<String>(json, r'event_id'),
        type: RealtimeClientEventResponseCreateTypeEnum.fromJson(json[r'type'])!,
        response: RealtimeResponseCreateParams.fromJson(json[r'response']),
      );
    }
    return null;
  }

  static List<RealtimeClientEventResponseCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventResponseCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventResponseCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeClientEventResponseCreate> mapFromJson(dynamic json) {
    final map = <String, RealtimeClientEventResponseCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeClientEventResponseCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeClientEventResponseCreate-objects as value to a dart map
  static Map<String, List<RealtimeClientEventResponseCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeClientEventResponseCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeClientEventResponseCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// The event type, must be `response.create`.
enum RealtimeClientEventResponseCreateTypeEnum {
  responsePeriodCreate._(r'response.create'),
  ;

  /// Instantiate a new enum with the provided value.
  const RealtimeClientEventResponseCreateTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeClientEventResponseCreateTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeClientEventResponseCreateTypeEnum? fromJson(dynamic value) => RealtimeClientEventResponseCreateTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeClientEventResponseCreateTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeClientEventResponseCreateTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventResponseCreateTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventResponseCreateTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeClientEventResponseCreateTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeClientEventResponseCreateTypeEnum].
class RealtimeClientEventResponseCreateTypeEnumTypeTransformer {
  factory RealtimeClientEventResponseCreateTypeEnumTypeTransformer() => _instance ??= const RealtimeClientEventResponseCreateTypeEnumTypeTransformer._();

  const RealtimeClientEventResponseCreateTypeEnumTypeTransformer._();

  String encode(RealtimeClientEventResponseCreateTypeEnum data) => data._value;

  /// Returns the instance of [RealtimeClientEventResponseCreateTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeClientEventResponseCreateTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeClientEventResponseCreateTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'response.create': return RealtimeClientEventResponseCreateTypeEnum.responsePeriodCreate;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeClientEventResponseCreateTypeEnumTypeTransformer? _instance;
}



//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseDone {
  /// Returns a new [RealtimeServerEventResponseDone] instance.
  RealtimeServerEventResponseDone({
    required this.eventId,
    required this.type,
    required this.response,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `response.done`.
  RealtimeServerEventResponseDoneTypeEnum type;

  RealtimeResponse response;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseDone &&
    other.eventId == eventId &&
    other.type == type &&
    other.response == response;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (response.hashCode);

  @override
  String toString() => 'RealtimeServerEventResponseDone[eventId=$eventId, type=$type, response=$response]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'response'] = this.response;
    return json;
  }

  /// Returns a new [RealtimeServerEventResponseDone] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseDone? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventResponseDone[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventResponseDone[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventResponseDone(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventResponseDoneTypeEnum.fromJson(json[r'type'])!,
        response: RealtimeResponse.fromJson(json[r'response'])!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseDone> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseDone>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseDone.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseDone> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseDone>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseDone.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseDone-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseDone>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseDone>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseDone.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'response',
  };
}

/// The event type, must be `response.done`.
class RealtimeServerEventResponseDoneTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventResponseDoneTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const responsePeriodDone = RealtimeServerEventResponseDoneTypeEnum._(r'response.done');

  /// List of all possible values in this [enum][RealtimeServerEventResponseDoneTypeEnum].
  static const values = <RealtimeServerEventResponseDoneTypeEnum>[
    responsePeriodDone,
  ];

  static RealtimeServerEventResponseDoneTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseDoneTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventResponseDoneTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseDoneTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseDoneTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseDoneTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseDoneTypeEnum].
class RealtimeServerEventResponseDoneTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseDoneTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseDoneTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseDoneTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseDoneTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventResponseDoneTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseDoneTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'response.done': return RealtimeServerEventResponseDoneTypeEnum.responsePeriodDone;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventResponseDoneTypeEnumTypeTransformer] instance.
  static RealtimeServerEventResponseDoneTypeEnumTypeTransformer? _instance;
}



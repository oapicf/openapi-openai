//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventSessionUpdated {
  /// Returns a new [RealtimeServerEventSessionUpdated] instance.
  RealtimeServerEventSessionUpdated({
    required this.eventId,
    required this.type,
    required this.session,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `session.updated`.
  RealtimeServerEventSessionUpdatedTypeEnum type;

  RealtimeSession session;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventSessionUpdated &&
    other.eventId == eventId &&
    other.type == type &&
    other.session == session;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (session.hashCode);

  @override
  String toString() => 'RealtimeServerEventSessionUpdated[eventId=$eventId, type=$type, session=$session]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'session'] = this.session;
    return json;
  }

  /// Returns a new [RealtimeServerEventSessionUpdated] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventSessionUpdated? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventSessionUpdated[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventSessionUpdated[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventSessionUpdated(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventSessionUpdatedTypeEnum.fromJson(json[r'type'])!,
        session: RealtimeSession.fromJson(json[r'session'])!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventSessionUpdated> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventSessionUpdated>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventSessionUpdated.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventSessionUpdated> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventSessionUpdated>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventSessionUpdated.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventSessionUpdated-objects as value to a dart map
  static Map<String, List<RealtimeServerEventSessionUpdated>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventSessionUpdated>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventSessionUpdated.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'session',
  };
}

/// The event type, must be `session.updated`.
class RealtimeServerEventSessionUpdatedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventSessionUpdatedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const sessionPeriodUpdated = RealtimeServerEventSessionUpdatedTypeEnum._(r'session.updated');

  /// List of all possible values in this [enum][RealtimeServerEventSessionUpdatedTypeEnum].
  static const values = <RealtimeServerEventSessionUpdatedTypeEnum>[
    sessionPeriodUpdated,
  ];

  static RealtimeServerEventSessionUpdatedTypeEnum? fromJson(dynamic value) => RealtimeServerEventSessionUpdatedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventSessionUpdatedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventSessionUpdatedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventSessionUpdatedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventSessionUpdatedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventSessionUpdatedTypeEnum].
class RealtimeServerEventSessionUpdatedTypeEnumTypeTransformer {
  factory RealtimeServerEventSessionUpdatedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventSessionUpdatedTypeEnumTypeTransformer._();

  const RealtimeServerEventSessionUpdatedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventSessionUpdatedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventSessionUpdatedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventSessionUpdatedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'session.updated': return RealtimeServerEventSessionUpdatedTypeEnum.sessionPeriodUpdated;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventSessionUpdatedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventSessionUpdatedTypeEnumTypeTransformer? _instance;
}



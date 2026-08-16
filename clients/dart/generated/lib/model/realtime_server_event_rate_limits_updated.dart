//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventRateLimitsUpdated {
  /// Returns a new [RealtimeServerEventRateLimitsUpdated] instance.
  RealtimeServerEventRateLimitsUpdated({
    required this.eventId,
    required this.type,
    this.rateLimits = const [],
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `rate_limits.updated`.
  RealtimeServerEventRateLimitsUpdatedTypeEnum type;

  /// List of rate limit information.
  List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventRateLimitsUpdated &&
    other.eventId == eventId &&
    other.type == type &&
    _deepEquality.equals(other.rateLimits, rateLimits);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (rateLimits.hashCode);

  @override
  String toString() => 'RealtimeServerEventRateLimitsUpdated[eventId=$eventId, type=$type, rateLimits=$rateLimits]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'rate_limits'] = this.rateLimits;
    return json;
  }

  /// Returns a new [RealtimeServerEventRateLimitsUpdated] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventRateLimitsUpdated? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventRateLimitsUpdated[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventRateLimitsUpdated[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventRateLimitsUpdated(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventRateLimitsUpdatedTypeEnum.fromJson(json[r'type'])!,
        rateLimits: RealtimeServerEventRateLimitsUpdatedRateLimitsInner.listFromJson(json[r'rate_limits']),
      );
    }
    return null;
  }

  static List<RealtimeServerEventRateLimitsUpdated> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventRateLimitsUpdated>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventRateLimitsUpdated.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventRateLimitsUpdated> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventRateLimitsUpdated>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventRateLimitsUpdated.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventRateLimitsUpdated-objects as value to a dart map
  static Map<String, List<RealtimeServerEventRateLimitsUpdated>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventRateLimitsUpdated>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventRateLimitsUpdated.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'rate_limits',
  };
}

/// The event type, must be `rate_limits.updated`.
class RealtimeServerEventRateLimitsUpdatedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventRateLimitsUpdatedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const rateLimitsPeriodUpdated = RealtimeServerEventRateLimitsUpdatedTypeEnum._(r'rate_limits.updated');

  /// List of all possible values in this [enum][RealtimeServerEventRateLimitsUpdatedTypeEnum].
  static const values = <RealtimeServerEventRateLimitsUpdatedTypeEnum>[
    rateLimitsPeriodUpdated,
  ];

  static RealtimeServerEventRateLimitsUpdatedTypeEnum? fromJson(dynamic value) => RealtimeServerEventRateLimitsUpdatedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventRateLimitsUpdatedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventRateLimitsUpdatedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventRateLimitsUpdatedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventRateLimitsUpdatedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventRateLimitsUpdatedTypeEnum].
class RealtimeServerEventRateLimitsUpdatedTypeEnumTypeTransformer {
  factory RealtimeServerEventRateLimitsUpdatedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventRateLimitsUpdatedTypeEnumTypeTransformer._();

  const RealtimeServerEventRateLimitsUpdatedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventRateLimitsUpdatedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventRateLimitsUpdatedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventRateLimitsUpdatedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'rate_limits.updated': return RealtimeServerEventRateLimitsUpdatedTypeEnum.rateLimitsPeriodUpdated;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventRateLimitsUpdatedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventRateLimitsUpdatedTypeEnumTypeTransformer? _instance;
}



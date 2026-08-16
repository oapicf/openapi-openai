//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventRateLimitsUpdatedRateLimitsInner {
  /// Returns a new [RealtimeServerEventRateLimitsUpdatedRateLimitsInner] instance.
  RealtimeServerEventRateLimitsUpdatedRateLimitsInner({
    this.name,
    this.limit,
    this.remaining,
    this.resetSeconds,
  });

  /// The name of the rate limit (`requests`, `tokens`). 
  RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum? name;

  /// The maximum allowed value for the rate limit.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? limit;

  /// The remaining value before the limit is reached.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? remaining;

  /// Seconds until the rate limit resets.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? resetSeconds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventRateLimitsUpdatedRateLimitsInner &&
    other.name == name &&
    other.limit == limit &&
    other.remaining == remaining &&
    other.resetSeconds == resetSeconds;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (limit == null ? 0 : limit!.hashCode) +
    (remaining == null ? 0 : remaining!.hashCode) +
    (resetSeconds == null ? 0 : resetSeconds!.hashCode);

  @override
  String toString() => 'RealtimeServerEventRateLimitsUpdatedRateLimitsInner[name=$name, limit=$limit, remaining=$remaining, resetSeconds=$resetSeconds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.limit != null) {
      json[r'limit'] = this.limit;
    } else {
      json[r'limit'] = null;
    }
    if (this.remaining != null) {
      json[r'remaining'] = this.remaining;
    } else {
      json[r'remaining'] = null;
    }
    if (this.resetSeconds != null) {
      json[r'reset_seconds'] = this.resetSeconds;
    } else {
      json[r'reset_seconds'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeServerEventRateLimitsUpdatedRateLimitsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventRateLimitsUpdatedRateLimitsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventRateLimitsUpdatedRateLimitsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventRateLimitsUpdatedRateLimitsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventRateLimitsUpdatedRateLimitsInner(
        name: RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum.fromJson(json[r'name']),
        limit: mapValueOfType<int>(json, r'limit'),
        remaining: mapValueOfType<int>(json, r'remaining'),
        resetSeconds: num.parse('${json[r'reset_seconds']}'),
      );
    }
    return null;
  }

  static List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventRateLimitsUpdatedRateLimitsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventRateLimitsUpdatedRateLimitsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventRateLimitsUpdatedRateLimitsInner> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventRateLimitsUpdatedRateLimitsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventRateLimitsUpdatedRateLimitsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventRateLimitsUpdatedRateLimitsInner-objects as value to a dart map
  static Map<String, List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventRateLimitsUpdatedRateLimitsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The name of the rate limit (`requests`, `tokens`). 
class RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const requests = RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum._(r'requests');
  static const tokens = RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum._(r'tokens');

  /// List of all possible values in this [enum][RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum].
  static const values = <RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum>[
    requests,
    tokens,
  ];

  static RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum? fromJson(dynamic value) => RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum].
class RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumTypeTransformer {
  factory RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumTypeTransformer() => _instance ??= const RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumTypeTransformer._();

  const RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumTypeTransformer._();

  String encode(RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'requests': return RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum.requests;
        case r'tokens': return RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum.tokens;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumTypeTransformer] instance.
  static RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumTypeTransformer? _instance;
}



//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsageTimeBucket {
  /// Returns a new [UsageTimeBucket] instance.
  UsageTimeBucket({
    required this.object,
    required this.startTime,
    required this.endTime,
    this.result = const [],
  });

  UsageTimeBucketObjectEnum object;

  int startTime;

  int endTime;

  List<UsageTimeBucketResultInner> result;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UsageTimeBucket &&
    other.object == object &&
    other.startTime == startTime &&
    other.endTime == endTime &&
    _deepEquality.equals(other.result, result);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (startTime.hashCode) +
    (endTime.hashCode) +
    (result.hashCode);

  @override
  String toString() => 'UsageTimeBucket[object=$object, startTime=$startTime, endTime=$endTime, result=$result]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'start_time'] = this.startTime;
      json[r'end_time'] = this.endTime;
      json[r'result'] = this.result;
    return json;
  }

  /// Returns a new [UsageTimeBucket] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsageTimeBucket? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'object'), 'Required key "UsageTimeBucket[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "UsageTimeBucket[object]" has a null value in JSON.');
        assert(json.containsKey(r'start_time'), 'Required key "UsageTimeBucket[start_time]" is missing from JSON.');
        assert(json[r'start_time'] != null, 'Required key "UsageTimeBucket[start_time]" has a null value in JSON.');
        assert(json.containsKey(r'end_time'), 'Required key "UsageTimeBucket[end_time]" is missing from JSON.');
        assert(json[r'end_time'] != null, 'Required key "UsageTimeBucket[end_time]" has a null value in JSON.');
        assert(json.containsKey(r'result'), 'Required key "UsageTimeBucket[result]" is missing from JSON.');
        assert(json[r'result'] != null, 'Required key "UsageTimeBucket[result]" has a null value in JSON.');
        return true;
      }());

      return UsageTimeBucket(
        object: UsageTimeBucketObjectEnum.fromJson(json[r'object'])!,
        startTime: mapValueOfType<int>(json, r'start_time')!,
        endTime: mapValueOfType<int>(json, r'end_time')!,
        result: UsageTimeBucketResultInner.listFromJson(json[r'result']),
      );
    }
    return null;
  }

  static List<UsageTimeBucket> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageTimeBucket>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageTimeBucket.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsageTimeBucket> mapFromJson(dynamic json) {
    final map = <String, UsageTimeBucket>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsageTimeBucket.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsageTimeBucket-objects as value to a dart map
  static Map<String, List<UsageTimeBucket>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsageTimeBucket>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsageTimeBucket.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'start_time',
    'end_time',
    'result',
  };
}


enum UsageTimeBucketObjectEnum {
  bucket._(r'bucket'),
  ;

  /// Instantiate a new enum with the provided value.
  const UsageTimeBucketObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [UsageTimeBucketObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static UsageTimeBucketObjectEnum? fromJson(dynamic value) => UsageTimeBucketObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [UsageTimeBucketObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<UsageTimeBucketObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageTimeBucketObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageTimeBucketObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UsageTimeBucketObjectEnum] to String,
/// and [decode] dynamic data back to [UsageTimeBucketObjectEnum].
class UsageTimeBucketObjectEnumTypeTransformer {
  factory UsageTimeBucketObjectEnumTypeTransformer() => _instance ??= const UsageTimeBucketObjectEnumTypeTransformer._();

  const UsageTimeBucketObjectEnumTypeTransformer._();

  String encode(UsageTimeBucketObjectEnum data) => data._value;

  /// Returns the instance of [UsageTimeBucketObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UsageTimeBucketObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is UsageTimeBucketObjectEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'bucket': return UsageTimeBucketObjectEnum.bucket;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static UsageTimeBucketObjectEnumTypeTransformer? _instance;
}



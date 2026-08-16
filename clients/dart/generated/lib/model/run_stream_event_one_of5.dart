//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStreamEventOneOf5 {
  /// Returns a new [RunStreamEventOneOf5] instance.
  RunStreamEventOneOf5({
    required this.event,
    required this.data,
  });

  RunStreamEventOneOf5EventEnum event;

  RunObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStreamEventOneOf5 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStreamEventOneOf5[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStreamEventOneOf5] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStreamEventOneOf5? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStreamEventOneOf5[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStreamEventOneOf5[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStreamEventOneOf5(
        event: RunStreamEventOneOf5EventEnum.fromJson(json[r'event'])!,
        data: RunObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStreamEventOneOf5> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf5>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf5.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStreamEventOneOf5> mapFromJson(dynamic json) {
    final map = <String, RunStreamEventOneOf5>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStreamEventOneOf5.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStreamEventOneOf5-objects as value to a dart map
  static Map<String, List<RunStreamEventOneOf5>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStreamEventOneOf5>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStreamEventOneOf5.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event',
    'data',
  };
}


class RunStreamEventOneOf5EventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStreamEventOneOf5EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodIncomplete = RunStreamEventOneOf5EventEnum._(r'thread.run.incomplete');

  /// List of all possible values in this [enum][RunStreamEventOneOf5EventEnum].
  static const values = <RunStreamEventOneOf5EventEnum>[
    threadPeriodRunPeriodIncomplete,
  ];

  static RunStreamEventOneOf5EventEnum? fromJson(dynamic value) => RunStreamEventOneOf5EventEnumTypeTransformer().decode(value);

  static List<RunStreamEventOneOf5EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf5EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf5EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStreamEventOneOf5EventEnum] to String,
/// and [decode] dynamic data back to [RunStreamEventOneOf5EventEnum].
class RunStreamEventOneOf5EventEnumTypeTransformer {
  factory RunStreamEventOneOf5EventEnumTypeTransformer() => _instance ??= const RunStreamEventOneOf5EventEnumTypeTransformer._();

  const RunStreamEventOneOf5EventEnumTypeTransformer._();

  String encode(RunStreamEventOneOf5EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStreamEventOneOf5EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStreamEventOneOf5EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.incomplete': return RunStreamEventOneOf5EventEnum.threadPeriodRunPeriodIncomplete;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStreamEventOneOf5EventEnumTypeTransformer] instance.
  static RunStreamEventOneOf5EventEnumTypeTransformer? _instance;
}



//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStreamEventOneOf6 {
  /// Returns a new [RunStreamEventOneOf6] instance.
  RunStreamEventOneOf6({
    required this.event,
    required this.data,
  });

  RunStreamEventOneOf6EventEnum event;

  RunObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStreamEventOneOf6 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStreamEventOneOf6[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStreamEventOneOf6] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStreamEventOneOf6? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStreamEventOneOf6[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStreamEventOneOf6[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStreamEventOneOf6(
        event: RunStreamEventOneOf6EventEnum.fromJson(json[r'event'])!,
        data: RunObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStreamEventOneOf6> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf6>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf6.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStreamEventOneOf6> mapFromJson(dynamic json) {
    final map = <String, RunStreamEventOneOf6>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStreamEventOneOf6.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStreamEventOneOf6-objects as value to a dart map
  static Map<String, List<RunStreamEventOneOf6>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStreamEventOneOf6>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStreamEventOneOf6.listFromJson(entry.value, growable: growable,);
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


class RunStreamEventOneOf6EventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStreamEventOneOf6EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodFailed = RunStreamEventOneOf6EventEnum._(r'thread.run.failed');

  /// List of all possible values in this [enum][RunStreamEventOneOf6EventEnum].
  static const values = <RunStreamEventOneOf6EventEnum>[
    threadPeriodRunPeriodFailed,
  ];

  static RunStreamEventOneOf6EventEnum? fromJson(dynamic value) => RunStreamEventOneOf6EventEnumTypeTransformer().decode(value);

  static List<RunStreamEventOneOf6EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf6EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf6EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStreamEventOneOf6EventEnum] to String,
/// and [decode] dynamic data back to [RunStreamEventOneOf6EventEnum].
class RunStreamEventOneOf6EventEnumTypeTransformer {
  factory RunStreamEventOneOf6EventEnumTypeTransformer() => _instance ??= const RunStreamEventOneOf6EventEnumTypeTransformer._();

  const RunStreamEventOneOf6EventEnumTypeTransformer._();

  String encode(RunStreamEventOneOf6EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStreamEventOneOf6EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStreamEventOneOf6EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.failed': return RunStreamEventOneOf6EventEnum.threadPeriodRunPeriodFailed;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStreamEventOneOf6EventEnumTypeTransformer] instance.
  static RunStreamEventOneOf6EventEnumTypeTransformer? _instance;
}



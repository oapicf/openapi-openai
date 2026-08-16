//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStreamEventOneOf4 {
  /// Returns a new [RunStreamEventOneOf4] instance.
  RunStreamEventOneOf4({
    required this.event,
    required this.data,
  });

  RunStreamEventOneOf4EventEnum event;

  RunObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStreamEventOneOf4 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStreamEventOneOf4[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStreamEventOneOf4] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStreamEventOneOf4? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStreamEventOneOf4[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStreamEventOneOf4[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStreamEventOneOf4(
        event: RunStreamEventOneOf4EventEnum.fromJson(json[r'event'])!,
        data: RunObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStreamEventOneOf4> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf4>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf4.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStreamEventOneOf4> mapFromJson(dynamic json) {
    final map = <String, RunStreamEventOneOf4>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStreamEventOneOf4.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStreamEventOneOf4-objects as value to a dart map
  static Map<String, List<RunStreamEventOneOf4>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStreamEventOneOf4>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStreamEventOneOf4.listFromJson(entry.value, growable: growable,);
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


class RunStreamEventOneOf4EventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStreamEventOneOf4EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodCompleted = RunStreamEventOneOf4EventEnum._(r'thread.run.completed');

  /// List of all possible values in this [enum][RunStreamEventOneOf4EventEnum].
  static const values = <RunStreamEventOneOf4EventEnum>[
    threadPeriodRunPeriodCompleted,
  ];

  static RunStreamEventOneOf4EventEnum? fromJson(dynamic value) => RunStreamEventOneOf4EventEnumTypeTransformer().decode(value);

  static List<RunStreamEventOneOf4EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf4EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf4EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStreamEventOneOf4EventEnum] to String,
/// and [decode] dynamic data back to [RunStreamEventOneOf4EventEnum].
class RunStreamEventOneOf4EventEnumTypeTransformer {
  factory RunStreamEventOneOf4EventEnumTypeTransformer() => _instance ??= const RunStreamEventOneOf4EventEnumTypeTransformer._();

  const RunStreamEventOneOf4EventEnumTypeTransformer._();

  String encode(RunStreamEventOneOf4EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStreamEventOneOf4EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStreamEventOneOf4EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.completed': return RunStreamEventOneOf4EventEnum.threadPeriodRunPeriodCompleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStreamEventOneOf4EventEnumTypeTransformer] instance.
  static RunStreamEventOneOf4EventEnumTypeTransformer? _instance;
}



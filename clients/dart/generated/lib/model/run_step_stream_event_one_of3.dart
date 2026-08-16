//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepStreamEventOneOf3 {
  /// Returns a new [RunStepStreamEventOneOf3] instance.
  RunStepStreamEventOneOf3({
    required this.event,
    required this.data,
  });

  RunStepStreamEventOneOf3EventEnum event;

  RunStepObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepStreamEventOneOf3 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStepStreamEventOneOf3[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStepStreamEventOneOf3] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepStreamEventOneOf3? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepStreamEventOneOf3[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepStreamEventOneOf3[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepStreamEventOneOf3(
        event: RunStepStreamEventOneOf3EventEnum.fromJson(json[r'event'])!,
        data: RunStepObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStepStreamEventOneOf3> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEventOneOf3>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEventOneOf3.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepStreamEventOneOf3> mapFromJson(dynamic json) {
    final map = <String, RunStepStreamEventOneOf3>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepStreamEventOneOf3.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepStreamEventOneOf3-objects as value to a dart map
  static Map<String, List<RunStepStreamEventOneOf3>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepStreamEventOneOf3>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepStreamEventOneOf3.listFromJson(entry.value, growable: growable,);
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


class RunStepStreamEventOneOf3EventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepStreamEventOneOf3EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodStepPeriodCompleted = RunStepStreamEventOneOf3EventEnum._(r'thread.run.step.completed');

  /// List of all possible values in this [enum][RunStepStreamEventOneOf3EventEnum].
  static const values = <RunStepStreamEventOneOf3EventEnum>[
    threadPeriodRunPeriodStepPeriodCompleted,
  ];

  static RunStepStreamEventOneOf3EventEnum? fromJson(dynamic value) => RunStepStreamEventOneOf3EventEnumTypeTransformer().decode(value);

  static List<RunStepStreamEventOneOf3EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEventOneOf3EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEventOneOf3EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepStreamEventOneOf3EventEnum] to String,
/// and [decode] dynamic data back to [RunStepStreamEventOneOf3EventEnum].
class RunStepStreamEventOneOf3EventEnumTypeTransformer {
  factory RunStepStreamEventOneOf3EventEnumTypeTransformer() => _instance ??= const RunStepStreamEventOneOf3EventEnumTypeTransformer._();

  const RunStepStreamEventOneOf3EventEnumTypeTransformer._();

  String encode(RunStepStreamEventOneOf3EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepStreamEventOneOf3EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepStreamEventOneOf3EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.step.completed': return RunStepStreamEventOneOf3EventEnum.threadPeriodRunPeriodStepPeriodCompleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepStreamEventOneOf3EventEnumTypeTransformer] instance.
  static RunStepStreamEventOneOf3EventEnumTypeTransformer? _instance;
}



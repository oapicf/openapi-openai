//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepStreamEventOneOf5 {
  /// Returns a new [RunStepStreamEventOneOf5] instance.
  RunStepStreamEventOneOf5({
    required this.event,
    required this.data,
  });

  RunStepStreamEventOneOf5EventEnum event;

  RunStepObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepStreamEventOneOf5 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStepStreamEventOneOf5[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStepStreamEventOneOf5] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepStreamEventOneOf5? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepStreamEventOneOf5[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepStreamEventOneOf5[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepStreamEventOneOf5(
        event: RunStepStreamEventOneOf5EventEnum.fromJson(json[r'event'])!,
        data: RunStepObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStepStreamEventOneOf5> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEventOneOf5>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEventOneOf5.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepStreamEventOneOf5> mapFromJson(dynamic json) {
    final map = <String, RunStepStreamEventOneOf5>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepStreamEventOneOf5.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepStreamEventOneOf5-objects as value to a dart map
  static Map<String, List<RunStepStreamEventOneOf5>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepStreamEventOneOf5>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepStreamEventOneOf5.listFromJson(entry.value, growable: growable,);
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


class RunStepStreamEventOneOf5EventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepStreamEventOneOf5EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodStepPeriodCancelled = RunStepStreamEventOneOf5EventEnum._(r'thread.run.step.cancelled');

  /// List of all possible values in this [enum][RunStepStreamEventOneOf5EventEnum].
  static const values = <RunStepStreamEventOneOf5EventEnum>[
    threadPeriodRunPeriodStepPeriodCancelled,
  ];

  static RunStepStreamEventOneOf5EventEnum? fromJson(dynamic value) => RunStepStreamEventOneOf5EventEnumTypeTransformer().decode(value);

  static List<RunStepStreamEventOneOf5EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEventOneOf5EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEventOneOf5EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepStreamEventOneOf5EventEnum] to String,
/// and [decode] dynamic data back to [RunStepStreamEventOneOf5EventEnum].
class RunStepStreamEventOneOf5EventEnumTypeTransformer {
  factory RunStepStreamEventOneOf5EventEnumTypeTransformer() => _instance ??= const RunStepStreamEventOneOf5EventEnumTypeTransformer._();

  const RunStepStreamEventOneOf5EventEnumTypeTransformer._();

  String encode(RunStepStreamEventOneOf5EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepStreamEventOneOf5EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepStreamEventOneOf5EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.step.cancelled': return RunStepStreamEventOneOf5EventEnum.threadPeriodRunPeriodStepPeriodCancelled;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepStreamEventOneOf5EventEnumTypeTransformer] instance.
  static RunStepStreamEventOneOf5EventEnumTypeTransformer? _instance;
}



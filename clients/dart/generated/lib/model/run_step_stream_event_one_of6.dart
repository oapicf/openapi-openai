//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepStreamEventOneOf6 {
  /// Returns a new [RunStepStreamEventOneOf6] instance.
  RunStepStreamEventOneOf6({
    required this.event,
    required this.data,
  });

  RunStepStreamEventOneOf6EventEnum event;

  RunStepObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepStreamEventOneOf6 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStepStreamEventOneOf6[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStepStreamEventOneOf6] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepStreamEventOneOf6? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepStreamEventOneOf6[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepStreamEventOneOf6[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepStreamEventOneOf6(
        event: RunStepStreamEventOneOf6EventEnum.fromJson(json[r'event'])!,
        data: RunStepObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStepStreamEventOneOf6> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEventOneOf6>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEventOneOf6.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepStreamEventOneOf6> mapFromJson(dynamic json) {
    final map = <String, RunStepStreamEventOneOf6>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepStreamEventOneOf6.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepStreamEventOneOf6-objects as value to a dart map
  static Map<String, List<RunStepStreamEventOneOf6>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepStreamEventOneOf6>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepStreamEventOneOf6.listFromJson(entry.value, growable: growable,);
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


class RunStepStreamEventOneOf6EventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepStreamEventOneOf6EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodStepPeriodExpired = RunStepStreamEventOneOf6EventEnum._(r'thread.run.step.expired');

  /// List of all possible values in this [enum][RunStepStreamEventOneOf6EventEnum].
  static const values = <RunStepStreamEventOneOf6EventEnum>[
    threadPeriodRunPeriodStepPeriodExpired,
  ];

  static RunStepStreamEventOneOf6EventEnum? fromJson(dynamic value) => RunStepStreamEventOneOf6EventEnumTypeTransformer().decode(value);

  static List<RunStepStreamEventOneOf6EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEventOneOf6EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEventOneOf6EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepStreamEventOneOf6EventEnum] to String,
/// and [decode] dynamic data back to [RunStepStreamEventOneOf6EventEnum].
class RunStepStreamEventOneOf6EventEnumTypeTransformer {
  factory RunStepStreamEventOneOf6EventEnumTypeTransformer() => _instance ??= const RunStepStreamEventOneOf6EventEnumTypeTransformer._();

  const RunStepStreamEventOneOf6EventEnumTypeTransformer._();

  String encode(RunStepStreamEventOneOf6EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepStreamEventOneOf6EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepStreamEventOneOf6EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.step.expired': return RunStepStreamEventOneOf6EventEnum.threadPeriodRunPeriodStepPeriodExpired;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepStreamEventOneOf6EventEnumTypeTransformer] instance.
  static RunStepStreamEventOneOf6EventEnumTypeTransformer? _instance;
}



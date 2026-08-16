//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepStreamEvent {
  /// Returns a new [RunStepStreamEvent] instance.
  RunStepStreamEvent({
    required this.event,
    required this.data,
  });

  RunStepStreamEventEventEnum event;

  RunStepObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepStreamEvent &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStepStreamEvent[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStepStreamEvent] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepStreamEvent? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepStreamEvent[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepStreamEvent[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepStreamEvent(
        event: RunStepStreamEventEventEnum.fromJson(json[r'event'])!,
        data: RunStepObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStepStreamEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepStreamEvent> mapFromJson(dynamic json) {
    final map = <String, RunStepStreamEvent>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepStreamEvent.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepStreamEvent-objects as value to a dart map
  static Map<String, List<RunStepStreamEvent>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepStreamEvent>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepStreamEvent.listFromJson(entry.value, growable: growable,);
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


class RunStepStreamEventEventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepStreamEventEventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodStepPeriodExpired = RunStepStreamEventEventEnum._(r'thread.run.step.expired');

  /// List of all possible values in this [enum][RunStepStreamEventEventEnum].
  static const values = <RunStepStreamEventEventEnum>[
    threadPeriodRunPeriodStepPeriodExpired,
  ];

  static RunStepStreamEventEventEnum? fromJson(dynamic value) => RunStepStreamEventEventEnumTypeTransformer().decode(value);

  static List<RunStepStreamEventEventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEventEventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEventEventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepStreamEventEventEnum] to String,
/// and [decode] dynamic data back to [RunStepStreamEventEventEnum].
class RunStepStreamEventEventEnumTypeTransformer {
  factory RunStepStreamEventEventEnumTypeTransformer() => _instance ??= const RunStepStreamEventEventEnumTypeTransformer._();

  const RunStepStreamEventEventEnumTypeTransformer._();

  String encode(RunStepStreamEventEventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepStreamEventEventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepStreamEventEventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.step.expired': return RunStepStreamEventEventEnum.threadPeriodRunPeriodStepPeriodExpired;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepStreamEventEventEnumTypeTransformer] instance.
  static RunStepStreamEventEventEnumTypeTransformer? _instance;
}



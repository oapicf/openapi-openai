//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepStreamEventOneOf {
  /// Returns a new [RunStepStreamEventOneOf] instance.
  RunStepStreamEventOneOf({
    required this.event,
    required this.data,
  });

  RunStepStreamEventOneOfEventEnum event;

  RunStepObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepStreamEventOneOf &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStepStreamEventOneOf[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStepStreamEventOneOf] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepStreamEventOneOf? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'event'), 'Required key "RunStepStreamEventOneOf[event]" is missing from JSON.');
        assert(json[r'event'] != null, 'Required key "RunStepStreamEventOneOf[event]" has a null value in JSON.');
        assert(json.containsKey(r'data'), 'Required key "RunStepStreamEventOneOf[data]" is missing from JSON.');
        assert(json[r'data'] != null, 'Required key "RunStepStreamEventOneOf[data]" has a null value in JSON.');
        return true;
      }());

      return RunStepStreamEventOneOf(
        event: RunStepStreamEventOneOfEventEnum.fromJson(json[r'event'])!,
        data: RunStepObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStepStreamEventOneOf> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEventOneOf>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEventOneOf.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepStreamEventOneOf> mapFromJson(dynamic json) {
    final map = <String, RunStepStreamEventOneOf>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepStreamEventOneOf.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepStreamEventOneOf-objects as value to a dart map
  static Map<String, List<RunStepStreamEventOneOf>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepStreamEventOneOf>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepStreamEventOneOf.listFromJson(entry.value, growable: growable,);
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


enum RunStepStreamEventOneOfEventEnum {
  threadPeriodRunPeriodStepPeriodCreated._(r'thread.run.step.created'),
  ;

  /// Instantiate a new enum with the provided value.
  const RunStepStreamEventOneOfEventEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RunStepStreamEventOneOfEventEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RunStepStreamEventOneOfEventEnum? fromJson(dynamic value) => RunStepStreamEventOneOfEventEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RunStepStreamEventOneOfEventEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RunStepStreamEventOneOfEventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepStreamEventOneOfEventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepStreamEventOneOfEventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepStreamEventOneOfEventEnum] to String,
/// and [decode] dynamic data back to [RunStepStreamEventOneOfEventEnum].
class RunStepStreamEventOneOfEventEnumTypeTransformer {
  factory RunStepStreamEventOneOfEventEnumTypeTransformer() => _instance ??= const RunStepStreamEventOneOfEventEnumTypeTransformer._();

  const RunStepStreamEventOneOfEventEnumTypeTransformer._();

  String encode(RunStepStreamEventOneOfEventEnum data) => data._value;

  /// Returns the instance of [RunStepStreamEventOneOfEventEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepStreamEventOneOfEventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RunStepStreamEventOneOfEventEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'thread.run.step.created': return RunStepStreamEventOneOfEventEnum.threadPeriodRunPeriodStepPeriodCreated;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RunStepStreamEventOneOfEventEnumTypeTransformer? _instance;
}



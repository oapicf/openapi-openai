//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaObject {
  /// Returns a new [RunStepDeltaObject] instance.
  RunStepDeltaObject({
    required this.id,
    required this.object,
    required this.delta,
  });

  /// The identifier of the run step, which can be referenced in API endpoints.
  String id;

  /// The object type, which is always `thread.run.step.delta`.
  RunStepDeltaObjectObjectEnum object;

  RunStepDeltaObjectDelta delta;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaObject &&
    other.id == id &&
    other.object == object &&
    other.delta == delta;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (delta.hashCode);

  @override
  String toString() => 'RunStepDeltaObject[id=$id, object=$object, delta=$delta]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'delta'] = this.delta;
    return json;
  }

  /// Returns a new [RunStepDeltaObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaObject(
        id: mapValueOfType<String>(json, r'id')!,
        object: RunStepDeltaObjectObjectEnum.fromJson(json[r'object'])!,
        delta: RunStepDeltaObjectDelta.fromJson(json[r'delta'])!,
      );
    }
    return null;
  }

  static List<RunStepDeltaObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaObject-objects as value to a dart map
  static Map<String, List<RunStepDeltaObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'delta',
  };
}

/// The object type, which is always `thread.run.step.delta`.
class RunStepDeltaObjectObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDeltaObjectObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodStepPeriodDelta = RunStepDeltaObjectObjectEnum._(r'thread.run.step.delta');

  /// List of all possible values in this [enum][RunStepDeltaObjectObjectEnum].
  static const values = <RunStepDeltaObjectObjectEnum>[
    threadPeriodRunPeriodStepPeriodDelta,
  ];

  static RunStepDeltaObjectObjectEnum? fromJson(dynamic value) => RunStepDeltaObjectObjectEnumTypeTransformer().decode(value);

  static List<RunStepDeltaObjectObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaObjectObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaObjectObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaObjectObjectEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaObjectObjectEnum].
class RunStepDeltaObjectObjectEnumTypeTransformer {
  factory RunStepDeltaObjectObjectEnumTypeTransformer() => _instance ??= const RunStepDeltaObjectObjectEnumTypeTransformer._();

  const RunStepDeltaObjectObjectEnumTypeTransformer._();

  String encode(RunStepDeltaObjectObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDeltaObjectObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaObjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.step.delta': return RunStepDeltaObjectObjectEnum.threadPeriodRunPeriodStepPeriodDelta;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDeltaObjectObjectEnumTypeTransformer] instance.
  static RunStepDeltaObjectObjectEnumTypeTransformer? _instance;
}



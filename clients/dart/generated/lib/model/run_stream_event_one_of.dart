//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStreamEventOneOf {
  /// Returns a new [RunStreamEventOneOf] instance.
  RunStreamEventOneOf({
    required this.event,
    required this.data,
  });

  RunStreamEventOneOfEventEnum event;

  RunObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStreamEventOneOf &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStreamEventOneOf[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStreamEventOneOf] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStreamEventOneOf? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStreamEventOneOf[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStreamEventOneOf[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStreamEventOneOf(
        event: RunStreamEventOneOfEventEnum.fromJson(json[r'event'])!,
        data: RunObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStreamEventOneOf> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStreamEventOneOf> mapFromJson(dynamic json) {
    final map = <String, RunStreamEventOneOf>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStreamEventOneOf.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStreamEventOneOf-objects as value to a dart map
  static Map<String, List<RunStreamEventOneOf>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStreamEventOneOf>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStreamEventOneOf.listFromJson(entry.value, growable: growable,);
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


class RunStreamEventOneOfEventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStreamEventOneOfEventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodCreated = RunStreamEventOneOfEventEnum._(r'thread.run.created');

  /// List of all possible values in this [enum][RunStreamEventOneOfEventEnum].
  static const values = <RunStreamEventOneOfEventEnum>[
    threadPeriodRunPeriodCreated,
  ];

  static RunStreamEventOneOfEventEnum? fromJson(dynamic value) => RunStreamEventOneOfEventEnumTypeTransformer().decode(value);

  static List<RunStreamEventOneOfEventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOfEventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOfEventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStreamEventOneOfEventEnum] to String,
/// and [decode] dynamic data back to [RunStreamEventOneOfEventEnum].
class RunStreamEventOneOfEventEnumTypeTransformer {
  factory RunStreamEventOneOfEventEnumTypeTransformer() => _instance ??= const RunStreamEventOneOfEventEnumTypeTransformer._();

  const RunStreamEventOneOfEventEnumTypeTransformer._();

  String encode(RunStreamEventOneOfEventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStreamEventOneOfEventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStreamEventOneOfEventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.created': return RunStreamEventOneOfEventEnum.threadPeriodRunPeriodCreated;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStreamEventOneOfEventEnumTypeTransformer] instance.
  static RunStreamEventOneOfEventEnumTypeTransformer? _instance;
}



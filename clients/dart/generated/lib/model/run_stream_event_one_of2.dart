//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStreamEventOneOf2 {
  /// Returns a new [RunStreamEventOneOf2] instance.
  RunStreamEventOneOf2({
    required this.event,
    required this.data,
  });

  RunStreamEventOneOf2EventEnum event;

  RunObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStreamEventOneOf2 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStreamEventOneOf2[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStreamEventOneOf2] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStreamEventOneOf2? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStreamEventOneOf2[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStreamEventOneOf2[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStreamEventOneOf2(
        event: RunStreamEventOneOf2EventEnum.fromJson(json[r'event'])!,
        data: RunObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStreamEventOneOf2> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf2>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf2.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStreamEventOneOf2> mapFromJson(dynamic json) {
    final map = <String, RunStreamEventOneOf2>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStreamEventOneOf2.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStreamEventOneOf2-objects as value to a dart map
  static Map<String, List<RunStreamEventOneOf2>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStreamEventOneOf2>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStreamEventOneOf2.listFromJson(entry.value, growable: growable,);
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


class RunStreamEventOneOf2EventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStreamEventOneOf2EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodInProgress = RunStreamEventOneOf2EventEnum._(r'thread.run.in_progress');

  /// List of all possible values in this [enum][RunStreamEventOneOf2EventEnum].
  static const values = <RunStreamEventOneOf2EventEnum>[
    threadPeriodRunPeriodInProgress,
  ];

  static RunStreamEventOneOf2EventEnum? fromJson(dynamic value) => RunStreamEventOneOf2EventEnumTypeTransformer().decode(value);

  static List<RunStreamEventOneOf2EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf2EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf2EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStreamEventOneOf2EventEnum] to String,
/// and [decode] dynamic data back to [RunStreamEventOneOf2EventEnum].
class RunStreamEventOneOf2EventEnumTypeTransformer {
  factory RunStreamEventOneOf2EventEnumTypeTransformer() => _instance ??= const RunStreamEventOneOf2EventEnumTypeTransformer._();

  const RunStreamEventOneOf2EventEnumTypeTransformer._();

  String encode(RunStreamEventOneOf2EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStreamEventOneOf2EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStreamEventOneOf2EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.in_progress': return RunStreamEventOneOf2EventEnum.threadPeriodRunPeriodInProgress;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStreamEventOneOf2EventEnumTypeTransformer] instance.
  static RunStreamEventOneOf2EventEnumTypeTransformer? _instance;
}



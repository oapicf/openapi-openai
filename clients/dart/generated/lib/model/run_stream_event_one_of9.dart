//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStreamEventOneOf9 {
  /// Returns a new [RunStreamEventOneOf9] instance.
  RunStreamEventOneOf9({
    required this.event,
    required this.data,
  });

  RunStreamEventOneOf9EventEnum event;

  RunObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStreamEventOneOf9 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'RunStreamEventOneOf9[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [RunStreamEventOneOf9] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStreamEventOneOf9? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStreamEventOneOf9[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStreamEventOneOf9[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStreamEventOneOf9(
        event: RunStreamEventOneOf9EventEnum.fromJson(json[r'event'])!,
        data: RunObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<RunStreamEventOneOf9> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf9>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf9.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStreamEventOneOf9> mapFromJson(dynamic json) {
    final map = <String, RunStreamEventOneOf9>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStreamEventOneOf9.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStreamEventOneOf9-objects as value to a dart map
  static Map<String, List<RunStreamEventOneOf9>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStreamEventOneOf9>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStreamEventOneOf9.listFromJson(entry.value, growable: growable,);
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


class RunStreamEventOneOf9EventEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStreamEventOneOf9EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodRunPeriodExpired = RunStreamEventOneOf9EventEnum._(r'thread.run.expired');

  /// List of all possible values in this [enum][RunStreamEventOneOf9EventEnum].
  static const values = <RunStreamEventOneOf9EventEnum>[
    threadPeriodRunPeriodExpired,
  ];

  static RunStreamEventOneOf9EventEnum? fromJson(dynamic value) => RunStreamEventOneOf9EventEnumTypeTransformer().decode(value);

  static List<RunStreamEventOneOf9EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStreamEventOneOf9EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStreamEventOneOf9EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStreamEventOneOf9EventEnum] to String,
/// and [decode] dynamic data back to [RunStreamEventOneOf9EventEnum].
class RunStreamEventOneOf9EventEnumTypeTransformer {
  factory RunStreamEventOneOf9EventEnumTypeTransformer() => _instance ??= const RunStreamEventOneOf9EventEnumTypeTransformer._();

  const RunStreamEventOneOf9EventEnumTypeTransformer._();

  String encode(RunStreamEventOneOf9EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStreamEventOneOf9EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStreamEventOneOf9EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.run.expired': return RunStreamEventOneOf9EventEnum.threadPeriodRunPeriodExpired;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStreamEventOneOf9EventEnumTypeTransformer] instance.
  static RunStreamEventOneOf9EventEnumTypeTransformer? _instance;
}



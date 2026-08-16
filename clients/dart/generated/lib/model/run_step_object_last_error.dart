//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepObjectLastError {
  /// Returns a new [RunStepObjectLastError] instance.
  RunStepObjectLastError({
    required this.code,
    required this.message,
  });

  /// One of `server_error` or `rate_limit_exceeded`.
  RunStepObjectLastErrorCodeEnum code;

  /// A human-readable description of the error.
  String message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepObjectLastError &&
    other.code == code &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'RunStepObjectLastError[code=$code, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'code'] = this.code;
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [RunStepObjectLastError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepObjectLastError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepObjectLastError[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepObjectLastError[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepObjectLastError(
        code: RunStepObjectLastErrorCodeEnum.fromJson(json[r'code'])!,
        message: mapValueOfType<String>(json, r'message')!,
      );
    }
    return null;
  }

  static List<RunStepObjectLastError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepObjectLastError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepObjectLastError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepObjectLastError> mapFromJson(dynamic json) {
    final map = <String, RunStepObjectLastError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepObjectLastError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepObjectLastError-objects as value to a dart map
  static Map<String, List<RunStepObjectLastError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepObjectLastError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepObjectLastError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'code',
    'message',
  };
}

/// One of `server_error` or `rate_limit_exceeded`.
class RunStepObjectLastErrorCodeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepObjectLastErrorCodeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const serverError = RunStepObjectLastErrorCodeEnum._(r'server_error');
  static const rateLimitExceeded = RunStepObjectLastErrorCodeEnum._(r'rate_limit_exceeded');

  /// List of all possible values in this [enum][RunStepObjectLastErrorCodeEnum].
  static const values = <RunStepObjectLastErrorCodeEnum>[
    serverError,
    rateLimitExceeded,
  ];

  static RunStepObjectLastErrorCodeEnum? fromJson(dynamic value) => RunStepObjectLastErrorCodeEnumTypeTransformer().decode(value);

  static List<RunStepObjectLastErrorCodeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepObjectLastErrorCodeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepObjectLastErrorCodeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepObjectLastErrorCodeEnum] to String,
/// and [decode] dynamic data back to [RunStepObjectLastErrorCodeEnum].
class RunStepObjectLastErrorCodeEnumTypeTransformer {
  factory RunStepObjectLastErrorCodeEnumTypeTransformer() => _instance ??= const RunStepObjectLastErrorCodeEnumTypeTransformer._();

  const RunStepObjectLastErrorCodeEnumTypeTransformer._();

  String encode(RunStepObjectLastErrorCodeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepObjectLastErrorCodeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepObjectLastErrorCodeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'server_error': return RunStepObjectLastErrorCodeEnum.serverError;
        case r'rate_limit_exceeded': return RunStepObjectLastErrorCodeEnum.rateLimitExceeded;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepObjectLastErrorCodeEnumTypeTransformer] instance.
  static RunStepObjectLastErrorCodeEnumTypeTransformer? _instance;
}



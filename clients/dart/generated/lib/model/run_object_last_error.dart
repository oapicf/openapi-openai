//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunObjectLastError {
  /// Returns a new [RunObjectLastError] instance.
  RunObjectLastError({
    required this.code,
    required this.message,
  });

  /// One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
  RunObjectLastErrorCodeEnum code;

  /// A human-readable description of the error.
  String message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunObjectLastError &&
    other.code == code &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'RunObjectLastError[code=$code, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'code'] = this.code;
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [RunObjectLastError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunObjectLastError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunObjectLastError[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunObjectLastError[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunObjectLastError(
        code: RunObjectLastErrorCodeEnum.fromJson(json[r'code'])!,
        message: mapValueOfType<String>(json, r'message')!,
      );
    }
    return null;
  }

  static List<RunObjectLastError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObjectLastError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObjectLastError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunObjectLastError> mapFromJson(dynamic json) {
    final map = <String, RunObjectLastError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunObjectLastError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunObjectLastError-objects as value to a dart map
  static Map<String, List<RunObjectLastError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunObjectLastError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunObjectLastError.listFromJson(entry.value, growable: growable,);
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

/// One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
class RunObjectLastErrorCodeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunObjectLastErrorCodeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const serverError = RunObjectLastErrorCodeEnum._(r'server_error');
  static const rateLimitExceeded = RunObjectLastErrorCodeEnum._(r'rate_limit_exceeded');
  static const invalidPrompt = RunObjectLastErrorCodeEnum._(r'invalid_prompt');

  /// List of all possible values in this [enum][RunObjectLastErrorCodeEnum].
  static const values = <RunObjectLastErrorCodeEnum>[
    serverError,
    rateLimitExceeded,
    invalidPrompt,
  ];

  static RunObjectLastErrorCodeEnum? fromJson(dynamic value) => RunObjectLastErrorCodeEnumTypeTransformer().decode(value);

  static List<RunObjectLastErrorCodeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObjectLastErrorCodeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObjectLastErrorCodeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunObjectLastErrorCodeEnum] to String,
/// and [decode] dynamic data back to [RunObjectLastErrorCodeEnum].
class RunObjectLastErrorCodeEnumTypeTransformer {
  factory RunObjectLastErrorCodeEnumTypeTransformer() => _instance ??= const RunObjectLastErrorCodeEnumTypeTransformer._();

  const RunObjectLastErrorCodeEnumTypeTransformer._();

  String encode(RunObjectLastErrorCodeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunObjectLastErrorCodeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunObjectLastErrorCodeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'server_error': return RunObjectLastErrorCodeEnum.serverError;
        case r'rate_limit_exceeded': return RunObjectLastErrorCodeEnum.rateLimitExceeded;
        case r'invalid_prompt': return RunObjectLastErrorCodeEnum.invalidPrompt;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunObjectLastErrorCodeEnumTypeTransformer] instance.
  static RunObjectLastErrorCodeEnumTypeTransformer? _instance;
}



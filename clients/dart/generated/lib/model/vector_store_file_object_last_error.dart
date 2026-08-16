//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VectorStoreFileObjectLastError {
  /// Returns a new [VectorStoreFileObjectLastError] instance.
  VectorStoreFileObjectLastError({
    required this.code,
    required this.message,
  });

  /// One of `server_error` or `rate_limit_exceeded`.
  VectorStoreFileObjectLastErrorCodeEnum code;

  /// A human-readable description of the error.
  String message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VectorStoreFileObjectLastError &&
    other.code == code &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'VectorStoreFileObjectLastError[code=$code, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'code'] = this.code;
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [VectorStoreFileObjectLastError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VectorStoreFileObjectLastError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "VectorStoreFileObjectLastError[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "VectorStoreFileObjectLastError[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return VectorStoreFileObjectLastError(
        code: VectorStoreFileObjectLastErrorCodeEnum.fromJson(json[r'code'])!,
        message: mapValueOfType<String>(json, r'message')!,
      );
    }
    return null;
  }

  static List<VectorStoreFileObjectLastError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreFileObjectLastError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreFileObjectLastError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VectorStoreFileObjectLastError> mapFromJson(dynamic json) {
    final map = <String, VectorStoreFileObjectLastError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VectorStoreFileObjectLastError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VectorStoreFileObjectLastError-objects as value to a dart map
  static Map<String, List<VectorStoreFileObjectLastError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VectorStoreFileObjectLastError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VectorStoreFileObjectLastError.listFromJson(entry.value, growable: growable,);
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
class VectorStoreFileObjectLastErrorCodeEnum {
  /// Instantiate a new enum with the provided [value].
  const VectorStoreFileObjectLastErrorCodeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const serverError = VectorStoreFileObjectLastErrorCodeEnum._(r'server_error');
  static const unsupportedFile = VectorStoreFileObjectLastErrorCodeEnum._(r'unsupported_file');
  static const invalidFile = VectorStoreFileObjectLastErrorCodeEnum._(r'invalid_file');

  /// List of all possible values in this [enum][VectorStoreFileObjectLastErrorCodeEnum].
  static const values = <VectorStoreFileObjectLastErrorCodeEnum>[
    serverError,
    unsupportedFile,
    invalidFile,
  ];

  static VectorStoreFileObjectLastErrorCodeEnum? fromJson(dynamic value) => VectorStoreFileObjectLastErrorCodeEnumTypeTransformer().decode(value);

  static List<VectorStoreFileObjectLastErrorCodeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreFileObjectLastErrorCodeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreFileObjectLastErrorCodeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VectorStoreFileObjectLastErrorCodeEnum] to String,
/// and [decode] dynamic data back to [VectorStoreFileObjectLastErrorCodeEnum].
class VectorStoreFileObjectLastErrorCodeEnumTypeTransformer {
  factory VectorStoreFileObjectLastErrorCodeEnumTypeTransformer() => _instance ??= const VectorStoreFileObjectLastErrorCodeEnumTypeTransformer._();

  const VectorStoreFileObjectLastErrorCodeEnumTypeTransformer._();

  String encode(VectorStoreFileObjectLastErrorCodeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a VectorStoreFileObjectLastErrorCodeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VectorStoreFileObjectLastErrorCodeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'server_error': return VectorStoreFileObjectLastErrorCodeEnum.serverError;
        case r'unsupported_file': return VectorStoreFileObjectLastErrorCodeEnum.unsupportedFile;
        case r'invalid_file': return VectorStoreFileObjectLastErrorCodeEnum.invalidFile;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [VectorStoreFileObjectLastErrorCodeEnumTypeTransformer] instance.
  static VectorStoreFileObjectLastErrorCodeEnumTypeTransformer? _instance;
}



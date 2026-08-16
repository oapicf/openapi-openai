//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ResponseFormatJsonObject {
  /// Returns a new [ResponseFormatJsonObject] instance.
  ResponseFormatJsonObject({
    required this.type,
  });

  /// The type of response format being defined: `json_object`
  ResponseFormatJsonObjectTypeEnum type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ResponseFormatJsonObject &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode);

  @override
  String toString() => 'ResponseFormatJsonObject[type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [ResponseFormatJsonObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ResponseFormatJsonObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ResponseFormatJsonObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ResponseFormatJsonObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ResponseFormatJsonObject(
        type: ResponseFormatJsonObjectTypeEnum.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<ResponseFormatJsonObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ResponseFormatJsonObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ResponseFormatJsonObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ResponseFormatJsonObject> mapFromJson(dynamic json) {
    final map = <String, ResponseFormatJsonObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ResponseFormatJsonObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ResponseFormatJsonObject-objects as value to a dart map
  static Map<String, List<ResponseFormatJsonObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ResponseFormatJsonObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ResponseFormatJsonObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// The type of response format being defined: `json_object`
class ResponseFormatJsonObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ResponseFormatJsonObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const jsonObject = ResponseFormatJsonObjectTypeEnum._(r'json_object');

  /// List of all possible values in this [enum][ResponseFormatJsonObjectTypeEnum].
  static const values = <ResponseFormatJsonObjectTypeEnum>[
    jsonObject,
  ];

  static ResponseFormatJsonObjectTypeEnum? fromJson(dynamic value) => ResponseFormatJsonObjectTypeEnumTypeTransformer().decode(value);

  static List<ResponseFormatJsonObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ResponseFormatJsonObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ResponseFormatJsonObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ResponseFormatJsonObjectTypeEnum] to String,
/// and [decode] dynamic data back to [ResponseFormatJsonObjectTypeEnum].
class ResponseFormatJsonObjectTypeEnumTypeTransformer {
  factory ResponseFormatJsonObjectTypeEnumTypeTransformer() => _instance ??= const ResponseFormatJsonObjectTypeEnumTypeTransformer._();

  const ResponseFormatJsonObjectTypeEnumTypeTransformer._();

  String encode(ResponseFormatJsonObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ResponseFormatJsonObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ResponseFormatJsonObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'json_object': return ResponseFormatJsonObjectTypeEnum.jsonObject;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ResponseFormatJsonObjectTypeEnumTypeTransformer] instance.
  static ResponseFormatJsonObjectTypeEnumTypeTransformer? _instance;
}



//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ResponseFormatText {
  /// Returns a new [ResponseFormatText] instance.
  ResponseFormatText({
    required this.type,
  });

  /// The type of response format being defined: `text`
  ResponseFormatTextTypeEnum type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ResponseFormatText &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode);

  @override
  String toString() => 'ResponseFormatText[type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [ResponseFormatText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ResponseFormatText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ResponseFormatText[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ResponseFormatText[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ResponseFormatText(
        type: ResponseFormatTextTypeEnum.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<ResponseFormatText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ResponseFormatText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ResponseFormatText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ResponseFormatText> mapFromJson(dynamic json) {
    final map = <String, ResponseFormatText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ResponseFormatText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ResponseFormatText-objects as value to a dart map
  static Map<String, List<ResponseFormatText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ResponseFormatText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ResponseFormatText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// The type of response format being defined: `text`
class ResponseFormatTextTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ResponseFormatTextTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = ResponseFormatTextTypeEnum._(r'text');

  /// List of all possible values in this [enum][ResponseFormatTextTypeEnum].
  static const values = <ResponseFormatTextTypeEnum>[
    text,
  ];

  static ResponseFormatTextTypeEnum? fromJson(dynamic value) => ResponseFormatTextTypeEnumTypeTransformer().decode(value);

  static List<ResponseFormatTextTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ResponseFormatTextTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ResponseFormatTextTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ResponseFormatTextTypeEnum] to String,
/// and [decode] dynamic data back to [ResponseFormatTextTypeEnum].
class ResponseFormatTextTypeEnumTypeTransformer {
  factory ResponseFormatTextTypeEnumTypeTransformer() => _instance ??= const ResponseFormatTextTypeEnumTypeTransformer._();

  const ResponseFormatTextTypeEnumTypeTransformer._();

  String encode(ResponseFormatTextTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ResponseFormatTextTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ResponseFormatTextTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return ResponseFormatTextTypeEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ResponseFormatTextTypeEnumTypeTransformer] instance.
  static ResponseFormatTextTypeEnumTypeTransformer? _instance;
}



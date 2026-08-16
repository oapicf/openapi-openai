//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ArrayOfContentPartsInner {
  /// Returns a new [ArrayOfContentPartsInner] instance.
  ArrayOfContentPartsInner({
    required this.type,
    required this.imageFile,
    required this.imageUrl,
    required this.text,
  });

  /// Always `image_file`.
  ArrayOfContentPartsInnerTypeEnum type;

  MessageContentImageFileObjectImageFile imageFile;

  MessageContentImageUrlObjectImageUrl imageUrl;

  /// Text content to be sent to the model
  String text;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ArrayOfContentPartsInner &&
    other.type == type &&
    other.imageFile == imageFile &&
    other.imageUrl == imageUrl &&
    other.text == text;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (imageFile.hashCode) +
    (imageUrl.hashCode) +
    (text.hashCode);

  @override
  String toString() => 'ArrayOfContentPartsInner[type=$type, imageFile=$imageFile, imageUrl=$imageUrl, text=$text]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'image_file'] = this.imageFile;
      json[r'image_url'] = this.imageUrl;
      json[r'text'] = this.text;
    return json;
  }

  /// Returns a new [ArrayOfContentPartsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ArrayOfContentPartsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ArrayOfContentPartsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ArrayOfContentPartsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ArrayOfContentPartsInner(
        type: ArrayOfContentPartsInnerTypeEnum.fromJson(json[r'type'])!,
        imageFile: MessageContentImageFileObjectImageFile.fromJson(json[r'image_file'])!,
        imageUrl: MessageContentImageUrlObjectImageUrl.fromJson(json[r'image_url'])!,
        text: mapValueOfType<String>(json, r'text')!,
      );
    }
    return null;
  }

  static List<ArrayOfContentPartsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ArrayOfContentPartsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ArrayOfContentPartsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ArrayOfContentPartsInner> mapFromJson(dynamic json) {
    final map = <String, ArrayOfContentPartsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ArrayOfContentPartsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ArrayOfContentPartsInner-objects as value to a dart map
  static Map<String, List<ArrayOfContentPartsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ArrayOfContentPartsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ArrayOfContentPartsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'image_file',
    'image_url',
    'text',
  };
}

/// Always `image_file`.
class ArrayOfContentPartsInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ArrayOfContentPartsInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageFile = ArrayOfContentPartsInnerTypeEnum._(r'image_file');
  static const imageUrl = ArrayOfContentPartsInnerTypeEnum._(r'image_url');
  static const text = ArrayOfContentPartsInnerTypeEnum._(r'text');

  /// List of all possible values in this [enum][ArrayOfContentPartsInnerTypeEnum].
  static const values = <ArrayOfContentPartsInnerTypeEnum>[
    imageFile,
    imageUrl,
    text,
  ];

  static ArrayOfContentPartsInnerTypeEnum? fromJson(dynamic value) => ArrayOfContentPartsInnerTypeEnumTypeTransformer().decode(value);

  static List<ArrayOfContentPartsInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ArrayOfContentPartsInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ArrayOfContentPartsInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ArrayOfContentPartsInnerTypeEnum] to String,
/// and [decode] dynamic data back to [ArrayOfContentPartsInnerTypeEnum].
class ArrayOfContentPartsInnerTypeEnumTypeTransformer {
  factory ArrayOfContentPartsInnerTypeEnumTypeTransformer() => _instance ??= const ArrayOfContentPartsInnerTypeEnumTypeTransformer._();

  const ArrayOfContentPartsInnerTypeEnumTypeTransformer._();

  String encode(ArrayOfContentPartsInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ArrayOfContentPartsInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ArrayOfContentPartsInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image_file': return ArrayOfContentPartsInnerTypeEnum.imageFile;
        case r'image_url': return ArrayOfContentPartsInnerTypeEnum.imageUrl;
        case r'text': return ArrayOfContentPartsInnerTypeEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ArrayOfContentPartsInnerTypeEnumTypeTransformer] instance.
  static ArrayOfContentPartsInnerTypeEnumTypeTransformer? _instance;
}



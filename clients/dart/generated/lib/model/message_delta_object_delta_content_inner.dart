//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaObjectDeltaContentInner {
  /// Returns a new [MessageDeltaObjectDeltaContentInner] instance.
  MessageDeltaObjectDeltaContentInner({
    required this.index,
    required this.type,
    this.imageFile,
    this.text,
    this.refusal,
    this.imageUrl,
  });

  /// The index of the content part in the message.
  int index;

  /// Always `image_file`.
  MessageDeltaObjectDeltaContentInnerTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MessageDeltaContentImageFileObjectImageFile? imageFile;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MessageDeltaContentTextObjectText? text;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? refusal;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MessageDeltaContentImageUrlObjectImageUrl? imageUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaObjectDeltaContentInner &&
    other.index == index &&
    other.type == type &&
    other.imageFile == imageFile &&
    other.text == text &&
    other.refusal == refusal &&
    other.imageUrl == imageUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (type.hashCode) +
    (imageFile == null ? 0 : imageFile!.hashCode) +
    (text == null ? 0 : text!.hashCode) +
    (refusal == null ? 0 : refusal!.hashCode) +
    (imageUrl == null ? 0 : imageUrl!.hashCode);

  @override
  String toString() => 'MessageDeltaObjectDeltaContentInner[index=$index, type=$type, imageFile=$imageFile, text=$text, refusal=$refusal, imageUrl=$imageUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
      json[r'type'] = this.type;
    if (this.imageFile != null) {
      json[r'image_file'] = this.imageFile;
    } else {
      json[r'image_file'] = null;
    }
    if (this.text != null) {
      json[r'text'] = this.text;
    } else {
      json[r'text'] = null;
    }
    if (this.refusal != null) {
      json[r'refusal'] = this.refusal;
    } else {
      json[r'refusal'] = null;
    }
    if (this.imageUrl != null) {
      json[r'image_url'] = this.imageUrl;
    } else {
      json[r'image_url'] = null;
    }
    return json;
  }

  /// Returns a new [MessageDeltaObjectDeltaContentInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaObjectDeltaContentInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaObjectDeltaContentInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaObjectDeltaContentInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaObjectDeltaContentInner(
        index: mapValueOfType<int>(json, r'index')!,
        type: MessageDeltaObjectDeltaContentInnerTypeEnum.fromJson(json[r'type'])!,
        imageFile: MessageDeltaContentImageFileObjectImageFile.fromJson(json[r'image_file']),
        text: MessageDeltaContentTextObjectText.fromJson(json[r'text']),
        refusal: mapValueOfType<String>(json, r'refusal'),
        imageUrl: MessageDeltaContentImageUrlObjectImageUrl.fromJson(json[r'image_url']),
      );
    }
    return null;
  }

  static List<MessageDeltaObjectDeltaContentInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaObjectDeltaContentInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaObjectDeltaContentInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaObjectDeltaContentInner> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaObjectDeltaContentInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaObjectDeltaContentInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaObjectDeltaContentInner-objects as value to a dart map
  static Map<String, List<MessageDeltaObjectDeltaContentInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaObjectDeltaContentInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaObjectDeltaContentInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'index',
    'type',
  };
}

/// Always `image_file`.
class MessageDeltaObjectDeltaContentInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaObjectDeltaContentInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageFile = MessageDeltaObjectDeltaContentInnerTypeEnum._(r'image_file');
  static const text = MessageDeltaObjectDeltaContentInnerTypeEnum._(r'text');
  static const refusal = MessageDeltaObjectDeltaContentInnerTypeEnum._(r'refusal');
  static const imageUrl = MessageDeltaObjectDeltaContentInnerTypeEnum._(r'image_url');

  /// List of all possible values in this [enum][MessageDeltaObjectDeltaContentInnerTypeEnum].
  static const values = <MessageDeltaObjectDeltaContentInnerTypeEnum>[
    imageFile,
    text,
    refusal,
    imageUrl,
  ];

  static MessageDeltaObjectDeltaContentInnerTypeEnum? fromJson(dynamic value) => MessageDeltaObjectDeltaContentInnerTypeEnumTypeTransformer().decode(value);

  static List<MessageDeltaObjectDeltaContentInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaObjectDeltaContentInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaObjectDeltaContentInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaObjectDeltaContentInnerTypeEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaObjectDeltaContentInnerTypeEnum].
class MessageDeltaObjectDeltaContentInnerTypeEnumTypeTransformer {
  factory MessageDeltaObjectDeltaContentInnerTypeEnumTypeTransformer() => _instance ??= const MessageDeltaObjectDeltaContentInnerTypeEnumTypeTransformer._();

  const MessageDeltaObjectDeltaContentInnerTypeEnumTypeTransformer._();

  String encode(MessageDeltaObjectDeltaContentInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaObjectDeltaContentInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaObjectDeltaContentInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image_file': return MessageDeltaObjectDeltaContentInnerTypeEnum.imageFile;
        case r'text': return MessageDeltaObjectDeltaContentInnerTypeEnum.text;
        case r'refusal': return MessageDeltaObjectDeltaContentInnerTypeEnum.refusal;
        case r'image_url': return MessageDeltaObjectDeltaContentInnerTypeEnum.imageUrl;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaObjectDeltaContentInnerTypeEnumTypeTransformer] instance.
  static MessageDeltaObjectDeltaContentInnerTypeEnumTypeTransformer? _instance;
}



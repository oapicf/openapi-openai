//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageObjectContentInner {
  /// Returns a new [MessageObjectContentInner] instance.
  MessageObjectContentInner({
    required this.type,
    required this.imageFile,
    required this.imageUrl,
    required this.text,
    required this.refusal,
  });

  /// Always `image_file`.
  MessageObjectContentInnerTypeEnum type;

  MessageContentImageFileObjectImageFile imageFile;

  MessageContentImageUrlObjectImageUrl imageUrl;

  MessageContentTextObjectText text;

  String refusal;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageObjectContentInner &&
    other.type == type &&
    other.imageFile == imageFile &&
    other.imageUrl == imageUrl &&
    other.text == text &&
    other.refusal == refusal;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (imageFile.hashCode) +
    (imageUrl.hashCode) +
    (text.hashCode) +
    (refusal.hashCode);

  @override
  String toString() => 'MessageObjectContentInner[type=$type, imageFile=$imageFile, imageUrl=$imageUrl, text=$text, refusal=$refusal]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'image_file'] = this.imageFile;
      json[r'image_url'] = this.imageUrl;
      json[r'text'] = this.text;
      json[r'refusal'] = this.refusal;
    return json;
  }

  /// Returns a new [MessageObjectContentInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageObjectContentInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageObjectContentInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageObjectContentInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageObjectContentInner(
        type: MessageObjectContentInnerTypeEnum.fromJson(json[r'type'])!,
        imageFile: MessageContentImageFileObjectImageFile.fromJson(json[r'image_file'])!,
        imageUrl: MessageContentImageUrlObjectImageUrl.fromJson(json[r'image_url'])!,
        text: MessageContentTextObjectText.fromJson(json[r'text'])!,
        refusal: mapValueOfType<String>(json, r'refusal')!,
      );
    }
    return null;
  }

  static List<MessageObjectContentInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageObjectContentInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageObjectContentInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageObjectContentInner> mapFromJson(dynamic json) {
    final map = <String, MessageObjectContentInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageObjectContentInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageObjectContentInner-objects as value to a dart map
  static Map<String, List<MessageObjectContentInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageObjectContentInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageObjectContentInner.listFromJson(entry.value, growable: growable,);
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
    'refusal',
  };
}

/// Always `image_file`.
class MessageObjectContentInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageObjectContentInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageFile = MessageObjectContentInnerTypeEnum._(r'image_file');
  static const imageUrl = MessageObjectContentInnerTypeEnum._(r'image_url');
  static const text = MessageObjectContentInnerTypeEnum._(r'text');
  static const refusal = MessageObjectContentInnerTypeEnum._(r'refusal');

  /// List of all possible values in this [enum][MessageObjectContentInnerTypeEnum].
  static const values = <MessageObjectContentInnerTypeEnum>[
    imageFile,
    imageUrl,
    text,
    refusal,
  ];

  static MessageObjectContentInnerTypeEnum? fromJson(dynamic value) => MessageObjectContentInnerTypeEnumTypeTransformer().decode(value);

  static List<MessageObjectContentInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageObjectContentInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageObjectContentInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageObjectContentInnerTypeEnum] to String,
/// and [decode] dynamic data back to [MessageObjectContentInnerTypeEnum].
class MessageObjectContentInnerTypeEnumTypeTransformer {
  factory MessageObjectContentInnerTypeEnumTypeTransformer() => _instance ??= const MessageObjectContentInnerTypeEnumTypeTransformer._();

  const MessageObjectContentInnerTypeEnumTypeTransformer._();

  String encode(MessageObjectContentInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageObjectContentInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageObjectContentInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image_file': return MessageObjectContentInnerTypeEnum.imageFile;
        case r'image_url': return MessageObjectContentInnerTypeEnum.imageUrl;
        case r'text': return MessageObjectContentInnerTypeEnum.text;
        case r'refusal': return MessageObjectContentInnerTypeEnum.refusal;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageObjectContentInnerTypeEnumTypeTransformer] instance.
  static MessageObjectContentInnerTypeEnumTypeTransformer? _instance;
}



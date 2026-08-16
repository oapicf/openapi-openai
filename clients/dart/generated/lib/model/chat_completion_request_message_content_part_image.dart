//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionRequestMessageContentPartImage {
  /// Returns a new [ChatCompletionRequestMessageContentPartImage] instance.
  ChatCompletionRequestMessageContentPartImage({
    required this.type,
    required this.imageUrl,
  });

  /// The type of the content part.
  ChatCompletionRequestMessageContentPartImageTypeEnum type;

  ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionRequestMessageContentPartImage &&
    other.type == type &&
    other.imageUrl == imageUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (imageUrl.hashCode);

  @override
  String toString() => 'ChatCompletionRequestMessageContentPartImage[type=$type, imageUrl=$imageUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'image_url'] = this.imageUrl;
    return json;
  }

  /// Returns a new [ChatCompletionRequestMessageContentPartImage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionRequestMessageContentPartImage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionRequestMessageContentPartImage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionRequestMessageContentPartImage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionRequestMessageContentPartImage(
        type: ChatCompletionRequestMessageContentPartImageTypeEnum.fromJson(json[r'type'])!,
        imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl.fromJson(json[r'image_url'])!,
      );
    }
    return null;
  }

  static List<ChatCompletionRequestMessageContentPartImage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestMessageContentPartImage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestMessageContentPartImage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionRequestMessageContentPartImage> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionRequestMessageContentPartImage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionRequestMessageContentPartImage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionRequestMessageContentPartImage-objects as value to a dart map
  static Map<String, List<ChatCompletionRequestMessageContentPartImage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionRequestMessageContentPartImage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionRequestMessageContentPartImage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'image_url',
  };
}

/// The type of the content part.
class ChatCompletionRequestMessageContentPartImageTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionRequestMessageContentPartImageTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageUrl = ChatCompletionRequestMessageContentPartImageTypeEnum._(r'image_url');

  /// List of all possible values in this [enum][ChatCompletionRequestMessageContentPartImageTypeEnum].
  static const values = <ChatCompletionRequestMessageContentPartImageTypeEnum>[
    imageUrl,
  ];

  static ChatCompletionRequestMessageContentPartImageTypeEnum? fromJson(dynamic value) => ChatCompletionRequestMessageContentPartImageTypeEnumTypeTransformer().decode(value);

  static List<ChatCompletionRequestMessageContentPartImageTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestMessageContentPartImageTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestMessageContentPartImageTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRequestMessageContentPartImageTypeEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionRequestMessageContentPartImageTypeEnum].
class ChatCompletionRequestMessageContentPartImageTypeEnumTypeTransformer {
  factory ChatCompletionRequestMessageContentPartImageTypeEnumTypeTransformer() => _instance ??= const ChatCompletionRequestMessageContentPartImageTypeEnumTypeTransformer._();

  const ChatCompletionRequestMessageContentPartImageTypeEnumTypeTransformer._();

  String encode(ChatCompletionRequestMessageContentPartImageTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionRequestMessageContentPartImageTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRequestMessageContentPartImageTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image_url': return ChatCompletionRequestMessageContentPartImageTypeEnum.imageUrl;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionRequestMessageContentPartImageTypeEnumTypeTransformer] instance.
  static ChatCompletionRequestMessageContentPartImageTypeEnumTypeTransformer? _instance;
}



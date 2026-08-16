//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionRequestUserMessageContentPart {
  /// Returns a new [ChatCompletionRequestUserMessageContentPart] instance.
  ChatCompletionRequestUserMessageContentPart({
    required this.type,
    required this.text,
    required this.imageUrl,
    required this.inputAudio,
  });

  /// The type of the content part.
  ChatCompletionRequestUserMessageContentPartTypeEnum type;

  /// The text content.
  String text;

  ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

  ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionRequestUserMessageContentPart &&
    other.type == type &&
    other.text == text &&
    other.imageUrl == imageUrl &&
    other.inputAudio == inputAudio;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (text.hashCode) +
    (imageUrl.hashCode) +
    (inputAudio.hashCode);

  @override
  String toString() => 'ChatCompletionRequestUserMessageContentPart[type=$type, text=$text, imageUrl=$imageUrl, inputAudio=$inputAudio]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'text'] = this.text;
      json[r'image_url'] = this.imageUrl;
      json[r'input_audio'] = this.inputAudio;
    return json;
  }

  /// Returns a new [ChatCompletionRequestUserMessageContentPart] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionRequestUserMessageContentPart? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionRequestUserMessageContentPart[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionRequestUserMessageContentPart[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionRequestUserMessageContentPart(
        type: ChatCompletionRequestUserMessageContentPartTypeEnum.fromJson(json[r'type'])!,
        text: mapValueOfType<String>(json, r'text')!,
        imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl.fromJson(json[r'image_url'])!,
        inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio.fromJson(json[r'input_audio'])!,
      );
    }
    return null;
  }

  static List<ChatCompletionRequestUserMessageContentPart> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestUserMessageContentPart>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestUserMessageContentPart.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionRequestUserMessageContentPart> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionRequestUserMessageContentPart>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionRequestUserMessageContentPart.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionRequestUserMessageContentPart-objects as value to a dart map
  static Map<String, List<ChatCompletionRequestUserMessageContentPart>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionRequestUserMessageContentPart>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionRequestUserMessageContentPart.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'text',
    'image_url',
    'input_audio',
  };
}

/// The type of the content part.
class ChatCompletionRequestUserMessageContentPartTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionRequestUserMessageContentPartTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = ChatCompletionRequestUserMessageContentPartTypeEnum._(r'text');
  static const imageUrl = ChatCompletionRequestUserMessageContentPartTypeEnum._(r'image_url');
  static const inputAudio = ChatCompletionRequestUserMessageContentPartTypeEnum._(r'input_audio');

  /// List of all possible values in this [enum][ChatCompletionRequestUserMessageContentPartTypeEnum].
  static const values = <ChatCompletionRequestUserMessageContentPartTypeEnum>[
    text,
    imageUrl,
    inputAudio,
  ];

  static ChatCompletionRequestUserMessageContentPartTypeEnum? fromJson(dynamic value) => ChatCompletionRequestUserMessageContentPartTypeEnumTypeTransformer().decode(value);

  static List<ChatCompletionRequestUserMessageContentPartTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestUserMessageContentPartTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestUserMessageContentPartTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRequestUserMessageContentPartTypeEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionRequestUserMessageContentPartTypeEnum].
class ChatCompletionRequestUserMessageContentPartTypeEnumTypeTransformer {
  factory ChatCompletionRequestUserMessageContentPartTypeEnumTypeTransformer() => _instance ??= const ChatCompletionRequestUserMessageContentPartTypeEnumTypeTransformer._();

  const ChatCompletionRequestUserMessageContentPartTypeEnumTypeTransformer._();

  String encode(ChatCompletionRequestUserMessageContentPartTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionRequestUserMessageContentPartTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRequestUserMessageContentPartTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return ChatCompletionRequestUserMessageContentPartTypeEnum.text;
        case r'image_url': return ChatCompletionRequestUserMessageContentPartTypeEnum.imageUrl;
        case r'input_audio': return ChatCompletionRequestUserMessageContentPartTypeEnum.inputAudio;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionRequestUserMessageContentPartTypeEnumTypeTransformer] instance.
  static ChatCompletionRequestUserMessageContentPartTypeEnumTypeTransformer? _instance;
}



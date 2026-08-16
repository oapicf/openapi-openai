//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionRequestMessageContentPartAudio {
  /// Returns a new [ChatCompletionRequestMessageContentPartAudio] instance.
  ChatCompletionRequestMessageContentPartAudio({
    required this.type,
    required this.inputAudio,
  });

  /// The type of the content part. Always `input_audio`.
  ChatCompletionRequestMessageContentPartAudioTypeEnum type;

  ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionRequestMessageContentPartAudio &&
    other.type == type &&
    other.inputAudio == inputAudio;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (inputAudio.hashCode);

  @override
  String toString() => 'ChatCompletionRequestMessageContentPartAudio[type=$type, inputAudio=$inputAudio]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'input_audio'] = this.inputAudio;
    return json;
  }

  /// Returns a new [ChatCompletionRequestMessageContentPartAudio] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionRequestMessageContentPartAudio? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionRequestMessageContentPartAudio[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionRequestMessageContentPartAudio[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionRequestMessageContentPartAudio(
        type: ChatCompletionRequestMessageContentPartAudioTypeEnum.fromJson(json[r'type'])!,
        inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio.fromJson(json[r'input_audio'])!,
      );
    }
    return null;
  }

  static List<ChatCompletionRequestMessageContentPartAudio> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestMessageContentPartAudio>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestMessageContentPartAudio.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionRequestMessageContentPartAudio> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionRequestMessageContentPartAudio>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionRequestMessageContentPartAudio.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionRequestMessageContentPartAudio-objects as value to a dart map
  static Map<String, List<ChatCompletionRequestMessageContentPartAudio>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionRequestMessageContentPartAudio>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionRequestMessageContentPartAudio.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'input_audio',
  };
}

/// The type of the content part. Always `input_audio`.
class ChatCompletionRequestMessageContentPartAudioTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionRequestMessageContentPartAudioTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const inputAudio = ChatCompletionRequestMessageContentPartAudioTypeEnum._(r'input_audio');

  /// List of all possible values in this [enum][ChatCompletionRequestMessageContentPartAudioTypeEnum].
  static const values = <ChatCompletionRequestMessageContentPartAudioTypeEnum>[
    inputAudio,
  ];

  static ChatCompletionRequestMessageContentPartAudioTypeEnum? fromJson(dynamic value) => ChatCompletionRequestMessageContentPartAudioTypeEnumTypeTransformer().decode(value);

  static List<ChatCompletionRequestMessageContentPartAudioTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestMessageContentPartAudioTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestMessageContentPartAudioTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRequestMessageContentPartAudioTypeEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionRequestMessageContentPartAudioTypeEnum].
class ChatCompletionRequestMessageContentPartAudioTypeEnumTypeTransformer {
  factory ChatCompletionRequestMessageContentPartAudioTypeEnumTypeTransformer() => _instance ??= const ChatCompletionRequestMessageContentPartAudioTypeEnumTypeTransformer._();

  const ChatCompletionRequestMessageContentPartAudioTypeEnumTypeTransformer._();

  String encode(ChatCompletionRequestMessageContentPartAudioTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionRequestMessageContentPartAudioTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRequestMessageContentPartAudioTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'input_audio': return ChatCompletionRequestMessageContentPartAudioTypeEnum.inputAudio;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionRequestMessageContentPartAudioTypeEnumTypeTransformer] instance.
  static ChatCompletionRequestMessageContentPartAudioTypeEnumTypeTransformer? _instance;
}



//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionRequestMessageContentPartAudioInputAudio {
  /// Returns a new [ChatCompletionRequestMessageContentPartAudioInputAudio] instance.
  ChatCompletionRequestMessageContentPartAudioInputAudio({
    required this.data,
    required this.format,
  });

  /// Base64 encoded audio data.
  String data;

  /// The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
  ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum format;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionRequestMessageContentPartAudioInputAudio &&
    other.data == data &&
    other.format == format;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data.hashCode) +
    (format.hashCode);

  @override
  String toString() => 'ChatCompletionRequestMessageContentPartAudioInputAudio[data=$data, format=$format]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'data'] = this.data;
      json[r'format'] = this.format;
    return json;
  }

  /// Returns a new [ChatCompletionRequestMessageContentPartAudioInputAudio] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionRequestMessageContentPartAudioInputAudio? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionRequestMessageContentPartAudioInputAudio[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionRequestMessageContentPartAudioInputAudio[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionRequestMessageContentPartAudioInputAudio(
        data: mapValueOfType<String>(json, r'data')!,
        format: ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum.fromJson(json[r'format'])!,
      );
    }
    return null;
  }

  static List<ChatCompletionRequestMessageContentPartAudioInputAudio> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestMessageContentPartAudioInputAudio>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestMessageContentPartAudioInputAudio.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionRequestMessageContentPartAudioInputAudio> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionRequestMessageContentPartAudioInputAudio>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionRequestMessageContentPartAudioInputAudio.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionRequestMessageContentPartAudioInputAudio-objects as value to a dart map
  static Map<String, List<ChatCompletionRequestMessageContentPartAudioInputAudio>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionRequestMessageContentPartAudioInputAudio>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionRequestMessageContentPartAudioInputAudio.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'data',
    'format',
  };
}

/// The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
class ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const wav = ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum._(r'wav');
  static const mp3 = ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum._(r'mp3');

  /// List of all possible values in this [enum][ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum].
  static const values = <ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum>[
    wav,
    mp3,
  ];

  static ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum? fromJson(dynamic value) => ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnumTypeTransformer().decode(value);

  static List<ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum].
class ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnumTypeTransformer {
  factory ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnumTypeTransformer() => _instance ??= const ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnumTypeTransformer._();

  const ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnumTypeTransformer._();

  String encode(ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'wav': return ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum.wav;
        case r'mp3': return ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum.mp3;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnumTypeTransformer] instance.
  static ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnumTypeTransformer? _instance;
}



//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionRequestMessageContentPartImageImageUrl {
  /// Returns a new [ChatCompletionRequestMessageContentPartImageImageUrl] instance.
  ChatCompletionRequestMessageContentPartImageImageUrl({
    required this.url,
    this.detail = const ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum._('auto'),
  });

  /// Either a URL of the image or the base64 encoded image data.
  String url;

  /// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
  ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum detail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionRequestMessageContentPartImageImageUrl &&
    other.url == url &&
    other.detail == detail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (url.hashCode) +
    (detail.hashCode);

  @override
  String toString() => 'ChatCompletionRequestMessageContentPartImageImageUrl[url=$url, detail=$detail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'url'] = this.url;
      json[r'detail'] = this.detail;
    return json;
  }

  /// Returns a new [ChatCompletionRequestMessageContentPartImageImageUrl] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionRequestMessageContentPartImageImageUrl? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionRequestMessageContentPartImageImageUrl[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionRequestMessageContentPartImageImageUrl[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionRequestMessageContentPartImageImageUrl(
        url: mapValueOfType<String>(json, r'url')!,
        detail: ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum.fromJson(json[r'detail']) ?? 'auto',
      );
    }
    return null;
  }

  static List<ChatCompletionRequestMessageContentPartImageImageUrl> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestMessageContentPartImageImageUrl>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestMessageContentPartImageImageUrl.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionRequestMessageContentPartImageImageUrl> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionRequestMessageContentPartImageImageUrl>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionRequestMessageContentPartImageImageUrl.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionRequestMessageContentPartImageImageUrl-objects as value to a dart map
  static Map<String, List<ChatCompletionRequestMessageContentPartImageImageUrl>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionRequestMessageContentPartImageImageUrl>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionRequestMessageContentPartImageImageUrl.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'url',
  };
}

/// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
class ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum._(r'auto');
  static const low = ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum._(r'low');
  static const high = ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum._(r'high');

  /// List of all possible values in this [enum][ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum].
  static const values = <ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum>[
    auto,
    low,
    high,
  ];

  static ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum? fromJson(dynamic value) => ChatCompletionRequestMessageContentPartImageImageUrlDetailEnumTypeTransformer().decode(value);

  static List<ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum].
class ChatCompletionRequestMessageContentPartImageImageUrlDetailEnumTypeTransformer {
  factory ChatCompletionRequestMessageContentPartImageImageUrlDetailEnumTypeTransformer() => _instance ??= const ChatCompletionRequestMessageContentPartImageImageUrlDetailEnumTypeTransformer._();

  const ChatCompletionRequestMessageContentPartImageImageUrlDetailEnumTypeTransformer._();

  String encode(ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum.auto;
        case r'low': return ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum.low;
        case r'high': return ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum.high;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionRequestMessageContentPartImageImageUrlDetailEnumTypeTransformer] instance.
  static ChatCompletionRequestMessageContentPartImageImageUrlDetailEnumTypeTransformer? _instance;
}



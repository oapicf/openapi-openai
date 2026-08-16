//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionRequestUserMessage {
  /// Returns a new [ChatCompletionRequestUserMessage] instance.
  ChatCompletionRequestUserMessage({
    required this.content,
    required this.role,
    this.name,
  });

  ChatCompletionRequestUserMessageContent content;

  /// The role of the messages author, in this case `user`.
  ChatCompletionRequestUserMessageRoleEnum role;

  /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionRequestUserMessage &&
    other.content == content &&
    other.role == role &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (content.hashCode) +
    (role.hashCode) +
    (name == null ? 0 : name!.hashCode);

  @override
  String toString() => 'ChatCompletionRequestUserMessage[content=$content, role=$role, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'content'] = this.content;
      json[r'role'] = this.role;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    return json;
  }

  /// Returns a new [ChatCompletionRequestUserMessage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionRequestUserMessage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionRequestUserMessage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionRequestUserMessage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionRequestUserMessage(
        content: ChatCompletionRequestUserMessageContent.fromJson(json[r'content'])!,
        role: ChatCompletionRequestUserMessageRoleEnum.fromJson(json[r'role'])!,
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<ChatCompletionRequestUserMessage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestUserMessage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestUserMessage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionRequestUserMessage> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionRequestUserMessage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionRequestUserMessage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionRequestUserMessage-objects as value to a dart map
  static Map<String, List<ChatCompletionRequestUserMessage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionRequestUserMessage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionRequestUserMessage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'content',
    'role',
  };
}

/// The role of the messages author, in this case `user`.
class ChatCompletionRequestUserMessageRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionRequestUserMessageRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const user = ChatCompletionRequestUserMessageRoleEnum._(r'user');

  /// List of all possible values in this [enum][ChatCompletionRequestUserMessageRoleEnum].
  static const values = <ChatCompletionRequestUserMessageRoleEnum>[
    user,
  ];

  static ChatCompletionRequestUserMessageRoleEnum? fromJson(dynamic value) => ChatCompletionRequestUserMessageRoleEnumTypeTransformer().decode(value);

  static List<ChatCompletionRequestUserMessageRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestUserMessageRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestUserMessageRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRequestUserMessageRoleEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionRequestUserMessageRoleEnum].
class ChatCompletionRequestUserMessageRoleEnumTypeTransformer {
  factory ChatCompletionRequestUserMessageRoleEnumTypeTransformer() => _instance ??= const ChatCompletionRequestUserMessageRoleEnumTypeTransformer._();

  const ChatCompletionRequestUserMessageRoleEnumTypeTransformer._();

  String encode(ChatCompletionRequestUserMessageRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionRequestUserMessageRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRequestUserMessageRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'user': return ChatCompletionRequestUserMessageRoleEnum.user;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionRequestUserMessageRoleEnumTypeTransformer] instance.
  static ChatCompletionRequestUserMessageRoleEnumTypeTransformer? _instance;
}



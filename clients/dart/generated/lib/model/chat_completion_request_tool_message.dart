//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionRequestToolMessage {
  /// Returns a new [ChatCompletionRequestToolMessage] instance.
  ChatCompletionRequestToolMessage({
    required this.role,
    required this.content,
    required this.toolCallId,
  });

  /// The role of the messages author, in this case `tool`.
  ChatCompletionRequestToolMessageRoleEnum role;

  ChatCompletionRequestToolMessageContent content;

  /// Tool call that this message is responding to.
  String toolCallId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionRequestToolMessage &&
    other.role == role &&
    other.content == content &&
    other.toolCallId == toolCallId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (role.hashCode) +
    (content.hashCode) +
    (toolCallId.hashCode);

  @override
  String toString() => 'ChatCompletionRequestToolMessage[role=$role, content=$content, toolCallId=$toolCallId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'role'] = this.role;
      json[r'content'] = this.content;
      json[r'tool_call_id'] = this.toolCallId;
    return json;
  }

  /// Returns a new [ChatCompletionRequestToolMessage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionRequestToolMessage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'role'), 'Required key "ChatCompletionRequestToolMessage[role]" is missing from JSON.');
        assert(json[r'role'] != null, 'Required key "ChatCompletionRequestToolMessage[role]" has a null value in JSON.');
        assert(json.containsKey(r'content'), 'Required key "ChatCompletionRequestToolMessage[content]" is missing from JSON.');
        assert(json[r'content'] != null, 'Required key "ChatCompletionRequestToolMessage[content]" has a null value in JSON.');
        assert(json.containsKey(r'tool_call_id'), 'Required key "ChatCompletionRequestToolMessage[tool_call_id]" is missing from JSON.');
        assert(json[r'tool_call_id'] != null, 'Required key "ChatCompletionRequestToolMessage[tool_call_id]" has a null value in JSON.');
        return true;
      }());

      return ChatCompletionRequestToolMessage(
        role: ChatCompletionRequestToolMessageRoleEnum.fromJson(json[r'role'])!,
        content: ChatCompletionRequestToolMessageContent.fromJson(json[r'content'])!,
        toolCallId: mapValueOfType<String>(json, r'tool_call_id')!,
      );
    }
    return null;
  }

  static List<ChatCompletionRequestToolMessage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestToolMessage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestToolMessage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionRequestToolMessage> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionRequestToolMessage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionRequestToolMessage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionRequestToolMessage-objects as value to a dart map
  static Map<String, List<ChatCompletionRequestToolMessage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionRequestToolMessage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionRequestToolMessage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'role',
    'content',
    'tool_call_id',
  };
}

/// The role of the messages author, in this case `tool`.
enum ChatCompletionRequestToolMessageRoleEnum {
  tool._(r'tool'),
  ;

  /// Instantiate a new enum with the provided value.
  const ChatCompletionRequestToolMessageRoleEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ChatCompletionRequestToolMessageRoleEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ChatCompletionRequestToolMessageRoleEnum? fromJson(dynamic value) => ChatCompletionRequestToolMessageRoleEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ChatCompletionRequestToolMessageRoleEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ChatCompletionRequestToolMessageRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestToolMessageRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestToolMessageRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRequestToolMessageRoleEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionRequestToolMessageRoleEnum].
class ChatCompletionRequestToolMessageRoleEnumTypeTransformer {
  factory ChatCompletionRequestToolMessageRoleEnumTypeTransformer() => _instance ??= const ChatCompletionRequestToolMessageRoleEnumTypeTransformer._();

  const ChatCompletionRequestToolMessageRoleEnumTypeTransformer._();

  String encode(ChatCompletionRequestToolMessageRoleEnum data) => data._value;

  /// Returns the instance of [ChatCompletionRequestToolMessageRoleEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRequestToolMessageRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ChatCompletionRequestToolMessageRoleEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'tool': return ChatCompletionRequestToolMessageRoleEnum.tool;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ChatCompletionRequestToolMessageRoleEnumTypeTransformer? _instance;
}



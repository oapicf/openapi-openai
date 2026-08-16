//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionRequestFunctionMessage {
  /// Returns a new [ChatCompletionRequestFunctionMessage] instance.
  ChatCompletionRequestFunctionMessage({
    required this.role,
    required this.content,
    required this.name,
  });

  /// The role of the messages author, in this case `function`.
  ChatCompletionRequestFunctionMessageRoleEnum role;

  /// The contents of the function message.
  String? content;

  /// The name of the function to call.
  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionRequestFunctionMessage &&
    other.role == role &&
    other.content == content &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (role.hashCode) +
    (content == null ? 0 : content!.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'ChatCompletionRequestFunctionMessage[role=$role, content=$content, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'role'] = this.role;
    if (this.content != null) {
      json[r'content'] = this.content;
    } else {
      json[r'content'] = null;
    }
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [ChatCompletionRequestFunctionMessage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionRequestFunctionMessage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionRequestFunctionMessage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionRequestFunctionMessage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionRequestFunctionMessage(
        role: ChatCompletionRequestFunctionMessageRoleEnum.fromJson(json[r'role'])!,
        content: mapValueOfType<String>(json, r'content'),
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<ChatCompletionRequestFunctionMessage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestFunctionMessage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestFunctionMessage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionRequestFunctionMessage> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionRequestFunctionMessage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionRequestFunctionMessage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionRequestFunctionMessage-objects as value to a dart map
  static Map<String, List<ChatCompletionRequestFunctionMessage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionRequestFunctionMessage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionRequestFunctionMessage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'role',
    'content',
    'name',
  };
}

/// The role of the messages author, in this case `function`.
class ChatCompletionRequestFunctionMessageRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionRequestFunctionMessageRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const function_ = ChatCompletionRequestFunctionMessageRoleEnum._(r'function');

  /// List of all possible values in this [enum][ChatCompletionRequestFunctionMessageRoleEnum].
  static const values = <ChatCompletionRequestFunctionMessageRoleEnum>[
    function_,
  ];

  static ChatCompletionRequestFunctionMessageRoleEnum? fromJson(dynamic value) => ChatCompletionRequestFunctionMessageRoleEnumTypeTransformer().decode(value);

  static List<ChatCompletionRequestFunctionMessageRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestFunctionMessageRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestFunctionMessageRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRequestFunctionMessageRoleEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionRequestFunctionMessageRoleEnum].
class ChatCompletionRequestFunctionMessageRoleEnumTypeTransformer {
  factory ChatCompletionRequestFunctionMessageRoleEnumTypeTransformer() => _instance ??= const ChatCompletionRequestFunctionMessageRoleEnumTypeTransformer._();

  const ChatCompletionRequestFunctionMessageRoleEnumTypeTransformer._();

  String encode(ChatCompletionRequestFunctionMessageRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionRequestFunctionMessageRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRequestFunctionMessageRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'function': return ChatCompletionRequestFunctionMessageRoleEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionRequestFunctionMessageRoleEnumTypeTransformer] instance.
  static ChatCompletionRequestFunctionMessageRoleEnumTypeTransformer? _instance;
}



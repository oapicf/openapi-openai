//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The role of the author of a message
class ChatCompletionRole {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionRole._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const system = ChatCompletionRole._(r'system');
  static const user = ChatCompletionRole._(r'user');
  static const assistant = ChatCompletionRole._(r'assistant');
  static const tool = ChatCompletionRole._(r'tool');
  static const function_ = ChatCompletionRole._(r'function');

  /// List of all possible values in this [enum][ChatCompletionRole].
  static const values = <ChatCompletionRole>[
    system,
    user,
    assistant,
    tool,
    function_,
  ];

  static ChatCompletionRole? fromJson(dynamic value) => ChatCompletionRoleTypeTransformer().decode(value);

  static List<ChatCompletionRole> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRole>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRole.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRole] to String,
/// and [decode] dynamic data back to [ChatCompletionRole].
class ChatCompletionRoleTypeTransformer {
  factory ChatCompletionRoleTypeTransformer() => _instance ??= const ChatCompletionRoleTypeTransformer._();

  const ChatCompletionRoleTypeTransformer._();

  String encode(ChatCompletionRole data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionRole.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRole? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'system': return ChatCompletionRole.system;
        case r'user': return ChatCompletionRole.user;
        case r'assistant': return ChatCompletionRole.assistant;
        case r'tool': return ChatCompletionRole.tool;
        case r'function': return ChatCompletionRole.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionRoleTypeTransformer] instance.
  static ChatCompletionRoleTypeTransformer? _instance;
}


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionRequestDeveloperMessage {
  /// Returns a new [ChatCompletionRequestDeveloperMessage] instance.
  ChatCompletionRequestDeveloperMessage({
    required this.content,
    required this.role,
    this.name,
  });

  ChatCompletionRequestDeveloperMessageContent content;

  /// The role of the messages author, in this case `developer`.
  ChatCompletionRequestDeveloperMessageRoleEnum role;

  /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionRequestDeveloperMessage &&
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
  String toString() => 'ChatCompletionRequestDeveloperMessage[content=$content, role=$role, name=$name]';

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

  /// Returns a new [ChatCompletionRequestDeveloperMessage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionRequestDeveloperMessage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionRequestDeveloperMessage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionRequestDeveloperMessage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionRequestDeveloperMessage(
        content: ChatCompletionRequestDeveloperMessageContent.fromJson(json[r'content'])!,
        role: ChatCompletionRequestDeveloperMessageRoleEnum.fromJson(json[r'role'])!,
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<ChatCompletionRequestDeveloperMessage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestDeveloperMessage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestDeveloperMessage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionRequestDeveloperMessage> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionRequestDeveloperMessage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionRequestDeveloperMessage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionRequestDeveloperMessage-objects as value to a dart map
  static Map<String, List<ChatCompletionRequestDeveloperMessage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionRequestDeveloperMessage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionRequestDeveloperMessage.listFromJson(entry.value, growable: growable,);
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

/// The role of the messages author, in this case `developer`.
class ChatCompletionRequestDeveloperMessageRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionRequestDeveloperMessageRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const developer = ChatCompletionRequestDeveloperMessageRoleEnum._(r'developer');

  /// List of all possible values in this [enum][ChatCompletionRequestDeveloperMessageRoleEnum].
  static const values = <ChatCompletionRequestDeveloperMessageRoleEnum>[
    developer,
  ];

  static ChatCompletionRequestDeveloperMessageRoleEnum? fromJson(dynamic value) => ChatCompletionRequestDeveloperMessageRoleEnumTypeTransformer().decode(value);

  static List<ChatCompletionRequestDeveloperMessageRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionRequestDeveloperMessageRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionRequestDeveloperMessageRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionRequestDeveloperMessageRoleEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionRequestDeveloperMessageRoleEnum].
class ChatCompletionRequestDeveloperMessageRoleEnumTypeTransformer {
  factory ChatCompletionRequestDeveloperMessageRoleEnumTypeTransformer() => _instance ??= const ChatCompletionRequestDeveloperMessageRoleEnumTypeTransformer._();

  const ChatCompletionRequestDeveloperMessageRoleEnumTypeTransformer._();

  String encode(ChatCompletionRequestDeveloperMessageRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionRequestDeveloperMessageRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionRequestDeveloperMessageRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'developer': return ChatCompletionRequestDeveloperMessageRoleEnum.developer;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionRequestDeveloperMessageRoleEnumTypeTransformer] instance.
  static ChatCompletionRequestDeveloperMessageRoleEnumTypeTransformer? _instance;
}



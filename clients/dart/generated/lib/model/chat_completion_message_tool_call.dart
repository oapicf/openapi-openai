//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionMessageToolCall {
  /// Returns a new [ChatCompletionMessageToolCall] instance.
  ChatCompletionMessageToolCall({
    required this.id,
    required this.type,
    required this.function_,
  });

  /// The ID of the tool call.
  String id;

  /// The type of the tool. Currently, only `function` is supported.
  ChatCompletionMessageToolCallTypeEnum type;

  ChatCompletionMessageToolCallFunction function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionMessageToolCall &&
    other.id == id &&
    other.type == type &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (type.hashCode) +
    (function_.hashCode);

  @override
  String toString() => 'ChatCompletionMessageToolCall[id=$id, type=$type, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'type'] = this.type;
      json[r'function'] = this.function_;
    return json;
  }

  /// Returns a new [ChatCompletionMessageToolCall] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionMessageToolCall? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionMessageToolCall[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionMessageToolCall[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionMessageToolCall(
        id: mapValueOfType<String>(json, r'id')!,
        type: ChatCompletionMessageToolCallTypeEnum.fromJson(json[r'type'])!,
        function_: ChatCompletionMessageToolCallFunction.fromJson(json[r'function'])!,
      );
    }
    return null;
  }

  static List<ChatCompletionMessageToolCall> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionMessageToolCall>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionMessageToolCall.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionMessageToolCall> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionMessageToolCall>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionMessageToolCall.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionMessageToolCall-objects as value to a dart map
  static Map<String, List<ChatCompletionMessageToolCall>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionMessageToolCall>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionMessageToolCall.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'type',
    'function',
  };
}

/// The type of the tool. Currently, only `function` is supported.
class ChatCompletionMessageToolCallTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionMessageToolCallTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const function_ = ChatCompletionMessageToolCallTypeEnum._(r'function');

  /// List of all possible values in this [enum][ChatCompletionMessageToolCallTypeEnum].
  static const values = <ChatCompletionMessageToolCallTypeEnum>[
    function_,
  ];

  static ChatCompletionMessageToolCallTypeEnum? fromJson(dynamic value) => ChatCompletionMessageToolCallTypeEnumTypeTransformer().decode(value);

  static List<ChatCompletionMessageToolCallTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionMessageToolCallTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionMessageToolCallTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionMessageToolCallTypeEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionMessageToolCallTypeEnum].
class ChatCompletionMessageToolCallTypeEnumTypeTransformer {
  factory ChatCompletionMessageToolCallTypeEnumTypeTransformer() => _instance ??= const ChatCompletionMessageToolCallTypeEnumTypeTransformer._();

  const ChatCompletionMessageToolCallTypeEnumTypeTransformer._();

  String encode(ChatCompletionMessageToolCallTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionMessageToolCallTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionMessageToolCallTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'function': return ChatCompletionMessageToolCallTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionMessageToolCallTypeEnumTypeTransformer] instance.
  static ChatCompletionMessageToolCallTypeEnumTypeTransformer? _instance;
}



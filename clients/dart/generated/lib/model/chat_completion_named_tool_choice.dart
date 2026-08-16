//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionNamedToolChoice {
  /// Returns a new [ChatCompletionNamedToolChoice] instance.
  ChatCompletionNamedToolChoice({
    required this.type,
    required this.function_,
  });

  /// The type of the tool. Currently, only `function` is supported.
  ChatCompletionNamedToolChoiceTypeEnum type;

  AssistantsNamedToolChoiceFunction function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionNamedToolChoice &&
    other.type == type &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (function_.hashCode);

  @override
  String toString() => 'ChatCompletionNamedToolChoice[type=$type, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'function'] = this.function_;
    return json;
  }

  /// Returns a new [ChatCompletionNamedToolChoice] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionNamedToolChoice? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionNamedToolChoice[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionNamedToolChoice[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionNamedToolChoice(
        type: ChatCompletionNamedToolChoiceTypeEnum.fromJson(json[r'type'])!,
        function_: AssistantsNamedToolChoiceFunction.fromJson(json[r'function'])!,
      );
    }
    return null;
  }

  static List<ChatCompletionNamedToolChoice> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionNamedToolChoice>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionNamedToolChoice.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionNamedToolChoice> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionNamedToolChoice>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionNamedToolChoice.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionNamedToolChoice-objects as value to a dart map
  static Map<String, List<ChatCompletionNamedToolChoice>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionNamedToolChoice>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionNamedToolChoice.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'function',
  };
}

/// The type of the tool. Currently, only `function` is supported.
class ChatCompletionNamedToolChoiceTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionNamedToolChoiceTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const function_ = ChatCompletionNamedToolChoiceTypeEnum._(r'function');

  /// List of all possible values in this [enum][ChatCompletionNamedToolChoiceTypeEnum].
  static const values = <ChatCompletionNamedToolChoiceTypeEnum>[
    function_,
  ];

  static ChatCompletionNamedToolChoiceTypeEnum? fromJson(dynamic value) => ChatCompletionNamedToolChoiceTypeEnumTypeTransformer().decode(value);

  static List<ChatCompletionNamedToolChoiceTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionNamedToolChoiceTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionNamedToolChoiceTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionNamedToolChoiceTypeEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionNamedToolChoiceTypeEnum].
class ChatCompletionNamedToolChoiceTypeEnumTypeTransformer {
  factory ChatCompletionNamedToolChoiceTypeEnumTypeTransformer() => _instance ??= const ChatCompletionNamedToolChoiceTypeEnumTypeTransformer._();

  const ChatCompletionNamedToolChoiceTypeEnumTypeTransformer._();

  String encode(ChatCompletionNamedToolChoiceTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionNamedToolChoiceTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionNamedToolChoiceTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'function': return ChatCompletionNamedToolChoiceTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionNamedToolChoiceTypeEnumTypeTransformer] instance.
  static ChatCompletionNamedToolChoiceTypeEnumTypeTransformer? _instance;
}



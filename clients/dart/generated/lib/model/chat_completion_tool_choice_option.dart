//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionToolChoiceOption {
  /// Returns a new [ChatCompletionToolChoiceOption] instance.
  ChatCompletionToolChoiceOption({
    required this.type,
    required this.function_,
  });

  /// The type of the tool. Currently, only `function` is supported.
  ChatCompletionToolChoiceOptionTypeEnum type;

  AssistantsNamedToolChoiceFunction function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionToolChoiceOption &&
    other.type == type &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (function_.hashCode);

  @override
  String toString() => 'ChatCompletionToolChoiceOption[type=$type, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'function'] = this.function_;
    return json;
  }

  /// Returns a new [ChatCompletionToolChoiceOption] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionToolChoiceOption? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionToolChoiceOption[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionToolChoiceOption[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionToolChoiceOption(
        type: ChatCompletionToolChoiceOptionTypeEnum.fromJson(json[r'type'])!,
        function_: AssistantsNamedToolChoiceFunction.fromJson(json[r'function'])!,
      );
    }
    return null;
  }

  static List<ChatCompletionToolChoiceOption> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionToolChoiceOption>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionToolChoiceOption.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionToolChoiceOption> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionToolChoiceOption>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionToolChoiceOption.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionToolChoiceOption-objects as value to a dart map
  static Map<String, List<ChatCompletionToolChoiceOption>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionToolChoiceOption>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionToolChoiceOption.listFromJson(entry.value, growable: growable,);
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
class ChatCompletionToolChoiceOptionTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionToolChoiceOptionTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const function_ = ChatCompletionToolChoiceOptionTypeEnum._(r'function');

  /// List of all possible values in this [enum][ChatCompletionToolChoiceOptionTypeEnum].
  static const values = <ChatCompletionToolChoiceOptionTypeEnum>[
    function_,
  ];

  static ChatCompletionToolChoiceOptionTypeEnum? fromJson(dynamic value) => ChatCompletionToolChoiceOptionTypeEnumTypeTransformer().decode(value);

  static List<ChatCompletionToolChoiceOptionTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionToolChoiceOptionTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionToolChoiceOptionTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionToolChoiceOptionTypeEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionToolChoiceOptionTypeEnum].
class ChatCompletionToolChoiceOptionTypeEnumTypeTransformer {
  factory ChatCompletionToolChoiceOptionTypeEnumTypeTransformer() => _instance ??= const ChatCompletionToolChoiceOptionTypeEnumTypeTransformer._();

  const ChatCompletionToolChoiceOptionTypeEnumTypeTransformer._();

  String encode(ChatCompletionToolChoiceOptionTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionToolChoiceOptionTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionToolChoiceOptionTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'function': return ChatCompletionToolChoiceOptionTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionToolChoiceOptionTypeEnumTypeTransformer] instance.
  static ChatCompletionToolChoiceOptionTypeEnumTypeTransformer? _instance;
}



//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionTool {
  /// Returns a new [ChatCompletionTool] instance.
  ChatCompletionTool({
    required this.type,
    required this.function_,
  });

  /// The type of the tool. Currently, only `function` is supported.
  ChatCompletionToolTypeEnum type;

  FunctionObject function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionTool &&
    other.type == type &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (function_.hashCode);

  @override
  String toString() => 'ChatCompletionTool[type=$type, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'function'] = this.function_;
    return json;
  }

  /// Returns a new [ChatCompletionTool] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionTool? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionTool[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionTool[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionTool(
        type: ChatCompletionToolTypeEnum.fromJson(json[r'type'])!,
        function_: FunctionObject.fromJson(json[r'function'])!,
      );
    }
    return null;
  }

  static List<ChatCompletionTool> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionTool>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionTool.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionTool> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionTool>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionTool.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionTool-objects as value to a dart map
  static Map<String, List<ChatCompletionTool>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionTool>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionTool.listFromJson(entry.value, growable: growable,);
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
class ChatCompletionToolTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionToolTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const function_ = ChatCompletionToolTypeEnum._(r'function');

  /// List of all possible values in this [enum][ChatCompletionToolTypeEnum].
  static const values = <ChatCompletionToolTypeEnum>[
    function_,
  ];

  static ChatCompletionToolTypeEnum? fromJson(dynamic value) => ChatCompletionToolTypeEnumTypeTransformer().decode(value);

  static List<ChatCompletionToolTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionToolTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionToolTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionToolTypeEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionToolTypeEnum].
class ChatCompletionToolTypeEnumTypeTransformer {
  factory ChatCompletionToolTypeEnumTypeTransformer() => _instance ??= const ChatCompletionToolTypeEnumTypeTransformer._();

  const ChatCompletionToolTypeEnumTypeTransformer._();

  String encode(ChatCompletionToolTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionToolTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionToolTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'function': return ChatCompletionToolTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionToolTypeEnumTypeTransformer] instance.
  static ChatCompletionToolTypeEnumTypeTransformer? _instance;
}



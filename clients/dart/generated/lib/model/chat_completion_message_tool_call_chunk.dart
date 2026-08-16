//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionMessageToolCallChunk {
  /// Returns a new [ChatCompletionMessageToolCallChunk] instance.
  ChatCompletionMessageToolCallChunk({
    required this.index,
    this.id,
    this.type,
    this.function_,
  });

  int index;

  /// The ID of the tool call.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// The type of the tool. Currently, only `function` is supported.
  ChatCompletionMessageToolCallChunkTypeEnum? type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ChatCompletionMessageToolCallChunkFunction? function_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionMessageToolCallChunk &&
    other.index == index &&
    other.id == id &&
    other.type == type &&
    other.function_ == function_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (function_ == null ? 0 : function_!.hashCode);

  @override
  String toString() => 'ChatCompletionMessageToolCallChunk[index=$index, id=$id, type=$type, function_=$function_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.function_ != null) {
      json[r'function'] = this.function_;
    } else {
      json[r'function'] = null;
    }
    return json;
  }

  /// Returns a new [ChatCompletionMessageToolCallChunk] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionMessageToolCallChunk? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionMessageToolCallChunk[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionMessageToolCallChunk[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionMessageToolCallChunk(
        index: mapValueOfType<int>(json, r'index')!,
        id: mapValueOfType<String>(json, r'id'),
        type: ChatCompletionMessageToolCallChunkTypeEnum.fromJson(json[r'type']),
        function_: ChatCompletionMessageToolCallChunkFunction.fromJson(json[r'function']),
      );
    }
    return null;
  }

  static List<ChatCompletionMessageToolCallChunk> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionMessageToolCallChunk>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionMessageToolCallChunk.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionMessageToolCallChunk> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionMessageToolCallChunk>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionMessageToolCallChunk.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionMessageToolCallChunk-objects as value to a dart map
  static Map<String, List<ChatCompletionMessageToolCallChunk>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionMessageToolCallChunk>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionMessageToolCallChunk.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'index',
  };
}

/// The type of the tool. Currently, only `function` is supported.
class ChatCompletionMessageToolCallChunkTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ChatCompletionMessageToolCallChunkTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const function_ = ChatCompletionMessageToolCallChunkTypeEnum._(r'function');

  /// List of all possible values in this [enum][ChatCompletionMessageToolCallChunkTypeEnum].
  static const values = <ChatCompletionMessageToolCallChunkTypeEnum>[
    function_,
  ];

  static ChatCompletionMessageToolCallChunkTypeEnum? fromJson(dynamic value) => ChatCompletionMessageToolCallChunkTypeEnumTypeTransformer().decode(value);

  static List<ChatCompletionMessageToolCallChunkTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionMessageToolCallChunkTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionMessageToolCallChunkTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChatCompletionMessageToolCallChunkTypeEnum] to String,
/// and [decode] dynamic data back to [ChatCompletionMessageToolCallChunkTypeEnum].
class ChatCompletionMessageToolCallChunkTypeEnumTypeTransformer {
  factory ChatCompletionMessageToolCallChunkTypeEnumTypeTransformer() => _instance ??= const ChatCompletionMessageToolCallChunkTypeEnumTypeTransformer._();

  const ChatCompletionMessageToolCallChunkTypeEnumTypeTransformer._();

  String encode(ChatCompletionMessageToolCallChunkTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChatCompletionMessageToolCallChunkTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChatCompletionMessageToolCallChunkTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'function': return ChatCompletionMessageToolCallChunkTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChatCompletionMessageToolCallChunkTypeEnumTypeTransformer] instance.
  static ChatCompletionMessageToolCallChunkTypeEnumTypeTransformer? _instance;
}



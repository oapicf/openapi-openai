//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateChatCompletionResponseChoicesInner {
  /// Returns a new [CreateChatCompletionResponseChoicesInner] instance.
  CreateChatCompletionResponseChoicesInner({
    required this.finishReason,
    required this.index,
    required this.message,
    required this.logprobs,
  });

  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  CreateChatCompletionResponseChoicesInnerFinishReasonEnum finishReason;

  /// The index of the choice in the list of choices.
  int index;

  ChatCompletionResponseMessage message;

  CreateChatCompletionResponseChoicesInnerLogprobs? logprobs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateChatCompletionResponseChoicesInner &&
    other.finishReason == finishReason &&
    other.index == index &&
    other.message == message &&
    other.logprobs == logprobs;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (finishReason.hashCode) +
    (index.hashCode) +
    (message.hashCode) +
    (logprobs == null ? 0 : logprobs!.hashCode);

  @override
  String toString() => 'CreateChatCompletionResponseChoicesInner[finishReason=$finishReason, index=$index, message=$message, logprobs=$logprobs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'finish_reason'] = this.finishReason;
      json[r'index'] = this.index;
      json[r'message'] = this.message;
    if (this.logprobs != null) {
      json[r'logprobs'] = this.logprobs;
    } else {
      json[r'logprobs'] = null;
    }
    return json;
  }

  /// Returns a new [CreateChatCompletionResponseChoicesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateChatCompletionResponseChoicesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateChatCompletionResponseChoicesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateChatCompletionResponseChoicesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateChatCompletionResponseChoicesInner(
        finishReason: CreateChatCompletionResponseChoicesInnerFinishReasonEnum.fromJson(json[r'finish_reason'])!,
        index: mapValueOfType<int>(json, r'index')!,
        message: ChatCompletionResponseMessage.fromJson(json[r'message'])!,
        logprobs: CreateChatCompletionResponseChoicesInnerLogprobs.fromJson(json[r'logprobs']),
      );
    }
    return null;
  }

  static List<CreateChatCompletionResponseChoicesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionResponseChoicesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionResponseChoicesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateChatCompletionResponseChoicesInner> mapFromJson(dynamic json) {
    final map = <String, CreateChatCompletionResponseChoicesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateChatCompletionResponseChoicesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateChatCompletionResponseChoicesInner-objects as value to a dart map
  static Map<String, List<CreateChatCompletionResponseChoicesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateChatCompletionResponseChoicesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateChatCompletionResponseChoicesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'finish_reason',
    'index',
    'message',
    'logprobs',
  };
}

/// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
class CreateChatCompletionResponseChoicesInnerFinishReasonEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateChatCompletionResponseChoicesInnerFinishReasonEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const stop = CreateChatCompletionResponseChoicesInnerFinishReasonEnum._(r'stop');
  static const length = CreateChatCompletionResponseChoicesInnerFinishReasonEnum._(r'length');
  static const toolCalls = CreateChatCompletionResponseChoicesInnerFinishReasonEnum._(r'tool_calls');
  static const contentFilter = CreateChatCompletionResponseChoicesInnerFinishReasonEnum._(r'content_filter');
  static const functionCall = CreateChatCompletionResponseChoicesInnerFinishReasonEnum._(r'function_call');

  /// List of all possible values in this [enum][CreateChatCompletionResponseChoicesInnerFinishReasonEnum].
  static const values = <CreateChatCompletionResponseChoicesInnerFinishReasonEnum>[
    stop,
    length,
    toolCalls,
    contentFilter,
    functionCall,
  ];

  static CreateChatCompletionResponseChoicesInnerFinishReasonEnum? fromJson(dynamic value) => CreateChatCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer().decode(value);

  static List<CreateChatCompletionResponseChoicesInnerFinishReasonEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionResponseChoicesInnerFinishReasonEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionResponseChoicesInnerFinishReasonEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateChatCompletionResponseChoicesInnerFinishReasonEnum] to String,
/// and [decode] dynamic data back to [CreateChatCompletionResponseChoicesInnerFinishReasonEnum].
class CreateChatCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer {
  factory CreateChatCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer() => _instance ??= const CreateChatCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer._();

  const CreateChatCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer._();

  String encode(CreateChatCompletionResponseChoicesInnerFinishReasonEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateChatCompletionResponseChoicesInnerFinishReasonEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateChatCompletionResponseChoicesInnerFinishReasonEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'stop': return CreateChatCompletionResponseChoicesInnerFinishReasonEnum.stop;
        case r'length': return CreateChatCompletionResponseChoicesInnerFinishReasonEnum.length;
        case r'tool_calls': return CreateChatCompletionResponseChoicesInnerFinishReasonEnum.toolCalls;
        case r'content_filter': return CreateChatCompletionResponseChoicesInnerFinishReasonEnum.contentFilter;
        case r'function_call': return CreateChatCompletionResponseChoicesInnerFinishReasonEnum.functionCall;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateChatCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer] instance.
  static CreateChatCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer? _instance;
}


